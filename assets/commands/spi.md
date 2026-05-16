# TAGLINE

Salix Package Installer: meta package manager wrapping slapt-get and slapt-src

# TLDR

**Search** both binary and SlackBuild repositories (default action)

```spi [search_terms]```

**Update** package and SlackBuild local caches

```sudo spi -u```

**Install** a package or SlackBuild

```sudo spi -i [package_name]```

**Simulate** an install, showing what would be done

```spi -s -i [package_name]```

**Upgrade** all installed packages

```sudo spi -U```

**Show information** about a package or SlackBuild

```spi --show [package_name]```

**Clean** local package and SlackBuild caches

```sudo spi --clean```

# SYNOPSIS

**spi** [_OPTIONS_] [_STRING(S)_]

# DESCRIPTION

**spi** (Salix Package Installer) is a command-line meta package manager for **Salix Linux** that wraps **slapt-get** and **slapt-src**. It provides unified access to both binary packages and SlackBuilds through a single interface.

When searching, **spi** queries both the **slapt-get** binary package cache and the **slapt-src** SlackBuild cache. When installing, it prefers binary packages: if none is available it falls back to building from source via **slapt-src**, and when a SlackBuild has dependencies that exist as binary packages it pulls those through **slapt-get** rather than rebuilding them.

Only basic functionality is exposed; for advanced features the underlying **slapt-get** and **slapt-src** tools should be used directly.

# PARAMETERS

**--search** _STRING(S)_
> Search both the package and SlackBuild databases. Default action when **spi** is called with one or more strings and no other options. Regular expressions are supported.

**--show** _PACKAGE(S)_
> Show details for the named packages or SlackBuilds (runs **slapt-get --show** and **slapt-src --show**).

**--clean**
> Purge cached packages and SlackBuild build directories. Requires root.

**-u**, **--update**
> Update the package and SlackBuild local caches. Requires root.

**-U**, **--upgrade**
> Upgrade all installed packages using **slapt-get --upgrade**. Requires root.

**-i**, **--install** _PACKAGE(S)_
> Install the named packages or SlackBuilds. Binary packages are preferred; otherwise the SlackBuild is built and installed. Requires root.

**-s**, **--simulate**
> Used with **--install**: simulate the operation, listing packages and SlackBuilds (including dependencies) that would be installed.

**-n**, **--no-colour**
> Disable coloured output when searching.

**-h**
> Print a brief usage message and exit.

# CAVEATS

Requires **slapt-get** and **slapt-src** to be installed and configured. SlackBuild installations compile from source and can be considerably slower than binary installs. The tool is specific to **Salix** and other Slackware-derived distributions that ship the slapt toolchain. Caches must be updated (**spi -u**) before searching for or installing newly published packages.

# HISTORY

**spi** was created by **George Vlahavas** (gapan) for the **Salix** Linux distribution, a Slackware derivative focused on simplicity and ease of use. Salix was founded in **2009**, and **spi** has since provided a user-friendly bridge between Slackware's binary package and SlackBuild source-build worlds.

# SEE ALSO

[slapt-get](/man/slapt-get)(8), [slapt-src](/man/slapt-src)(8), [slackpkg](/man/slackpkg)(8)
