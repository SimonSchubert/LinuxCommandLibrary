# TAGLINE

Query Void Linux package information

# TLDR

**Search for a package** in remote repositories

```xbps-query -Rs [keyword]```

**Show information** about an installed package

```xbps-query -S [package]```

**Show information** about a package in remote repositories

```xbps-query -RS [package]```

**List all installed** packages

```xbps-query -l```

**List explicitly installed** packages (not dependencies)

```xbps-query -m```

**List files** installed by a package

```xbps-query -f [package]```

**Show dependencies** of an installed package

```xbps-query -x [package]```

**Show reverse dependencies** of a package

```xbps-query -X [package]```

**Find which package owns** a file

```xbps-query -o [/path/to/file]```

**List package orphans** (unused dependencies)

```xbps-query -O```

# SYNOPSIS

**xbps-query** [_options_] [_package_]

# PARAMETERS

**-s** _pattern_
> Search for packages matching pattern.

**-S** _package_
> Show detailed package information.

**-l**
> List all installed packages.

**-m**
> List explicitly installed packages (not dependencies).

**-L**
> List configured repositories.

**-f** _package_
> List files installed by package.

**-x** _package_
> Show package dependencies.

**-X** _package_
> Show reverse dependencies.

**-R**, **--repository**
> Query remote repositories instead of local.

**-o** _PATTERN_
> Search for packages owning files matching PATTERN.

**-O**
> List package orphans (installed as dependencies, no longer needed).

**--regex**
> Enable Extended Regular Expression matching for search.

**-p** _property_
> Show specific property (e.g., version, description).

**-v**, **--verbose**
> Enable verbose output.

# DESCRIPTION

**xbps-query** queries package information from the XBPS package management system. It can search repositories, display package details, list installed packages, and show dependency information.

The tool is essential for exploring available packages and understanding the current system state on Void Linux.

# CAVEATS

Repository queries require network access and an up-to-date repository index (run **xbps-install -S** to sync). Only one query mode can be used at a time. Part of the XBPS package management system for Void Linux.

# SEE ALSO

[xbps-install](/man/xbps-install)(1), [xbps-remove](/man/xbps-remove)(1)
