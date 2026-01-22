# TLDR

**Synchronize** list of packages and versions

```sudo aptitude update```

**Install** a new package

```sudo aptitude install [package]```

**Search** for a package

```aptitude search [package]```

Search for an **installed** package

```aptitude search '?installed([package])'```

**Remove** a package and all packages depending on it

```sudo aptitude remove [package]```

**Upgrade** installed packages

```sudo aptitude upgrade```

**Full upgrade** including removing obsolete packages

```sudo aptitude full-upgrade```

**Hold** a package to prevent automatic upgrades

```sudo aptitude hold '?installed([package])'```

# SYNOPSIS

**aptitude** [_options_] _command_ [_arguments_]

# DESCRIPTION

**aptitude** is a powerful package management utility for Debian and Ubuntu systems. It provides both a command-line interface and an interactive ncurses-based interface with advanced dependency resolution and search capabilities.

# PARAMETERS

**update**
> Synchronize package index files from sources

**install package**
> Install or upgrade specified packages

**remove package**
> Remove packages and dependent packages

**purge package**
> Remove packages, configurations, and dependent packages

**upgrade**
> Upgrade installed packages to newest versions

**full-upgrade**
> Upgrade packages, removing obsolete ones as needed

**search pattern**
> Search for packages matching pattern

**show package**
> Display detailed package information

**hold package**
> Prevent package from being upgraded

**unhold package**
> Allow package to be upgraded

**safe-upgrade**
> Upgrade packages conservatively

**clean**
> Remove downloaded package files

**autoclean**
> Remove old downloaded package files

# CAVEATS

Aptitude uses its own search syntax with special terms like **?installed**, **?automatic**, etc. Different from apt-cache search syntax.

# HISTORY

Created as an alternative to apt-get with more advanced features. First released for Debian in **2001** by Daniel Burrows.

# SEE ALSO

[apt](/man/apt)(8), [apt-get](/man/apt-get)(8), [dpkg](/man/dpkg)(1)
