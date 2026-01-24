# TLDR

**Install all dependencies** from package.json

```yarn install```

**Add a package** to dependencies

```yarn add [package]```

**Add a package** as a dev dependency

```yarn add --dev [package]```

**Remove a package**

```yarn remove [package]```

**Upgrade packages** to latest versions

```yarn upgrade```

**Run a script** defined in package.json

```yarn run [script]```

**Initialize a new project**

```yarn init```

**Interactively upgrade** packages

```yarn upgrade-interactive```

# SYNOPSIS

**yarn** [_command_] [_flags_]

# PARAMETERS

**install**
> Install all dependencies from package.json.

**add** _package_
> Add a package to project dependencies.

**remove** _package_
> Remove a package from the project.

**upgrade** [_package_]
> Upgrade packages to their latest version based on version range.

**run** _script_
> Execute a script defined in package.json.

**init**
> Initialize a new project, creating package.json.

**publish**
> Publish a package to a registry.

**create** _starter-kit_
> Create a new project from a starter kit.

**config**
> Manage Yarn configuration settings.

**cache clean**
> Clean the global cache.

**--dev**, **-D**
> Add package as a dev dependency.

**--global**, **-g**
> Install package globally.

**--verbose**
> Print verbose output for the command.

**--cwd** _directory_
> Specify a working directory.

**--mutex** _type_
> Ensure only one Yarn instance runs (file or network).

**--help**
> Display help for a command.

**--version**
> Display version information.

# DESCRIPTION

**Yarn** is a fast, reliable, and secure dependency manager for JavaScript. It caches every package it downloads, enabling offline installation of previously fetched packages. Yarn parallelizes operations for faster performance compared to npm.

Running **yarn** with no command executes **yarn install**. Running **yarn script** executes a user-defined script from package.json. The lockfile **yarn.lock** ensures consistent installations across machines.

Yarn 2+ (Berry) introduces Plug'n'Play for zero-install workflows and improved workspace support. Configuration can be set globally or per-project via **.yarnrc.yml**.

# CAVEATS

Two major versions exist: Yarn Classic (1.x) and Yarn Modern (2+/Berry) with different features and configurations. Yarn Modern uses Plug'n'Play by default, which may require project configuration adjustments. The global install location differs from npm.

# HISTORY

Yarn was developed by **Facebook** (now Meta) in collaboration with Exponent, Google, and Tilde, and released in **October 2016** as an alternative to npm. It addressed npm's performance and security issues at the time. Yarn 2 (Berry), a complete rewrite, was released in **January 2020** with features like Plug'n'Play and improved workspaces. Yarn is now a community-driven project.

# SEE ALSO

[npm](/man/npm)(1), [pnpm](/man/pnpm)(1), [node](/man/node)(1), [npx](/man/npx)(1)
