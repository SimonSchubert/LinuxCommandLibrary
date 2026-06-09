import ComposeApp
import SwiftUI

/// Native SwiftUI command detail screen.
/// Observes CommandDetailViewModel (KMP) via SKIE-bridged StateFlow.
/// `onManTap` is invoked when a man-page link inside the rendered markdown is tapped;
/// the parent NavigationStack uses it to push another CommandDetailView.
struct CommandDetailView: View {
    let commandName: String
    @StateObject private var store: CommandDetailStore

    init(commandName: String, onManTap: @escaping (String) -> Void = { _ in }) {
        self.commandName = commandName
        _store = StateObject(wrappedValue: CommandDetailStore(commandName: commandName, onManTap: onManTap))
    }

    var body: some View {
        List {
            ForEach(store.state.sections, id: \.id) { section in
                Section {
                    if store.isExpanded(sectionId: section.id) {
                        if section.title == "SEE ALSO" {
                            SeeAlsoChips(
                                names: store.state.seeAlsoCommands,
                                fallback: section.parsedContent,
                                onTapMan: store.tapMan,
                                onTapLink: store.tapLink,
                                onTapUrl: store.tapUrl
                            )
                        } else if section.title == "RESOURCES" {
                            ResourcesChips(
                                links: store.state.resources,
                                fallback: section.parsedContent,
                                onTapMan: store.tapMan,
                                onTapLink: store.tapLink,
                                onTapUrl: store.tapUrl
                            )
                        } else {
                            MarkdownView(
                                elements: section.parsedContent,
                                onTapMan: store.tapMan,
                                onTapLink: store.tapLink,
                                onTapUrl: store.tapUrl
                            )
                            .padding(.vertical, 4)
                        }
                    }
                } header: {
                    Button {
                        store.toggle(sectionId: section.id)
                    } label: {
                        HStack {
                            Text(section.title.uppercased())
                                .font(.headline)
                                .foregroundColor(.primary)
                                .multilineTextAlignment(.leading)
                                .frame(maxWidth: .infinity, alignment: .leading)
                            Image(systemName: store.isExpanded(sectionId: section.id) ? "chevron.up" : "chevron.down")
                                .foregroundColor(.secondary)
                                .font(.caption)
                        }
                        .contentShape(Rectangle())
                    }
                    .hoverEffect(.highlight)
                }
            }
        }
        .listStyle(.insetGrouped)
        .navigationTitle(commandName)
        .navigationBarTitleDisplayMode(.inline)
        .toolbar {
            ToolbarItem(placement: .navigationBarTrailing) {
                BookmarkToolbarButton(
                    isBookmarked: store.state.isBookmarked,
                    toggle: store.toggleBookmark
                )
            }
        }
    }
}

/// Toolbar bookmark button with a manual scale-bounce on toggle, since
/// SF Symbol `.symbolEffect(.bounce)` is iOS 17+ and we target iOS 16.
private struct BookmarkToolbarButton: View {
    let isBookmarked: Bool
    let toggle: () -> Void
    @State private var scale: CGFloat = 1.0

    var body: some View {
        Button {
            toggle()
            Haptics.impact()
            withAnimation(.spring(response: 0.2, dampingFraction: 0.5)) {
                scale = 1.35
            }
            DispatchQueue.main.asyncAfter(deadline: .now() + 0.12) {
                withAnimation(.spring(response: 0.3, dampingFraction: 0.6)) {
                    scale = 1.0
                }
            }
        } label: {
            Image(systemName: isBookmarked ? "bookmark.fill" : "bookmark")
                .foregroundColor(.brandRed)
                .scaleEffect(scale)
        }
    }
}

private struct SeeAlsoChips: View {
    let names: [String]
    let fallback: [TipSectionElement]
    let onTapMan: (String) -> Void
    let onTapLink: (String) -> Void
    let onTapUrl: (String) -> Void

    var body: some View {
        if names.isEmpty {
            MarkdownView(
                elements: fallback,
                onTapMan: onTapMan,
                onTapLink: onTapLink,
                onTapUrl: onTapUrl
            )
        } else {
            FlowLayout(spacing: 8) {
                ForEach(names, id: \.self) { name in
                    Button(name) {
                        onTapMan(name)
                        Haptics.selection()
                    }
                    .buttonStyle(.bordered)
                    .tint(.brandRed)
                }
            }
        }
    }
}

/// External resource links (Source code / Homepage / Documentation) shown as
/// tappable chips that open the URL in the browser, mirroring See Also.
private struct ResourcesChips: View {
    let links: [ResourceLink]
    let fallback: [TipSectionElement]
    let onTapMan: (String) -> Void
    let onTapLink: (String) -> Void
    let onTapUrl: (String) -> Void

