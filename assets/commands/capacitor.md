# TLDR

**Initialize Capacitor** in a project

```npx cap init [appName] [appId]```

**Add a platform** to the project

```npx cap add [android|ios]```

**Sync web assets** to native projects

```npx cap sync```

**Sync a specific platform**

```npx cap sync [android|ios]```

**Copy web assets** without updating native plugins

```npx cap copy```

**Open the native IDE** for a platform

```npx cap open [android|ios]```

**Build and run** on a device or emulator

```npx cap run [android|ios]```

**Check system configuration** and diagnose issues

```npx cap doctor```

# SYNOPSIS

**npx cap** [**-V**] [**-h**] [_COMMAND_]

# PARAMETERS

**-V**, **--version**
> Display version number.

**-h**, **--help**
> Show usage information. Works with individual commands.

# COMMANDS

**init** _appName_ _appId_
> Initialize a new Capacitor project with configuration files.

**add** _platform_
> Add native platform support (android or ios).

**sync** [_platform_]
> Copy web assets and update native plugins. Runs copy and update together.

**copy** [_platform_]
> Copy web assets to native projects without updating plugins.

**update** [_platform_]
> Update native plugins and dependencies.

**open** _platform_
> Open the native IDE (Android Studio or Xcode) for the platform.

**run** _platform_
> Build and run the app on a device or emulator.

**build** _platform_
> Build the native project.

**ls**
> List installed Capacitor plugins and platforms.

**doctor**
> Check system configuration and diagnose common issues.

**migrate**
> Migrate project between Capacitor versions.

# DESCRIPTION

**Capacitor** is an open-source native runtime by Ionic for building cross-platform mobile applications using web technologies (JavaScript, HTML, CSS). It allows web developers to create native iOS, Android, and Progressive Web Apps from a single codebase.

The Capacitor CLI manages the native project lifecycle including initialization, platform management, asset synchronization, and building. Unlike Cordova, Capacitor embraces native project configuration, giving developers direct access to native IDEs and build systems.

Web assets are built separately (using any web framework) and then copied to native projects with **cap sync**. Native functionality is accessed through Capacitor plugins that bridge JavaScript to native iOS/Android APIs.

# CAVEATS

Requires Node.js and npm. For iOS development, macOS with Xcode is required. For Android development, Android Studio and the Android SDK must be installed. The CLI is typically run via **npx** rather than global installation to ensure version consistency across projects.

# HISTORY

Capacitor was created by the Ionic team and first released in **2019** as a modern alternative to Apache Cordova. It was designed to address Cordova's limitations by providing better native project integration, improved plugin ecosystem, and support for Progressive Web Apps. The project has become the recommended runtime for Ionic Framework applications and can be used with any web framework.

# SEE ALSO

[ionic](/man/ionic)(1), [npm](/man/npm)(1), [npx](/man/npx)(1), [cordova](/man/cordova)(1)
