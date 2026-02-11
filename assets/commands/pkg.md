# TAGLINE

FreeBSD binary package manager

# TLDR

**Install package**

```pkg install [package]```

**Search packages**

```pkg search [query]```

**Update package database**

```pkg update```

**Upgrade packages**

```pkg upgrade```

**Remove package**

```pkg delete [package]```

**List installed**

```pkg info```

# SYNOPSIS

**pkg** [_command_] [_options_] [_package_...]

# PARAMETERS

**install** _PACKAGE_
> Install package.

**search** _QUERY_
> Search packages.

**update**
> Update database.

**upgrade**
> Upgrade packages.

**delete** _PACKAGE_
> Remove package.

**info**
> Show information.

**--help**
> Display help.

# DESCRIPTION

**pkg** is the official binary package manager for FreeBSD. It handles installation, removal, upgrading, and searching of pre-built packages from FreeBSD repositories, replacing the older pkg_add tools.

The tool resolves dependencies automatically, manages a local package database, and supports multiple repositories. It can also lock packages to prevent upgrades, audit installed packages for security vulnerabilities, and create packages from installed ports.

# CONFIGURATION

**/usr/local/etc/pkg.conf**
> Main configuration file for pkg behavior and default settings.

**/usr/local/etc/pkg/repos/**
> Repository configuration directory with per-repo .conf files.

# CAVEATS

FreeBSD specific. Root required for install. Repository based.

# HISTORY

pkg replaced pkg_add as the **FreeBSD package manager**.

# SEE ALSO

[pkg-add](/man/pkg-add)(8), [ports](/man/ports)(7)