    var body: some View {
        if links.isEmpty {
            MarkdownView(
                elements: fallback,
                onTapMan: onTapMan,
                onTapLink: onTapLink,
                onTapUrl: onTapUrl
            )
        } else {
            FlowLayout(spacing: 8) {
                ForEach(links, id: \.url) { link in
                    Button(link.label) {
                        onTapUrl(link.url)
                        Haptics.selection()
                    }
                    .buttonStyle(.bordered)
                    .tint(.brandRed)
                }
            }
        }
    }
}

/// Wrapping flow layout — places children left-to-right, breaking to a new row
/// when the next child would overflow the proposed width. Used by See Also chips.
private struct FlowLayout: Layout {
    var spacing: CGFloat = 8

    func sizeThatFits(proposal: ProposedViewSize, subviews: Subviews, cache _: inout ()) -> CGSize {
        let maxWidth = proposal.width ?? .infinity
        let rows = layoutRows(maxWidth: maxWidth, subviews: subviews)
        let height = rows.reduce(CGFloat(0)) { acc, row in
            acc + row.height + (acc > 0 ? spacing : 0)
        }
        let width = rows.map(\.width).max() ?? 0
        return CGSize(width: width, height: height)
    }

    func placeSubviews(in bounds: CGRect, proposal _: ProposedViewSize, subviews: Subviews, cache _: inout ()) {
        let rows = layoutRows(maxWidth: bounds.width, subviews: subviews)
        var y = bounds.minY
        var subviewIndex = 0
        for row in rows {
            var x = bounds.minX
            for size in row.sizes {
                let subview = subviews[subviewIndex]
                subview.place(
                    at: CGPoint(x: x, y: y),
                    anchor: .topLeading,
                    proposal: ProposedViewSize(size)
                )
                x += size.width + spacing
                subviewIndex += 1
            }
            y += row.height + spacing
        }
    }

    private struct Row {
        var sizes: [CGSize] = []
        var width: CGFloat = 0
        var height: CGFloat = 0
    }

    private func layoutRows(maxWidth: CGFloat, subviews: Subviews) -> [Row] {
        var rows: [Row] = [Row()]
        for subview in subviews {
            let size = subview.sizeThatFits(.unspecified)
            let projected = (rows[rows.count - 1].sizes.isEmpty ? 0 : rows[rows.count - 1].width + spacing) + size.width
            if projected > maxWidth, !rows[rows.count - 1].sizes.isEmpty {
                rows.append(Row())
            }
            var current = rows[rows.count - 1]
            if !current.sizes.isEmpty {
                current.width += spacing
            }
            current.sizes.append(size)
            current.width += size.width
            current.height = max(current.height, size.height)
            rows[rows.count - 1] = current
        }
        return rows
    }
}

/// Owns the CommandDetailViewModel lifecycle and bridges its StateFlow into SwiftUI.
@MainActor
final class CommandDetailStore: ObservableObject {
    private let viewModel: CommandDetailViewModel
    private let commandName: String
    private let onManTap_: (String) -> Void
    @Published private(set) var state = CommandDetailUiState(
        sections: [],
        expandedSectionsMap: [:],
        isBookmarked: false,
        seeAlsoCommands: [],
        resources: []
    )

    private var stateTask: Task<Void, Never>?

    init(commandName: String, onManTap: @escaping (String) -> Void) {
        self.commandName = commandName
        onManTap_ = onManTap
        viewModel = KoinHelperKt.makeCommandDetailViewModel(commandName: commandName)

        stateTask = Task { [weak self] in
            guard let self else { return }
            for await s in self.viewModel.state {
                self.state = s
            }
        }
    }

    deinit {
        stateTask?.cancel()
        viewModel.cancel()
    }

    func isExpanded(sectionId: Int64) -> Bool {
        state.expandedSectionsMap[KotlinLong(value: sectionId)]?.boolValue ?? false
    }

    func toggle(sectionId: Int64) {
        viewModel.onToggleExpanded(id: sectionId)
    }

    func toggleBookmark() {
        if state.isBookmarked {
            viewModel.removeBookmark()
        } else {
            viewModel.addBookmark()
        }
    }

    func tapMan(_ name: String) {
        onManTap_(name)
        Haptics.selection()
    }

    func tapLink(_: String) {
        // No external app launch on iOS for "settings"/"terminal" actions — silently ignore
    }

    func tapUrl(_ url: String) {
        if let target = URL(string: url) {
            UIApplication.shared.open(target)
        }
    }
}
