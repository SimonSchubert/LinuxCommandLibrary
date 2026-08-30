import SwiftUI

extension Color {
    /// Linux Command Library brand red (#e45151)
    static let brandRed = Color(red: 0xE4 / 255.0, green: 0x51 / 255.0, blue: 0x51 / 255.0)
}

extension Font {
    /// Share Tech Mono — bundled custom font for command/code rendering.
    /// PostScript name verified at runtime; falls back to monospaced system font.
    static func shareTechMono(size: CGFloat) -> Font {
        Font.custom("ShareTechMono-Regular", size: size)
    }
}

/// A `Text` that shrinks rather than splitting a word at accessibility type sizes.
///
/// SwiftUI hyphen-breaks any word too wide for the line ("MEMO-RY", "NET-WORK INTER-FACES"), and
/// `minimumScaleFactor` only engages when the text would otherwise be truncated. Allowing one line
/// per word makes the hyphenated layout overflow that limit, so the renderer scales the text down
/// to fit instead of splitting a word — while multi-word headings still wrap at their spaces.
///
/// Not airtight: where two short words share a line the hyphenated layout still fits inside the
/// per-word limit ("OS & KER-NEL"). A tighter limit would shrink long headings past the scale
/// floor and truncate them, which is worse, so those keep the hyphen.
struct WordSafeText: View {
    private let text: String

    init(_ text: String) {
        self.text = text
    }

    var body: some View {
        Text(text)
            .lineLimit(max(1, text.split(separator: " ").count))
            .minimumScaleFactor(0.5)
            .allowsTightening(true)
    }
}
