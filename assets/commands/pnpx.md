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

**pnpx** executes packages without permanent installation. Part of pnpm.

The tool runs one-off commands. Downloads and executes packages.

pnpx executes packages.

# CAVEATS

Alias for pnpm dlx. Requires pnpm installed.

# HISTORY

pnpx was created as **pnpm's equivalent** to npx for package execution.

# SEE ALSO

[pnpm](/man/pnpm)(1), [npx](/man/npx)(1), [yarn-dlx](/man/yarn-dlx)(1)

