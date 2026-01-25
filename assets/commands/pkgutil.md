# TLDR

**List installed packages**

```pkgutil --pkgs```

**Show package info**

```pkgutil --pkg-info [com.apple.pkg.Safari]```

**List package files**

```pkgutil --files [com.apple.pkg.Safari]```

**Verify package**

```pkgutil --verify [com.apple.pkg.Safari]```

**Forget package**

```sudo pkgutil --forget [com.example.package]```

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

**--expand** _pkg_ _dir_
> Expand package.

**--volume** _path_
> Target volume.

# DESCRIPTION

**pkgutil** is macOS's package receipt utility. It queries the package database, verifies installations, and manages package receipts without removing files.

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

[installer](/man/installer)(8), [lsbom](/man/lsbom)(1), [pkgbuild](/man/pkgbuild)(1)
