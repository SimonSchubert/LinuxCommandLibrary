package com.linuxcommandlibrary.app.ui.screens.basiccategories

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyGridState
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.unit.dp
import com.linuxcommandlibrary.app.NavEvent
import com.linuxcommandlibrary.app.data.BasicCategory
import com.linuxcommandlibrary.app.ui.composables.WithScrollbar
import com.linuxcommandlibrary.app.ui.composables.debouncedClickable
import com.linuxcommandlibrary.app.ui.composables.getIconId
import com.linuxcommandlibrary.app.ui.composables.rememberIconPainter
import kotlinx.collections.immutable.ImmutableList

@Composable
fun BasicCategoriesScreen(
    viewModel: BasicCategoriesViewModel,
    gridState: LazyGridState,
    onNavigate: (NavEvent) -> Unit,
    selectedId: String? = null,
) {
    val basicCategories by viewModel.basicCategories.collectAsState()

    BasicCategoriesContent(
        gridState = gridState,
        basicCategories = basicCategories,
        onNavigate = onNavigate,
        selectedId = selectedId,
    )
}

@Composable
private fun BasicCategoriesContent(
    gridState: LazyGridState,
    basicCategories: ImmutableList<BasicCategory>,
    onNavigate: (NavEvent) -> Unit,
    selectedId: String?,
) {
    WithScrollbar(
        state = gridState,
        modifier = Modifier
            .background(MaterialTheme.colorScheme.background)
            .fillMaxSize(),
    ) {
        LazyVerticalGrid(
            state = gridState,
            modifier = Modifier.fillMaxSize(),
            columns = GridCells.Adaptive(minSize = 300.dp),
        ) {
            items(
                items = basicCategories,
                key = { it.id },
                contentType = { "basic_category_item" },
            ) { basicCategory ->
                BasicCategoryRow(
                    basicCategory = basicCategory,
                    isSelected = basicCategory.id == selectedId,
                    onNavigate = onNavigate,
                )
            }
        }
    }
}

@Composable
private fun BasicCategoryRow(
    basicCategory: BasicCategory,
    isSelected: Boolean,
    onNavigate: (NavEvent) -> Unit,
) {
    val painter = rememberIconPainter(basicCategory.getIconId())
    val background = if (isSelected) MaterialTheme.colorScheme.secondaryContainer else Color.Transparent
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(background)
            .pointerHoverIcon(PointerIcon.Hand)
            .debouncedClickable { onNavigate(NavEvent.ToBasicGroups(basicCategory.id)) }
            .padding(horizontal = 16.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(
            painter = painter,
            contentDescription = null,
            tint = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier.size(40.dp),
        )
        Text(
            text = basicCategory.title,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 16.dp),
        )
    }
}
