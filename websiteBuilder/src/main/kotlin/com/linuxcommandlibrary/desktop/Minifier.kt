package com.linuxcommandlibrary.desktop

import java.io.File
import java.nio.file.Files

class Minifier {

    fun minifyScriptsAndSheets(isRelease: Boolean) {
        val scriptsDir = File("html/scripts")
        scriptsDir.mkdir()
        val scripts = File("websiteBuilder/src/main/resources/scripts")
        scripts.listFiles()?.forEach {
            if (it.isFile) {
                val file = File(scriptsDir, it.name)
                file.delete()
                if (isRelease) {
                    val minified = minifyJS(it.readText())
                    file.writeText(minified)
                } else {
                    Files.createLink(file.toPath(), it.toPath())
                }
            }
        }
        val styleSheetsDir = File("html/stylesheets")
        styleSheetsDir.mkdir()
        val stylesheets = File("websiteBuilder/src/main/resources/stylesheets")
        stylesheets.listFiles()?.forEach {
            if (it.isFile) {
                val file = File(styleSheetsDir, it.name)
                file.delete()
                if (isRelease) {
                    val minified = minifyCSS(it.readText())
                    file.writeText(minified)
                } else {
                    Files.createLink(file.toPath(), it.toPath())
                }
            }
        }
    }

    private fun minifyCSS(css: String): String = css.replaceWhiteSpacesBeforeAndAfter(";")
        .replaceWhiteSpacesBeforeAndAfter("}")
        .replaceWhiteSpacesBeforeAndAfter("\\{")
        .replaceWhiteSpacesBeforeAndAfter(":")
        .replaceWhiteSpacesBeforeAndAfter(",")

    private fun minifyJS(js: String): String = js.replace("[\\n\\s].?//.*\\n".toRegex(), "") // will break if comment is after code
        .replaceWhiteSpacesBeforeAndAfter(";")
        .replaceWhiteSpacesBeforeAndAfter("}")
        .replaceWhiteSpacesBeforeAndAfter("\\{")
        .replaceWhiteSpacesBeforeAndAfter("=")
        .replaceWhiteSpacesBeforeAndAfter("<")
        .replaceWhiteSpacesBeforeAndAfter("-")
        .replaceWhiteSpacesBeforeAndAfter(",")
        .replaceWhiteSpacesBeforeAndAfter("\\+")
        .replaceWhiteSpacesBeforeAndAfter("\\(")
        .replaceWhiteSpacesBeforeAndAfter("\\)")
        .replaceWhiteSpacesBeforeAndAfter("\\&")
        .replaceWhiteSpacesBeforeAndAfter("\\>")

    private fun String.replaceWhiteSpacesBeforeAndAfter(value: String): String = replace("\\s*$value\\s*".toRegex(), value)
}
