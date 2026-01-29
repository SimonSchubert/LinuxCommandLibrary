import androidx.compose.ui.window.ComposeUIViewController
import com.linuxcommandlibrary.app.App
import com.linuxcommandlibrary.app.di.commonModule
import com.linuxcommandlibrary.app.di.platformModule
import org.koin.core.context.startKoin
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController {
    App()
}

fun initKoin() {
    startKoin {
        modules(commonModule, platformModule())
    }
}
