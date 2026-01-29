package com.linuxcommandlibrary.app.di

import com.linuxcommandlibrary.app.platform.IosAssetReader
import com.linuxcommandlibrary.app.platform.IosPreferencesStorage
import com.linuxcommandlibrary.app.platform.IosReviewHandler
import com.linuxcommandlibrary.app.platform.IosShareHandler
import com.linuxcommandlibrary.shared.platform.AssetReader
import com.linuxcommandlibrary.shared.platform.PreferencesStorage
import com.linuxcommandlibrary.shared.platform.ReviewHandler
import com.linuxcommandlibrary.shared.platform.ShareHandler
import org.koin.core.module.Module
import org.koin.dsl.module

actual fun platformModule(): Module = module {
    single<AssetReader> { IosAssetReader() }
    single<PreferencesStorage> { IosPreferencesStorage() }
    single<ShareHandler> { IosShareHandler() }
    single<ReviewHandler> { IosReviewHandler(get()) }
}
