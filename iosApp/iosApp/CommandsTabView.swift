import ComposeApp
import SwiftUI

/// Native SwiftUI Commands tab. NavigationSplitView gives:
/// - iPhone: stack-style nav (sidebar pushes detail)
/// - iPad: persistent sidebar + detail pane
///
/// Selection is by command name. Man-link drilling appends to a NavigationPath
/// that lives on the detail column's NavigationStack.
struct CommandsTabView: View {
    @StateObject private var store = CommandsStore()
    @EnvironmentObject private var router: AppRouter
    @Environment(\.horizontalSizeClass) private var sizeClass
    @State private var query = ""
    @State private var selectedCommand: String?
    @State private var path = NavigationPath()

    var body: some View {
        NavigationSplitView {
            List(selection: $selectedCommand) {
                ForEach(store.filtered(query: query), id: \.name) { command in
                    let isSelected = selectedCommand == command.name
                    HStack {
                        Text(command.name)
                        Spacer()
                        if store.bookmarkedNames.contains(command.name) {
                            Image(systemName: "bookmark.fill")
                                .foregroundColor(isSelected ? .white : .brandRed)
                                .font(.caption)
                        }
                    }
                    .tag(command.name)
                }
            }
            .listStyle(.insetGrouped)
            .navigationTitle("Commands")
            .searchable(text: $query, prompt: "Search commands")
        } detail: {
            NavigationStack(path: $path) {
                if let cmd = selectedCommand {
                    CommandDetailView(commandName: cmd, onManTap: { name in
                        path.append(name)
                    })
                    .id(cmd) // Force a fresh CommandDetailStore when sidebar selection changes
                    .navigationDestination(for: String.self) { name in
                        CommandDetailView(commandName: name, onManTap: { next in
                            path.append(next)
                        })
                        .id(name)
                    }
                } else {
                    DetailPlaceholder(systemImage: "terminal", message: "Select a command")
                }
            }
        }
        .onChange(of: router.commandDetailTarget) { newValue in
            if let newValue {
                selectedCommand = newValue
                path = NavigationPath()
                router.commandDetailTarget = nil
            }
        }
        // On iPad, pre-select the first command once data is loaded so the
        // detail pane shows real content instead of the empty placeholder.
        // On iPhone (compact), skip — auto-pushing to detail on launch is bad UX.
        .onChange(of: store.allCommands) { commands in
            if sizeClass == .regular && selectedCommand == nil,
               let first = commands.first
            {
                selectedCommand = first.name
            }
        }
    }
}

/// Owns the lifecycle of CommandListViewModel and bridges its StateFlows
/// into SwiftUI-observable @Published properties via SKIE's AsyncSequence support.
/// Search filtering happens locally in Swift to avoid a per-keystroke KMP bridge.
@MainActor
final class CommandsStore: ObservableObject {
    private let listViewModel: CommandListViewModel

    @Published private(set) var allCommands: [CommandInfo] = []
    @Published private(set) var bookmarkedNames: Set<String> = []

    /// Parallel to allCommands; pre-lowercased once so search doesn't allocate
    /// 7,700+ strings per keystroke.
    private var lowerNames: [String] = []

    private var listTask: Task<Void, Never>?
    private var bookmarkTask: Task<Void, Never>?

    init() {
        listViewModel = KoinHelperKt.makeCommandListViewModel()

        listTask = Task { [weak self] in
            guard let self else { return }
            for await commands in self.listViewModel.commands {
                self.allCommands = commands
                self.lowerNames = commands.map { $0.name.lowercased() }
            }
        }
        bookmarkTask = Task { [weak self] in
            guard let self else { return }
            for await names in self.listViewModel.bookmarkedNames {
                self.bookmarkedNames = names
            }
        }
    }

    deinit {
        listTask?.cancel()
        bookmarkTask?.cancel()
    }

    func filtered(query: String) -> [CommandInfo] {
        let trimmed = query.trimmingCharacters(in: .whitespaces)
        guard !trimmed.isEmpty else { return allCommands }
        let needle = trimmed.lowercased()

        var matches: [Int] = []
        matches.reserveCapacity(64)
        for i in lowerNames.indices where lowerNames[i].contains(needle) {
            matches.append(i)
        }
        matches.sort { a, b in
            let aLower = lowerNames[a]
            let bLower = lowerNames[b]
            let aExact = aLower == needle
            let bExact = bLower == needle
            if aExact != bExact {
                return aExact
            }
            let aPrefix = aLower.hasPrefix(needle)
            let bPrefix = bLower.hasPrefix(needle)
            if aPrefix != bPrefix {
                return aPrefix
            }
            return allCommands[a].name < allCommands[b].name
        }
        return matches.map { allCommands[$0] }
    }
}
