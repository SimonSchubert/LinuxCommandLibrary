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

**aurman** is an AUR helper for Arch Linux that provides a pacman-like interface for installing packages from both official repositories and the Arch User Repository. It handles dependency resolution, PKGBUILD review, and package building, and was aimed at advanced users already familiar with pacman, makepkg, and the AUR.

The command follows pacman's option syntax, making it familiar to Arch Linux users. It combines repository and AUR package management into a single workflow. Note that aurman is no longer maintained and has been removed from the AUR; the entries below are kept for historical reference.

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

**--devel**
> Also consider development packages (VCS sources such as -git) for upgrades

**--pgp_fetch**
> Automatically fetch unknown PGP keys needed to verify sources

**--aur**
> Restrict the operation to AUR packages

**--repo**
> Restrict the operation to official repository packages

# CAVEATS

**aurman** is no longer maintained and has been removed from the AUR. Use a current AUR helper such as **yay** or **paru** instead. Always review PKGBUILDs when installing from the AUR, as they contain user-submitted code that runs with your privileges.

# HISTORY

**aurman** was a popular AUR helper known for its advanced dependency solver and interactive package selection. Development stopped and the package was eventually dropped from the AUR, leaving **yay** and **paru** as the commonly recommended replacements.

# SEE ALSO

[pacman](/man/pacman)(8), [yay](/man/yay)(1), [paru](/man/paru)(1), [makepkg](/man/makepkg)(8)

# RESOURCES

```[Source code](https://github.com/polygamma/aurman)```

<!-- verified: 2026-06-17 -->
