# TLDR

**Build** and download package

```pkgmk -d```

Build and **install** package

```pkgmk -d -i```

Build and **upgrade** existing package

```pkgmk -d -u```

**Ignore footprint** differences

```pkgmk -d -if```

**Ignore MD5** checksum

```pkgmk -d -im```

**Update footprint** file

```pkgmk -uf```

# SYNOPSIS

**pkgmk** [**-d**] [**-i**] [**-u**] [**-if**] [**-im**] [**-uf**] [**-um**]

# PARAMETERS

**-d**
> Download source files

**-i**
> Install package after build

**-u**
> Upgrade package after build

**-if**
> Ignore footprint mismatch

**-im**
> Ignore MD5 checksum mismatch

**-uf**
> Update footprint file

**-um**
> Update MD5 checksum file

**-ns**
> No stripping of binaries

# DESCRIPTION

**pkgmk** builds binary packages from source for CRUX Linux. It reads a Pkgfile (similar to PKGBUILD in Arch) containing build instructions, downloads sources, compiles the software, and creates a package archive.

The tool verifies source integrity using MD5 checksums and tracks installed files using footprint files for reproducibility.

# CAVEATS

Requires Pkgfile in current directory. Build dependencies must be installed manually. Source downloads require internet access. Footprint mismatches may indicate build environment differences.

# HISTORY

**pkgmk** is part of **pkgutils** for CRUX Linux. It provides a simple, scripted approach to building packages from source, emphasizing transparency and user control over the build process.

# SEE ALSO

[pkgadd](/man/pkgadd)(8), [pkginfo](/man/pkginfo)(1), [prt-get](/man/prt-get)(8)
