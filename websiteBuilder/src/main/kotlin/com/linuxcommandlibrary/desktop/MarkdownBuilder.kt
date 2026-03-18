package com.linuxcommandlibrary.desktop

import org.json.JSONObject
import java.io.File
import java.io.PrintStream
import java.net.HttpURLConnection
import java.net.URI

/* Copyright 2022 Simon Schubert
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

fun main() {
    val markdownBuilder = MarkdownBuilder()
    markdownBuilder.build()
}

class MarkdownBuilder {
    fun build() {
        val file = File("README.md")
        val stream = PrintStream(file)
        stream.appendLine("## Linux Command Library (Android+iOS+Desktop GUI and CLI+Web)")
        stream.appendLine()
        stream.appendLine("![Icon](https://raw.githubusercontent.com/SimonSchubert/LinuxCommandLibrary/master/art/web_hi_res_144.png)")
        stream.appendLine()
        stream.appendLine("The app currently has **${MarkdownFileUtils.getCommandCount()}** manual pages, **${MarkdownFileUtils.getBasicCategories().size}+** basic categories and a bunch of general terminal tips. It works 100% offline, doesn't need an internet connection and has no tracking software.")
        stream.appendLine()
        stream.appendLine("[![App Store](https://raw.githubusercontent.com/SimonSchubert/LinuxCommandBibliotheca/master/art/app_store_badge.png)](https://apps.apple.com/us/app/linux-command-library/id1219649976)")
        stream.appendLine("[![Play Store](https://raw.githubusercontent.com/SimonSchubert/LinuxCommandBibliotheca/master/art/play_store_badge.png)](https://play.google.com/store/apps/details?id=com.inspiredandroid.linuxcommandbibliotheca)")
        stream.appendLine("[![F-Droid](https://raw.githubusercontent.com/SimonSchubert/LinuxCommandBibliotheca/master/art/fdroid_badge.png)](https://f-droid.org/en/packages/com.inspiredandroid.linuxcommandbibliotheca/)")
        stream.appendLine("[![Web](https://raw.githubusercontent.com/SimonSchubert/LinuxCommandBibliotheca/master/art/web_badge.png)](https://linuxcommandlibrary.com)")
        stream.appendLine()
        stream.appendLine("Native CLI and GUI binaries for Linux, macOS, and Windows are available in [Releases](https://github.com/SimonSchubert/LinuxCommandLibrary/releases).")
        stream.appendLine()

        stream.appendLine("**Homebrew (macOS)**:")
        stream.appendLine()
        stream.appendLine("GUI:")
        stream.appendLine()
        stream.appendLine("```")
        stream.appendLine("brew install --cask simonschubert/tap/linux-command-library")
        stream.appendLine("```")
        stream.appendLine()
        stream.appendLine("CLI:")
        stream.appendLine()
        stream.appendLine("```")
        stream.appendLine("brew install simonschubert/tap/linux-command-library-cli")
        stream.appendLine("```")
        stream.appendLine()
        stream.appendLine("**AUR (Arch Linux)**:")
        stream.appendLine()
        stream.appendLine("GUI:")
        stream.appendLine()
        stream.appendLine("```")
        stream.appendLine("yay -S lcl-gui-bin")
        stream.appendLine("```")
        stream.appendLine()
        stream.appendLine("CLI:")
        stream.appendLine()
        stream.appendLine("```")
        stream.appendLine("yay -S lcl-bin")
        stream.appendLine("```")
        stream.appendLine()

        stream.appendLine("### Android screenshots")
        stream.appendLine()
        stream.appendLine("<p>")
        val androidScreenshotFiles =
            listOf("screen-android-1.png", "screen-android-2.png")
        androidScreenshotFiles.forEach { fileName ->
            stream.appendLine("<img src=\"https://raw.githubusercontent.com/SimonSchubert/LinuxCommandBibliotheca/master/art/${fileName}\" width=\"200\">")
        }
        stream.appendLine("</p>")
        stream.appendLine()
        stream.appendLine("### iOS screenshots")
        stream.appendLine()
        stream.appendLine("<p>")
        val iosScreenshotFiles =
            listOf("screen-ios-1.png", "screen-ios-2.png")
        iosScreenshotFiles.forEach { fileName ->
            stream.appendLine("<img src=\"https://raw.githubusercontent.com/SimonSchubert/LinuxCommandBibliotheca/master/art/${fileName}\" width=\"200\">")
        }
        stream.appendLine("</p>")
        stream.appendLine()
        stream.appendLine("### Desktop screenshots")
        stream.appendLine()
        stream.appendLine("<p>")
        val desktopScreenshotFiles =
            listOf("screen-desktop-1.png", "screen-desktop-2.png")
        desktopScreenshotFiles.forEach { fileName ->
            stream.appendLine("<img src=\"https://raw.githubusercontent.com/SimonSchubert/LinuxCommandBibliotheca/master/art/${fileName}\" width=\"400\">")
        }
        stream.appendLine("</p>")
        stream.appendLine()
        stream.appendLine("### CLI screenshot")
        stream.appendLine()
        stream.appendLine("<img src=\"https://raw.githubusercontent.com/SimonSchubert/LinuxCommandBibliotheca/master/art/screen-cli-1.png\" width=\"400\">")
        stream.appendLine()
        stream.appendLine("### Content")
        stream.appendLine()
        stream.appendLine("#### Categories")
        stream.appendLine()
        stream.appendLine(
            MarkdownFileUtils.getBasicCategories().joinToString(),
        )
        stream.appendLine()
        stream.appendLine("#### Tips")
        stream.appendLine()
        stream.appendLine(
            MarkdownFileUtils.getTipTitles().joinToString(),
        )

        stream.appendLine()
        stream.appendLine("### CI/CD")
        stream.appendLine()
        stream.appendLine("[Github Action](.github/workflows/android.yml) to automatically create a new Github release with APK, CLI binaries, and desktop installers, and upload an AAB to the Play Store.")

        stream.appendLine()
        stream.appendLine("### Tests")
        stream.appendLine()
        stream.appendLine("Android Jetpack Compose deeplinking tests: [ComposeDeeplinkTests.kt](android/src/androidTest/java/com/inspiredandroid/linuxcommandbibliotheca/ComposeDeeplinkTests.kt)")
        stream.appendLine()
        stream.appendLine("Common code unit tests: [CommonTests.kt](common/src/commonTest/kotlin/CommonTests.kt)")

        stream.appendLine()
        stream.appendLine("### Licensing")
        stream.appendLine()
        stream.appendLine("The source code is licensed under the Apache 2.0 license and the copyright of the man pages are copyrighted by their respective authors.")

        // Sponsors
        val (currentSponsors, pastSponsors) = getPublicSponsors()
        if (currentSponsors.isNotEmpty() || pastSponsors.isNotEmpty()) {
            stream.appendLine()
            stream.appendLine("### Public GitHub Sponsors")
            if (currentSponsors.isNotEmpty()) {
                stream.appendLine()
                stream.appendLine("#### Monthly")
                stream.appendLine()
                currentSponsors.forEach { (username, avatar) ->
                    stream.append("<a href=\"https://github.com/$username\"><img src=\"$avatar\" width=\"60px\" alt=\"$username\" /></a> ")
                }
                stream.appendLine()
            }
            if (pastSponsors.isNotEmpty()) {
                stream.appendLine()
                stream.appendLine("#### Previous")
                stream.appendLine()
                pastSponsors.forEach { (username, avatar) ->
                    stream.append("<a href=\"https://github.com/$username\"><img src=\"$avatar\" width=\"60px\" alt=\"$username\" /></a> ")
                }
                stream.appendLine()
            }
        }

        stream.appendLine()
        stream.appendLine("### Thanks to")
        stream.appendLine()
        stream.appendLine("http://letsgokoyo.com - App Icon")
        stream.appendLine()
        stream.appendLine("https://icons8.com - Icons")
        stream.appendLine()
        stream.appendLine("https://tldr.sh - TLDR")

        stream.close()
    }
}

fun getPublicSponsors(): Pair<List<Pair<String, String>>, List<Pair<String, String>>> = try {
    val connection = URI("https://ghs.vercel.app/v3/sponsors/SimonSchubert").toURL()
        .openConnection() as HttpURLConnection
    connection.connectTimeout = 5000
    connection.readTimeout = 5000

    val response = JSONObject(connection.inputStream.bufferedReader().readText())
    val sponsors = response.getJSONObject("sponsors")

    fun parseSponsors(array: org.json.JSONArray) = (0 until array.length()).map { i ->
        val sponsor = array.getJSONObject(i)
        Pair(sponsor.getString("username"), sponsor.getString("avatar"))
    }

    Pair(
        parseSponsors(sponsors.getJSONArray("current")),
        parseSponsors(sponsors.getJSONArray("past")).take(10),
    )
} catch (e: Exception) {
    println("Failed to fetch sponsors: ${e.message}")
    Pair(emptyList(), emptyList())
}
