# TAGLINE

Query the APT package cache

# TLDR

**Search** for a package in your current sources

```apt-cache search [query]```

**Search** only in package names

```apt-cache search --names-only [query]```

Show **information** about a package

```apt-cache show [package]```

Show whether a package is **installed and up to date**

```apt-cache policy [package]```

Show **dependencies** for a package

```apt-cache depends [package]```

Show packages that **depend on** a particular package

```apt-cache rdepends [package]```

Show **available versions** in a table format

```apt-cache madison [package]```

# SYNOPSIS

**apt-cache** [_options_] _command_ [_arguments_]

# DESCRIPTION

**apt-cache** queries the local APT package cache to search for packages, display detailed package information, and analyze dependency relationships. It reads the package index files downloaded by **apt update** and provides fast, offline access to package metadata without contacting remote repositories.

Common operations include searching for packages by name or description, inspecting version and dependency details, checking installation policies, and listing reverse dependencies. The output is suitable for scripting and can help diagnose dependency conflicts or determine which repository provides a given package.

# PARAMETERS

**search** _regex_
> Search for packages matching the POSIX regex in names and descriptions

**show** _package_
> Show detailed package record for a package

**showpkg** _package_
> Show general information including versions and dependencies

**showsrc** _package_
> Show all source package records for a package

**policy** [_package_]
> Show policy settings, installation status, and repository priorities

**depends** _package_
> Show dependencies for a package

**rdepends** _package_
> Show reverse dependencies (packages that depend on this one)

**madison** _package_
> Show available versions in a tabular format

**pkgnames** [_prefix_]
> List all package names in the cache, optionally filtered by prefix

**stats**
> Show cache statistics

**dump**
> Show a short listing of every package in the cache

**unmet**
> Show a summary of all unmet dependencies in the cache

**-f, --full**
> Print full package records when searching

**-n, --names-only**
> Only search package names, not descriptions

**-i, --important**
> Print only Depends and Pre-Depends relations (for use with depends and unmet)

**--installed**
> Limit output to currently installed packages

**--recurse**
> Make depends and rdepends recursive

# CONFIGURATION

**/etc/apt/sources.list**
> Main file listing configured package repositories.

**/etc/apt/sources.list.d/**
> Directory for additional repository source files.

**/etc/apt/preferences.d/**
> Directory for package pinning and priority preferences.

# CAVEATS

This tool operates on the local cache; run **apt update** first to ensure the cache is current.

# HISTORY

Part of the **APT** (Advanced Package Tool) suite developed for Debian-based systems in the late 1990s.

# SEE ALSO

[apt](/man/apt)(8), [apt-get](/man/apt-get)(8), [aptitude](/man/aptitude)(8), [dpkg](/man/dpkg)(1)
