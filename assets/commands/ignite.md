# TAGLINE

CLI for React Native project scaffolding and code generation

# TLDR

**Create a new React Native app**

```npx ignite-cli new [MyApp]```

**Create a new app** with Expo workflow

```npx ignite-cli new [MyApp] --workflow=expo```

**Generate a component**

```npx ignite-cli generate component [Header]```

**Generate a screen**

```npx ignite-cli generate screen [Login]```

**Generate a model**

```npx ignite-cli generate model [User]```

**Check environment** for issues

```npx ignite-cli doctor```

**Remove the demo code** from a generated project

```npx ignite-cli remove-demo```

# SYNOPSIS

**ignite** _command_ [_options_]

# PARAMETERS

**new** _name_
> Scaffold a new React Native app with the Ignite boilerplate.

**generate** _type_ _name_
> Generate a component, screen, model, or navigator from templates.

**doctor**
> Check the local development environment for common issues.

**remove-demo**
> Remove the demo/example code from a project generated with Ignite.

**--workflow** _type_
> Workflow to use when creating a new app: **expo** (default) or **cng** (Continuous Native Generation).

**--yes**, **-y**
> Accept all default options when creating a new app (non-interactive).

**--help**
> Display help information.

**--version**
> Display the CLI version.

# DESCRIPTION

**Ignite** is a CLI for React Native development created by **Infinite Red**. It provides an opinionated project scaffolding with industry best practices, including MobX-State-Tree for state management, TypeScript, React Navigation, and a testing setup with Jest.

The **generate** command creates boilerplate files from templates for common patterns: components, screens, models, and navigators. Generated code follows the project's established conventions and directory structure.

# CAVEATS

React Native and Node.js are required. The generated boilerplate is opinionated and follows Infinite Red's recommended architecture. Ignite v9+ defaults to Expo-based workflows.

# HISTORY

Ignite was created by **Infinite Red** as a React Native boilerplate and CLI tool. It has evolved through multiple major versions, shifting from multiple boilerplate options to a single, maintained boilerplate (Ignite Bowser, then Ignite v9+) that focuses on Expo.

# SEE ALSO

[npx](/man/npx)(1), [react-native](/man/react-native)(1), [expo](/man/expo)(1), [npm](/man/npm)(1)
