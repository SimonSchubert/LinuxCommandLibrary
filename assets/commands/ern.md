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

```ern add [package]```

**Create a Container** locally

```ern create-container --miniapps [miniapp] -p [android]```

**Start the packager** serving a composite of MiniApps

```ern start```

**Push an OTA update** via CodePush

```ern code-push release --miniapps [miniapps] -d [descriptor]```

# SYNOPSIS

**ern** _command_ [_options_]

# PARAMETERS

**create-miniapp** _NAME_
> Create a new MiniApp in a new directory named after it.

**run-android**
> Run MiniApp on Android emulator or device.

**run-ios**
> Run MiniApp on iOS simulator or device.

**create-api** _NAME_
> Create a new API with generated client code.

**start**
> Create a composite bundle of MiniApps and start the React Native packager to serve it.

**add** _PACKAGES_
> Add JavaScript or native dependencies to a MiniApp.

**cauldron** _COMMAND_
> Manage the Cauldron (version registry for native app containers).

**code-push** _release_|_patch_|_promote_
> Release, patch or promote OTA updates via CodePush.

**link**, **unlink**
> Link or unlink a MiniApp directory for local development and debugging.

**create-container**
> Create a Container locally.

**publish-container**
> Publish a Container to a repository.

**create-api-impl**
> Create an implementation of an API.

**regen-api**
> Regenerate an API from its schema.

**compat-check**
> Check MiniApp compatibility with a native application version.

**upgrade-miniapp**
> Upgrade a MiniApp to a newer platform version.

**platform** _COMMAND_
> Manage installed Electrode Native platform versions and configuration.

**--help**
> Display help information.

# DESCRIPTION

**ern** (Electrode React Native) is a platform for integrating React Native into existing native applications. It provides tools for building, managing, and deploying React Native "MiniApps" within native mobile apps.

The platform includes a Cauldron for version management, Container generation for bundling MiniApps with native dependencies, and APIs for communication between React Native and native code.

ERN enables incremental React Native adoption in existing mobile applications.

# CAVEATS

Requires native development setup (Android SDK and/or Xcode). Complex architecture learning curve. The latest npm release (1.1.1) dates from June 2020. Integrates with existing apps differently than standalone React Native.

# HISTORY

Electrode React Native was developed by **Walmart Labs** to enable their gradual adoption of React Native in their existing mobile applications, addressing enterprise integration challenges.

# SEE ALSO

[react-native](/man/react-native)(1), [npm](/man/npm)(1), [yarn](/man/yarn)(1), [node](/man/node)(1)

# RESOURCES

```[Source code](https://github.com/electrode-io/electrode-native)```

```[Homepage](https://native.electrode.io/)```

<!-- verified: 2026-11-09 -->
