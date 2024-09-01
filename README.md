## Linux Command Library (Mobile+CLI+Web)

![Icon](https://raw.githubusercontent.com/SimonSchubert/LinuxCommandLibrary/master/art/web_hi_res_144.png)

The app currently has **6056** manual pages, **22+** basic categories and a bunch of general terminal tips. It works 100% offline, doesn't need an internet connection and has no tracking software.

[![Play Store](https://raw.githubusercontent.com/SimonSchubert/LinuxCommandBibliotheca/master/art/play_store_badge.png)](https://play.google.com/store/apps/details?id=com.inspiredandroid.linuxcommandbibliotheca)
[![F-Droid](https://raw.githubusercontent.com/SimonSchubert/LinuxCommandBibliotheca/master/art/fdroid_badge.png)](https://f-droid.org/en/packages/com.inspiredandroid.linuxcommandbibliotheca/)

https://linuxcommandlibrary.com

### Mobile screenshots

<p>
<img src="https://raw.githubusercontent.com/SimonSchubert/LinuxCommandBibliotheca/master/art/screen-1.png" width="200">
<img src="https://raw.githubusercontent.com/SimonSchubert/LinuxCommandBibliotheca/master/art/screen-2-dark.png" width="200">
<img src="https://raw.githubusercontent.com/SimonSchubert/LinuxCommandBibliotheca/master/art/screen-3.png" width="200">
<img src="https://raw.githubusercontent.com/SimonSchubert/LinuxCommandBibliotheca/master/art/screen-4-dark.png" width="200">
</p>
<img src="https://raw.githubusercontent.com/SimonSchubert/LinuxCommandBibliotheca/master/art/screen-1-tablet.png" width="400">
<img src="https://raw.githubusercontent.com/SimonSchubert/LinuxCommandBibliotheca/master/art/screen-2-tablet.png" width="400">

### CLI screenshot

<img src="https://raw.githubusercontent.com/SimonSchubert/LinuxCommandBibliotheca/master/art/screen-cli-1.png" width="300">

Execute `gradle :cli:buildJar` to create jar file for Linux, Windows and Mac.

### Content

#### Categories

One-liners, System information, System control, Users & Groups, Files & Folders, Input, Printing, JSON, Network, Search & Find, GIT, SSH, Video & Audio, Package manager, Hacking tools, Terminal games, Crypto currencies, VIM Texteditor, Emacs Texteditor, Nano Texteditor, Pico Texteditor, Micro Texteditor

#### Tips

Clear and reset the terminal, List of recent commands, Close a frozen window/application, Tab Completion, Temporary aliases, Permanent aliases, Chain commands, Command syntax, Cursor navigation, Redirection, Special characters in commands, View file permissions, Modify file permissions, Set file permissions via binary references

### CI/CD

[Github Action](.github/workflows/android.yml) to automatically create a new Github release with APK and JAR and upload an AAB to the Play Store.

### Tests

Android Jetpack Compose screen tests: [ComposeTests.kt](android/src/androidTest/java/com/inspiredandroid/linuxcommandbibliotheca/ComposeTests.kt)

Android Jetpack Compose deeplinking tests: [ComposeDeeplinkTests.kt](android/src/androidTest/java/com/inspiredandroid/linuxcommandbibliotheca/ComposeDeeplinkTests.kt)

Common code unit tests: [CommonTests.kt](common/src/commonTest/kotlin/CommonTests.kt)

### Licensing

The source code is licensed under the Apache 2.0 license and the copyright of the man pages in the `database.db` file are copyrighted by their respective authors.

### Thanks to

http://letsgokoyo.com - App Icon

https://www.commandlinefu.com - Lots of one-liners

https://icons8.com - Icons

https://tldr.sh - TLDR
