# TLDR

**Synchronize and update** all packages (includes AUR)

```pacaur -Syu```

Synchronize and update only **AUR packages**

```pacaur -Syua```

**Install** a new package (includes AUR)

```pacaur -S [package]```

**Remove** a package and its dependencies

```pacaur -Rs [package]```

**Search** the package database for a keyword

```pacaur -Ss [keyword]```

**List** all currently installed packages

```pacaur -Qs```

# SYNOPSIS

**pacaur** [_operation_] [_options_] [_targets_]

# PARAMETERS

**-S**, **--sync**
> Synchronize packages (install/upgrade from repos and AUR)

**-Q**, **--query**
> Query the local package database

**-R**, **--remove**
> Remove packages

**-y**, **--refresh**
> Download fresh package databases

**-u**, **--sysupgrade**
> Upgrade all out-of-date packages

**-a**, **--aur**
> Restrict operation to AUR packages only

**-s**, **--search**
> Search for packages matching pattern

**-i**, **--info**
> Display package information

**-c**, **--clean**
> Remove old packages from cache

**--devel**
> Consider development packages during upgrade

**--needed**
> Do not reinstall up-to-date packages

**--noconfirm**
> Do not ask for confirmation

**--noedit**
> Do not prompt to edit PKGBUILDs

# DESCRIPTION

**pacaur** is an AUR (Arch User Repository) helper for Arch Linux that wraps pacman functionality while adding support for building and installing packages from the AUR. It maintains pacman's command syntax, making it familiar to Arch users while extending functionality to include user-contributed packages.

The tool automates the process of downloading PKGBUILDs from the AUR, resolving dependencies, building packages with makepkg, and installing them. It can handle both official repository packages and AUR packages in a single operation.

# CAVEATS

**Development discontinued** - pacaur is no longer actively maintained. Consider alternatives like **yay** or **paru** for continued support. Always review PKGBUILDs before building AUR packages, as they contain user-submitted code that could potentially be malicious.

# HISTORY

Developed as a minimalist AUR helper following the philosophy of keeping close to pacman's interface. Was popular among Arch users who preferred its non-interactive approach and tight pacman integration. Development ceased around **2018**, with the maintainer recommending users migrate to actively maintained alternatives.

# SEE ALSO

[pacman](/man/pacman)(8), [yay](/man/yay)(8), [paru](/man/paru)(1), [makepkg](/man/makepkg)(8)
