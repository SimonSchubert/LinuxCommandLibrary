# TAGLINE

Query and manage macOS package receipts

# TLDR

**List installed packages**

```pkgutil --pkgs```

**Show package info**

```pkgutil --pkg-info [com.apple.pkg.Safari]```

**List package files**

```pkgutil --files [com.apple.pkg.Safari]```

**Find which package owns a file**

```pkgutil --file-info [/usr/bin/python3]```

**Forget package receipt** (does not uninstall files)

```sudo pkgutil --forget [com.example.package]```

**Expand a package for inspection**

```pkgutil --expand [package.pkg] [expanded_dir]```

# SYNOPSIS

**pkgutil** [_options_] [_packages_]

# PARAMETERS

**--pkgs**
> List all packages.

**--pkg-info** _id_
> Show package information.

**--files** _id_
> List installed files.

**--verify** _id_
> Verify package installation.

**--forget** _id_
> Remove package receipt.

**--file-info** _path_
> Show which package installed a specific file.

**--only-files**
> List only files (not directories) in --files output.

**--only-dirs**
> List only directories (not files) in --files output.

**--regexp**
> Match package-id arguments as regular expressions.

**--expand** _pkg_ _dir_
> Expand flat package into a directory for inspection.

**--flatten** _pkg_ _dir_
> Flatten an expanded package into a flat package.

**--bom** _path_
> Extract BOM files from a flat package.

**--volume** _path_
> Target volume (default: /).

**-f**, **--force**
> Skip confirmation for destructive operations.

**-v**, **--verbose**
> Human-readable output with extra context.

# DESCRIPTION

**pkgutil** is macOS's package receipt management utility. It queries the installer database to list installed packages, show package metadata, verify installation integrity, and list files belonging to a package.

The **--forget** command removes a package receipt from the database without deleting any installed files, useful for cleaning up stale entries. The **--expand** command extracts a .pkg archive for inspection. Package identifiers use reverse-DNS notation (e.g., com.apple.pkg.Safari).

Note that pkgutil manages receipts only - it cannot install or uninstall packages. Use **installer** for installation and manual removal for uninstallation.

# EXAMPLES

```bash
# List all Apple packages
pkgutil --pkgs | grep com.apple

# Get package details
pkgutil --pkg-info com.apple.pkg.Safari

# List package files
pkgutil --files com.apple.pkg.Safari | head

# Find package owning file
pkgutil --file-info /usr/bin/python3

# Expand pkg for inspection
pkgutil --expand package.pkg expanded_dir
```

# CAVEATS

macOS-specific. --forget doesn't uninstall, only removes receipt. Some packages are protected.

# HISTORY

pkgutil is Apple's command-line interface for the macOS Installer package system, managing .pkg installations.

# SEE ALSO

[brew](/man/brew)(1)
