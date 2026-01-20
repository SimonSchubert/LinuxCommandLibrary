package com.inspiredandroid.linuxcommandbibliotheca

import android.app.Application
import com.inspiredandroid.linuxcommandbibliotheca.data.BasicsRepository
import com.inspiredandroid.linuxcommandbibliotheca.data.CommandsRepository
import com.inspiredandroid.linuxcommandbibliotheca.data.TipsRepository
import com.inspiredandroid.linuxcommandbibliotheca.ui.screens.basiccategories.BasicCategoriesViewModel
import com.inspiredandroid.linuxcommandbibliotheca.ui.screens.basicgroups.BasicGroupsViewModel
import com.inspiredandroid.linuxcommandbibliotheca.ui.screens.commanddetail.CommandDetailViewModel
import com.inspiredandroid.linuxcommandbibliotheca.ui.screens.commandlist.CommandListViewModel
import com.inspiredandroid.linuxcommandbibliotheca.ui.screens.search.SearchViewModel
import com.inspiredandroid.linuxcommandbibliotheca.ui.screens.tips.TipsViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin
import org.koin.core.module.dsl.*
import org.koin.dsl.module

class LinuxApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@LinuxApplication)
            modules(appModule)
        }
    }

    private val appModule = module {
        single { DataManager(androidContext()) }
        single { BasicsRepository(androidContext()) }
        single { CommandsRepository(androidContext()) }
        single { TipsRepository(androidContext()) }

        viewModel { (categoryId: String) -> BasicGroupsViewModel(categoryId, get()) }
        viewModel { BasicCategoriesViewModel(get()) }
        viewModel { (commandName: String) -> CommandDetailViewModel(commandName, get(), get()) }
        viewModel { TipsViewModel(get()) }
        viewModel { CommandListViewModel(get(), get()) }
        viewModel { SearchViewModel(get()) }
    }
}
