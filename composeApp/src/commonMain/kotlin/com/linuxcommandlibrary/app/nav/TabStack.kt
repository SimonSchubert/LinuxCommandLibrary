package com.linuxcommandlibrary.app.nav

import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveableStateHolder
import androidx.compose.runtime.snapshots.SnapshotStateList
import com.linuxcommandlibrary.app.NavEvent
import com.linuxcommandlibrary.app.ui.screens.basicgroups.BasicGroupDetailPane
import com.linuxcommandlibrary.app.ui.screens.commanddetail.CommandDetailPane
import com.linuxcommandlibrary.app.ui.screens.licenses.LicensesScreen

internal sealed class TabStackEntry {
    internal data class Command(val name: String) : TabStackEntry()
    internal data class BasicGroup(val categoryId: String, val expandGroupId: Long?) : TabStackEntry()
    internal data object License : TabStackEntry()
}

// '|'-separated encoding relies on slugs never containing '|'.
internal fun TabStackEntry.encode(): String = when (this) {
    is TabStackEntry.Command -> "c|$name"
    is TabStackEntry.BasicGroup -> "b|$categoryId|${expandGroupId ?: ""}"
    TabStackEntry.License -> "l"
}

// Returns null on malformed input rather than throwing — process-death restore must not
// crash the app on a stale or truncated saved-state token; the caller filters nulls out.
internal fun decodeTabStackEntry(s: String): TabStackEntry? {
    val parts = s.split('|')
    return when (parts.firstOrNull()) {
        "c" -> parts.getOrNull(1)?.let { TabStackEntry.Command(it) }

        "l" -> TabStackEntry.License

        "b" -> parts.getOrNull(1)?.let { categoryId ->
            TabStackEntry.BasicGroup(
                categoryId,
                parts.getOrNull(2)?.takeIf { it.isNotEmpty() }?.toLongOrNull(),
            )
        }

        else -> null
    }
}

@Composable
internal fun TabStackTop(
    stack: SnapshotStateList<TabStackEntry>,
    onPop: () -> Unit,
    onNavigate: (NavEvent) -> Unit,
) {
    val top = stack.lastOrNull() ?: return
    TabStackEntryContent(entry = top, onBack = onPop, onNavigate = onNavigate)
}

// Keyed by encoded identity so popping back restores per-entry state (scroll, etc.)
// instead of leaking it into the next entry.
@Composable
internal fun TabStackEntryContent(
    entry: TabStackEntry,
    onBack: () -> Unit,
    onNavigate: (NavEvent) -> Unit,
) {
    val stateHolder = rememberSaveableStateHolder()
    stateHolder.SaveableStateProvider(entry.encode()) {
        when (entry) {
            is TabStackEntry.Command -> CommandDetailPane(
                commandName = entry.name,
                onBack = onBack,
                onNavigate = onNavigate,
            )

            is TabStackEntry.BasicGroup -> BasicGroupDetailPane(
                categoryId = entry.categoryId,
                expandGroupId = entry.expandGroupId,
                onBack = onBack,
                onNavigate = onNavigate,
            )

            TabStackEntry.License -> LicensesScreen(onBack = onBack)
        }
    }
}
