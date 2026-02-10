# TAGLINE

verifies the integrity and consistency of installed packages on Arch-based

# TLDR

**List and check** all installed packages

```paccheck```

**Check** specific packages

```paccheck [package1] [package2]```

Only display messages if a **problem is found**

```paccheck --quiet```

Check that all **package dependencies** are satisfied

```paccheck --depends```

Display **help**

```paccheck --help```

# SYNOPSIS

**paccheck** [_options_] [_packages_...]

# PARAMETERS

**--quiet**
> Only display output if a problem is found

**--depends**
> Check that all package dependencies are satisfied

**--opt-depends**
> Check optional dependencies

**--files**
> Check that package files exist

**--file-properties**
> Check file properties against package database

**--md5sum**
> Check file MD5 checksums

**--sha256sum**
> Check file SHA256 checksums

**--require-mtree**
> Treat missing MTREE data as an error

**--db-files**
> Include database files in checks

**--backup**
> Include backup files in checks

**--noextract**
> Include NoExtract files in checks

**--noupgrade**
> Include NoUpgrade files in checks

**--help**
> Display help information

**--version**
> Display version information

# DESCRIPTION

**paccheck** verifies the integrity and consistency of installed packages on Arch-based systems. It can check dependency relationships, verify that package files exist on disk, and validate file checksums against the package database records.

The tool is useful for detecting system corruption, identifying manually modified configuration files, finding missing files, and ensuring all package dependencies are properly satisfied. It reads package metadata from the local pacman database.

# CAVEATS

Checksum verification requires MTREE data to be present in packages (not all packages include this). Some modified files are expected (configuration files edited by user). Running with all verification options can be slow on systems with many packages.

# HISTORY

Part of **pacutils**, a collection of utilities for pacman developed by Andrew Gregory. Provides functionality similar to **rpm -V** for RPM-based systems, allowing administrators to verify package integrity on Arch Linux.

# SEE ALSO

[pacman](/man/pacman)(8), [pacconf](/man/pacconf)(8), [pacsift](/man/pacsift)(8)
