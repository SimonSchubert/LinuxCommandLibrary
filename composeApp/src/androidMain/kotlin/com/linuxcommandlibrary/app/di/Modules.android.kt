package com.linuxcommandlibrary.app.di

import com.linuxcommandlibrary.app.platform.AndroidAssetReader
import com.linuxcommandlibrary.app.platform.AndroidPreferencesStorage
import com.linuxcommandlibrary.app.platform.AndroidReviewHandler
import com.linuxcommandlibrary.app.platform.AndroidShareHandler
import com.linuxcommandlibrary.shared.platform.AssetReader
import com.linuxcommandlibrary.shared.platform.PreferencesStorage
import com.linuxcommandlibrary.shared.platform.ReviewHandler
import com.linuxcommandlibrary.shared.platform.ShareHandler
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.Module
import org.koin.dsl.module

actual fun platformModule(): Module = module {
    single<AssetReader> { AndroidAssetReader(androidContext()) }
    single<PreferencesStorage> { AndroidPreferencesStorage(androidContext()) }
    single<ShareHandler> { AndroidShareHandler(androidContext()) }
    single<ReviewHandler> { AndroidReviewHandler() }
}
