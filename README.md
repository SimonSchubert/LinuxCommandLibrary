## Linux Command Library (Android+iOS+Desktop GUI and CLI+Web)

![Icon](https://raw.githubusercontent.com/SimonSchubert/LinuxCommandLibrary/master/art/web_hi_res_144.png)

The app currently has **7713** manual pages, **23+** basic categories and a bunch of general terminal tips. It works 100% offline, doesn't need an internet connection and has no tracking software.

[![App Store](https://raw.githubusercontent.com/SimonSchubert/LinuxCommandBibliotheca/master/art/app_store_badge.png)](https://apps.apple.com/us/app/linux-command-library/id1219649976)
[![Play Store](https://raw.githubusercontent.com/SimonSchubert/LinuxCommandBibliotheca/master/art/play_store_badge.png)](https://play.google.com/store/apps/details?id=com.inspiredandroid.linuxcommandbibliotheca)
[![F-Droid](https://raw.githubusercontent.com/SimonSchubert/LinuxCommandBibliotheca/master/art/fdroid_badge.png)](https://f-droid.org/en/packages/com.inspiredandroid.linuxcommandbibliotheca/)
[![Web](https://raw.githubusercontent.com/SimonSchubert/LinuxCommandBibliotheca/master/art/web_badge.png)](https://linuxcommandlibrary.com)

Native CLI and GUI binaries for Linux, macOS, and Windows are available in [Releases](https://github.com/SimonSchubert/LinuxCommandLibrary/releases).

#### Homebrew

GUI: ```brew install --cask simonschubert/tap/linux-command-library```

CLI: ```brew install simonschubert/tap/linux-command-library-cli```

### Android screenshots

<p>
<img src="https://raw.githubusercontent.com/SimonSchubert/LinuxCommandBibliotheca/master/art/screen-android-1.png" width="200">
<img src="https://raw.githubusercontent.com/SimonSchubert/LinuxCommandBibliotheca/master/art/screen-android-2.png" width="200">
</p>

### iOS screenshots

<p>
<img src="https://raw.githubusercontent.com/SimonSchubert/LinuxCommandBibliotheca/master/art/screen-ios-1.png" width="200">
<img src="https://raw.githubusercontent.com/SimonSchubert/LinuxCommandBibliotheca/master/art/screen-ios-2.png" width="200">
</p>

### Desktop screenshots

<p>
<img src="https://raw.githubusercontent.com/SimonSchubert/LinuxCommandBibliotheca/master/art/screen-desktop-1.png" width="400">
<img src="https://raw.githubusercontent.com/SimonSchubert/LinuxCommandBibliotheca/master/art/screen-desktop-2.png" width="400">
</p>

### CLI screenshot

<img src="https://raw.githubusercontent.com/SimonSchubert/LinuxCommandBibliotheca/master/art/screen-cli-1.png" width="400">

### Content

#### Categories

One-liners, AI tools, System information, System control, Users & Groups, Files & Folders, Input, Printing, JSON, Network, Search & Find, GIT, SSH, Video & Audio, Package manager, Hacking tools, Terminal games, Cryptocurrencies, VIM Text Editor, Emacs Text Editor, Nano Text Editor, Pico Text Editor, Micro Text Editor

#### Tips

Clear and reset the terminal, List of recent commands, Close a frozen window/application, Tab Completion, Temporary aliases, Permanent aliases, Chain commands, Command syntax, Cursor navigation, Redirection, Special characters in commands, View file permissions, Modify file permissions, Set file permissions via binary references, Running commands in the background, Scheduling tasks with cron

### CI/CD

[Github Action](.github/workflows/android.yml) to automatically create a new Github release with APK, CLI binaries, and desktop installers, and upload an AAB to the Play Store.

### Tests

Android Jetpack Compose deeplinking tests: [ComposeDeeplinkTests.kt](android/src/androidTest/java/com/inspiredandroid/linuxcommandbibliotheca/ComposeDeeplinkTests.kt)

Common code unit tests: [CommonTests.kt](common/src/commonTest/kotlin/CommonTests.kt)

### Licensing

The source code is licensed under the Apache 2.0 license and the copyright of the man pages are copyrighted by their respective authors.

### Thanks to

http://letsgokoyo.com - App Icon

https://icons8.com - Icons

https://tldr.sh - TLDR
