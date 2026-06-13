import ComposeApp
import SwiftUI

/// Inset-grouped list of basic-command groups within a category.
/// Each group is a Section that expands to show its full rich markdown content
/// (text, code blocks, tables, blockquotes) rendered via MarkdownView.
struct BasicGroupsView: View {
    let categoryId: String
    let title: String
    let onManTap: (String) -> Void
    @StateObject private var store: BasicGroupsStore

    init(categoryId: String, title: String, onManTap: @escaping (String) -> Void = { _ in }) {
        self.categoryId = categoryId
        self.title = title
        self.onManTap = onManTap
        _store = StateObject(wrappedValue: BasicGroupsStore(categoryId: categoryId))
    }

    var body: some View {
        List {
            ForEach(store.state.basicGroups, id: \.id) { group in
                Section {
                    if store.isExpanded(groupId: group.id) {
                        MarkdownView(
                            elements: store.sections(for: group.id),
                            onTapMan: { name in
                                onManTap(name)
                                Haptics.selection()
                            },
                            onTapLink: store.tapLink,
                            onTapUrl: store.tapUrl
                        )
                        .padding(.vertical, 4)
                    }
                } header: {
                    Button {
                        store.toggle(groupId: group.id)
                    } label: {
                        HStack(spacing: 10) {
                            IconView(
                                assetName: IconHelperKt.assetNameForGroup(group: group, categoryTitle: title),
                                size: 22,
                                tint: .brandRed
                            )
                            Text(group.description_)
                                .font(.headline)
                                .foregroundColor(.primary)
                                .multilineTextAlignment(.leading)
                                .frame(maxWidth: .infinity, alignment: .leading)
                            Spacer(minLength: 0)
                            Image(systemName: store.isExpanded(groupId: group.id) ? "chevron.up" : "chevron.down")
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
        .navigationTitle(title)
        .navigationBarTitleDisplayMode(.inline)
    }
}

@MainActor
private final class BasicGroupsStore: ObservableObject {
    private let viewModel: BasicGroupsViewModel
    @Published private(set) var state = BasicGroupsUiState(
        categoryTitle: "",
        basicGroups: [],
        collapsedMap: [:],
        sectionsByGroupId: [:]
    )

    private var task: Task<Void, Never>?

    init(categoryId: String) {
        viewModel = KoinHelperKt.makeBasicGroupsViewModel(categoryId: categoryId)
        task = Task { [weak self] in
            guard let self else { return }
            for await s in self.viewModel.uiState {
                self.state = s
            }
        }
    }

    deinit {
        task?.cancel()
        viewModel.cancel()
    }

    func isExpanded(groupId: Int64) -> Bool {
        let collapsed = state.collapsedMap[KotlinLong(value: groupId)]?.boolValue ?? true
        return !collapsed
    }

    func sections(for groupId: Int64) -> [TipSectionElement] {
        state.sectionsByGroupId[KotlinLong(value: groupId)] ?? []
    }

    func toggle(groupId: Int64) {
        viewModel.toggleCollapse(id: groupId)
        Haptics.selection()
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
