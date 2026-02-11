# TAGLINE

Build native mobile apps using React

# TLDR

**Create new project**

```npx react-native init [ProjectName]```

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

**Link native dependencies**

```npx react-native link```

**Show doctor diagnostics**

```npx react-native doctor```

# SYNOPSIS

**npx react-native** _command_ [_options_]

# PARAMETERS

**init** _NAME_
> Create new project.

**start**
> Start Metro bundler.

**run-android**
> Build and run on Android.

**run-ios**
> Build and run on iOS.

**doctor**
> Check development environment.

**link**
> Link native dependencies.

**upgrade**
> Upgrade React Native.

**--device** _NAME_
> Target device.

**--reset-cache**
> Clear bundler cache.

# DESCRIPTION

**react-native** is the command-line interface for React Native, a framework that enables building native iOS and Android mobile applications using JavaScript and React. It manages the full development lifecycle from project creation through building, running, and debugging apps on simulators, emulators, and physical devices.

The CLI starts the Metro bundler, which serves JavaScript bundles to running apps and enables hot reloading for rapid development iteration. Platform-specific commands (**run-android**, **run-ios**) compile native code and deploy to target devices. The **doctor** command verifies that the development environment is correctly configured, checking for Xcode, Android SDK, Node.js, and required dependencies.

# CAVEATS

iOS development requires macOS. Android needs SDK and emulator. Native builds can be slow.

# HISTORY

**React Native** was created by **Facebook** and released in **2015**. It enables building mobile apps using React and JavaScript, compiling to native code.

# SEE ALSO

[expo](/man/expo)(1), [npm](/man/npm)(1), [metro](/man/metro)(1)
