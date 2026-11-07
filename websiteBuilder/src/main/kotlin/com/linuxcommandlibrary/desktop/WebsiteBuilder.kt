package com.linuxcommandlibrary.desktop

import com.linuxcommandlibrary.shared.CommandElement
import com.linuxcommandlibrary.shared.CommandInfo
import com.linuxcommandlibrary.shared.InstallEntries
import com.linuxcommandlibrary.shared.MarkdownParser
import com.linuxcommandlibrary.shared.TipSectionElement
import com.linuxcommandlibrary.shared.basicsSortOrder
import com.linuxcommandlibrary.shared.getSortPriority
import com.linuxcommandlibrary.shared.toHtmlFileName
import kotlinx.html.ATarget
import kotlinx.html.DIV
import kotlinx.html.FlowContent
import kotlinx.html.HEAD
import kotlinx.html.HTML
import kotlinx.html.HTMLTag
import kotlinx.html.InputType
import kotlinx.html.LINK
import kotlinx.html.META
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
import kotlinx.html.title
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

fun main(args: Array<String>) {
    val commandNames = args.map { it.trim() }.filter { it.isNotEmpty() }
    val (currentSponsors, pastSponsors) = getPublicSponsors()
    val websiteBuilder = WebsiteBuilder(currentSponsors, pastSponsors)

    val folder = File("html")
    folder.mkdir()

    if (commandNames.isEmpty()) {
        val minifier = Minifier()
        minifier.copyWebImages()

        websiteBuilder.createCommandsHtmlFile(folder)

        websiteBuilder.createBasicsHtmlFile(folder)
        websiteBuilder.createTipsHtmlFile(folder)
        minifier.minifyScriptsAndSheets(true)

        websiteBuilder.createBasicHtmlFiles(File(folder, "basic"))

        websiteBuilder.createManHtmlFiles(File(folder, "man"))

        websiteBuilder.create404HtmlFile()
        websiteBuilder.createPrivacyPolicyHtmlFile(folder)
        websiteBuilder.createContactHtmlFile(folder)
        websiteBuilder.createImpressumHtmlFile(folder)
        websiteBuilder.createTermsAndConditionsHtmlFile(folder)

        websiteBuilder.createSitemap(folder)

        minifier.minifyScriptsAndSheets(true)
    } else {
        val only = commandNames.map { it.lowercase(Locale.US) }.toSet()
        val missing = only.filterNot { File("assets/commands", "$it.md").isFile }
        if (missing.isNotEmpty()) {
            error("No markdown page for command(s): ${missing.sorted().joinToString(", ")}")
        }
        println("Incremental website build for: ${commandNames.joinToString(", ")}")
        websiteBuilder.createCommandsHtmlFile(folder)
        websiteBuilder.createManHtmlFiles(File(folder, "man"), only = only)
        websiteBuilder.createSitemap(folder)
    }
}

