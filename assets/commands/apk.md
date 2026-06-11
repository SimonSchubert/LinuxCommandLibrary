# TAGLINE

Alpine Linux package manager

# TLDR

**Update** repository indexes and upgrade all packages

```apk upgrade -U```

Only update **repository indexes**

```apk update```

**Install** a new package

```apk add [package]```

**Install** without caching the index (common in Dockerfiles)

```apk add --no-cache [package]```

**Remove** a package

```apk del [package]```

**Repair/Reinstall** a package without modifying main dependencies

```apk fix [package]```

**Search** for packages by name with descriptions

```apk search -v [keyword]```

Search for packages by **description**

```apk search -d [keyword]```

Display **information** about a specific package

```apk info [package]```

# SYNOPSIS

**apk** [_options_] _command_ [_arguments_]

# DESCRIPTION

**apk** (Alpine Package Keeper) is the package management tool for Alpine Linux. It handles installation, upgrade, and removal of packages, as well as repository management and system maintenance.

# PARAMETERS

**add**
> Add or modify constraints and commit changes

**del**
> Remove constraints and commit changes

**fix**
> Fix, reinstall, or upgrade packages without modifying world

**update**
> Update repository indexes

**upgrade**
> Install upgrades available from repositories

**cache**
> Manage the local package cache

**search**
> Search for packages by name or description

**info**
> Display detailed information about packages

**list**
> List packages matching a pattern or criteria

**query**
> Interrogate installed database and indexes

**policy**
> Show repository policy for packages

**version**
> Compare package versions or check for available upgrades

**fetch**
> Download packages from repositories to the current directory

**stats**
> Show statistics about the package database

**-U, --update-cache**
> Update package lists before the operation (alias for --cache-max-age 0)

**-v, --verbose**
> Print more verbose information (repeat for more detail)

**-q, --quiet**
> Print less information

**-d, --description**
> Search in package descriptions

**--no-cache**
> Do not use or update any local cache; fetch the index directly

**--allow-untrusted**
> Install packages with untrusted or missing signatures

**-X, --repository** _url_
> Specify a supplemental repository

**-p, --root** _dir_
> Manage a filesystem rooted at the given directory

# CONFIGURATION

**/etc/apk/repositories**
> List of package repository URLs, one per line.

**/etc/apk/world**
> List of explicitly installed packages and version constraints.

**/etc/apk/keys/**
> Directory containing trusted repository signing keys.

# CAVEATS

Alpine Linux specific; not available on other distributions. Uses a minimal package format designed for size and simplicity.

# HISTORY

Developed for **Alpine Linux**, a security-oriented, lightweight Linux distribution. Alpine is widely used in container environments due to its small footprint.

# SEE ALSO

[apt](/man/apt)(8), [dnf](/man/dnf)(8), [pacman](/man/pacman)(8)

# RESOURCES

```[Source code](https://github.com/alpinelinux/apk-tools)```

```[Documentation](https://wiki.alpinelinux.org/wiki/Alpine_Package_Keeper)```

<!-- verified: 2026-06-11 -->
