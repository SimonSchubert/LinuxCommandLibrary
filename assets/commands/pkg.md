# TAGLINE

FreeBSD binary package manager

# TLDR

**Install a package**

```pkg install [package]```

**Search for packages**

```pkg search [query]```

**Update the package repository catalog**

```pkg update```

**Upgrade all installed packages**

```pkg upgrade```

**Remove a package**

```pkg delete [package]```

**List all installed packages**

```pkg info```

**Show details for a specific installed package**

```pkg info [package]```

**Audit installed packages for security vulnerabilities**

```pkg audit -F```

**Lock a package to prevent upgrades**

```pkg lock [package]```

# SYNOPSIS

**pkg** [_command_] [_options_] [_package_...]

# PARAMETERS

**install** _PACKAGE_
> Install a package and its dependencies.

**search** _QUERY_
> Search for packages in remote repositories.

**update**
> Update the remote repository catalog.

**upgrade**
> Upgrade installed packages to latest available versions.

**delete** _PACKAGE_
> Remove a package.

**info** [_PACKAGE_]
> Show information about installed packages, or details for a specific package.

**audit** [**-F**]
> Audit installed packages for known security vulnerabilities. -F fetches the latest database.

**lock** _PACKAGE_
> Lock a package to prevent modification or deletion.

**unlock** _PACKAGE_
> Unlock a previously locked package.

**autoremove**
> Remove unneeded packages that were installed as dependencies.

**query** _FORMAT_ [_PACKAGE_]
> Query information about installed packages using a format string.

**clean**
> Clean the local cache of fetched packages.

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