class WebsiteBuilder(
    private val currentSponsors: List<Pair<String, String>> = emptyList(),
    private val pastSponsors: List<Pair<String, String>> = emptyList(),
) {

    private val cacheVersion = 19

    private val preInstalledCommands: Set<String>
    private val installableCommands: Set<String>

    init {
        val v86File = File("assets/v86-commands.txt")
        val preInstalled = mutableSetOf<String>()
        val installable = mutableSetOf<String>()
        var currentSection = ""
        if (v86File.exists()) {
            v86File.readLines().forEach { line ->
                val trimmed = line.trim()
                when {
                    trimmed == "# PRE-INSTALLED" -> currentSection = "pre"

                    trimmed == "# INSTALLABLE" -> currentSection = "inst"

                    trimmed.isNotEmpty() && !trimmed.startsWith("#") -> {
                        when (currentSection) {
                            "pre" -> preInstalled.add(trimmed)
                            "inst" -> installable.add(trimmed)
                        }
                    }
                }
            }
        }
        preInstalledCommands = preInstalled
        installableCommands = installable
    }

    private fun getTerminalStatus(commandName: String): String? {
        val name = commandName.lowercase()
        return when {
            preInstalledCommands.contains(name) -> "preinstalled"
            installableCommands.contains(name) -> "installable"
            else -> null
        }
    }

    /**
     * Get sorted list of command names from markdown files.
     */
    private fun getCommandNamesFromMarkdown(): List<String> {
        val commandsDir = File("assets/commands")
        return commandsDir.listFiles { file -> file.extension == "md" }
            ?.map { it.nameWithoutExtension }
            ?.sortedWith(compareBy<String> { !it.first().isDigit() }.thenBy { it.lowercase() })
            ?: emptyList()
    }

    /**
     * Get commands with their info from markdown files.
     * When [only] is set, parse just those names (lowercase file stems) instead of the full set.
     */
    private fun getCommandsFromMarkdown(only: Set<String>? = null): List<CommandInfo> {
        val commandsDir = File("assets/commands")
        if (only != null) {
            return only.mapNotNull { name ->
                val file = File(commandsDir, "$name.md")
                if (file.isFile) parseCommandMarkdown(file) else null
            }.sortedBy { it.name }
        }
        return commandsDir.listFiles { file -> file.extension == "md" }
            ?.mapNotNull { parseCommandMarkdown(it) }
            ?.sortedBy { it.name }
            ?: emptyList()
    }

    private fun parseCommandMarkdown(file: File): CommandInfo? = MarkdownParser.parseCommand(file.readText(), file.nameWithoutExtension)

    fun createCommandsHtmlFile(folder: File) {
        println("Create index html")

        val file = File(folder, "commands.html")

        writeHtmlPage(file) {
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
                            getCommandNamesFromMarkdown().forEach { commandName ->
                                val groupKey = if (commandName.first().isDigit()) "#" else commandName.lowercase().first().toString()
                                if (groupKey != currentFirstLetter) {
                                    currentFirstLetter = groupKey
                                    div {
                                        classes = classes + "headline"
                                        text(if (groupKey == "#") "#" else groupKey.uppercase())
                                    }
                                }
                                a("man/${commandName.lowercase()}") {
                                    attributes["data-c"] = commandName.lowercase()
                                    text(commandName)
                                }
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
    }

    fun createBasicsHtmlFile(folder: File) {
        println("Create basics html")

        val file = File(folder, "index.html")

        val basicTitles = MarkdownFileUtils.getBasicCategories()

        writeHtmlPage(file) {
            head {
                commonMeta()

                val title = "Basics | Cheat sheets | Linux Command Library"
                uncommonMeta(
                    title = title,
                    description = "Handy cheat sheets with linux tips and terminal basics about System control, Users, Files, Package managers, Video and Audio, Hacking tools, Terminal games and many more categories.",
                    url = "https://linuxcommandlibrary.com/${folder.name}/${file.nameWithoutExtension}",
                    keywords = "linux,cmd,basics,terminal,console,cheat sheets,tips,${basicTitles.joinToString(",")}",
                )

                styleLink("/stylesheets/main.css?v=$cacheVersion")
            }
            body {
                header(selectedIndex = 1)

                contentWrapper {
                    div {
                        ul {
                            classes = setOf("grid-container")

                            basicTitles.forEach { categoryTitle ->
                                li {
                                    classes = setOf("grid-item")
                                    a("basic/${categoryTitle.toHtmlFileName()}") {
                                        div {
                                            i {
                                                classes = setOf("invert-color")
                                                style = "background-image: url(\"images/${getIconResourceForTitle(categoryTitle)}\");"
                                            }
                                            h2 {
                                                if (categoryTitle == "Cryptocurrencies") {
                                                    style = "    line-break: anywhere;"
                                                }
                                                text(categoryTitle)
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
    }

    /**
     * Get icon resource for a category title.
     */
    private fun getIconResourceForTitle(title: String): String = when (title) {
        "One-liners" -> "icon-hand_with_pen.svg"
        "AI tools" -> "icon-agent.svg"
        "System information" -> "icon-system_task.svg"
        "System control" -> "icon-settings.svg"
        "Users & Groups" -> "icon-user.svg"
        "Files & Folders" -> "icon-file.svg"
        "Printing" -> "icon-print.svg"
        "Network" -> "icon-network_card.svg"
        "Search & Find" -> "icon-search.svg"
        "Git" -> "icon-git.svg"
        "SSH" -> "icon-vpn_key.svg"
        "Video & Audio" -> "icon-video_trimming.svg"
        "Package manager" -> "icon-package.svg"
        "Hacking tools" -> "icon-skull.svg"
        "Terminal games" -> "icon-controller.svg"
        "VIM" -> "icon-vim.svg"
        "Emacs" -> "icon-emacs.svg"
        "Nano" -> "icon-nano.svg"
        "Pico" -> "icon-pico.svg"
        "Text Processing" -> "icon-file_edit.svg"
        "Compression & Archiving" -> "icon-file_download.svg"
        "Shell Scripting" -> "icon-console.svg"
        "Tmux" -> "icon-restore_window.svg"
        "Regular Expressions" -> "icon-loupe.svg"
        "Cryptocurrencies" -> "icon-bitcoin.svg"
        "Input" -> "icon-mouse.svg"
        "JSON" -> "icon-json.svg"
        "Fun" -> "icon-fun.svg"
        "Backup & Imaging" -> "icon-save.svg"
        "System Recovery" -> "icon-healing.svg"
        "VIM Text Editor" -> "icon-text-edit.svg"
        "Emacs Text Editor" -> "icon-text-edit.svg"
        "Nano Text Editor" -> "icon-text-edit.svg"
        "Pico Text Editor" -> "icon-text-edit.svg"
        "Micro Text Editor" -> "icon-text-edit.svg"
        else -> ""
    }

    fun createBasicHtmlFiles(folder: File) {
        folder.mkdir()

        val basics = File("assets/basics").listFiles { file -> file.extension == "md" }
            .map { MarkdownParser.parseBasic(it.readText()) }
            .sortedBy { basicsSortOrder.indexOf(it.title) }
        val totalCount = basics.size

        basics.forEachIndexed { index, basicInfo ->
            print("\rCreate basic category html ${index + 1}/$totalCount")

            val categoryTitle = basicInfo.title
            val groups = basicInfo.groups
            val file = File(folder, "${categoryTitle.toHtmlFileName()}.html")

            writeHtmlPage(file) {
                head {
                    val title = "$categoryTitle | Basic | Cheat sheet | Linux Command Library"
                    commonMeta()
                    uncommonMeta(
                        title = title,
                        description = getDescriptionForTitle(categoryTitle),
                        url = "https://linuxcommandlibrary.com/${folder.name}/${file.nameWithoutExtension}",
                        keywords = getKeywordsForTitle(categoryTitle),
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

                    if (categoryTitle == "One-liners") {
                        style {
                            unsafe { +".masonry{-webkit-column-width: 400px !important;-moz-column-width: 400px !important;column-width: 400px !important;}" }
                        }
                    } else if (groups.isNotEmpty()) {
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
                                // Get first code section's command as the answer
                                val firstCommand = group.sections.filterIsInstance<TipSectionElement.Code>()
                                    .firstOrNull()?.command ?: ""
                                acceptedAnswerJson.put("text", firstCommand)
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
                                text(categoryTitle)
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
                                        unsafe {
                                            +HtmlMarkdownRenderer.renderSections(group.sections, previews = categoryTitle == "Terminal games")
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
        }
        println()
    }

    /**
     * Get description for a category title.
     */
    private fun getDescriptionForTitle(title: String): String = when (title) {
        "One-liners" -> "Useful linux command line one liners"
        "System information" -> "System and battery/cpu/memory/disk usage info on Linux "
        "System control" -> "Lock, unlock, start/stop bluetooth/wifi, shutdown, reboot system"
        "Users & Groups" -> "Create, remove, modify and list Linux groups and users"
        "Files & Folders" -> "Create, delete, list, show and change Linux files and folders"
        "Printing" -> "Print, view, start and cancel printing jobs on Linux"
        "Network" -> "Configure, list, trace, sockets, wifi networks on Linux"
        "Search & Find" -> "Search and find files by phrase, date and size on Linux"
        "Git" -> "Commit, push, create, delete and undo with git on Linux"
        "SSH" -> "Connect, forward, push and pull files via SSH"
        "Video & Audio" -> "Convert, volume, play, screenshot, webcam on Linux"
        "Package manager" -> "Install, update, upgrade, remove packages on Linux"
        "Hacking tools" -> "Hacking, forensics and exploitation tools for Linux"
        "Terminal games" -> "Terminal games on Linux"
        "VIM Text Editor" -> "Working with vim on the Linux command line"
        "Emacs Text Editor" -> "Working with emacs on the Linux command line"
        "Nano Text Editor" -> "Working with nano on the Linux command line"
        "Pico Text Editor" -> "Working with pico on the Linux command line"
        "Micro Text Editor" -> "Working with micro on the Linux command line"
        "Crypto currencies" -> "Miners, wallets and trading bots for Linux"
        "Input" -> "Type keys and move mouse via the Linux command line"
        "JSON" -> "Print, select, modify, delete and create json files on cmd"
        "Fun" -> "Fun on the linux command line"
        else -> ""
    }

    /**
     * Get keywords for a category title.
     */
    private fun getKeywordsForTitle(title: String): String = when (title) {
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
        "Git" -> "linux,create,clone,repository,tag,checkout,delete,commit"
        "SSH" -> "linux,connect,ssh,push,pull,forwarding"
        "Video & Audio" -> "linux,screenshot,webcam,sounds,video,convert,image"
        "Package manager" -> "linux,install,file,repository,find,package,upgrade"
        "Hacking tools" -> "linux,password,forensics,sniffing,spoofing,exploit,vulnerability"
        "Crypto currencies" -> "linux,minters,wallets,coin,trading,bots"
        "VIM Text Editor" -> "linux,insert,search,edit,replace,navigation"
        "Emacs Text Editor" -> "linux,emacs,usage,buffers,navigation"
        "Nano Text Editor" -> "linux,nano,info,navigation,edit,input,output"
        "Pico Text Editor" -> "linux,pico,navigation,usage,input,output"
        "Micro Text Editor" -> "linux,pico,navigation,usage,input,output"
        "Terminal games" -> "linux,terminal,games,list,rogue"
        else -> "linux"
    }

    fun createTipsHtmlFile(folder: File) {
        println("Create tips html")

        folder.mkdir()

        val file = File(folder, "tips.html")

        // Read tips from markdown file
        val tips = MarkdownParser.parseTips(File("assets/tips.md").readText())

        writeHtmlPage(file) {
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

                        tips.forEach { tip ->
                            div {
                                classes = setOf("code-group")

                                h2 {
                                    a("/${file.nameWithoutExtension}#${tip.id}") {
                                        id = tip.id.toString()
                                        text(tip.title)
                                    }
                                }

                                unsafe {
                                    +HtmlMarkdownRenderer.renderSections(tip.sections)
                                }
                            }
                        }
                    }
                }
                tooltip()
                footer()
            }
        }
    }

    fun createManHtmlFiles(folder: File, only: Set<String>? = null) {
        folder.mkdir()

        val requested = only?.map { it.lowercase(Locale.US) }?.toSet()
        val commands = getCommandsFromMarkdown(requested)
        if (requested != null) {
            val found = commands.map { it.name.lowercase(Locale.US) }.toSet()
            val missing = requested - found
            if (missing.isNotEmpty()) {
                error("No markdown page for command(s): ${missing.sorted().joinToString(", ")}")
            }
        }
        val totalCount = commands.size

        commands.forEachIndexed { index, command ->
            print("\rCreate mans html ${index + 1}/$totalCount")

            val file = File(folder, "${command.name.lowercase()}.html")

            writeHtmlPage(file) {
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
                    if (getTerminalStatus(command.name) != null) {
                        styleLink("/stylesheets/terminal.css?v=$cacheVersion")
                    }
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
                            command.description?.let {
                                h2 {
                                    classes = setOf("subtitle")
                                    text(it)
                                }
                            }

                            command.sections.filter { it.title.uppercase() != "TAGLINE" }
                                .sortedBy { it.getSortPriority() }
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
                                        when (section.title.uppercase()) {
                                            "SEE ALSO" -> {
                                                // Parse SEE ALSO section for man page links
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

                                            "RESOURCES" -> {
                                                // Render external links as clickable chips, like SEE ALSO
                                                p {
                                                    val links = section.elements
                                                        .filterIsInstance<TipSectionElement.Code>()
                                                        .flatMap { it.elements }
                                                        .filterIsInstance<CommandElement.Url>()
                                                    links.forEachIndexed { index, link ->
                                                        if (index > 0) {
                                                            unsafe { +" &middot; " }
                                                        }
                                                        a(link.url) {
                                                            target = ATarget.blank
                                                            rel = "noopener"
                                                            text(link.command)
                                                        }
                                                    }
                                                }
                                            }

                                            "INSTALL" -> {
                                                val entries = InstallEntries.parseFromElements(section.elements)
                                                if (entries.isEmpty()) {
                                                    p {
                                                        unsafe {
                                                            +HtmlMarkdownRenderer.renderSections(section.elements)
                                                        }
                                                    }
                                                } else {
                                                    div {
                                                        classes = setOf("install-list")
                                                        entries.forEach { entry ->
                                                            // Same pattern as code-wrapper: command + copy.
                                                            div {
                                                                classes = setOf("code-wrapper", "install-row")
                                                                span {
                                                                    classes = setOf("code", "install-command")
                                                                    text(entry.command)
                                                                }
                                                                div {
                                                                    onClick = "javascript:copy('${entry.command.escapeJsAttribute()}')"
                                                                    classes = setOf("copy-button")
                                                                    attributes["title"] = "Copy install command"
                                                                    unsafe {
                                                                        +"""<img src="/images/icon-copy.svg" alt="copy" width="24" height="24">"""
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }

                                            "TLDR" -> {
                                                div {
                                                    unsafe {
                                                        +HtmlMarkdownRenderer.renderSections(section.elements)
                                                    }
                                                }
                                            }

                                            "PREVIEW" -> {
                                                div {
                                                    unsafe {
                                                        +HtmlMarkdownRenderer.renderSections(section.elements, previews = true)
                                                    }
                                                }
                                            }

                                            else -> {
                                                // Use HtmlMarkdownRenderer for all other sections
                                                p {
                                                    unsafe {
                                                        +HtmlMarkdownRenderer.renderSections(section.elements)
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

                    val terminalStatus = getTerminalStatus(command.name)
                    if (terminalStatus != null) {
                        script {
                            unsafe {
                                +"var terminalCmd=\"${command.name.lowercase()}\",terminalStatus=\"$terminalStatus\";"
                            }
                        }
                        script(src = "/scripts/terminal.js?v=$cacheVersion") {
                            defer = true
                        }
                    }
                    script(src = "/scripts/man.js?v=$cacheVersion") {
                        defer = true
                    }
                }
            }
        }
        println()
    }

    fun createTermsAndConditionsHtmlFile(folder: File) {
        println("Create terms and conditions html")
        createLegalPage(folder, "terms-conditions", "Terms and Conditions | Linux Command Library") {
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
                a(href = "https://www.commandlinefu.com/") { +"commandlinefu.com" }
                +"."
            }
            p {
                +"Some command examples are adapted from "
                a(href = "https://github.com/tldr-pages/tldr") { +"tldr-pages" }
                +", © tldr-pages contributors, licensed under "
                a(href = "https://creativecommons.org/licenses/by/4.0/") { +"CC BY 4.0" }
                +". Changes were made."
            }
        }
    }

    fun createPrivacyPolicyHtmlFile(folder: File) {
        println("Create privacy html")
        createLegalPage(folder, "privacy-policy", "Privacy Policy | Linux Command Library") {
            h1 { +"Privacy Policy" }
            p { +"Last Updated: November 4, 2026" }

            h2 { +"1. No Data Collection or Tracking" }
            p { +"Our website does not use cookies, web beacons, analytics, advertising or any other tracking technologies." }
            p { +"We do not collect any personal data from users. There are no contact forms, email sign-ups, or other mechanisms that gather personal information on our website." }

            h2 { +"2. GitHub Sponsor Avatars" }
            p {
                +"The footer shows the profile pictures of our GitHub Sponsors. These images are loaded directly from GitHub, so your browser connects to GitHub's servers and transmits your IP address to GitHub when you view a page. See "
                a(href = "https://docs.github.com/en/site-policy/privacy-policies/github-general-privacy-statement") { +"GitHub's Privacy Statement" }
                +"."
            }

            h2 { +"3. Your Rights (GDPR Compliance)" }
            p { +"For EU Users: If you are located in the European Union, you have the right to access, correct, or delete any personal data we may hold about you. Since we do not collect personal data through tracking or forms, no such data is stored." }

            h2 { +"4. Contact Us" }
            p {
                +"If you have any questions or concerns about this Privacy Policy, you can contact us at "
                a(href = "mailto:info@linuxcommandlibrary.com") { +"info@linuxcommandlibrary.com" }
                +"."
            }

            h2 { +"5. Changes to This Policy" }
            p { +"We may update this Privacy Policy from time to time. Any changes will be posted on this page with an updated 'Last Updated' date." }
        }
    }

    fun createContactHtmlFile(folder: File) {
        println("Create contact html")
        createLegalPage(folder, "contact", "Contact | Linux Command Library") {
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
                a(href = "/terms-conditions") { +"Terms and Conditions" }
                +"."
            }
        }
    }

    fun createImpressumHtmlFile(folder: File) {
        println("Create impressum html")
        createLegalPage(
            folder,
            "impressum",
            "Impressum | Linux Command Library",
            description = "Impressum / Legal notice of Linux Command Library",
            lang = "de",
            extraHead = { meta(name = "robots", content = "noindex") },
        ) {
            h1 { +"Impressum" }
            p { +"Angaben gemäß § 5 DDG" }
            p {
                +"Simon Schubert"
                br
                +"Parkstr. 43"
                br
                +"13585 Berlin"
                br
                +"Deutschland"
            }

            h2 { +"Kontakt" }
            p {
                +"E-Mail: "
                a(href = "mailto:info@linuxcommandlibrary.com") { +"info@linuxcommandlibrary.com" }
            }

            h2 { +"Verantwortlich für den Inhalt nach § 18 Abs. 2 MStV" }
            p {
                +"Simon Schubert, Anschrift wie oben"
            }
        }
    }

    /**
     * A text-only page (legal notices, contact) without ads, sharing one head and layout.
     * [extraHead] is emitted between the page meta and the stylesheet.
     */
    private fun createLegalPage(
        folder: File,
        fileName: String,
        title: String,
        description: String = "",
        lang: String = "en",
        extraHead: HEAD.() -> Unit = {},
        content: DIV.() -> Unit,
    ) {
        folder.mkdir()
        writeHtmlPage(File(folder, "$fileName.html"), lang) {
            head {
                commonMeta()
                uncommonMeta(
                    title = title,
                    description = description,
                    url = "https://linuxcommandlibrary.com/$fileName",
                    keywords = "",
                )
                extraHead()

                styleLink("/stylesheets/main.css?v=$cacheVersion")
            }

            body {
                header(-1)

                div {
                    id = "content"
                    content()
                }

                footer(showAd = false)
            }
        }
    }

    /**
     * Writes one HTML page: doctype plus the kotlinx.html document built by [block].
     */
    private fun writeHtmlPage(file: File, lang: String = "en", block: HTML.() -> Unit) {
        file.delete()
        PrintStream(file).use { stream ->
            stream.appendLine("<!DOCTYPE html>")
            stream.appendHTML().html {
                this.lang = lang
                block()
            }
        }
    }

    private val seeAlsoManLinkRegex = Regex("""\[([^\]]+)]\(/man/([^)]+)\)""")

    /**
     * Parse SEE ALSO section for man page links like [less](/man/less)(1); everything else is text.
     */
    private fun getSeeAlsoSectionElements(content: String): List<CommandElement> {
        val elements = mutableListOf<CommandElement>()
        var last = 0
        for (match in seeAlsoManLinkRegex.findAll(content)) {
            if (match.range.first > last) elements += CommandElement.Text(content.substring(last, match.range.first))
            elements += CommandElement.Man(match.groupValues[2])
            last = match.range.last + 1
        }
        if (last < content.length) elements += CommandElement.Text(content.substring(last))
        return elements
    }

    fun create404HtmlFile() {
        println("Create 404 html")

        val file = File("html/error_404.html")

        writeHtmlPage(file) {
            head {
                commonMeta()
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
    ) {
        li {
            a(href) {
                if (selectedIndex == index) {
                    classes = setOf("selected")
                }
                text(title)
            }
        }
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
                            alt = "GitHub"
                            width = "25"
                            height = "25"
                        }
                    }
                    a("https://f-droid.org/en/packages/com.inspiredandroid.linuxcommandbibliotheca") {
                        target = ATarget.blank
                        rel = "noopener"
                        img {
                            src = "/images/icon-fdroid.svg"
                            alt = "F-Droid"
                            width = "25"
                            height = "25"
                        }
                    }
                    a("https://play.google.com/store/apps/details?id=com.inspiredandroid.linuxcommandbibliotheca") {
                        target = ATarget.blank
                        rel = "noopener"
                        img {
                            src = "/images/icon-playstore.svg"
                            alt = "Google Play Store"
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
        // Get basic categories from markdown files
        val basicsDir = File("assets/basics")
        basicsDir.listFiles { f -> f.extension == "md" }?.forEach { mdFile ->
            val title = MarkdownParser.parseTitle(mdFile.readText()) ?: "Unknown"
            stream.print(getSitemapUrlNode("basic/${title.toHtmlFileName()}"))
        }
        // Get commands from markdown files
        getCommandNamesFromMarkdown().forEach { commandName ->
            stream.print(getSitemapUrlNode("man/$commandName"))
        }
        stream.print("</urlset>")
        stream.close()
    }

    private fun getSitemapUrlNode(urlPart: String): String = "<url>" +
        "<loc>https://linuxcommandlibrary.com/$urlPart</loc>" +
        "</url>"

    private fun HEAD.commonMeta() {
        meta(charset = "utf-8")
        meta(name = "viewport", content = "width=device-width, initial-scale=1")
        link(rel = "apple-touch-icon", sizes = "180x180", href = "/apple-touch-icon.png")
        link(rel = "icon", type = "image/png", sizes = "32x32", href = "/favicon-32x32.png")
        link(rel = "icon", type = "image/png", sizes = "16x16", href = "/favicon-16x16.png")
        link(rel = "manifest", href = "/site.webmanifest")
        meta(name = "msapplication-TileColor", content = "#da532c")
        meta(name = "theme-color", content = "#ffffff")
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

    private fun FlowContent.contentWrapper(content: DIV.() -> Unit = {}) {
        div {
            id = "content-wrapper"
            content()
        }
    }

    private fun FlowContent.footer(showAd: Boolean = true) {
        if (showAd) {
            div {
                classes = setOf("bottom-panel")
                style = "background-color: #5e2cbd;"
                a {
                    id = "app-link"
                    href = "https://github.com/SimonSchubert/Kai"
                    img {
                        style = "max-width: 100%;"
                        src = "/images/af/kai-1-horizontal.webp"
                        alt = "Kai"
                    }
                }
                script {
                    unsafe {
                        raw(
                            """
                            (function() {
                                var ua = navigator.userAgent || '';
                                var link = document.getElementById('app-link');
                                if (/android/i.test(ua)) {
                                    link.href = 'https://play.google.com/store/apps/details?id=com.inspiredandroid.kai';
                                } else if (/iPhone|iPad|iPod|Macintosh|Mac OS/i.test(ua)) {
                                    link.href = 'https://apps.apple.com/us/app/kai-ai/id6758148023';
                                }
                            })();
                            """.trimIndent(),
                        )
                    }
                }
            }
        }
        footer {
            if (currentSponsors.isNotEmpty() || pastSponsors.isNotEmpty()) {
                div {
                    style = "text-align: center; padding: 12px 0;"
                    p {
                        style = "font-size: 14px; color: #fff; margin: 0 0 10px 0;"
                        +"GitHub Sponsors"
                    }
                    div {
                        style = "display: flex; justify-content: center; flex-wrap: wrap; gap: 8px; margin-bottom: 12px;"
                        for ((username, avatar) in currentSponsors + pastSponsors) {
                            a("https://github.com/$username") {
                                target = ATarget.blank
                                rel = "noopener"
                                title = username
                                img {
                                    src = avatar
                                    alt = username
                                    width = "36"
                                    height = "36"
                                    style = "border-radius: 50%;"
                                }
                            }
                        }
                    }
                    a("https://github.com/sponsors/SimonSchubert") {
                        target = ATarget.blank
                        rel = "noopener"
                        style = "display: inline-block; padding: 6px 14px; background-color: #db61a2; color: #fff; border-radius: 6px; font-size: 13px; text-decoration: none;"
                        +"\u2665\uFE0F Become a Sponsor"
                    }
                }
            }
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
                text(" | ")
                a {
                    target = ATarget.self
                    rel = "noopener"
                    href = "/impressum"
                    text("Impressum")
                }
            }
            a("https://apps.apple.com/us/app/linux-command-library/id1219649976") {
                style = "margin-right: 4px;"
                target = ATarget.blank
                rel = "noopener"
                img {
                    src = "/images/app_store.svg"
                    alt = "Google Play Store"
                    classes = setOf("download-icon")
                    width = "150"
                    height = "50"
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
            br
            br
        }
    }

    private fun FlowContent.tooltip() {
        div {
            classes = setOf("tooltip")
            b {
                text("Copied to clipboard")
            }
        }
    }

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
}
