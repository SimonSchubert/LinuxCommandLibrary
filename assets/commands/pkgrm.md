# TLDR

**Remove** an installed package

```pkgrm [package]```

# SYNOPSIS

**pkgrm** [**-r** _root_] _package_

# PARAMETERS

**-r _root_**
> Use alternate root directory

**package**
> Name of package to remove

# DESCRIPTION

**pkgrm** removes installed packages from a CRUX Linux system. It deletes all files belonging to the package and removes the package entry from the system database.

The tool does not check for dependencies, so removing packages that other software depends on may break the system. Users must manage dependencies manually.

# CAVEATS

No dependency checking. Files modified after installation are not removed. Directories are only removed if empty. Use pkginfo to check package contents before removal.

# HISTORY

**pkgrm** is part of **pkgutils**, the native package management system for CRUX Linux. It follows CRUX's philosophy of simple, transparent tools that trust the user to manage their system.

# SEE ALSO

[pkgadd](/man/pkgadd)(8), [pkginfo](/man/pkginfo)(1), [pkgmk](/man/pkgmk)(8)
