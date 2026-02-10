# TAGLINE

modern package management frontend for dpkg-based Linux distributions

# TLDR

Enter the **interactive** package management interface

```sudo oma```

**Install** a package

```sudo oma install [package_name]```

**Remove** a package

```sudo oma remove [package_name]```

**Search** for a package

```oma search [keyword]```

Show **detailed information** for a package

```oma show [package_name]```

**Upgrade** all installed packages to their latest versions

```sudo oma upgrade```

**Update** the list of available packages

```sudo oma refresh```

Display **help**

```oma help```

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

**clean**
> Clean package cache

**help**
> Display help information

# DESCRIPTION

**oma** is a modern package management frontend for dpkg-based Linux distributions, developed by the AOSC (Anthon Open Source Community) project. It provides an interactive text-based interface for managing packages, with support for dependency resolution and system upgrades.

The tool automatically refreshes package lists before install and upgrade operations, reducing the need for manual repository updates. It aims to provide a user-friendly experience while maintaining compatibility with the underlying dpkg/apt infrastructure.

# CAVEATS

Requires root privileges (via sudo) for operations that modify the system. Designed primarily for AOSC OS but may work on other dpkg-based distributions with appropriate configuration.

# HISTORY

Developed by the **AOSC (Anthon Open Source Community)** as part of their effort to create a streamlined Linux distribution experience. The name "oma" is derived from various meanings across languages, reflecting AOSC's international community.

# SEE ALSO

[apt](/man/apt)(8), [apt-get](/man/apt-get)(8), [dpkg](/man/dpkg)(1), [aptitude](/man/aptitude)(8)
