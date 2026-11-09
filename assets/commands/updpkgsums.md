# TAGLINE

Update source checksums in Arch PKGBUILD files

# TLDR

**Update checksums in PKGBUILD** in the current directory

```updpkgsums```

**Update checksums in a specific PKGBUILD** file

```updpkgsums [path/to/PKGBUILD]```

**Update checksums without colored output**

```updpkgsums -m```

Display **help**

```updpkgsums -h```

# SYNOPSIS

**updpkgsums** [**--nocolor**] [_build file_]

# PARAMETERS

**-h**, **--help**
> Display help information.

**-m**, **--nocolor**
> Do not colorize output.

**-V**, **--version**
> Display version information.

# DESCRIPTION

**updpkgsums** performs an in-place update of the checksums in a PKGBUILD file. It downloads the sources (if needed) and calculates new checksums, updating the PKGBUILD file. Defaults to the PKGBUILD in the current directory if no file is specified.

New checksums come from **makepkg -g**, so existing checksum algorithms in the PKGBUILD are kept; if none are present, those in **INTEGRITY_CHECK** from makepkg.conf are used. It is part of **pacman-contrib**.

# CAVEATS

Arch Linux specific. Requires write permission in the directory containing the PKGBUILD, since the file is replaced. Downloads sources if not already cached. Network access required for remote sources.

# SEE ALSO

[makepkg](/man/makepkg)(8), [pkgbuild](/man/pkgbuild)(5), [pacman](/man/pacman)(8)

# RESOURCES

```[Source code](https://gitlab.archlinux.org/pacman/pacman-contrib)```

```[Documentation](https://man.archlinux.org/man/updpkgsums.8)```

<!-- verified: 2026-11-09 -->
