# TLDR

**Search** AUR packages

```aura -As keyword```

**Install** from AUR

```aura -A package```

**Update** AUR packages

```aura -Akua```

Install from **official** repos

```aura -S package```

**Sync** and upgrade official packages

```aura -Syu```

**Remove** package and dependencies

```aura -Rsu package```

Remove **orphan** packages

```aura -Oj```

# SYNOPSIS

**aura** [_OPTIONS_] [_PACKAGE_...]

# DESCRIPTION

**aura** is a secure, multilingual package manager for Arch Linux that handles both official repository packages and AUR (Arch User Repository) packages. It provides a unified interface for all package management tasks.

# PARAMETERS

**-A, --aursync**
> Synchronize with the AUR

**-As, --search**
> Search AUR packages

**-S, --sync**
> Synchronize with official repositories

**-Syu**
> Sync database and upgrade packages

**-R, --remove**
> Remove packages

**-s, --recursive**
> Remove dependencies recursively

**-u, --unneeded**
> Remove unneeded packages

**-O, --orphans**
> List orphan packages

**-j, --abandon**
> Remove orphan packages

**-k, --diff**
> Show PKGBUILD diff before building

**--delmakedeps**
> Remove make dependencies after install

# CAVEATS

AUR packages are user-submitted and not officially supported. Review PKGBUILDs before installing for security. Building from source may require additional dependencies.

# HISTORY

**aura** was created as a Haskell-based alternative to other AUR helpers, emphasizing security and multilingual support.

# SEE ALSO

[pacman](/man/pacman)(8), [yay](/man/yay)(1), [paru](/man/paru)(1)
