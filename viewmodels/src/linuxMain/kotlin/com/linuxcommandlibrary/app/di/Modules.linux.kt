package com.linuxcommandlibrary.app.di

import com.linuxcommandlibrary.app.platform.LinuxAssetReader
import com.linuxcommandlibrary.app.platform.LinuxPreferencesStorage
import com.linuxcommandlibrary.app.platform.LinuxReviewHandler
import com.linuxcommandlibrary.app.platform.LinuxShareHandler
import com.linuxcommandlibrary.shared.platform.AssetReader
import com.linuxcommandlibrary.shared.platform.PreferencesStorage
import com.linuxcommandlibrary.shared.platform.ReviewHandler
import com.linuxcommandlibrary.shared.platform.ShareHandler
import org.koin.core.module.Module
import org.koin.dsl.module

actual fun platformModule(): Module = module {
    single<AssetReader> { LinuxAssetReader() }
    single<PreferencesStorage> { LinuxPreferencesStorage() }
    single<ShareHandler> { LinuxShareHandler() }
    single<ReviewHandler> { LinuxReviewHandler() }
}
