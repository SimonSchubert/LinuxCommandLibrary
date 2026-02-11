# TAGLINE

Command-line client for PackageKit

# TLDR

**Install** a package

```pkcon install [package]```

**Remove** a package

```pkcon remove [package]```

**Refresh** package cache

```pkcon refresh```

**Update** all packages

```pkcon update```

**Search** for a package

```pkcon search [package]```

List **all packages**

```pkcon get-packages```

# SYNOPSIS

**pkcon** [**install**|**remove**|**update**|**search**|**refresh**] [_options_] [_package_]

# COMMANDS

**install**
> Install packages

**remove**
> Remove packages

**update**
> Update all installed packages

**search**
> Search for packages by name

**refresh**
> Refresh package cache

**get-packages**
> List all available packages

**get-updates**
> List available updates

**get-details**
> Show package details

# PARAMETERS

**-y, --noninteractive**
> Automatic yes to prompts

**-p, --plain**
> Plain text output

**--filter _filter_**
> Filter results (installed, devel, etc.)

# DESCRIPTION

**pkcon** is the command-line client for PackageKit, a cross-distribution package management abstraction layer. It provides a consistent interface regardless of the underlying package manager (apt, dnf, zypper, etc.).

PackageKit is used by graphical software centers like GNOME Software and KDE Discover. pkcon provides the same functionality from the command line.

# CAVEATS

Operations may be slower than native package managers. Not all backend features are exposed. Some distributions don't enable all PackageKit backends. Requires PackageKit daemon running.

# HISTORY

**PackageKit** was created by **Richard Hughes** to provide a unified interface for Linux package management. It was designed to allow desktop applications to manage packages without knowing which package manager the distribution uses.

# SEE ALSO

[apt](/man/apt)(8), [dnf](/man/dnf)(8), [flatpak](/man/flatpak)(1)
