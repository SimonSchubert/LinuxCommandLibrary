# TAGLINE

Install and update Void Linux packages

# TLDR

**Install** a new package

```xbps-install [package]```

**Synchronize** and update all packages

```xbps-install -S -u```

# SYNOPSIS

**xbps-install** [_options_] [_package_...]

# PARAMETERS

**-S, --sync**
> Synchronize repository index

**-u, --update**
> Update installed packages

**-y, --yes**
> Assume yes to all questions

**-n, --dry-run**
> Show what would be done

**-f, --force**
> Force installation

**-R, --repository _url_**
> Add repository to search

**-D, --download-only**
> Download packages only

**-v, --verbose**
> Verbose output

# DESCRIPTION

**xbps-install** is the package installation and update utility for XBPS, the package manager used by Void Linux. It handles package installation, dependency resolution, and system updates.

Before installing or updating packages, synchronize the repository index with **-S** to get the latest package information.

# CAVEATS

Requires root privileges for system-wide installation. Repository sync (**-S**) should be run before updates. Part of the XBPS package management system for Void Linux.

# SEE ALSO

[xbps-query](/man/xbps-query)(1), [xbps-remove](/man/xbps-remove)(1), [xbps-reconfigure](/man/xbps-reconfigure)(1)
