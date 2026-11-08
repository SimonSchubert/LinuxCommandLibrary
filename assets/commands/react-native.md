# TAGLINE

Build native mobile apps using React

# TLDR

**Create new project**

```npx @react-native-community/cli@latest init [ProjectName]```

**Start Metro bundler**

```npx react-native start```

**Run on Android**

```npx react-native run-android```

**Run on iOS**

```npx react-native run-ios```

**Run on specific device**

```npx react-native run-ios --device "[iPhone 15]"```

**Clean build cache**

```npx react-native start --reset-cache```

**Run on a named simulator**

```npx react-native run-ios --simulator "[iPhone 15]"```

**Show environment information**

```npx react-native info```

**Show doctor diagnostics**

```npx react-native doctor```

# SYNOPSIS

**npx react-native** _command_ [_options_]

# PARAMETERS

**init** _NAME_
> Create new project, run through **@react-native-community/cli**.

**start**
> Start Metro bundler.

**run-android**
> Build and run on Android.

**run-ios**
> Build and run on iOS.

**doctor**
> Check development environment.

**info**
> Show environment and project information.

**build-android**, **build-ios**
> Build the native app without running it.

**log-android**, **log-ios**
> Show device logs.

**--simulator** _NAME_
> Target iOS simulator.

**--list-devices**
> Pick from available devices.

**--no-packager**
> Do not launch Metro.

**--device** _NAME_
> Target device.

**--reset-cache**
> Clear bundler cache.

# DESCRIPTION

**react-native** is the command-line interface for React Native, a framework that enables building native iOS and Android mobile applications using JavaScript and React. It manages the full development lifecycle from project creation through building, running, and debugging apps on simulators, emulators, and physical devices.

The CLI starts the Metro bundler, which serves JavaScript bundles to running apps and enables Fast Refresh for rapid development iteration. Platform-specific commands (**run-android**, **run-ios**) compile native code and deploy to target devices. The **doctor** command verifies that the development environment is correctly configured, checking for Xcode, Android SDK, Node.js, and required dependencies.

# CAVEATS

iOS development requires macOS. Android needs SDK and emulator. Native builds can be slow. The old **react-native init** was replaced by **@react-native-community/cli init**, and **link** is unnecessary because native modules are autolinked.

# HISTORY

**React Native** was created by **Facebook** and released in **2015**. It enables building mobile apps using React and JavaScript, rendering through native platform views.

# SEE ALSO

[expo](/man/expo)(1), [npm](/man/npm)(1), [metro](/man/metro)(1)

# RESOURCES

```[Source code](https://github.com/react-native-community/cli)```

```[Homepage](https://reactnative.dev)```

```[Documentation](https://reactnative.dev/docs/environment-setup)```

<!-- verified: 2026-11-08 -->
