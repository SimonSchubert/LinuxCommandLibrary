# TAGLINE

Deprecated Arch Linux AUR helper

# TLDR

**Update** all packages including AUR

```yaourt -Syua```

**Install** a package

```yaourt -S [package]```

**Remove** a package and its unneeded dependencies

```yaourt -Rs [package]```

**Search** for a package in repositories and AUR

```yaourt -Ss [query]```

**List** installed packages

```yaourt -Q```

**Build a package** from source (ABS or AUR) and install it

```yaourt -Sb [package]```

**Download a PKGBUILD** to the current directory

```yaourt -G [package]```

**Show statistics** about installed packages

```yaourt --stats```

**Get information** about a package

```yaourt -Si [package]```

# SYNOPSIS

**yaourt** [_OPTIONS_] [_PACKAGE..._]

# PARAMETERS

**-S** _PACKAGE_
> Install a package from repositories or AUR.

**-Syua**
> Synchronize databases and update all packages including AUR.

**-Sb** _PACKAGE_
> Build from source: ABS for official packages, AUR otherwise. Specify **-b** twice to also build all dependencies.

**-G**, **--getpkgbuild** _PACKAGE_
> Get the PKGBUILD from ABS or AUR.

**-a**, **--aur**
> Also search the AUR database. With **-u**, also upgrade AUR packages.

**--devel**
> With **-u**, also upgrade development (VCS) packages.

**-C**
> Manage .pac* configuration files.

**--stats**
> Show statistics about installed packages.

**-Rs** _PACKAGE_
> Remove a package and its unneeded dependencies.

**-Ss** _QUERY_
> Search for a package in the sync databases and AUR.

**-Si** _PACKAGE_
> Display detailed information about a package.

**-Q**
> List installed packages.

**-Qm**
> List foreign (AUR-installed) packages.

**--noconfirm**
> Do not ask for any confirmation.

# DESCRIPTION

**yaourt** (Yet AnOther User Repository Tool) is an AUR helper for Arch Linux that wraps pacman with additional features for building packages from the Arch User Repository.

It combines official repository and AUR package management in a single interface with colorized output, interactive search/install, and orphan detection. Since the majority of yaourt's options are the same as pacman's, it can be used as a drop-in replacement.

# HISTORY

**yaourt** was one of the first popular AUR helpers but is now deprecated: its repository was marked unmaintained and archived on **August 9, 2019**. Users are recommended to switch to yay, paru, or other maintained alternatives.

# CAVEATS

Deprecated and no longer maintained. Consider using yay or paru instead. AUR packages are not officially supported.

# SEE ALSO

[yay](/man/yay)(8), [paru](/man/paru)(8), [pacman](/man/pacman)(8)

# RESOURCES

```[Source code](https://github.com/archlinuxfr/yaourt)```

<!-- verified: 2026-11-09 -->
