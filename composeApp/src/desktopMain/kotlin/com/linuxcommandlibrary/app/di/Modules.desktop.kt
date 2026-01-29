package com.linuxcommandlibrary.app.di

import com.linuxcommandlibrary.app.platform.DesktopAssetReader
import com.linuxcommandlibrary.app.platform.DesktopPreferencesStorage
import com.linuxcommandlibrary.app.platform.DesktopReviewHandler
import com.linuxcommandlibrary.app.platform.DesktopShareHandler
import com.linuxcommandlibrary.shared.platform.AssetReader
import com.linuxcommandlibrary.shared.platform.PreferencesStorage
import com.linuxcommandlibrary.shared.platform.ReviewHandler
import com.linuxcommandlibrary.shared.platform.ShareHandler
import org.koin.core.module.Module
import org.koin.dsl.module

actual fun platformModule(): Module = module {
    single<AssetReader> { DesktopAssetReader() }
    single<PreferencesStorage> { DesktopPreferencesStorage() }
    single<ShareHandler> { DesktopShareHandler() }
    single<ReviewHandler> { DesktopReviewHandler() }
}
