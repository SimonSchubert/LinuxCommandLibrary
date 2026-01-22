# TLDR

**Update** package and slackbuild lists

```spi -u```

**Install** a package or slackbuild

```spi -i [package_name]```

**Upgrade** all installed packages

```spi -U```

**Search** for packages or slackbuilds

```spi [search_terms]```

Show **information** about a package

```spi --show [package_name]```

**Clean** local caches

```spi --clean```

# SYNOPSIS

**spi** [_OPTIONS_] [_package_name_|_search_terms_]

# PARAMETERS

**-u, --update**
> Update list of available packages and slackbuilds

**-i, --install** _name_
> Install a package or slackbuild

**-U, --upgrade**
> Upgrade all installed packages to latest versions

**--show** _name_
> Display information about a package or slackbuild

**--clean**
> Purge local package and slackbuild caches

**-h, --help**
> Display help information

# DESCRIPTION

**spi** (Salix Package Installer) is a meta package manager for Salix Linux that wraps **slapt-get** and **slapt-src**. It provides unified access to both binary packages and SlackBuilds through a single interface.

When installing, spi first checks for binary packages via slapt-get. If unavailable, it falls back to building from source via slapt-src. Dependencies are resolved automatically, using binary packages when possible even for SlackBuild installations.

# CAVEATS

Requires slapt-get and slapt-src to be properly configured. SlackBuild installations compile from source, which takes longer than binary installs. Specific to Salix and Slackware-based distributions. Cache updates are needed before searching or installing new packages.

# HISTORY

**spi** was created by **George Vlahavas** (gapan) for the **Salix** Linux distribution, a Slackware derivative focused on simplicity and ease of use. Salix was founded in **2009**, and spi provides a user-friendly interface to its package management system, bridging binary packages and source builds.

# SEE ALSO

[slapt-get](/man/slapt-get)(8), [slapt-src](/man/slapt-src)(8), [slackpkg](/man/slackpkg)(8)
