import ComposeApp
import SwiftUI

/// Identifies one rendered element so `ScrollViewReader` can jump straight to it.
struct ManPageAnchor: Hashable {
    let section: Int
    let element: Int
}

/// Match ranges for the strings a single section element renders, keyed by sub-index
/// (0 for text/blockquote/code, cell ordinal for tables).
struct ElementHighlight {
    let ranges: [Int: [Range<Int>]]
    let activeSubIndex: Int
    let activeRange: Range<Int>?

    func rangesFor(_ subIndex: Int) -> [Range<Int>] {
        ranges[subIndex] ?? []
    }

    func activeRangeFor(_ subIndex: Int) -> Range<Int>? {
        subIndex == activeSubIndex ? activeRange : nil
    }
}

/// Swift-side view of the shared match list produced by `findManPageMatches` in KMP.
/// Grouping happens once up front so stepping between matches doesn't rescan every match
/// for every visible section.
struct ManPageMatchIndex {
    let matches: [ManPageMatch]
    private let grouped: [Int: [Int: [Int: [Range<Int>]]]]

    init(_ matches: [ManPageMatch]) {
        self.matches = matches
        var grouped: [Int: [Int: [Int: [Range<Int>]]]] = [:]
        for match in matches {
            let section = Int(match.sectionIndex)
            let element = Int(match.elementIndex)
            let sub = Int(match.subIndex)
            grouped[section, default: [:]][element, default: [:]][sub, default: []]
                .append(Int(match.start) ..< Int(match.end))
        }
        self.grouped = grouped
    }

    static let empty = ManPageMatchIndex([])

    var count: Int {
        matches.count
    }

    /// Draw-ready highlights for one section, keyed by element index.
    /// Returns nil when the section has no matches, so untouched sections stay unstyled.
    func highlights(sectionIndex: Int, activeMatch: ManPageMatch?) -> [Int: ElementHighlight]? {
        guard let section = grouped[sectionIndex] else { return nil }
        var result: [Int: ElementHighlight] = [:]
        for (elementIndex, ranges) in section {
            let isActiveElement = activeMatch.map {
                Int($0.sectionIndex) == sectionIndex && Int($0.elementIndex) == elementIndex
            } ?? false
            result[elementIndex] = ElementHighlight(
                ranges: ranges,
                activeSubIndex: isActiveElement ? Int(activeMatch!.subIndex) : -1,
                activeRange: isActiveElement ? Int(activeMatch!.start) ..< Int(activeMatch!.end) : nil
            )
        }
        return result
    }
}

extension AttributedString {
    /// Layers match backgrounds over an already-styled string, leaving the bold/italic/link
    /// styling the markdown renderer produced intact.
    ///
    /// The active match also forces a white foreground: man links are drawn in brand red, which
    /// would disappear against the brand-red active background.
    func withMatchHighlight(_ highlight: ElementHighlight?, subIndex: Int = 0) -> AttributedString {
        guard let highlight else { return self }
        let ranges = highlight.rangesFor(subIndex)
        if ranges.isEmpty {
            return self
        }
        let activeRange = highlight.activeRangeFor(subIndex)

        var result = self
        // The KMP matcher reports UTF-16 offsets (Kotlin String indices), so the conversion goes
        // through NSRange rather than counting Characters, which would drift on any non-ASCII text.
        let plain = String(result.characters)
        for range in ranges {
            let nsRange = NSRange(location: range.lowerBound, length: range.count)
            guard let stringRange = Range(nsRange, in: plain),
                  let lower = AttributedString.Index(stringRange.lowerBound, within: result),
                  let upper = AttributedString.Index(stringRange.upperBound, within: result)
            else { continue }
            if range == activeRange {
                result[lower ..< upper].backgroundColor = .brandRed
                result[lower ..< upper].foregroundColor = .white
            } else {
                result[lower ..< upper].backgroundColor = Color.brandRed.opacity(0.25)
            }
        }
        return result
    }
}

/// The find-in-page bar shown under the navigation bar while a search is active.
struct ManPageFindBar: View {
    @Binding var query: String
    let matchCount: Int
    let activeMatchIndex: Int
    let onPrevious: () -> Void
    let onNext: () -> Void
    let onClose: () -> Void
    @FocusState.Binding var isFieldFocused: Bool

    var body: some View {
        HStack(spacing: 10) {
            Image(systemName: "magnifyingglass")
                .foregroundColor(.secondary)
                .font(.footnote)

            TextField("Search in page", text: $query)
                .textFieldStyle(.plain)
                .autocorrectionDisabled()
                .textInputAutocapitalization(.never)
                .submitLabel(.search)
                .focused($isFieldFocused)
                .onSubmit(onNext)

            if !query.isEmpty {
                Button {
                    query = ""
                } label: {
                    Image(systemName: "xmark.circle.fill")
                        .foregroundColor(.secondary)
                }
                .accessibilityLabel("Clear search")
            }

            Text(matchCount == 0 ? "0/0" : "\(activeMatchIndex + 1)/\(matchCount)")
                .font(.footnote.monospacedDigit())
                .foregroundColor(.secondary)

            Button(action: onPrevious) {
                Image(systemName: "chevron.up")
            }
            .disabled(matchCount == 0)
            .accessibilityLabel("Previous match")

            Button(action: onNext) {
                Image(systemName: "chevron.down")
            }
            .disabled(matchCount == 0)
            .accessibilityLabel("Next match")

            Button("Done", action: onClose)
                .font(.body.weight(.semibold))
        }
        .tint(.brandRed)
        .padding(.horizontal, 16)
        .padding(.vertical, 10)
        .background(Color(.secondarySystemBackground))
        .overlay(alignment: .bottom) {
            Divider()
        }
    }
}
