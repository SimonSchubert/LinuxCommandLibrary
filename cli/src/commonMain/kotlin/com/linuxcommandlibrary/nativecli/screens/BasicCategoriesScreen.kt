package com.linuxcommandlibrary.nativecli.screens

import com.linuxcommandlibrary.nativecli.data.BasicCategory
import com.linuxcommandlibrary.nativecli.data.DataRepository

class BasicCategoriesScreen :
    ListScreen<BasicCategory>(
        title = "Basics",
        values = DataRepository.getBasicCategories(),
        label = { it.title },
        open = { BasicDetailScreen(it.id, it.title) },
    )
