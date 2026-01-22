# TLDR

**Install** a local package

```pkgadd [package]```

**Update** an existing package

```pkgadd -u [package]```

# SYNOPSIS

**pkgadd** [**-u**] [**-f**] [**-r** _root_] _package_

# PARAMETERS

**-u**
> Upgrade mode, update existing package

**-f**
> Force installation, overwrite existing files

**-r _root_**
> Use alternate root directory

# DESCRIPTION

**pkgadd** installs software packages on CRUX Linux systems. Packages are tar archives with a specific structure containing binaries, libraries, and metadata.

The tool extracts package contents to the filesystem and registers the package in the system database. It handles file conflicts and can upgrade existing installations.

# CAVEATS

CRUX-specific package manager. Packages must be built locally or downloaded. No automatic dependency resolution. Manual dependency management required.

# HISTORY

**pkgadd** is part of **pkgutils**, the native package management system for **CRUX Linux**. CRUX emphasizes simplicity with packages being simple tar archives and minimal tooling.

# SEE ALSO

[pkgrm](/man/pkgrm)(8), [pkginfo](/man/pkginfo)(1), [pkgmk](/man/pkgmk)(8)
