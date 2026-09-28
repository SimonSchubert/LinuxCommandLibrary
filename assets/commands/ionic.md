# TAGLINE

CLI manages Ionic Framework projects

# TLDR

**Create new app** interactively

```ionic start```

Create an app from a **starter template** and framework

```ionic start [myapp] [blank|tabs|sidemenu] --type [angular|react|vue]```

**Serve locally** with live reload

```ionic serve```

Serve on **all network interfaces** (test from a phone on the LAN)

```ionic serve --external```

**Build** web assets for production (Angular)

```ionic build --prod```

**Add** a native platform

```ionic capacitor add [ios|android]```

**Sync** web assets and plugins to native projects

```ionic capacitor sync```

**Run on device** with live reload

```ionic capacitor run [android] -l --external```

**Open** the native project in Android Studio or Xcode

```ionic capacitor open [android|ios]```

**Generate** a page (Angular projects)

```ionic generate page [name]```

Print **environment and project info** for bug reports

```ionic info```

# SYNOPSIS

**ionic** _command_ [_options_]

# PARAMETERS

**start** [_NAME_] [_TEMPLATE_]
> Create a new project. Options include **--type** (angular, react, vue), **--list** (show starters), **--capacitor**, **--no-deps** and **--no-git**.

**serve**
> Start the development server with live reload. Options include **--external**, **--host** and **--port**.

**build**
> Build web assets. **--prod** and **-c**, **--configuration** apply to Angular projects.

**capacitor** _COMMAND_
> Capacitor integration: **add**, **build**, **copy**, **open**, **run**, **sync**, **update**.

**cordova** _COMMAND_
> Legacy Cordova integration commands.

**generate** _TYPE_ _NAME_
> Generate pages, components, services and other Angular features (alias **g**).

**info**
> Print system and project environment information.

**integrations** **enable**|**disable** _NAME_
> Add or remove integrations such as capacitor or cordova.

**repair**
> Remove and recreate dependencies and generated files.

**--help**
> Display help information for any command.

# DESCRIPTION

**Ionic** CLI manages Ionic Framework projects. It creates cross-platform mobile and web apps using web technologies with Angular, React or Vue.

The tool integrates with Capacitor (default) or Cordova for native functionality. It provides a development server, build tools, and code generation.

# CAVEATS

Requires Node.js. Native builds need platform SDKs (Android Studio, Xcode on macOS). **ionic generate** and **--prod** only work in Angular projects; React and Vue projects rely on their own tooling. Cordova support is legacy; new projects should use Capacitor. The npm package is **@ionic/cli**; the old unscoped **ionic** package is deprecated.

# HISTORY

Ionic was created by **Drifty Co.** (later renamed Ionic) in 2013 as a framework for building hybrid mobile applications with web technologies. The company was acquired by **OutSystems** in 2022.

# SEE ALSO

[capacitor](/man/capacitor)(1), [cordova](/man/cordova)(1), [npm](/man/npm)(1), [ng](/man/ng)(1)

# RESOURCES

```[Source code](https://github.com/ionic-team/ionic-cli)```

```[Homepage](https://ionicframework.com)```

<!-- verified: 2026-09-29 -->
