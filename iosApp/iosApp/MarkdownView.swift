import ComposeApp
import SwiftUI

/// Renders a list of TipSectionElement (the parsed markdown AST from KMP MarkdownParser)
/// natively in SwiftUI. The 4 element types each get their own renderer.
struct MarkdownView: View {
    let elements: [TipSectionElement]
    let onTapMan: (String) -> Void
    let onTapLink: (String) -> Void
    let onTapUrl: (String) -> Void
    /// Find-in-page match ranges for this section, keyed by element index. Nil when not searching
    /// or when this section has no hits.
    var highlights: [Int: ElementHighlight]?
    /// When set, each element is tagged with a `ManPageAnchor` so prev/next can scroll to it.
    var anchorSection: Int?

    var body: some View {
        VStack(alignment: .leading, spacing: 12) {
            ForEach(Array(elements.enumerated()), id: \.offset) { index, element in
                TipSectionElementView(
                    element: element,
                    onTapMan: onTapMan,
                    onTapLink: onTapLink,
                    onTapUrl: onTapUrl,
                    highlight: highlights?[index]
                )
                .modifier(MatchAnchor(section: anchorSection, element: index))
            }
        }
    }
}

/// Tags a view with its scroll anchor, but only while a search is running — outside search there
/// is nothing to scroll to and the extra identity would be pure overhead.
private struct MatchAnchor: ViewModifier {
    let section: Int?
    let element: Int

    func body(content: Content) -> some View {
        if let section {
            content.id(ManPageAnchor(section: section, element: element))
        } else {
            content
        }
    }
}

private struct TipSectionElementView: View {
    let element: TipSectionElement
    let onTapMan: (String) -> Void
    let onTapLink: (String) -> Void
    let onTapUrl: (String) -> Void
    var highlight: ElementHighlight?

    var body: some View {
        switch onEnum(of: element) {
        case let .text(textCase):
            TextElementsView(
                elements: textCase.elements,
                onTapMan: onTapMan,
                onTapLink: onTapLink,
                highlight: highlight
            )
        case let .blockquote(bqCase):
            HStack(alignment: .top, spacing: 8) {
                Rectangle()
                    .fill(Color.secondary.opacity(0.4))
                    .frame(width: 3)
                TextElementsView(
                    elements: bqCase.elements,
                    onTapMan: onTapMan,
                    onTapLink: onTapLink,
                    highlight: highlight
                )
                .foregroundColor(.secondary)
            }
        case let .code(codeCase):
            CommandLineView(
                command: codeCase.command,
                elements: codeCase.elements,
                onTapMan: onTapMan,
                onTapUrl: onTapUrl,
                highlight: highlight
            )
        case let .table(tableCase):
            MarkdownTableView(
                headers: tableCase.headers,
                rows: tableCase.rows,
                onTapMan: onTapMan,
                onTapLink: onTapLink,
                highlight: highlight
            )
        }
    }
}

/// Renders [TextElement] as an inline AttributedString with bold/italic runs
/// and tappable man / action links.
private struct TextElementsView: View {
    let elements: [TextElement]
    let onTapMan: (String) -> Void
    let onTapLink: (String) -> Void
    var highlight: ElementHighlight?
    /// Which string this view renders within its element — always 0 except for table cells.
    var subIndex: Int = 0

    var body: some View {
        Text(buildAttributedString().withMatchHighlight(highlight, subIndex: subIndex))
            .environment(\.openURL, OpenURLAction(handler: handleURL))
            .fixedSize(horizontal: false, vertical: true)
    }

    /// Must append exactly the substrings `List<TextElement>.toPlainText()` joins in `:common`,
    /// in the same order — the shared search reports match offsets against that string.
    private func buildAttributedString() -> AttributedString {
        var result = AttributedString()
        for element in elements {
            switch onEnum(of: element) {
            case let .plain(plain):
                result += AttributedString(plain.text)
            case let .bold(bold):
                var part = AttributedString(bold.text)
                part.font = .body.bold()
                result += part
            case let .italic(italic):
                var part = AttributedString(italic.text)
                part.font = .body.italic()
                result += part
            case let .man(man):
                var part = AttributedString(man.man)
                part.foregroundColor = .brandRed
                part.link = URL(string: "lcl-man://\(man.man)")
                result += part
            case let .link(link):
                var part = AttributedString(link.text)
                part.foregroundColor = .brandRed
                part.link = URL(string: "lcl-action://\(link.action)")
                result += part
            }
        }
        return result
    }

