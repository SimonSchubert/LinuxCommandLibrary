package com.linuxcommandlibrary.app.di

import com.linuxcommandlibrary.app.data.BasicsRepository
import com.linuxcommandlibrary.app.data.CommandsRepository
import com.linuxcommandlibrary.app.data.DataManager
import com.linuxcommandlibrary.app.data.TipsRepository
import com.linuxcommandlibrary.app.ui.screens.basiccategories.BasicCategoriesViewModel
import com.linuxcommandlibrary.app.ui.screens.basicgroups.BasicEditorViewModel
import com.linuxcommandlibrary.app.ui.screens.basicgroups.BasicGroupsViewModel
import com.linuxcommandlibrary.app.ui.screens.commanddetail.CommandDetailViewModel
import com.linuxcommandlibrary.app.ui.screens.commandlist.CommandListViewModel
import com.linuxcommandlibrary.app.ui.screens.search.SearchViewModel
import com.linuxcommandlibrary.app.ui.screens.tips.TipsViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import org.koin.core.module.Module
import org.koin.dsl.module

val commonModule = module {
    single { CoroutineScope(SupervisorJob() + Dispatchers.Default) }
    single { DataManager(get()) }
    single { BasicsRepository(get()) }
    single { CommandsRepository(get()) }
    single { TipsRepository(get()) }

    factory { BasicCategoriesViewModel(get(), get()) }
    factory { params -> BasicEditorViewModel(params.get(), get(), get()) }
    factory { params -> BasicGroupsViewModel(params.get(), get(), get()) }
    factory { params -> CommandDetailViewModel(params.get(), get(), get(), get()) }
    factory { TipsViewModel(get(), get()) }
    factory { CommandListViewModel(get(), get(), get()) }
    factory { SearchViewModel(get(), get()) }
}

/**
 * Platform-specific module to be implemented by each platform.
 * Should provide:
 * - AssetReader
 * - PreferencesStorage
 * - ShareHandler
 */
expect fun platformModule(): Module
