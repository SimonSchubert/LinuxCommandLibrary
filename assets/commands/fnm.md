# TAGLINE

fast Node.js version manager written in Rust

# TLDR

**Install Node version**

```fnm install [18]```

**Use specific version**

```fnm use [18]```

**Set default version**

```fnm default [18]```

**List installed versions**

```fnm list```

**List remote versions**

```fnm list-remote```

# SYNOPSIS

**fnm** _command_ [_options_] [_arguments_]

# PARAMETERS

_COMMAND_
> Operation: install, use, list, uninstall, default, etc.

**install** _VERSION_
> Install Node.js version.

**use** _VERSION_
> Switch to version.

**default** _VERSION_
> Set default version.

**list**
> List installed versions.

**list-remote**
> List available versions.

**uninstall** _VERSION_
> Remove version.

**current**
> Show active version.

**--help**
> Display help information.

# DESCRIPTION

**fnm** (Fast Node Manager) is a Node.js version manager written in Rust. It provides quick installation and switching between Node.js versions with minimal overhead.

The tool reads .node-version or .nvmrc files for automatic version switching. Shell integration enables per-directory version selection without manual commands.

fnm emphasizes speed with Rust implementation and cross-platform support including Windows.

# CONFIGURATION

**.node-version**
> Specifies Node.js version for the current directory.

**.nvmrc**
> Alternative version file format compatible with nvm.

# CAVEATS

Requires shell configuration for auto-switching. Not all nvm features supported. Separate from npm/pnpm.

# HISTORY

fnm was created as a fast alternative to **nvm**, the original Node Version Manager. Written in Rust, it dramatically improves installation and switching speed over shell-based alternatives.

# SEE ALSO

[nvm](/man/nvm)(1), [node](/man/node)(1), [volta](/man/volta)(1)
