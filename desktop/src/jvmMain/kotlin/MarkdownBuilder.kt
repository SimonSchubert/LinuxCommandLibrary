import com.linuxcommandlibrary.shared.databaseHelper
import com.linuxcommandlibrary.shared.initDatabase
import java.io.File
import java.io.PrintStream

fun main() {
    initDatabase()

    val markdownBuilder = MarkdownBuilder()
    markdownBuilder.build()
}


class MarkdownBuilder {
    fun build() {
        val file = File("README.md")
        val stream = PrintStream(file)
        stream.appendLine("## Linux Command Library (Mobile+Web)")
        stream.appendLine("The app currently has **${databaseHelper.getCommands().size}** manual pages, **${databaseHelper.getBasics().size}+** basic categories and a bunch of general terminal tips. It works 100% offline, doesn't need an internet connection and has no tracking software.")
        stream.appendLine()
        stream.appendLine("[![Play Store](https://raw.githubusercontent.com/SimonSchubert/LinuxCommandBibliotheca/master/art/play_store_badge.png)](https://play.google.com/store/apps/details?id=com.inspiredandroid.linuxcommandbibliotheca)")
        stream.appendLine()
        stream.appendLine("https://linuxcommandlibrary.com")
        stream.appendLine()
        stream.appendLine("### Screenshots")
        stream.appendLine()
        stream.appendLine("<p float=\"left\">")
        val mobileScreenshotFiles = listOf("screen-1.png", "screen-2-dark.png", "screen-3.png", "screen-4-dark.png")
        mobileScreenshotFiles.forEach { fileName ->
            stream.appendLine("<img src=\"https://raw.githubusercontent.com/SimonSchubert/LinuxCommandBibliotheca/master/art/${fileName}\" width=\"200\">")
        }
        stream.appendLine("</p>")
        val tabletScreenshotFiles = listOf("screen-1-tablet.png", "screen-2-tablet.png")
        tabletScreenshotFiles.forEach { fileName ->
            stream.appendLine("<img src=\"https://raw.githubusercontent.com/SimonSchubert/LinuxCommandBibliotheca/master/art/${fileName}\" width=\"400\">")
        }
        stream.appendLine()
        stream.appendLine("### Categories")
        stream.appendLine()
        databaseHelper.getBasics().forEach { category ->
            stream.appendLine("* ${category.title}")
        }
        stream.appendLine()
        stream.appendLine("### Tips")
        stream.appendLine()
        databaseHelper.getTips().forEach { tip ->
            stream.appendLine("* ${tip.title}")
        }

        stream.appendLine()
        stream.appendLine("### Goals")
        stream.appendLine("* Keep it simple and performant")
        stream.appendLine("* Keep the app content up-to-date")
        stream.appendLine("* Keep the app up-to-date with Jetpack Compose")


        stream.appendLine()
        stream.appendLine("### Licensing")
        stream.appendLine("The source code is licensed under the Apache 2.0 license and the copyright of the man pages in the `database.db` file are copyrighted by their respective authors.")


        stream.appendLine()
        stream.appendLine("### Thanks to")
        stream.appendLine()
        stream.appendLine("http://letsgokoyo.com - App Icon")
        stream.appendLine()
        stream.appendLine("https://www.commandlinefu.com - Lots of one-liners")
        stream.appendLine()
        stream.appendLine("https://icons8.com - Icons")


        stream.close()
    }
}