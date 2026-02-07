# TAGLINE

AUR helper with pacman-like interface

# TLDR

**Synchronize and update** all packages

```aurman -Syu```

Update all packages **without showing PKGBUILD** changes

```aurman -Syu --noedit```

**Install** a new package

```aurman -S [package]```

Install a package **without prompting**

```aurman -S --noedit --noconfirm [package]```

**Search** for a keyword in repositories and AUR

```aurman -Ss [keyword]```

**Remove** a package and its dependencies

```aurman --remove --recursive --nosave [package]```

**Clear** the package cache

```aurman -Sc```

# SYNOPSIS

**aurman** [_options_] [_packages_]

# DESCRIPTION

**aurman** is an AUR helper for Arch Linux that provides a pacman-like interface for installing packages from both official repositories and the Arch User Repository. It handles dependency resolution, PKGBUILD review, and package building.

The command follows pacman's option syntax, making it familiar to Arch Linux users. It combines repository and AUR package management into a single workflow.

# PARAMETERS

**-S, --sync**
> Synchronize packages

**-y, --refresh**
> Download fresh package databases

**-u, --sysupgrade**
> Upgrade installed packages

**-s, --search**
> Search for packages matching a pattern

**-c, --clean**
> Remove old packages from cache

**--noedit**
> Do not show PKGBUILD changes before building

**--noconfirm**
> Do not ask for confirmation

**--remove**
> Remove a package

**--recursive**
> Remove dependencies not required by other packages

# CAVEATS

**aurman** is no longer actively maintained. Consider alternatives like **yay** or **paru**. Always review PKGBUILDs when installing from the AUR as they contain user-submitted code.

# SEE ALSO

[pacman](/man/pacman)(8), [yay](/man/yay)(1), [paru](/man/paru)(1), [makepkg](/man/makepkg)(8)
