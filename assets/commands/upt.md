# TAGLINE

Universal cross-platform package manager wrapper

# TLDR

**Install package**

```upt install [package]```

**Remove package**

```upt remove [package]```

**Update packages**

```upt upgrade```

**Search package**

```upt search [query]```

**List installed**

```upt list```

**Show info**

```upt info [package]```

# SYNOPSIS

**upt** _command_ [_options_] [_package_]

# PARAMETERS

**install**
> Install package.

**remove**
> Remove package.

**upgrade**
> Update all.

**search**
> Find packages.

**list**
> Show installed.

**info**
> Package details.

# DESCRIPTION

**upt** (Universal Package Tool) provides a single, consistent command-line interface that wraps the native package manager on any system. It automatically detects which package manager is available and translates upt commands into the appropriate native commands for apt, pacman, brew, and others.

This allows users and scripts to use the same commands across different Linux distributions and macOS without needing to remember the syntax differences between package managers. Commands like **install**, **remove**, **search**, and **upgrade** work identically regardless of the underlying system.

The tool delegates all actual package operations to the native package manager, so it does not introduce any compatibility layers or alternative package formats. Root privileges may be required depending on the underlying package manager's requirements.

# CAVEATS

Wrapper tool. Underlying PM varies. May need sudo.

# HISTORY

**upt** (Universal Package Tool) provides a unified interface to various system package managers.

# SEE ALSO

[apt](/man/apt)(1), [pacman](/man/pacman)(1), [brew](/man/brew)(1)
