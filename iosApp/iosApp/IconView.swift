import SwiftUI

/// Renders a vector icon from the Asset Catalog under the `Icons/` namespace.
/// Asset Catalog imagesets are auto-generated from /icons/*.svg by
/// scripts/svg_to_imageset.py (Gradle task `syncIconImageSets`).
struct IconView: View {
    let assetName: String
    var size: CGFloat = 24
    var tint: Color = .primary

    /// Multiplier for the current Dynamic Type setting (1.0 at the default body size). Without it
    /// the icons stay at their fixed point size and shrink to specks beside accessibility-size
    /// labels. Capped so an icon can grow with the text without swallowing the row.
    @ScaledMetric(relativeTo: .body) private var typeScale: CGFloat = 1

    private var scaledSize: CGFloat {
        size * min(typeScale, 2.0)
    }

    var body: some View {
        Image("Icons/\(assetName)")
            .renderingMode(.template)
            .resizable()
            .scaledToFit()
            .frame(width: scaledSize, height: scaledSize)
            .foregroundColor(tint)
    }
}
