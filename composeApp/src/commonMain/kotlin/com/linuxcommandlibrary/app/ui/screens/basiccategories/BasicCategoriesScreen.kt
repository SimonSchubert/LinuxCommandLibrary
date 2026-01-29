@file:OptIn(ExperimentalMaterialApi::class)

package com.linuxcommandlibrary.app.ui.screens.basiccategories

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.ListItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.unit.dp
import com.linuxcommandlibrary.app.ui.composables.AppIcon
import com.linuxcommandlibrary.app.ui.composables.getIconId
import com.linuxcommandlibrary.app.ui.composables.rememberIconPainter

@Composable
fun BasicCategoriesScreen(
    viewModel: BasicCategoriesViewModel,
    onNavigate: (String) -> Unit,
) {
    val basicCategories by viewModel.basicCategories.collectAsState()

    LazyVerticalGrid(
        modifier = Modifier.fillMaxSize(),
        columns = GridCells.Adaptive(minSize = 300.dp),
    ) {
        items(
            items = basicCategories,
            key = { it.id },
            contentType = { "basic_category_item" },
        ) { basicCategory ->
            ListItem(
                text = { Text(basicCategory.title) },
                icon = {
                    val painter = rememberIconPainter(basicCategory.getIconId())
                    Icon(
                        painter = painter,
                        contentDescription = null,
                        modifier = Modifier.size(40.dp),
                    )
                },
                modifier = Modifier
                    .pointerHoverIcon(PointerIcon.Hand)
                    .clickable {
                        onNavigate(
                            "basicgroups?categoryId=${basicCategory.id}&categoryName=${basicCategory.id}",
                        )
                    },
            )
        }
    }
}
