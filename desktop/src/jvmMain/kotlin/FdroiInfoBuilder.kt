import org.example.common.databaseHelper
import org.example.common.initDatabase
import java.io.File
import java.io.PrintStream

fun main() {
    initDatabase()

    val builder = FdroidInfoBuilder()
    builder.buildFullDescription()
    builder.buildShortDescription()
}

class FdroidInfoBuilder {

    fun buildFullDescription() {
        val file = File("fastlane/metadata/android/en-US/full_description.txt")
        val stream = PrintStream(file)
        stream.appendLine("The app currently has <b>${databaseHelper.getCommands().size}</b> manual pages, <b>${databaseHelper.getBasics().size}</b> basic categories and a bunch of general terminal tips. It works 100% offline, doesn't need an internet connection and has no tracking software.")
        stream.appendLine()
        stream.appendLine("<b>Categories</b>")
        stream.appendLine()
        databaseHelper.getBasics().forEach { category ->
            stream.appendLine("* ${category.title}")
        }
        stream.appendLine()
        stream.appendLine("<b>Tips</b>")
        stream.appendLine()
        databaseHelper.getTips().forEach { tip ->
            stream.appendLine("* ${tip.title}")
        }

        stream.close()
    }

    fun buildShortDescription() {
        val file = File("fastlane/metadata/android/en-US/short_description.txt")
        val stream = PrintStream(file)
        stream.appendLine("${databaseHelper.getCommands().size} manual pages, ${databaseHelper.getBasics().size} basic categories and a bunch of general terminal tips.")

        stream.close()
    }
}