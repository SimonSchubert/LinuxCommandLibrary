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

**eopkg** is the package manager for Solus Linux. It handles package installation, updates, removal, and repository management using .eopkg format packages.

Evolved from the PiSi package manager with improvements for Solus.

# PARAMETERS

**install** _packages_
> Install packages

**upgrade**
> Update all packages

**search** _term_
> Search for packages

**remove** _packages_
> Remove packages

**info** _package_
> Show package information

**list-installed**
> List installed packages

# CAVEATS

Solus Linux specific. Not compatible with other distributions. Requires root privileges for most operations.

# SEE ALSO

[apt](/man/apt)(8), [dnf](/man/dnf)(8), [pacman](/man/pacman)(8)
