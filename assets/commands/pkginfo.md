# TAGLINE

Query CRUX Linux package database

# TLDR

List **installed packages** and versions

```pkginfo -i```

List **files** owned by a package

```pkginfo -l [package]```

Find **owner** of files matching pattern

```pkginfo -o [pattern]```

Print **footprint** of a file

```pkginfo -f [path/to/file]```

# SYNOPSIS

**pkginfo** [**-i**|**--installed**] [**-l**|**--list** _pkg_] [**-o**|**--owner** _pattern_] [**-f** _file_]

# PARAMETERS

**-i, --installed**
> List all installed packages with versions

**-l, --list _package_**
> List files owned by package

**-o, --owner _pattern_**
> Find package(s) owning files matching pattern

**-f _file_**
> Print the footprint of a package file

**-r, --root _path_**
> Use alternate root directory

# DESCRIPTION

**pkginfo** queries the package database on CRUX Linux systems. It can list installed packages, show package contents, and determine which package owns specific files.

The tool reads from the package database maintained by pkgadd and pkgrm, providing essential information for system administration and troubleshooting.

# CAVEATS

CRUX-specific tool. Pattern matching uses shell wildcards. Footprint comparison helps verify package integrity. Database location fixed at /var/lib/pkg/db.

# HISTORY

**pkginfo** is part of **pkgutils**, the native package management system for CRUX Linux. It provides simple query functionality consistent with CRUX's minimalist philosophy.

# SEE ALSO

[pkgadd](/man/pkgadd)(8), [pkgrm](/man/pkgrm)(8), [pkgmk](/man/pkgmk)(8)
