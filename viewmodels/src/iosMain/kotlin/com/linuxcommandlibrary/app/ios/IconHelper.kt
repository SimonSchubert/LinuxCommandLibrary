package com.linuxcommandlibrary.app.ios

import com.linuxcommandlibrary.app.data.BasicCategory
import com.linuxcommandlibrary.app.data.BasicGroup
import com.linuxcommandlibrary.app.ui.composables.appIconAssetName
import com.linuxcommandlibrary.app.ui.composables.getIconId

fun assetNameForCategory(category: BasicCategory): String = appIconAssetName(category.getIconId())

fun assetNameForGroup(group: BasicGroup, categoryTitle: String): String = appIconAssetName(group.getIconId(categoryTitle))
