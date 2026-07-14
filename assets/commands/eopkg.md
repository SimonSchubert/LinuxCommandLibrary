# TAGLINE

Package manager for Solus Linux

# TLDR

**Install** a specific package

```sudo eopkg install [package]```

**Update** all packages

```sudo eopkg upgrade```

**Search** for packages

```sudo eopkg search [search_term]```

# SYNOPSIS

**eopkg** _command_ [_options_] [_packages_]

# DESCRIPTION

**eopkg** is the package manager for Solus Linux, an independent distribution. It handles all aspects of package management including installation, updates, removal, and repository management using the .eopkg package format.

The tool evolved from the PiSi package manager originally developed for Pardus Linux, with significant improvements and optimizations for Solus. eopkg provides dependency resolution, package rollback capabilities, and maintains a local database of installed packages. It integrates with Solus's rolling release model to provide continuous updates while maintaining system stability.

# PARAMETERS

**install** _packages_
> Install packages (short alias: **it**)

**upgrade**
> Update all packages (short alias: **up**)

**search** _term_
> Search for packages (short alias: **sr**)

**remove** _packages_
> Remove packages (short alias: **rm**)

**info** _package_
> Show package information

**list-installed**
> List installed packages (short alias: **li**)

**list-available**
> List packages available in the repositories (short alias: **la**)

**update-repo**
> Refresh the local copy of the repository index (short alias: **ur**)

**history**
> Show the transaction history

**history -t** _number_
> Roll the system back to a previous transaction

**check** _package_
> Verify the integrity of installed files

# CAVEATS

Solus Linux specific. Not compatible with other distributions. Requires root privileges for most operations. Refresh the index with `eopkg update-repo` before installing or upgrading if it may be stale.

# SEE ALSO

[apt](/man/apt)(8), [dnf](/man/dnf)(8), [pacman](/man/pacman)(8)

# RESOURCES

```[Source code](https://github.com/getsolus/eopkg)```

```[Homepage](https://getsol.us/)```

```[Documentation](https://help.getsol.us/docs/user/package-management/basics)```

<!-- verified: 2026-07-14 -->
