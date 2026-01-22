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

**flutter** is the command-line tool for the Flutter UI framework. It manages projects, dependencies, builds, and development workflows for cross-platform applications.

Flutter creates native apps for iOS, Android, web, and desktop from a single Dart codebase. The CLI handles hot reload during development and production builds for distribution.

The doctor command verifies installation and identifies missing platform tools.

# CAVEATS

Requires platform SDKs (Android SDK, Xcode). Large initial download. Different platforms need different setup.

# HISTORY

Flutter was created by **Google** and released in 2017. It provides a reactive UI framework with its own rendering engine, enabling consistent appearance across platforms.

# SEE ALSO

[dart](/man/dart)(1), [flutter-pub](/man/flutter-pub)(1), [adb](/man/adb)(1)
