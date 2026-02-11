# TAGLINE

APT-like package manager for Slackware

# TLDR

**Update** the list of available packages

```slapt-get --update```

**Install** a package

```slapt-get --install [package]```

**Remove** a package

```slapt-get --remove [package]```

**Upgrade** all installed packages

```slapt-get --upgrade```

**Search** for packages

```slapt-get --search [query]```

**Show** information about a package

```slapt-get --show [package]```

# SYNOPSIS

**slapt-get** [_options_] [_package_...]

# PARAMETERS

**--update**
> Update package list from sources

**--install _package_**
> Install or upgrade a package

**--remove _package_**
> Remove an installed package

**--upgrade**
> Upgrade all installed packages

**--search _query_**
> Search for packages by name, disk set, or version

**--show _package_**
> Display package information

**--clean**
> Clean package cache

**--autoclean**
> Remove only obsolete packages from cache

# DESCRIPTION

**slapt-get** is an APT-like package management system for Slackware Linux. It provides dependency resolution and mirrors the familiar apt-get workflow for managing packages.

Package sources are configured in the slapt-getrc configuration file.

# CONFIGURATION

**/etc/slapt-get/slapt-getrc**
> Main configuration file defining package source URLs, cache directory, and excluded packages.

# CAVEATS

Requires configured package sources in slapt-getrc. Designed specifically for Slackware Linux distributions.

# SEE ALSO

[installpkg](/man/installpkg)(8), [removepkg](/man/removepkg)(8), [pkgtool](/man/pkgtool)(8)
