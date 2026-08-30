import ComposeApp
import SwiftUI

/// Native SwiftUI Basics tab. NavigationSplitView gives the iPad sidebar/detail
/// experience automatically; on iPhone it collapses to a single-column stack.
struct BasicCategoriesView: View {
    @StateObject private var store = BasicCategoriesStore()
    @EnvironmentObject private var router: AppRouter
    @Environment(\.horizontalSizeClass) private var sizeClass
    @State private var selectedCategoryId: String?
    @State private var path = NavigationPath()

    var body: some View {
        NavigationSplitView {
            List(selection: $selectedCategoryId) {
                ForEach(store.categories, id: \.id) { category in
                    let isSelected = selectedCategoryId == category.id
                    HStack(spacing: 12) {
                        IconView(
                            assetName: IconHelperKt.assetNameForCategory(category: category),
                            size: 28,
                            tint: isSelected ? .white : .brandRed
                        )
                        WordSafeText(category.title)
                    }
                    .tag(category.id)
                }
            }
            .listStyle(.insetGrouped)
            .navigationTitle("Basics")
        } detail: {
            NavigationStack(path: $path) {
                if let id = selectedCategoryId,
                   let category = store.categories.first(where: { $0.id == id })
                {
                    Group {
                        if KoinHelperKt.categoryUsesCardLayout(categoryId: category.id) {
                            BasicEditorView(
                                categoryId: category.id,
                                title: category.title,
                                onManTap: { name in path.append(name) }
                            )
                        } else {
                            BasicGroupsView(
                                categoryId: category.id,
                                title: category.title,
                                onManTap: { name in path.append(name) }
                            )
                        }
                    }
                    .id(category.id) // Force a fresh store when sidebar selection changes
                    .navigationDestination(for: String.self) { name in
                        CommandDetailView(commandName: name, onManTap: { next in
                            path.append(next)
                        })
                        .id(name)
                    }
                } else {
                    DetailPlaceholder(systemImage: "book.fill", message: "Select a category")
                }
            }
        }
        .onChange(of: router.basicsCategoryTarget) { newValue in
            if let newValue {
                selectedCategoryId = newValue
                path = NavigationPath()
                router.basicsCategoryTarget = nil
            }
        }
        // iPad-only: pre-select first category so the detail pane is non-empty on launch.
        .onChange(of: store.categories) { categories in
            if sizeClass == .regular && selectedCategoryId == nil,
               let first = categories.first
            {
                selectedCategoryId = first.id
            }
        }
    }
}

@MainActor
private final class BasicCategoriesStore: ObservableObject {
    private let viewModel: BasicCategoriesViewModel
    @Published private(set) var categories: [BasicCategory] = []

    private var task: Task<Void, Never>?

    init() {
        viewModel = KoinHelperKt.makeBasicCategoriesViewModel()
        task = Task { [weak self] in
            guard let self else { return }
            for await items in self.viewModel.basicCategories {
                self.categories = items
            }
        }
    }

    deinit {
        task?.cancel()
        viewModel.cancel()
    }
}
