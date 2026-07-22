# TAGLINE

command-line tool for the Flutter UI framework

# TLDR

**Create new project**

```flutter create [app_name]```

**Run app in** debug

```flutter run```

**Build release APK**

```flutter build apk```

**Get dependencies**

```flutter pub get```

**Run tests**

```flutter test```

# SYNOPSIS

**flutter** _command_ [_options_] [_arguments_]

# PARAMETERS

_COMMAND_
> Operation: create, run, build, test, pub, etc.

**create** _NAME_
> Create new Flutter project.

**run**
> Run app on device/emulator.

**build** _TARGET_
> Build app (apk, ios, web).

**test**
> Run unit and widget tests.

**pub** _SUBCMD_
> Package management.

**doctor**
> Check environment setup.

**devices**
> List connected devices.

**--help**
> Display help information.

# DESCRIPTION

**flutter** is the command-line tool that drives the Flutter UI framework. It scaffolds projects, manages package dependencies through **pub**, runs builds for each supported platform, and orchestrates the developer loop including hot-reload and hot-restart during **flutter run**.

A single Dart codebase compiles to native binaries for **iOS**, **Android**, **macOS**, **Linux**, **Windows**, and to JavaScript/WebAssembly for the web. The **doctor** subcommand inspects the host machine and reports missing prerequisites such as the Android SDK, Xcode, command-line tools, and the appropriate device emulators. **flutter devices** lists currently attached or running targets that **flutter run** can deploy to.

# CAVEATS

Each target platform requires its native SDK on the host: Android SDK plus a JDK for Android, Xcode plus CocoaPods for iOS/macOS, Visual Studio for Windows, GTK/clang for Linux. Initial channel switches (**flutter channel stable | beta | master**) trigger a large download. **flutter upgrade** updates only the active channel; downgrading typically requires **flutter downgrade** or a fresh checkout of a specific tag.

# HISTORY

**Flutter** was announced by **Google** at I/O **2017** and reached **1.0** in **December 2018**. The framework uses its own GPU-accelerated rendering engine (originally Skia, now also Impeller) instead of native widget toolkits, which is what gives it identical appearance across platforms. Dart **3** brought sound null safety and patterns to the toolchain.

# INSTALL

```nix: nix profile install nixpkgs#flutter```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[dart](/man/dart)(1), [flutter-pub](/man/flutter-pub)(1), [adb](/man/adb)(1), [xcrun](/man/xcrun)(1)
