# TAGLINE

Execute packages without installing them

# TLDR

**Run package without installing**

```pnpx [package] [args]```

**Run specific version**

```pnpx [package]@[version] [args]```

**Run with package name different from command**

```pnpx --package [package] [command]```

**Install multiple packages** and run a command

```pnpx --package [pkg1] --package [pkg2] [command]```

# SYNOPSIS

**pnpx** [_options_] _package_ [_args_]

# PARAMETERS

_PACKAGE_
> Package to execute.

**--package** _PKG_
> Package to install (if different from command). Can be specified multiple times.

# DESCRIPTION

**pnpx** executes npm packages without permanently installing them, similar to npx. It downloads the package to a temporary location, runs the specified command, and cleans up afterward. This is a deprecated alias for **pnpm dlx**; prefer using **pnpm dlx** directly.

Use **--package** to specify a package name when the executable name differs from the package name. The **@version** suffix allows running a specific package version. Packages executed by pnpx are allowed to run postinstall scripts by default.

# CAVEATS

**pnpx** is deprecated in favor of **pnpm dlx**. Requires pnpm installed. The command runs inside a shell (/bin/sh on Unix, cmd.exe on Windows).

# SEE ALSO

[pnpm](/man/pnpm)(1), [npx](/man/npx)(1), [yarn-dlx](/man/yarn-dlx)(1)
