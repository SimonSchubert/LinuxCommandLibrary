# TLDR

**Install** a package from repository

```sudo pactrans --install [package]```

**Remove** a package

```sudo pactrans --remove [package]```

**Upgrade** all installed packages

```sudo pactrans --sysupgrade```

Install a **package file**

```sudo pactrans --file [path/to/package.pkg.tar.zst]```

**Replace** local package with repository version

```sudo pactrans local/[old_package] [repo]/[new_package]```

**Print** what would happen without executing

```pactrans --print-only --install [package]```

# SYNOPSIS

**pactrans** [**--install**|**--remove**|**--sysupgrade**] [**--file**] [**--print-only**] [_packages_...]

# PARAMETERS

**--install**
> Install packages from configured repositories

**--remove**
> Remove installed packages

**--sysupgrade**
> Upgrade all installed packages

**--file**
> Install from local package file

**--print-only**
> Show what would be done without making changes

**--config _file_**
> Use alternate pacman configuration

**--dbpath _path_**
> Use alternate database path

# DESCRIPTION

**pactrans** handles package installation, removal, and system upgrades using the ALPM (Arch Linux Package Management) library. It provides a unified interface for common package operations.

The tool supports mixed operations, allowing package installation and removal in a single transaction. Package specifications can include repository prefixes for precise control over package sources.

# CAVEATS

Requires root privileges for system modifications. Uses pacman's configuration and database. Part of the pacutils package. Transaction conflicts must be resolved manually.

# HISTORY

**pactrans** is part of **pacutils**, created by **Andrew Gregory**. It provides a programmatic interface to ALPM transactions, useful for scripts and automation that need fine-grained control over package operations.

# SEE ALSO

[pacman](/man/pacman)(8), [pacsync](/man/pacsync)(1), [pacinstall](/man/pacinstall)(1), [pacremove](/man/pacremove)(1)
