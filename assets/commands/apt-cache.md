# TLDR

**Search** for a package in your current sources

```apt-cache search [query]```

Show **information** about a package

```apt-cache show [package]```

Show whether a package is **installed and up to date**

```apt-cache policy [package]```

Show **dependencies** for a package

```apt-cache depends [package]```

Show packages that **depend on** a particular package

```apt-cache rdepends [package]```

# SYNOPSIS

**apt-cache** [_options_] _command_ [_arguments_]

# DESCRIPTION

**apt-cache** is a query tool for the APT package cache. It performs a variety of operations on APT's package cache and can search for packages, show package information, and display dependency relationships.

# PARAMETERS

**search query**
> Search for packages matching the query in names and descriptions

**show package**
> Show detailed information about a package

**showpkg package**
> Show general information about a package

**policy [package]**
> Show policy settings and installation status

**depends package**
> Show dependencies for a package

**rdepends package**
> Show reverse dependencies (packages that depend on this one)

**pkgnames [prefix]**
> List all package names in the cache

**stats**
> Show cache statistics

**dump**
> Show a short listing of every package in the cache

**--full**
> Print full records when searching

**-n, --names-only**
> Only search package names, not descriptions

# CAVEATS

This tool operates on the local cache; run **apt update** first to ensure the cache is current.

# HISTORY

Part of the **APT** (Advanced Package Tool) suite developed for Debian-based systems in the late 1990s.

# SEE ALSO

[apt](/man/apt)(8), [apt-get](/man/apt-get)(8), [dpkg](/man/dpkg)(1)
