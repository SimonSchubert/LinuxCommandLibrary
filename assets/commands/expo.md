# TAGLINE

React Native development platform and build toolchain

# TLDR

**Create new project**

```expo init [project-name]```

**Start development** server

```expo start```

**Start on specific** platform

```expo start --ios```

**Build for production**

```expo build:android```

**Publish to Expo**

```expo publish```

**Log in to** Expo account

```expo login```

**Install package**

```expo install [expo-camera]```

# SYNOPSIS

**expo** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Expo CLI command.

**init** _NAME_
> Create new project.

**start**
> Start development server.

**build:android**/**build:ios**
> Build for platform.

**publish**
> Publish to Expo.

**install** _PACKAGE_
> Install compatible package.

**login**
> Authenticate with Expo.

**--help**
> Display help information.

# CONFIGURATION

**app.json**
> Expo project configuration including app name, version, SDK version, and platform-specific settings.

**eas.json**
> EAS Build and Submit configuration for managed builds and deployments.

# DESCRIPTION

**Expo** is a platform for building React Native applications. The CLI provides tools for development, building, and deployment of cross-platform mobile apps.

Expo simplifies React Native development with managed workflow, pre-configured native modules, and OTA (over-the-air) updates. The Expo Go app enables testing without native builds.

The platform handles iOS and Android builds in the cloud without local toolchains.

# CAVEATS

Some native modules unavailable in managed workflow. Build service may have queues. Ejecting loses some Expo features. App size includes Expo runtime.

# HISTORY

Expo was created to simplify React Native development, providing a managed workflow and build service. It's maintained by **Expo** (formerly Exponent) and widely used for React Native projects.

# SEE ALSO

[react-native](/man/react-native)(1), [npm](/man/npm)(1), [eas](/man/eas)(1)
