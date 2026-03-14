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

**updpkgsums** [_OPTIONS_] [_build file_]

# PARAMETERS

**-h**, **--help**
> Display help information.

**-m**, **--nocolor**
> Do not colorize output.

**-V**, **--version**
> Display version information.

# DESCRIPTION

**updpkgsums** performs an in-place update of the checksums in a PKGBUILD file. It downloads the sources (if needed) and calculates new checksums, updating the PKGBUILD file. Defaults to the PKGBUILD in the current directory if no file is specified.

Unless a preexisting hashing algorithm is already specified in the PKGBUILD, SHA256 will be used for the new checksums.

# CAVEATS

Arch Linux specific. Must be run in directory containing PKGBUILD. Downloads sources if not already cached. Network access required for remote sources.

# SEE ALSO

[makepkg](/man/makepkg)(8), [pacman](/man/pacman)(8)