    private func handleURL(_ url: URL) -> OpenURLAction.Result {
        switch url.scheme {
        case "lcl-man":
            onTapMan(url.host ?? url.path.trimmingCharacters(in: CharacterSet(charactersIn: "/")))
            return .handled
        case "lcl-action":
            onTapLink(url.host ?? url.path.trimmingCharacters(in: CharacterSet(charactersIn: "/")))
            return .handled
        default:
            return .systemAction
        }
    }
}

/// Renders a code block: the full command in monospace, with each CommandElement
/// rendered as plain text or tappable colored link.
private struct CommandLineView: View {
    let command: String
    let elements: [CommandElement]
    let onTapMan: (String) -> Void
    let onTapUrl: (String) -> Void
    var highlight: ElementHighlight?

    var body: some View {
        Text(buildAttributedString().withMatchHighlight(highlight))
            .font(.shareTechMono(size: 14))
            .environment(\.openURL, OpenURLAction(handler: handleURL))
            .padding(10)
            .frame(maxWidth: .infinity, alignment: .leading)
            .background(Color.secondary.opacity(0.1))
            .cornerRadius(8)
            .textSelection(.enabled)
    }

    private func buildAttributedString() -> AttributedString {
        var result = AttributedString()
        for element in elements {
            switch onEnum(of: element) {
            case let .text(text):
                result += AttributedString(text.text)
            case let .man(man):
                var part = AttributedString(man.man)
                part.foregroundColor = .brandRed
                part.link = URL(string: "lcl-man://\(man.man)")
                result += part
            case let .url(urlElem):
                var part = AttributedString(urlElem.command)
                part.foregroundColor = .brandRed
                if let target = URL(string: urlElem.url) {
                    part.link = target
                }
                result += part
            }
        }
        return result
    }

    private func handleURL(_ url: URL) -> OpenURLAction.Result {
        if url.scheme == "lcl-man" {
            onTapMan(url.host ?? url.path.trimmingCharacters(in: CharacterSet(charactersIn: "/")))
            return .handled
        }
        onTapUrl(url.absoluteString)
        return .systemAction
    }
}

private struct MarkdownTableView: View {
    let headers: [[TextElement]]
    let rows: [[[TextElement]]]
    let onTapMan: (String) -> Void
    let onTapLink: (String) -> Void
    var highlight: ElementHighlight?

    /// Start of each row's sub-index run. Mirrors `tableCellsInRenderOrder` in `:common`, which
    /// numbers the header row first and then each body row left to right.
    private var rowSubIndexOffsets: [Int] {
        var next = headers.count
        return rows.map { row in
            let start = next
            next += row.count
            return start
        }
    }

    var body: some View {
        let offsets = rowSubIndexOffsets
        VStack(alignment: .leading, spacing: 4) {
            HStack(alignment: .top) {
                ForEach(Array(headers.enumerated()), id: \.offset) { index, headerCell in
                    TextElementsView(
                        elements: headerCell,
                        onTapMan: onTapMan,
                        onTapLink: onTapLink,
                        highlight: highlight,
                        subIndex: index
                    )
                    .font(.body.bold())
                    .frame(maxWidth: .infinity, alignment: .leading)
                }
            }
            Divider()
            ForEach(Array(rows.enumerated()), id: \.offset) { rowIndex, row in
                HStack(alignment: .top) {
                    ForEach(Array(row.enumerated()), id: \.offset) { cellIndex, cell in
                        TextElementsView(
                            elements: cell,
                            onTapMan: onTapMan,
                            onTapLink: onTapLink,
                            highlight: highlight,
                            subIndex: offsets[rowIndex] + cellIndex
                        )
                        .frame(maxWidth: .infinity, alignment: .leading)
                    }
                }
            }
        }
    }
}
