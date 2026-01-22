# TLDR

**Synchronize** and update all packages

```paru```

**Search** and install a package interactively

```paru package_name```

Upgrade **AUR packages** only

```paru -Sua```

**Remove** a package with its configuration and dependencies

```paru -Rns package```

Get **information** about a package

```paru -Si package```

Download **PKGBUILD** from AUR

```paru --getpkgbuild package```

**Display** the PKGBUILD file

```paru --getpkgbuild --print package```

# SYNOPSIS

**paru** [_operation_] [_options_] [_targets_]

# DESCRIPTION

**paru** is an AUR helper and pacman wrapper for Arch Linux. It simplifies installing packages from the Arch User Repository (AUR) while providing full pacman compatibility for official repository packages.

# OPERATIONS

**-S, --sync**
> Synchronize packages from repositories

**-R, --remove**
> Remove packages from the system

**-Q, --query**
> Query the local package database

**-U, --upgrade**
> Upgrade from local package files

**-G, --getpkgbuild**
> Download PKGBUILDs from AUR or ABS

**-P, --show**
> Print various package information

# COMMON OPTIONS

**-u, --sysupgrade**
> Upgrade installed packages

**-a, --aur**
> Limit operation to AUR packages

**-s, --search**
> Search for packages

**-i, --info**
> Display package information

**-c, --clean**
> Remove unneeded dependencies

**--devel**
> Update development packages

**--print**
> Print PKGBUILD instead of saving

**--noconfirm**
> Skip all confirmation prompts

**--needed**
> Don't reinstall up-to-date packages

# CAVEATS

AUR packages are user-contributed and not officially supported by Arch Linux. Always review PKGBUILDs before installation. Paru will prompt to show diffs of updated PKGBUILDs by default.

# HISTORY

**paru** was created by Morganamilo as a successor to yay, written in Rust for better performance. It aims to be feature-rich while maintaining simplicity and pacman compatibility.

# SEE ALSO

[pacman](/man/pacman)(8), [yay](/man/yay)(8), [makepkg](/man/makepkg)(8)
