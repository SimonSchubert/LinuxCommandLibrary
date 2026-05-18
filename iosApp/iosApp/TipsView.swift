import ComposeApp
import SwiftUI

/// Native SwiftUI Tips tab. Each tip renders as a rounded card; on iPad the
/// cards lay out as a 2-column staggered grid (à la Pinterest), on iPhone they
/// fall back to a single column.
struct TipsView: View {
    @StateObject private var store = TipsStore()
    @Environment(\.horizontalSizeClass) private var sizeClass
    @State private var path = NavigationPath()

    private var columnCount: Int {
        sizeClass == .regular ? 2 : 1
    }

    var body: some View {
        NavigationStack(path: $path) {
            ScrollView {
                StaggeredGrid(items: store.tips, id: \.id, columns: columnCount, spacing: 12) { tip in
                    TipCard(
                        tip: tip,
                        onTapMan: { name in
                            path.append(name)
                            Haptics.selection()
                        },
                        onTapLink: store.tapLink,
                        onTapUrl: store.tapUrl
                    )
                }
                .padding(.horizontal, 16)
                .padding(.vertical, 12)
            }
            .background(Color(.systemGroupedBackground))
            .navigationTitle("Tips")
            .toolbar {
                ToolbarItem(placement: .navigationBarTrailing) {
                    Button {
                        store.showAppInfo = true
                    } label: {
                        Image(systemName: "info.circle")
                            .foregroundColor(.brandRed)
                    }
                }
            }
            .navigationDestination(for: String.self) { name in
                CommandDetailView(commandName: name, onManTap: { next in
                    path.append(next)
                })
                .id(name)
            }
            .sheet(isPresented: $store.showAppInfo) {
                AppInfoSheet()
            }
        }
    }
}

private struct TipCard: View {
    let tip: TipInfo
    let onTapMan: (String) -> Void
    let onTapLink: (String) -> Void
    let onTapUrl: (String) -> Void

    var body: some View {
        VStack(alignment: .leading, spacing: 8) {
            Text(tip.title)
                .font(.headline)
                .foregroundColor(.primary)
            MarkdownView(
                elements: tip.sections,
                onTapMan: onTapMan,
                onTapLink: onTapLink,
                onTapUrl: onTapUrl
            )
        }
        .padding(12)
        .frame(maxWidth: .infinity, alignment: .leading)
        .background(Color(.secondarySystemGroupedBackground))
        .cornerRadius(10)
    }
}

/// Distributes items across N columns by modulo index — gives a staggered look
/// because each column's heights flow independently, even though it isn't true
/// shortest-column masonry. Good enough when items have moderately variable height.
private struct StaggeredGrid<Item, ID: Hashable, Content: View>: View {
    let items: [Item]
    let id: KeyPath<Item, ID>
    let columns: Int
    let spacing: CGFloat
    @ViewBuilder let content: (Item) -> Content

    var body: some View {
        HStack(alignment: .top, spacing: spacing) {
            ForEach(0 ..< columns, id: \.self) { col in
                LazyVStack(spacing: spacing) {
                    ForEach(columnItems(col), id: id) { item in
                        content(item)
                    }
                }
            }
        }
    }

    private func columnItems(_ col: Int) -> [Item] {
        items.enumerated().compactMap { idx, item in
            idx % columns == col ? item : nil
        }
    }
}

private struct AppInfoSheet: View {
    @Environment(\.dismiss) private var dismiss

    var body: some View {
        NavigationStack {
            ScrollView {
                VStack(alignment: .leading, spacing: 16) {
                    Text("Linux Command Library")
                        .font(.title2.bold())
                    Text("A reference for Linux commands, basics, and tips. Bookmark commands you use often, and tap any underlined command to drill into its man page.")
                        .foregroundColor(.secondary)
                    Link("Source on GitHub", destination: URL(string: "https://github.com/SimonSchubert/LinuxCommandLibrary")!)
                        .foregroundColor(.brandRed)
                }
                .padding()
            }
            .navigationTitle("About")
            .navigationBarTitleDisplayMode(.inline)
            .toolbar {
                ToolbarItem(placement: .navigationBarTrailing) {
                    Button("Done") { dismiss() }
                        .foregroundColor(.brandRed)
                }
            }
        }
    }
}

@MainActor
final class TipsStore: ObservableObject {
    private let viewModel: TipsViewModel
    @Published private(set) var tips: [TipInfo] = []
    @Published var showAppInfo = false

    private var task: Task<Void, Never>?

    init() {
        viewModel = KoinHelperKt.makeTipsViewModel()
        task = Task { [weak self] in
            guard let self else { return }
            for await items in self.viewModel.tips {
                self.tips = items
            }
        }
    }

    deinit {
        task?.cancel()
    }

    func tapLink(_: String) {
        // No external app launch on iOS for "settings"/"terminal" — silently ignore
    }

    func tapUrl(_ url: String) {
        if let target = URL(string: url) {
            UIApplication.shared.open(target)
        }
    }
}
