# TAGLINE

React Native integration platform for native apps

# TLDR

**Create a new MiniApp** project

```ern create-miniapp [app-name]```

**Run a MiniApp** on Android

```ern run-android```

**Run a MiniApp** on iOS

```ern run-ios```

**Create a new API** module

```ern create-api [api-name]```

**Add a dependency** to a MiniApp

```ern add [dependency]```

**Start the development** server for MiniApps

```ern start```

**Push an OTA update** via CodePush

```ern code-push [miniapps] -d [descriptor]```

# SYNOPSIS

**ern** _command_ [_options_]

# PARAMETERS

_COMMAND_
> ERN operation to perform.

**create-miniapp** _NAME_
> Create a new MiniApp project (equivalent to react-native init).

**run-android**
> Run MiniApp on Android emulator or device.

**run-ios**
> Run MiniApp on iOS simulator or device.

**create-api** _NAME_
> Create a new API with generated client code.

**start**
> Start the Electrode Native development server (packager).

**add** _DEPENDENCY_
> Add a JavaScript or native dependency to a MiniApp.

**cauldron** _COMMAND_
> Manage the Cauldron (version registry for native app containers).

**code-push** _MINIAPPS_
> Push OTA updates via CodePush.

**link**
> Link a MiniApp for local development and debugging.

**--help**
> Display help information.

# DESCRIPTION

**ern** (Electrode React Native) is a platform for integrating React Native into existing native applications. It provides tools for building, managing, and deploying React Native "MiniApps" within native mobile apps.

The platform includes a Cauldron for version management, Container generation for bundling MiniApps with native dependencies, and APIs for communication between React Native and native code.

ERN enables incremental React Native adoption in existing mobile applications.

# CAVEATS

Requires native development setup (Android SDK and/or Xcode). Complex architecture learning curve. Integrates with existing apps differently than standalone React Native.

# HISTORY

Electrode React Native was developed by **Walmart Labs** to enable their gradual adoption of React Native in their existing mobile applications, addressing enterprise integration challenges.

# SEE ALSO

[react-native](/man/react-native)(1), [npm](/man/npm)(1), [yarn](/man/yarn)(1), [node](/man/node)(1)
