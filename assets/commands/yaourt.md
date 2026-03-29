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

**Download and build** a package from AUR without installing

```yaourt -Sb [package]```

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
> Download and build a package without installing.

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

**yaourt** was one of the first popular AUR helpers but is now deprecated. Users are recommended to switch to yay, paru, or other maintained alternatives.

# CAVEATS

Deprecated and no longer maintained. Consider using yay or paru instead. AUR packages are not officially supported.

# SEE ALSO

[yay](/man/yay)(8), [paru](/man/paru)(8), [pacman](/man/pacman)(8)
