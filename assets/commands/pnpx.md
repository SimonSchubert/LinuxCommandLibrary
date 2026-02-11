# TAGLINE

Execute packages without installing them

# TLDR

**Run package without installing**

```pnpx [package] [args]```

**Run specific version**

```pnpx [package]@[version] [args]```

**Run with package name different from command**

```pnpx -p [package] [command]```

# SYNOPSIS

**pnpx** [_options_] _package_ [_args_]

# PARAMETERS

_PACKAGE_
> Package to execute.

**-p** _PKG_
> Package to install (if different from command).

**-c** _CMD_
> Command to run.

**--yes**
> Skip confirmation.

**--no**
> Refuse to install.

# DESCRIPTION

**pnpx** executes npm packages without permanently installing them, similar to npx. It downloads the package to a temporary location, runs the specified command, and cleans up afterward.

This is an alias for **pnpm dlx**. Use **-p** to specify a package name when the executable name differs from the package name. The **@version** suffix allows running a specific package version.

# CAVEATS

Alias for pnpm dlx. Requires pnpm installed.

# HISTORY

pnpx was created as **pnpm's equivalent** to npx for package execution.

# SEE ALSO

[pnpm](/man/pnpm)(1), [npx](/man/npx)(1), [yarn-dlx](/man/yarn-dlx)(1)

