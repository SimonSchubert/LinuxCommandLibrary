# TAGLINE

Deprecated Arch Linux AUR helper

# TLDR

**Update** all packages

```yaourt -Syua```

**Install** package

```yaourt -S [package]```

**Remove** package

```yaourt -Rs [package]```

**Search** packages

```yaourt -Ss [query]```

**List** installed

```yaourt -Q```

# SYNOPSIS

**yaourt** [_OPTIONS_] [_PACKAGE..._]

# PARAMETERS

**-S** _PACKAGE_
> Install package

**-Syua**
> Synchronize and update all packages including AUR

**-Rs** _PACKAGE_
> Remove package and dependencies

**-Ss** _QUERY_
> Search package database

**-Q**
> List installed packages

# DESCRIPTION

**yaourt** is an AUR helper for Arch Linux that wraps pacman with additional features for building packages from the Arch User Repository.

It combines official repository and AUR package management in a single interface.

# HISTORY

**yaourt** was one of the first popular AUR helpers but is now deprecated. Users are recommended to switch to yay, paru, or other maintained alternatives.

# CAVEATS

Deprecated and no longer maintained. Consider using yay or paru instead. AUR packages are not officially supported.

# SEE ALSO

[yay](/man/yay)(8), [paru](/man/paru)(8), [pacman](/man/pacman)(8)
