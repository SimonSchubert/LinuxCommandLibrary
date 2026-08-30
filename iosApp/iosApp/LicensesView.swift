import ComposeApp
import SwiftUI

/// Attribution for the app's own license, its content sources and the bundled third-party
/// libraries. Pushed from the About sheet's own NavigationStack in `TipsView`.
///
/// The list itself lives in `:common` (`Licenses`) so this screen and the Compose
/// `LicensesScreen` never drift apart.
struct LicensesView: View {
    var body: some View {
        List {
            Section {
                LicenseRow(
                    entry: Licenses.shared.app,
                    subtitle: "Version \(Version.shared.APP_VERSION)"
                )
            }
            ForEach(Licenses.shared.groups, id: \.title) { group in
                Section(group.title) {
                    ForEach(group.entries, id: \.name) { entry in
                        LicenseRow(entry: entry)
                    }
                }
            }
        }
        .listStyle(.insetGrouped)
        .navigationTitle("Open source licenses")
        .navigationBarTitleDisplayMode(.inline)
    }
}

private struct LicenseRow: View {
    let entry: LicenseEntry
    var subtitle: String?

    var body: some View {
        if let url = entry.url.flatMap({ URL(string: $0) }) {
            Link(destination: url) {
                HStack(alignment: .top, spacing: 12) {
                    details
                    Image(systemName: "arrow.up.right")
                        .font(.footnote)
                        .foregroundColor(.brandRed)
                }
            }
            .accessibilityHint("Opens in browser")
        } else {
            details
        }
    }

    private var details: some View {
        VStack(alignment: .leading, spacing: 2) {
            Text(entry.name)
                .font(.body.weight(.medium))
                .foregroundColor(.primary)
            if let subtitle {
                Text(subtitle)
                    .font(.footnote)
                    .foregroundColor(.secondary)
            }
            Text(entry.license)
                .font(.footnote)
                .foregroundColor(.secondary)
            if let copyright = entry.copyright {
                Text(copyright)
                    .font(.footnote)
                    .foregroundColor(.secondary)
            }
        }
        .frame(maxWidth: .infinity, alignment: .leading)
    }
}
