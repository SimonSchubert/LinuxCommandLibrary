# TAGLINE

Install, remove, and upgrade packages using ALPM transactions

# TLDR

**Install** a package from repository

```sudo pactrans --install [package]```

**Remove** a package

```sudo pactrans --remove [package]```

**Upgrade** all installed packages

```sudo pactrans --sysupgrade```

Install a **package file**

```sudo pactrans --file [path/to/package.pkg.tar.zst]```

**Install and remove** packages in a single transaction

```sudo pactrans --install [new_package] --remove [old_package]```

**Print** what would happen without executing

```pactrans --print-only --install [package]```

**Install from a specific repository**

```sudo pactrans [repo]/[package]```

# SYNOPSIS

**pactrans** [_options_] [_target_...]

# PARAMETERS

**--install**
> Interpret following targets as packages to install from repositories.

**--remove**
> Interpret following targets as packages to remove.

**--sysupgrade**
> Upgrade all installed packages to the latest available versions.

**--file**
> Interpret following targets as local package files to install.

**--spec**
> Interpret following targets as pkgspecs: install if a file or repo package, remove if a local database entry.

**--print-only**
> Display what the transaction would do and exit without making changes.

**--no-confirm**
> Do not prompt for confirmation.

**--no-deps**
> Ignore dependency checks.

**--dbonly**
> Make changes to the database without extracting or removing files.

**--config** _file_
> Use an alternate pacman configuration file.

**--dbpath** _path_
> Use an alternate database path.

**--sysroot** _path_
> Set an alternate system root.

# DESCRIPTION

**pactrans** handles package installation, removal, and system upgrades using the ALPM (Arch Linux Package Management) library. It provides a unified interface for common package operations with support for mixed transactions.

The tool can install and remove packages in a single transaction. Package specifications can include repository prefixes (e.g., **extra/vim**) for precise control over package sources. If only a package name is provided, repositories are searched in the order they are declared.

The **pacinstall** and **pacremove** commands are aliases that differ only in their default interpretation of targets but are otherwise identical to **pactrans**.

If stdin is not connected to a terminal, package specifications are read from stdin.

# CAVEATS

Requires root privileges for system modifications. Uses pacman's configuration and database. Part of the **pacutils** package. Transaction conflicts must be resolved manually.

# HISTORY

**pactrans** is part of **pacutils**, created by **Andrew Gregory**. It provides a programmatic interface to ALPM transactions, useful for scripts and automation that need fine-grained control over package operations.

# SEE ALSO

[pacman](/man/pacman)(8), [pacsync](/man/pacsync)(1), [pacinstall](/man/pacinstall)(1), [pacremove](/man/pacremove)(1), [pacconf](/man/pacconf)(1)
