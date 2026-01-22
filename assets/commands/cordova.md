# TLDR

**Create a new Cordova project**

```cordova create [myapp] [com.example.myapp] "[MyApp]"```

**Add a platform** (iOS, Android, etc.)

```cordova platform add [android]```

**Build the app** for all platforms

```cordova build```

**Build for a specific platform**

```cordova build [android]```

**Run the app** on an emulator or device

```cordova run [android]```

**Add a plugin**

```cordova plugin add [cordova-plugin-camera]```

**List installed plugins**

```cordova plugin list```

**Remove a platform**

```cordova platform remove [ios]```

# SYNOPSIS

**cordova** _command_ [_options_]

# PARAMETERS

**create** _DIR_ _ID_ _NAME_
> Create a new Cordova project in the specified directory.

**platform add** _PLATFORM_
> Add a platform (android, ios, browser, electron).

**platform remove** _PLATFORM_
> Remove a platform from the project.

**build** [_PLATFORM_]
> Build the app for specified or all platforms.

**run** [_PLATFORM_]
> Run the app on device or emulator.

**emulate** _PLATFORM_
> Run the app in a platform emulator.

**plugin add** _PLUGIN_
> Add a plugin to the project.

**plugin remove** _PLUGIN_
> Remove a plugin from the project.

**plugin list**
> List installed plugins.

**prepare**
> Copy files into platform directories for building.

**--release**
> Build in release mode.

**--device**
> Deploy to connected device instead of emulator.

# DESCRIPTION

**Apache Cordova** is a mobile application development framework that allows building apps for multiple platforms using HTML, CSS, and JavaScript. The CLI manages project creation, platform configuration, plugin installation, and app building.

Cordova wraps web applications in a native container, providing access to device features through JavaScript APIs. Plugins bridge the gap between web code and native functionality like camera, GPS, contacts, and file system access.

The workflow typically involves creating a project, adding target platforms, installing necessary plugins, developing the web app in the **www** directory, and using build/run commands to test on devices or emulators.

# CAVEATS

Platform SDKs must be installed separately (Android SDK, Xcode for iOS). iOS development requires macOS. Some plugins may have platform-specific limitations. Performance may not match fully native applications for intensive tasks.

# HISTORY

Cordova originated as **PhoneGap**, created by Nitobi Software in **2009**. Adobe acquired Nitobi in **2011** and donated the codebase to the Apache Software Foundation, where it was renamed Cordova. It remains one of the most widely used hybrid mobile development frameworks.

# SEE ALSO

[ionic](/man/ionic)(1), [npm](/man/npm)(1), [phonegap](/man/phonegap)(1)
