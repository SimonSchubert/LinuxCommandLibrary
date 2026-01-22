# TLDR

**Search** for a package in remote repositories

```xbps-query -s [regex|keyword] --repository --regex```

**Show** information about an installed package

```xbps-query -S [package]```

**Show** information about a package in remote repositories

```xbps-query -S [package] --repository```

**List** packages registered in the package database

```xbps-query -l```

**List** explicitly installed packages

```xbps-query -m```

# SYNOPSIS

**xbps-query** [_options_] [_package_]

# PARAMETERS

**-s, --search _pattern_**
> Search for packages matching pattern

**-S, --show _package_**
> Show package information

**-l, --list-pkgs**
> List all installed packages

**-m, --list-manual-pkgs**
> List explicitly installed packages (not dependencies)

**-L, --list-repos**
> List configured repositories

**-f, --files _package_**
> List files installed by package

**-x, --deps _package_**
> Show package dependencies

**-X, --revdeps _package_**
> Show reverse dependencies

**--repository**
> Query remote repositories instead of local

**--regex**
> Enable regex pattern matching

# DESCRIPTION

**xbps-query** queries package information from the XBPS package management system. It can search repositories, display package details, list installed packages, and show dependency information.

The tool is essential for exploring available packages and understanding the current system state on Void Linux.

# CAVEATS

Repository queries require network access. Use **--repository** flag to query remote packages. Part of the XBPS package management system for Void Linux.

# SEE ALSO

[xbps-install](/man/xbps-install)(1), [xbps-remove](/man/xbps-remove)(1)
