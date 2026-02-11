# TAGLINE

Update source checksums in Arch PKGBUILD files

# TLDR

**Update** checksums in PKGBUILD

```updpkgsums```

Display **help**

```updpkgsums -h```

Display **version**

```updpkgsums -v```

# SYNOPSIS

**updpkgsums** [_OPTIONS_]

# PARAMETERS

**-h, --help**
> Display help information

**-v, --version**
> Display version information

# DESCRIPTION

**updpkgsums** updates the checksums of source files in a PKGBUILD. It downloads the sources (if needed) and calculates new checksums, updating the PKGBUILD file.

Unless a preexisting hashing algorithm is already specified in the PKGBUILD, SHA256 will be used for the new checksums.

# CAVEATS

Arch Linux specific. Must be run in directory containing PKGBUILD. Downloads sources if not already cached. Network access required for remote sources.

# SEE ALSO

[makepkg](/man/makepkg)(8), [pacman](/man/pacman)(8)
