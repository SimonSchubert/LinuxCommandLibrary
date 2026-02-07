# TAGLINE

React Native integration platform for native apps

# TLDR

**Create new React** Native project

```ern create-miniapp [app-name]```

**Run miniapp**

```ern run-android```

**Generate API** code

```ern generate api [api-name]```

**List containers**

```ern cauldron list containers```

**Add dependency**

```ern add [dependency]```

# SYNOPSIS

**ern** _command_ [_options_]

# PARAMETERS

_COMMAND_
> ERN operation to perform.

**create-miniapp** _NAME_
> Create new miniapp.

**run-android**
> Run on Android.

**run-ios**
> Run on iOS.

**generate api** _NAME_
> Generate API module.

**cauldron** _COMMAND_
> Manage cauldron (version registry).

**--help**
> Display help information.

# DESCRIPTION

**ern** (Electrode React Native) is a platform for integrating React Native into existing native applications. It provides tools for building, managing, and deploying React Native "miniapps" within native mobile apps.

The platform includes a Cauldron for version management, Container generation for bundling miniapps with native dependencies, and APIs for communication between React Native and native code.

ERN enables incremental React Native adoption in existing mobile applications.

# CAVEATS

Requires native development setup. Complex architecture learning curve. Integrates with existing apps differently than standalone RN.

# HISTORY

Electrode React Native was developed by **Walmart Labs** to enable their gradual adoption of React Native in their existing mobile applications, addressing enterprise integration challenges.

# SEE ALSO

[react-native](/man/react-native)(1), [npm](/man/npm)(1)
