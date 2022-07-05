import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.linuxcommandlibrary.CommandDatabase
import org.example.common.initDatabase

fun main() = application {

    initDatabase()

    Window(onCloseRequest = ::exitApplication) {
        MaterialTheme {
            // App()

            Text(CommandDatabase.Schema.version.toString()) // databaseHelper.getCommands().size.toString())
        }
    }
}