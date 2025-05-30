package com.linuxcommandlibrary.desktop

import com.linuxcommandlibrary.shared.CommandElement
import com.linuxcommandlibrary.shared.databaseHelper
import com.linuxcommandlibrary.shared.getCommandList
import com.linuxcommandlibrary.shared.getHtmlFileName
import com.linuxcommandlibrary.shared.getSortPriority
import com.linuxcommandlibrary.shared.initDatabase
import databases.BasicCategory
import kotlinx.coroutines.async
import kotlinx.html.ATarget
import kotlinx.html.DIV
import kotlinx.html.FlowContent
import kotlinx.html.HEAD
import kotlinx.html.HTMLTag
import kotlinx.html.HtmlTagMarker
import kotlinx.html.InputType
import kotlinx.html.LINK
import kotlinx.html.META
import kotlinx.html.ScriptCrossorigin
import kotlinx.html.UL
import kotlinx.html.a
import kotlinx.html.attributesMapOf
import kotlinx.html.b
import kotlinx.html.body
import kotlinx.html.br
import kotlinx.html.button
import kotlinx.html.classes
import kotlinx.html.div
import kotlinx.html.footer
import kotlinx.html.h1
import kotlinx.html.h2
import kotlinx.html.head
import kotlinx.html.html
import kotlinx.html.i
import kotlinx.html.id
import kotlinx.html.img
import kotlinx.html.input
import kotlinx.html.lang
import kotlinx.html.li
import kotlinx.html.link
import kotlinx.html.nav
import kotlinx.html.noScript
import kotlinx.html.onClick
import kotlinx.html.onKeyUp
import kotlinx.html.p
import kotlinx.html.script
import kotlinx.html.span
import kotlinx.html.stream.appendHTML
import kotlinx.html.style
import kotlinx.html.styleLink
import kotlinx.html.table
import kotlinx.html.td
import kotlinx.html.title
import kotlinx.html.tr
import kotlinx.html.ul
import kotlinx.html.unsafe
import kotlinx.html.visit
import org.json.JSONArray
import org.json.JSONObject
import java.io.File
import java.io.PrintStream
import java.util.Locale

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
    initDatabase()

    val minifier = Minifier()
    val websiteBuilder = WebsiteBuilder()

    val folder = File("html")
    folder.mkdir()

    websiteBuilder.createCommandsHtmlFile(folder)

    websiteBuilder.createBasicsHtmlFile(folder)
    websiteBuilder.createBasicHtmlFiles(File(folder, "basic"))

    websiteBuilder.createTipsHtmlFile(folder)
    websiteBuilder.createManHtmlFiles(File(folder, "man"))

    websiteBuilder.create404HtmlFile()
    websiteBuilder.createPrivacyPolicyHtmlFile(folder)
    websiteBuilder.createContactHtmlFile(folder)
    websiteBuilder.createTermsAndConditionsHtmlFile(folder)

    websiteBuilder.createSitemap(folder)

    minifier.minifyScriptsAndSheets(true)
}

class WebsiteBuilder {

    private val cacheVersion = 11

    private val h2Regex by lazy {
        "(<h2>)(.*?)(</h2>)".toRegex()
    }
    private val quoteRegex by lazy {
        "`(.*?)`".toRegex()
    }
    private val commandRegex by lazy {
        "([^\\s,]+)\\(([0-9]|1L|1M|p)\\)".toRegex()
    }
    private val htmlTagRegex by lazy {
        "<[^>]*>".toRegex()
    }

    fun createCommandsHtmlFile(folder: File) {
        println("Create index html")

        val file = File(folder, "commands.html")
        file.delete()
        val stream = PrintStream(file)

        stream.appendLine("<!DOCTYPE html>")
        stream.appendHTML().html {
            lang = "en"
            head {
                commonMeta()
                val title = "Commands | Linux Command Library"
                uncommonMeta(
                    title = title,
                    description = "Handy cheat sheets with linux tips, terminal basics and thousands of man pages.",
                    url = "https://linuxcommandlibrary.com",
                    keywords = "linux,cmd,tips,man,commands",
                )

                styleLink("/stylesheets/main.css?v=$cacheVersion")
                script(src = "/scripts/search.js?v=$cacheVersion") {
                    defer = true
                }

                noScript {
                    style {
                        unsafe { +"#search-wrapper { display: none; }" }
                    }
                }
            }
            body {
                header(selectedIndex = 0)

                contentWrapper {
                    div {
                        id = "content"
                        style = "width: 100%; padding: 12px; align-self: start"
                        div {
                            id = "search-wrapper"
                            input {
                                type = InputType.text
                                id = "search"
                                onKeyUp = "search()"
                                placeholder = "Search for commands"
                                autoComplete = "false"
                            }
                        }
                        div {
                            id = "commandlist"
                            var currentFirstLetter = ""
                            databaseHelper.getCommands().forEach {
                                if (it.name.lowercase().first().toString() != currentFirstLetter) {
                                    currentFirstLetter = it.name.lowercase().first().toString()
                                    div {
                                        classes = classes + "headline"
                                        text(currentFirstLetter.uppercase())
                                    }
                                }
                                a("man/${it.name.lowercase()}") {
                                    attributes["data-c"] = it.name.lowercase()
                                    text(it.name)
                                }
                                it.name
                            }
                        }
                        div {
                            id = "no-results"
                            text("No results")
                        }
                    }
                }

                footer()
            }
        }
        stream.close()
    }

