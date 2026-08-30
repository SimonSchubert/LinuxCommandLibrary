# TAGLINE

modern package management frontend for dpkg-based Linux distributions

# TLDR

Open the **interactive** package browser

```sudo oma```

**Refresh** the package lists

```sudo oma refresh```

**Install** a package

```sudo oma install [package_name]```

**Choose a particular version** from those available

```sudo oma pick [package_name]```

**Remove** a package

```sudo oma remove [package_name]```

**Upgrade** everything installed

```sudo oma upgrade```

**Search** for a package

```oma search [keyword]```

Show a package's **details**

```oma show [package_name]```

List packages with their **installation status**

```oma list [package_name]```

List the **files a package installs**

```oma files [package_name]```

Find **which package provides a path**

```oma provides [/usr/bin/ssh]```

Show what a package **depends on**

```oma depends [package_name]```

Show **what depends on** a package

```oma rdepends [package_name]```

Draw the **dependency tree**

```oma tree [package_name]```

**Hold** a package at its current version

```sudo oma mark hold [package_name]```

**Repair** broken dependencies

```sudo oma fix-broken```

Review **past transactions**

```oma history```

Free the **download cache**

```sudo oma clean```

# SYNOPSIS

**oma** [_command_] [_options_] [_package_...]

# PARAMETERS

**install** _package_
> Install one or more packages

**remove** _package_
> Remove one or more packages

**upgrade**
> Upgrade all installed packages to newest versions

**refresh**
> Update the package list from repositories

**search** _keyword_
> Search for packages matching keyword

**show** _package_
> Display detailed information about a package

**list**
> List installed packages

**depends** _package_
> Show package dependencies

**rdepends** _package_
> Show reverse dependencies

**files** _package_
> List files in the specified package

**provides** _pattern_
> Find packages providing files matching the pattern

**fix-broken**
> Fix broken dependencies

**pick** _package_
> Install a specific version of a package

**mark** _package_
> Mark package status (manual, auto, hold, unhold)

**download** _package_
> Download package(s) without installing

**history**
> Show package operation history

**clean**
> Clean downloaded package cache

**help**
> Display help information

# DESCRIPTION

**oma** is a modern package management frontend for dpkg-based Linux distributions, developed by the AOSC (Anthon Open Source Community) project. It provides an interactive text-based interface for managing packages, with support for dependency resolution and system upgrades. Pre-installed on AOSC OS, it is also available for Debian, Ubuntu, Deepin, openKylin, and other dpkg-based distributions.

The tool features multi-threaded package downloads, smart search, and safeguards against accidental removal of essential packages. It aims to provide a user-friendly experience while maintaining compatibility with the underlying dpkg/apt infrastructure.

# CAVEATS

Requires root privileges (via sudo) for operations that modify the system. Designed primarily for AOSC OS but may work on other dpkg-based distributions with appropriate configuration.

# HISTORY

Developed by the **AOSC (Anthon Open Source Community)** as part of their effort to create a streamlined Linux distribution experience. The name "oma" is derived from various meanings across languages, reflecting AOSC's international community.

# SEE ALSO

[apt](/man/apt)(8), [apt-get](/man/apt-get)(8), [dpkg](/man/dpkg)(1), [aptitude](/man/aptitude)(8)
