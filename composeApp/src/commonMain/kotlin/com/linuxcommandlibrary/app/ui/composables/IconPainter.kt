package com.linuxcommandlibrary.app.ui.composables

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.painter.Painter
import com.linuxcommandlibrary.app.resources.Res
import com.linuxcommandlibrary.app.resources.allDrawableResources
import org.jetbrains.compose.resources.painterResource

/**
 * Load icon painter from Compose Multiplatform resources. The drawable name comes from the same
 * [appIconAssetName] mapping iOS uses for its Asset Catalog.
 */
@Composable
fun rememberIconPainter(icon: AppIcon): Painter {
    val resource = remember(icon) { Res.allDrawableResources.getValue(appIconAssetName(icon)) }
    return painterResource(resource)
}