    fun createBasicsHtmlFile(folder: File) {
        println("Create basics html")

        val file = File(folder, "index.html")
        file.delete()
        val stream = PrintStream(file)

        val basicCategories = databaseHelper.getBasics()

        stream.appendLine("<!DOCTYPE html>")
        stream.appendHTML().html {
            lang = "en"
            head {
                commonMeta()

                val title = "Basics | Cheat sheets | Linux Command Library"
                uncommonMeta(
                    title = title,
                    description = "Handy cheat sheets with linux tips and terminal basics about System control, Users, Files, Package managers, Video and Audio, Hacking tools, Terminal games and many more categories.",
                    url = "https://linuxcommandlibrary.com/${folder.name}/${file.nameWithoutExtension}",
                    keywords = "linux,cmd,basics,terminal,console,cheat sheets,tips,${
                        basicCategories.joinToString(
                            ",",
                        ) { it.title }
                    }",
                )

                styleLink("/stylesheets/main.css?v=$cacheVersion")
            }
            body {
                header(selectedIndex = 1)

                contentWrapper {
                    div {
                        ul {
                            classes = setOf("grid-container")

                            basicCategories.forEach {
                                li {
                                    classes = setOf("grid-item")
                                    a("basic/${it.getHtmlFileName()}") {
                                        div {
                                            i {
                                                classes = setOf("invert-color")
                                                style =
                                                    "background-image: url(\"images/${it.getIconResource()}\");"
                                            }
                                            h2 {
                                                text(it.title)
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                footer()
            }
        }
        stream.close()
    }

    fun createBasicHtmlFiles(folder: File) {
        folder.mkdir()

        val basicCategories = databaseHelper.getBasics()
        val totalCount = basicCategories.count()

        basicCategories.forEachIndexed { index, category ->
            print("\rCreate basic category html ${index + 1}/$totalCount")

            val groups = databaseHelper.getBasicGroupsByQuery(category.id)

            val file = File(folder, "${category.getHtmlFileName()}.html")
            file.delete()
            val stream = PrintStream(file)

            stream.appendLine("<!DOCTYPE html>")
            stream.appendHTML().html {
                lang = "en"
                head {
                    val title = "${category.title} | Basic | Cheat sheet | Linux Command Library"
                    commonMeta()
                    uncommonMeta(
                        title = title,
                        description = category.getDescription(),
                        url = "https://linuxcommandlibrary.com/${folder.name}/${file.nameWithoutExtension}",
                        keywords = getKeywordsForBasic(category),
                    )

                    styleLink("/stylesheets/main.css?v=$cacheVersion")
                    script(src = "/scripts/copy.js?v=$cacheVersion") {
                        defer = true
                    }

                    noScript {
                        style {
                            unsafe { +".copy-button { display: none; }" }
                        }
                    }

                    if (category.title == "One-liners") {
                        style {
                            unsafe { +".masonry{-webkit-column-width: 400px !important;-moz-column-width: 400px !important;column-width: 400px !important;}" }
                        }
                    } else {
                        script(type = "application/ld+json") {
                            val faqJson = JSONObject()
                            faqJson.put("@context", "https://schema.org")
                            faqJson.put("@type", "FAQPage")
                            val answerArray = JSONArray()
                            groups.forEach { group ->
                                val answerJson = JSONObject()
                                answerJson.put("@type", "Question")
                                answerJson.put("name", group.description)
                                val acceptedAnswerJson = JSONObject()
                                acceptedAnswerJson.put("@type", "Answer")
                                acceptedAnswerJson.put(
                                    "text",
                                    databaseHelper.getBasicCommands(group.id).first().command,
                                )
                                answerJson.put("acceptedAnswer", acceptedAnswerJson)
                                answerArray.put(answerJson)
                            }
                            faqJson.put("mainEntity", answerArray)
                        }
                    }
                }
                body {
                    header(1)

                    contentWrapper {
                        div {
                            h1 {
                                text(category.title)
                            }
                            div {
                                classes = setOf("masonry")
                                groups.forEach { group ->
                                    div {
                                        classes = setOf("code-group")
                                        h2 {
                                            a("/${folder.name}/${file.nameWithoutExtension}#${group.id}") {
                                                id = group.id.toString()
                                                text(group.description)
                                            }
                                        }
                                        databaseHelper.getBasicCommands(group.id)
                                            .forEach { command ->
                                                if (listOf(
                                                        "VIM Texteditor",
                                                        "Emacs Texteditor",
                                                        "Nano Texteditor",
                                                        "Pico Texteditor",
                                                        "Micro Texteditor",
                                                    ).contains(category.title)
                                                ) {
                                                    table {
                                                        command.command.split("\n").forEach {
                                                            tr {
                                                                it.split(" - ").forEach {
                                                                    td {
                                                                        text(it)
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else if (listOf(
                                                        "Terminal games",
                                                        "Fun",
                                                    ).contains(category.title)
                                                ) {
                                                    code(
                                                        "$ ${
                                                            command.command.replace(
                                                                "\\n",
                                                                "<br>",
                                                            )
                                                        }",
                                                        command.mans,
                                                        true,
                                                    )
                                                } else {
                                                    code(
                                                        "$ ${
                                                            command.command.replace(
                                                                "\\n",
                                                                "<br>",
                                                            )
                                                        }",
                                                        command.mans,
                                                    )
                                                }
                                            }
                                    }
                                }
                            }
                        }
                    }

                    tooltip()
                    footer()
                }
            }
            stream.close()
        }
        println()
    }

    fun createTipsHtmlFile(folder: File) {
        println("Create tips html")

        folder.mkdir()

        val file = File(folder, "tips.html")
        file.delete()
        val stream = PrintStream(file)

        stream.appendLine("<!DOCTYPE html>")
        stream.appendHTML().html {
            lang = "en"
            head {
                commonMeta()
                val title = "Tips | Cheat sheets | Linux Command Library"
                uncommonMeta(
                    title = title,
                    description = "Handy cheat sheets with linux tips and terminal basics.",
                    url = "https://linuxcommandlibrary.com/${file.nameWithoutExtension}",
                    keywords = "linux,cmd,useful,terminal,tips,cheat",
                )

                styleLink("/stylesheets/main.css?v=$cacheVersion")
                script(src = "/scripts/copy.js?v=$cacheVersion") {
                    defer = true
                }

                noScript {
                    style {
                        unsafe { +".copy-button { display: none; }" }
                    }
                }
            }

            body {
                header(2)

                contentWrapper {
                    div {
                        classes = setOf("masonry")

                        databaseHelper.getTips().forEach { tip ->
                            div {
                                classes = setOf("code-group")

                                h2 {
                                    a("/${file.nameWithoutExtension}#${tip.id}") {
                                        id = tip.id.toString()
                                        text(tip.title)
                                    }
                                }

                                var isTable = false

                                fun closeTable() {
                                    isTable = false
                                    unsafe {
                                        +"</table>"
                                    }
                                }

                                fun startTable() {
                                    isTable = true
                                    unsafe {
                                        +"<table>"
                                    }
                                }

                                databaseHelper.getTipSections().filter { it.tip_id == tip.id }.forEach {
                                    if (it.type != 3L && isTable) {
                                        closeTable()
                                    }
                                    if (it.type == 3L && !isTable) {
                                        startTable()
                                    }
                                    when (it.type) {
                                        0L -> {
                                            span {
                                                unsafe {
                                                    +it.data1.replace("\\n", "<br>")
                                                }
                                            }
                                            br
                                        }

                                        1L -> {
                                            code(it.data1.replace("\\n", "<br>"), it.extra)
                                        }

                                        3L -> {
                                            unsafe {
                                                +"<tr><td>"
                                            }
                                            if (it.data1.isNotBlank()) {
                                                b {
                                                    text(it.data1)
                                                }
                                            }
                                            unsafe {
                                                +"</td>"
                                            }
                                            unsafe {
                                                +"<td>"
                                            }
                                            if (it.extra.isNotBlank()) {
                                                code(it.data2.replace("\\n", "<br>"), it.extra)
                                            } else {
                                                text(it.data2)
                                            }
                                            unsafe {
                                                +"</td></tr>"
                                            }
                                        }
                                    }
                                }
                                if (isTable) {
                                    closeTable()
                                }
                            }
                        }
                    }
                }
                tooltip()
                footer()
            }
        }
        stream.close()
    }

    fun createManHtmlFiles(folder: File) {
        folder.mkdir()

        val commands = databaseHelper.getCommands()
        val totalCount = commands.count()

        commands.forEachIndexed { index, command ->
            print("\rCreate mans html ${index + 1}/$totalCount")

            val file = File(folder, "${command.name.lowercase()}.html")

            file.delete()
            val stream = PrintStream(file)

            stream.appendLine("<!DOCTYPE html>")
            stream.appendHTML().html {
                lang = "en"
                head {
                    commonMeta()

                    val title = "${command.name} man | Linux Command Library"
                    uncommonMeta(
                        title = title,
                        description = "${command.name} linux command man page: ${command.description}",
                        url = "https://linuxcommandlibrary.com/${folder.name}/${file.nameWithoutExtension}",
                        keywords = "linux,man,page,command,manual,${command.name}",
                    )

                    styleLink("/stylesheets/main.css?v=$cacheVersion")
                    script(src = "/scripts/copy.js?v=$cacheVersion") {
                        defer = true
                    }
                    script(type = "application/ld+json") {
                        val applicationJson = JSONObject()
                        applicationJson.put("@context", "https://schema.org")
                        applicationJson.put("@type", "SoftwareApplication")
                        applicationJson.put("name", command.name)
                        applicationJson.put("operatingSystem", "LINUX")
                        unsafe {
                            +applicationJson.toString()
                        }
                    }

                    noScript {
                        style {
                            unsafe {
                                +".toggle-all-button { display: none; }"
                                +".copy-button { display: none; }"
                            }
                        }
                    }
                }
                body {
                    header(selectedIndex = 0)

                    contentWrapper {
                        div {
                            id = "content"
                            h1 {
                                text(command.name)
                            }
                            h2 {
                                classes = setOf("subtitle")
                                text(command.description)
                            }

                            databaseHelper.getSections(command.id).sortedBy { it.getSortPriority() }
                                .forEach { section ->
                                    h2 {
                                        onClick = "togglePanel(this)"
                                        classes = setOf("accordion-button", "active")
                                        val sectionId =
                                            section.title.lowercase(Locale.US).replace(" ", "-")
                                        a("/man/${command.name.lowercase(Locale.US)}#$sectionId") {
                                            id = sectionId
                                            text(section.title)
                                        }
                                    }
                                    div {
                                        classes = setOf("panel")
                                        when (section.title) {
                                            "SEE ALSO" -> {
                                                p {
                                                    val elements =
                                                        getSeeAlsoSectionElements(section.content)
                                                    elements.forEach { element ->
                                                        when (element) {
                                                            is CommandElement.Man -> {
                                                                a("/man/${element.man}") {
                                                                    title =
                                                                        "${element.man} man page"
                                                                    text(element.man)
                                                                }
                                                            }

                                                            is CommandElement.Text -> {
                                                                unsafe {
                                                                    +element.text
                                                                }
                                                            }

                                                            else -> {}
                                                        }
                                                    }
                                                }
                                            }

                                            "TLDR" -> {
                                                p {
                                                    unsafe {
                                                        +sanitizeHtml(section.content.addAnchorAndCodeStyle(file.nameWithoutExtension))
                                                    }
                                                }
                                            }

                                            else -> {
                                                p {
                                                    unsafe {
                                                        +sanitizeHtml(section.content)
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }

                            button {
                                onClick = "toggleAll(this)"
                                classes = setOf("toggle-all-button")
                                text("COLLAPSE ALL")
                            }
                        }
                    }

                    tooltip()
                    footer()

                    script(src = "/scripts/man.js?v=$cacheVersion") {
                        defer = true
                    }
                }
            }
            stream.close()
        }
        println()
    }

    fun createTermsAndConditionsHtmlFile(folder: File) {
        println("Create terms and conditions html")

        folder.mkdir()

        val file = File(folder, "terms-conditions.html")
        file.delete()
        val stream = PrintStream(file)

        stream.appendLine("<!DOCTYPE html>")

        stream.appendHTML().html {
            lang = "en"
            head {
                commonMeta(adSense = false)
                val title = "Terms and Conditions | Linux Command Library"
                uncommonMeta(
                    title = title,
                    description = "",
                    url = "https://linuxcommandlibrary.com/${file.nameWithoutExtension}",
                    keywords = "",
                )

                styleLink("/stylesheets/main.css?v=$cacheVersion")
            }

            body {
                header(-1)

                div {
                    id = "content"

                    h1 { +"Terms and Conditions" }

                    h2 { +"Educational Purpose Only" }
                    p {
                        +"The content on Linux Command Library is provided solely for educational and informational purposes. It is intended to assist users in learning about Linux commands."
                    }

                    h2 { +"Disclaimer of Liability" }
                    p {
                        +"The commands on this website can be powerful and may cause data loss or system damage if misused. Users are responsible for verifying and safely using the commands. Linux Command Library is not liable for any damage or loss resulting from the use or misuse of this information."
                    }

                    h2 { +"Copyright and Credits" }
                    p {
                        +"Man pages referenced on this site are copyrighted by their respective authors and used under fair use principles for educational reference. We gratefully acknowledge inspiration and contributions from "
                        a(href = "https://tldr.sh/") { +"TLDR" }
                        +" and "
                        a(href = "https://www.commandlinefu.com/") { +"commandlinefu.com" }
                        +"."
                    }
                }

                footer(showAd = false)
            }
        }
        stream.close()
    }

    fun createPrivacyPolicyHtmlFile(folder: File) {
        println("Create privacy html")

        folder.mkdir()

        val file = File(folder, "privacy-policy.html")
        file.delete()
        val stream = PrintStream(file)

        stream.appendLine("<!DOCTYPE html>")

        stream.appendHTML().html {
            lang = "en"
            head {
                commonMeta(adSense = false)
                val title = "Privacy Policy | Linux Command Library"
                uncommonMeta(
                    title = title,
                    description = "",
                    url = "https://linuxcommandlibrary.com/${file.nameWithoutExtension}",
                    keywords = "",
                )

                styleLink("/stylesheets/main.css?v=$cacheVersion")
            }

            body {
                header(-1)

                div {
                    id = "content"

                    h1 { +"Privacy Policy" }
                    p { +"Last Updated: April 19, 2025" }

                    h2 { +"1. No Data Collection or Tracking" }
                    p { +"Our website does not use cookies, web beacons, or any other tracking technologies to collect personal information about your browsing activities." }
                    p { +"We do not collect any personal data from users. There are no contact forms, email sign-ups, or other mechanisms that gather personal information on our website." }

                    h2 { +"2. Future Use of Cookies (Google AdSense)" }
                    p {
                        +"If our website is approved for Google AdSense, we may use cookies to serve personalized advertisements. These cookies would be managed by Google and are subject to "
                        a(href = "https://policies.google.com/privacy") { +"Google’s Privacy Policy" }
                        +". If this occurs, we will update this Privacy Policy to reflect the change and provide details on how cookies are used for advertising purposes."
                    }
                    p { +"You will be able to manage your ad preferences through Google’s Ad Settings." }

                    h2 { +"3. Your Rights (GDPR Compliance)" }
                    p { +"For EU Users: If you are located in the European Union, you have the right to access, correct, or delete any personal data we may hold about you. Since we do not collect personal data through tracking or forms, no such data is stored." }
                    p { +"Cookie Consent (Future): If we introduce cookies for advertising in the future, we will implement a cookie consent mechanism for EU users to ensure compliance with GDPR." }

                    h2 { +"4. Contact Us" }
                    p { +"If you have any questions or concerns about this Privacy Policy, you can contact us at [your email address]." }

                    h2 { +"5. Changes to This Policy" }
                    p { +"We may update this Privacy Policy from time to time, especially if we introduce new features or services that affect data handling (e.g., Google AdSense). Any changes will be posted on this page with an updated 'Last Updated' date." }
                }

                footer(showAd = false)
            }
        }
        stream.close()
    }

    fun createContactHtmlFile(folder: File) {
        println("Create contact html")

        folder.mkdir()

        val file = File(folder, "contact.html")
        file.delete()
        val stream = PrintStream(file)

        stream.appendLine("<!DOCTYPE html>")

        stream.appendHTML().html {
            lang = "en"
            head {
                commonMeta(adSense = false)
                val title = "Contact | Linux Command Library"
                uncommonMeta(
                    title = title,
                    description = "",
                    url = "https://linuxcommandlibrary.com/${file.nameWithoutExtension}",
                    keywords = "",
                )

                styleLink("/stylesheets/main.css?v=$cacheVersion")
            }

            body {
                header(-1)

                div {
                    id = "content"

                    h1 { +"Contact Us" }
                    p {
                        +"Have questions, feedback, or issues about Linux Command Library?"
                    }
                    p {
                        +"Please reach out to us at "
                        a(href = "mailto:info@linuxcommandlibrary.com") { +"info@linuxcommandlibrary.com" }
                        +". We aim to respond within 2-3 business days."
                    }
                    p {
                        +"For more information about our site, please review our "
                        a(href = "/privacy-policy") { +"Privacy Policy" }
                        +" and "
                        a(href = "/terms-and-conditions") { +"Terms and Conditions" }
                        +"."
                    }
                }

                footer(showAd = false)
            }
        }
        stream.close()
    }

    private fun sanitizeHtml(content: String): String = content.replace(Regex("(?i)<(html|head|title|body)[^>]*>.*?</\\1>|<(html|head|title|body)[^>]*>"), "")
        .replace(Regex("(?i)</?(html|head|title|body)>"), "")

    /**
     * Find and link man pages if command exists in database. Example: ps(1), regex(7), signal(7)
     */
    private fun getSeeAlsoSectionElements(content: String): List<CommandElement> {
        var text = content.replace(htmlTagRegex, "")
        repeat(10) {
            text = text.replace(" ($it)", "($it)")
        }
        val mans = text.getCommaSeparatedMans()

        return text.getCommandList(
            mans,
            hasBrackets = true,
            checkExisting = true,
        )
    }

    /**
     * Return comma separated list of commands. Example: ps(1),man(1) -> ps,man
     */
    private fun String.getCommaSeparatedMans(): String {
        val matches = commandRegex.findAll(this)
        return matches.mapNotNull {
            it.groups[1]?.value
        }.sortedByDescending { it.length }.joinToString(",")
    }

    fun create404HtmlFile() {
        println("Create 404 html")

        val file = File("html/error_404.html")
        file.delete()
        val stream = PrintStream(file)

        stream.appendLine("<!DOCTYPE html>")
        stream.appendHTML().html {
            lang = "en"
            head {
                commonMeta(adSense = false)
                val title = "404 command not found | Linux Command Library"
                uncommonMeta(
                    title = title,
                    description = "Handy cheat sheets with linux tips, terminal basics and thousands of man pages.",
                    url = "https://linuxcommandlibrary.com",
                    keywords = "linux,cmd,tips,man,commands",
                )

                styleLink("/stylesheets/main.css?v=$cacheVersion")
            }
            body {
                header(selectedIndex = -1)

                div {
                    style =
                        "display: flex;height: 500px;justify-content: center;align-items: center;flex-direction: column;"
                    h1 {
                        style = "margin: inherit;"
                        text("404 command not found")
                    }

                    img {
                        style = "margin-top:12px;"
                        src = "/images/icons8-404.svg"
                        width = "100"
                        height = "100"
                        alt = "not found"
                    }
                }

                footer(false)
            }
        }
    }

    private fun UL.headerNav(
        title: String,
        href: String,
        index: Int,
        selectedIndex: Int,
    ): FlowContent {
        li {
            a(href) {
                if (selectedIndex == index) {
                    classes = setOf("selected")
                }
                text(title)
            }
        }
        return this
    }

    private fun FlowContent.header(selectedIndex: Int) {
        div {
            id = "top-border"

            div {
                a("/") {
                    title = "logo"
                    id = "logo-icon-wrapper"
                    i {
                        style = "background-image: url('/images/logo.png');"
                        classes = setOf("logo-icon")
                    }
                }
                div {
                    classes = setOf("title")
                    span {
                        text("Linux")
                    }
                    span {
                        text("Command")
                    }
                    span {
                        text("Library")
                    }
                }

                div {
                    a("https://github.com/SimonSchubert/LinuxCommandLibrary") {
                        target = ATarget.blank
                        rel = "noopener"
                        img {
                            src = "/images/logo-github.svg"
                            width = "25"
                            height = "25"
                        }
                    }
                    a("https://f-droid.org/en/packages/com.inspiredandroid.linuxcommandbibliotheca") {
                        target = ATarget.blank
                        rel = "noopener"
                        img {
                            src = "/images/icon-fdroid.svg"
                            width = "25"
                            height = "25"
                        }
                    }
                    a("https://play.google.com/store/apps/details?id=com.inspiredandroid.linuxcommandbibliotheca") {
                        target = ATarget.blank
                        rel = "noopener"
                        img {
                            src = "/images/icon-playstore.svg"
                            width = "25"
                            height = "25"
                        }
                    }
                }
            }
        }
        nav {
            ul {
                headerNav("Basics", "/", 1, selectedIndex)
                headerNav("Tips", "/tips", 2, selectedIndex)
                headerNav("Commands", "/commands", 0, selectedIndex)
            }
        }
    }

    fun createSitemap(folder: File) {
        val file = File(folder, "sitemap.xml")
        file.delete()

        val stream = PrintStream(file)
        stream.print("<?xml version=\"1.0\" encoding=\"UTF-8\"?><urlset xmlns=\"http://www.sitemaps.org/schemas/sitemap/0.9\">")
        stream.print(getSitemapUrlNode(""))
        stream.print(getSitemapUrlNode("tips"))
        stream.print(getSitemapUrlNode("commands"))
        databaseHelper.getBasics().forEach {
            stream.print(getSitemapUrlNode("basic/${it.getHtmlFileName()}"))
        }
        databaseHelper.getCommands().forEach {
            stream.print(getSitemapUrlNode("man/${it.name}"))
        }
        stream.print("</urlset>")
        stream.close()
    }

    private fun getSitemapUrlNode(urlPart: String): String = "<url>" +
        "<loc>https://linuxcommandlibrary.com/$urlPart</loc>" +
        "</url>"

    private fun HEAD.commonMeta(adSense: Boolean = true) {
        meta(charset = "utf-8")
        meta(name = "viewport", content = "width=device-width, initial-scale=1")
        link(rel = "apple-touch-icon", sizes = "180x180", href = "/apple-touch-icon.png")
        link(rel = "icon", type = "image/png", sizes = "32x32", href = "/favicon-32x32.png")
        link(rel = "icon", type = "image/png", sizes = "16x16", href = "/favicon-16x16.png")
        link(rel = "manifest", href = "/site.webmanifest")
        meta(name = "msapplication-TileColor", content = "#da532c")
        meta(name = "theme-color", content = "#ffffff")
        if (adSense) {
            script {
                src =
                    "https://pagead2.googlesyndication.com/pagead/js/adsbygoogle.js?client=ca-pub-3003920357099437"
                async = true
                crossorigin = ScriptCrossorigin.anonymous
            }
        }
    }

    private fun HEAD.uncommonMeta(
        title: String,
        description: String,
        url: String,
        keywords: String,
    ) {
        title(title)

        meta(name = "description", content = description)
        meta(name = "keywords", content = keywords)
        link(rel = "canonical", href = url)

        meta(property = "og:title", content = title)
        meta(property = "og:type", content = "website")
        meta(property = "og:url", content = url)
        meta(property = "og:image", content = "https://linuxcommandlibrary.com/images/preview.jpg")
        meta(property = "og:description", content = description)
        meta(property = "og:site_name", content = "Linux Command Library")
        meta(property = "og:locale", content = "en_US")

        meta(property = "twitter:card", content = "summary")
        meta(property = "twitter:title", content = title)
        meta(property = "twitter:description", content = description)
        meta(
            property = "twitter:image",
            content = "https://linuxcommandlibrary.com/images/preview.jpg",
        )
    }

    private inline fun HTMLTag.link(
        href: String? = null,
        rel: String? = null,
        type: String? = null,
        sizes: String?,
        crossinline block: LINK.() -> Unit = {},
    ): Unit = LINK(
        attributesMapOf("href", href, "rel", rel, "type", type, "sizes", sizes),
        consumer,
    ).visit(block)

    data class Ad(val imageUrl: String, val url: String, val backgroundColor: String)
    val ads = listOf(
        Ad("linode-vertical.webp", "/linode-2025", "#ea9230"),
        Ad("digitalocean-vertical.webp", "/digitalocean-2025", "#173a62"),
        Ad("proton-free-vertical.webp", "/proton-free-2025", "#01a4e8"),
        Ad("proton-paid-vertical.webp", "/proton-paid-2025", "#f1c522"),
    )

    private fun FlowContent.contentWrapper(content: DIV.() -> Unit = {}): FlowContent {
        val randomAds = ads.shuffled().take(2)
        div {
            id = "content-wrapper"
            randomAds[0].let { ad ->
                div {
                    classes = setOf("side-panel")
                    style = "background-color: ${ad.backgroundColor}"
                    a {
                        href = ad.url
                        img {
                            src = "/images/af/${ad.imageUrl}"
                            width = "200"
                        }
                    }
                }
            }
            content()
            randomAds[1].let { ad ->
                div {
                    classes = setOf("side-panel")
                    style = "background-color: ${ad.backgroundColor}"
                    a {
                        href = ad.url
                        img {
                            src = "/images/af/${ad.imageUrl}"
                            width = "200"
                        }
                    }
                }
            }
        }
        return this
    }

    private fun FlowContent.footer(showAd: Boolean = true): FlowContent {
        if (showAd) {
            div {
                classes = setOf("bottom-panel")

                a("/linode-2025") {
                    target = ATarget.blank
                    img {
                        style = "max-width: calc(100% - 4px);"
                        src = "/images/af/linode-horizontal.webp"
                        attributes["loading"] = "lazy"
                        width = "600"
                    }
                }
            }
        }
        footer {
            p {
                a {
                    target = ATarget.self
                    rel = "noopener"
                    href = "/privacy-policy"
                    text("Privacy Policy")
                }
                text(" | ")
                a {
                    target = ATarget.self
                    rel = "noopener"
                    href = "/terms-conditions"
                    text("Terms and Conditions")
                }
                text(" | ")
                a {
                    target = ATarget.self
                    rel = "noopener"
                    href = "/contact"
                    text("Contact")
                }
            }

            a("https://play.google.com/store/apps/details?id=com.inspiredandroid.linuxcommandbibliotheca") {
                style = "margin-right: 4px;"
                target = ATarget.blank
                rel = "noopener"
                img {
                    src = "/images/google-play-download.svg"
                    alt = "Google Play Store"
                    classes = setOf("download-icon")
                    width = "169"
                    height = "50"
                }
            }
            a("https://f-droid.org/en/packages/com.inspiredandroid.linuxcommandbibliotheca") {
                style = "margin-left: 4px;"
                target = ATarget.blank
                rel = "noopener"
                img {
                    src = "/images/f-droid-download.png"
                    alt = "F-Droid Store"
                    classes = setOf("download-icon")
                    width = "168"
                    height = "50"
                }
            }
            div {
                style =
                    "width: 100%; justify-content: center; padding-top: 6px; display: flex; align-items: center; gap: 6px;"
                text("My other projects: ")
                div {
                    classes = setOf("project")
                    a("https://adahub.io") {
                        target = ATarget.blank
                        rel = "noopener"
                        img {
                            src = "https://adahub.io/favicon.svg"
                            alt = "adahub.io"
                            width = "30"
                            height = "30"
                        }
                    }
                    br
                    text("Blockchain")
                }
                div {
                    classes = setOf("project")
                    a("https://simonschubert.github.io/YogaBase/") {
                        target = ATarget.blank
                        rel = "noopener"
                        img {
                            src = "https://simonschubert.github.io/YogaBase/favicon.svg"
                            alt = ""
                            width = "30"
                            height = "30"
                        }
                    }
                    br
                    text("Yoga")
                }
                div {
                    classes = setOf("project")
                    a("https://betabase.fun") {
                        target = ATarget.blank
                        rel = "noopener"
                        img {
                            src = "https://betabase.fun/images/icon.png"
                            alt = "betabase.fun"
                            width = "30"
                            height = "30"
                        }
                    }
                    br
                    text("Climbing")
                }
            }
        }
        return this
    }

    private fun FlowContent.tooltip(): FlowContent {
        div {
            classes = setOf("tooltip")
            b {
                text("Copied to clipboard")
            }
        }
        return this
    }

    private fun FlowContent.code(
        command: String,
        mans: String,
        isMonospace: Boolean = false,
    ): FlowContent {
        div {
            classes = setOf("code-wrapper")
            span {
                classes = setOf("code")
                if (isMonospace) {
                    style = "font-family: 'Courier New', Courier, monospace;font-size:14px;"
                }
                command.getCommandList(mans).forEach { element ->
                    when (element) {
                        is CommandElement.Man -> {
                            a("/man/${element.man}") {
                                title = "${element.man} man page"
                                text(element.man)
                            }
                        }

                        is CommandElement.Text -> {
                            element.text.split("<br>").map { it.replace("$  ", "$ ") }
                                .forEachIndexed { index, s ->
                                    if (index != 0) {
                                        br
                                    }
                                    s.split(" ").forEachIndexed { index2, s2 ->
                                        if (index2 != 0) {
                                            unsafe {
                                                +"&nbsp;"
                                            }
                                        }
                                        text(s2)
                                    }
                                }
                        }

                        is CommandElement.Url -> {
                            a(element.url) {
                                target = ATarget.blank
                                rel = "noopener"
                                text(element.command)
                            }
                        }
                    }
                }
            }
            div {
                if (isMonospace) {
                    onClick =
                        "javascript:copy('$mans')"
                } else {
                    onClick =
                        "javascript:copy('${
                            command.split("<br>").first().drop(2).replace("'", "&#039;")
                                .replace("\n", "").trim()
                        }')"
                }
                classes = setOf("copy-button")
                img {
                    src = "/images/icon-copy.svg"
                    alt = "copy"
                    width = "24"
                    height = "24"
                }
            }
        }
        return this
    }

    @HtmlTagMarker
    inline fun HTMLTag.meta(
        property: String? = null,
        name: String? = null,
        content: String? = null,
        charset: String? = null,
        httpEquiv: String? = null,
        crossinline block: META.() -> Unit = {},
    ): Unit = META(
        attributesMapOf(
            "property",
            property,
            "name",
            name,
            "content",
            content,
            "charset",
            charset,
            "http-equiv",
            httpEquiv,
        ),
        consumer,
    ).visit(block)

    private fun BasicCategory.getIconResource(): String = when (title) {
        "One-liners" -> "icon-hand_with_pen.svg"
        "System information" -> "icon-system_task.svg"
        "System control" -> "icon-settings.svg"
        "Users & Groups" -> "icon-user.svg"
        "Files & Folders" -> "icon-file.svg"
        "Printing" -> "icon-print.svg"
        "Network" -> "icon-network_card.svg"
        "Search & Find" -> "icon-search.svg"
        "GIT" -> "icon-git.svg"
        "SSH" -> "icon-console.svg"
        "Video & Audio" -> "icon-video_trimming.svg"
        "Package manager" -> "icon-package.svg"
        "Hacking tools" -> "icon-skull.svg"
        "Terminal games" -> "icon-controller.svg"
        "VIM" -> "icon-vim.svg"
        "Emacs" -> "icon-emacs.svg"
        "Nano" -> "icon-nano.svg"
        "Pico" -> "icon-pico.svg"
        "Crypto currencies" -> "icon-bitcoin.svg"
        "Input" -> "icon-mouse.svg"
        "JSON" -> "icon-json.svg"
        "Fun" -> "icon-fun.svg"
        "VIM Texteditor" -> "icon-text-edit.svg"
        "Emacs Texteditor" -> "icon-text-edit.svg"
        "Nano Texteditor" -> "icon-text-edit.svg"
        "Pico Texteditor" -> "icon-text-edit.svg"
        "Micro Texteditor" -> "icon-text-edit.svg"
        else -> ""
    }

    private fun BasicCategory.getDescription(): String = when (title) {
        "One-liners" -> "Useful linux command line one liners"
        "System information" -> "System and battery/cpu/memory/disk usage info on Linux "
        "System control" -> "Lock, unlock, start/stop bluetooth/wifi, shutdown, reboot system"
        "Users & Groups" -> "Create, remove, modify and list Linux groups and users"
        "Files & Folders" -> "Create, delete, list, show and change Linux files and folders"
        "Printing" -> "Print, view, start and cancel printing jobs on Linux"
        "Network" -> "Configure, list, trace, sockets, wifi networks on Linux"
        "Search & Find" -> "Search and find files by phrase, date and size on Linux"
        "GIT" -> "Commit, push, create, delete and undo with git on Linux"
        "SSH" -> "Connect, forward, push and pull files via SSH"
        "Video & Audio" -> "Convert, volume, play, screenshot, webcam on Linux"
        "Package manager" -> "Install, update, upgrade, remove packages on Linux"
        "Hacking tools" -> "Hacking, forensics and exploitation tools for Linux"
        "Terminal games" -> "Terminal games on Linux"
        "VIM Texteditor" -> "Working with vim on the Linux command line"
        "Emacs Texteditor" -> "Working with emacs on the Linux command line"
        "Nano Texteditor" -> "Working with nano on the Linux command line"
        "Pico Texteditor" -> "Working with pico on the Linux command line"
        "Micro Texteditor" -> "Working with micro on the Linux command line"
        "Crypto currencies" -> "Miners, wallets and trading bots for Linux"
        "Input" -> "Type keys and move mouse via the Linux command line"
        "JSON" -> "Print, select, modify, delete and create json files on cmd"
        "Fun" -> "Fun on the linux command line"
        else -> ""
    }

    private fun getKeywordsForBasic(category: BasicCategory): String = when (category.title) {
        "One-liners" -> "linux,list,useful,oneliners,commands,cmd"
        "Input" -> "linux,move,click,mouse,type,text,xdotool,ydotool,read,copy,clipboard"
        "System information" -> "linux,system,info,disk,bluetooth,cpu,memory,battery"
        "System control" -> "linux,control,lock,unlock,reboot,shutdown,start,stop,wifi,bluetooth"
        "Users & Groups" -> "linux,create,delete,user,group,list,info"
        "Files & Folders" -> "linux,create,edit,delete,file,folder,permission,list"
        "Printing" -> "linux,print,file,cancel,job,status,queue"
        "JSON" -> "linux,json,pretty,print,select,put,delete,create"
        "Network" -> "linux,network,wifi,password,ip,interfaces,sockets"
        "Search & Find" -> "linux,find,search,pattern,files,path,phrase"
        "GIT" -> "linux,create,clone,repository,tag,checkout,delete,commit"
        "SSH" -> "linux,connect,ssh,push,pull,forwarding"
        "Video & Audio" -> "linux,screenshot,webcam,sounds,video,convert,image"
        "Package manager" -> "linux,install,file,repository,find,package,upgrade"
        "Hacking tools" -> "linux,password,forensics,sniffing,spoofing,exploit,vulnerability"
        "Crypto currencies" -> "linux,minters,wallets,coin,trading,bots"
        "VIM Texteditor" -> "linux,insert,search,edit,replace,navigation"
        "Emacs Texteditor" -> "linux,emacs,usage,buffers,navigation"
        "Nano Texteditor" -> "linux,nano,info,navigation,edit,input,output"
        "Pico Texteditor" -> "linux,pico,navigation,usage,input,output"
        "Micro Texteditor" -> "linux,pico,navigation,usage,input,output"
        "Terminal games" -> "linux,terminal,games,list,rogue"
        else -> throw Exception("${category.title} not found")
    }

    private fun String.addAnchorAndCodeStyle(fileName: String): String {
        var content = this
        var matches = quoteRegex.findAll(content)
        matches.forEach {
            val command = it.value.replace("`", "").replace("'", "&#039;").replace(">", "&gt;")
                .replace("<", "&lt;")
                .replace("\"", "&quot;")
            content = content.replace(
                it.value,
                "<div class=\"code-wrapper\"><span class=\"code\">$ $command</span><div onclick=\"javascript:copy('$command')\" class=\"copy-button\"><img alt=\"copy\" src=\"/images/icon-copy.svg\" width=\"24\" height=\"24\"></div></div>",
            )
        }

        matches = h2Regex.findAll(content)
        matches.forEachIndexed { index, matchResult ->
            val text =
                matchResult.value.replace("<h2>", "").replace("</h2>", "").replace(">", "&gt;")
                    .replace("<", "&lt;")
            content =
                content.replace(
                    matchResult.value,
                    "<h3><a id=\"tldr$index\" href=\"/man/$fileName#tldr$index\">$text</a></h3>",
                )
        }

        return content
    }
}
