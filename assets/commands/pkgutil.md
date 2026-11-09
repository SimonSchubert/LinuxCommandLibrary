# TAGLINE

Query and manage macOS package receipts

# TLDR

**List installed packages**

```pkgutil --pkgs```

**List installed packages matching a regular expression**

```pkgutil --pkgs='[com\.apple\..*]'```

**Show package info**

```pkgutil --pkg-info [com.apple.pkg.Safari]```

**List package files**

```pkgutil --files [com.apple.pkg.Safari]```

**Find which package owns a file**

```pkgutil --file-info [/usr/bin/python3]```

**Check the signature of a package file**

```pkgutil --check-signature [package.pkg]```

**List the files inside an uninstalled package**

```pkgutil --payload-files [package.pkg]```

**Forget package receipt** (does not uninstall files)

```sudo pkgutil --forget [com.example.package]```

**Expand a package for inspection**

```pkgutil --expand [package.pkg] [expanded_dir]```

# SYNOPSIS

**pkgutil** [_options_] [_commands_]

# PARAMETERS

**--packages**, **--pkgs**
> List all installed package IDs on the volume.

**--pkgs**=_REGEXP_
> List installed package IDs matching REGEXP. The equal sign is required.

**--pkg-info** _id_
> Print extended information about the package.

**--pkg-info-plist** _id_
> Print extended information about the package in plist format.

**--export-plist** _id_
> Print all receipt information about the package in plist format.

**--files** _id_
> List all files installed under the package.

**--forget** _id_
> Discard all receipt data about the package, without touching installed files.

**--file-info** _path_
> Show the metadata known about a path, including the package that installed it.

**--file-info-plist** _path_
> Show the metadata known about a path in plist format.

**--groups**
> List all package groups on the volume.

**--group-pkgs** _group-id_
> List the packages that are members of a group.

**--pkg-groups** _id_
> List the package groups a package is a member of.

**--expand** _pkg_ _dir_
> Expand a flat package into a new directory.

**--flatten** _dir_ _pkg_
> Flatten a directory into a new flat package.

**--bom** _path_
> Extract BOM files from a flat package into /tmp and print their names.

**--payload-files** _path_
> List the files archived in the payload of an uninstalled flat package.

**--check-signature** _pkg_
> Check the validity and trust of a package's signature.

**--only-files**
> List only files (not directories) in --files output.

**--only-dirs**
> List only directories (not files) in --files output.

**--regexp**
> Match package-id arguments as regular expressions if no exact match is found.

**--volume** _path_
> Operate on the given volume or home directory (default: /).

**-f**, **--force**
> Skip confirmation for destructive or ambiguous operations.

**-v**, **--verbose**
> Human-readable output with extra context.

**-h**, **--help**
> Show a summary of commands and usage.

# DESCRIPTION

**pkgutil** reads and manipulates macOS Installer flat packages and provides access to the receipt database. It lists installed packages, shows package metadata, and lists the files belonging to a package. Options are processed first, and multiple commands run sequentially in the order given.

The **--forget** command removes a package receipt from the database without deleting any installed files, useful for cleaning up stale entries. The **--expand** command extracts a .pkg archive for inspection. Package identifiers use reverse-DNS notation (e.g., com.apple.pkg.Safari).

Note that pkgutil manages receipts only: it cannot install or uninstall packages. Use the system **installer** command for installation and remove files manually to uninstall.

# CAVEATS

macOS-specific. **--forget** does not uninstall anything, and should not be used from an installer script. Receipt storage locations are subject to change, so always query them through pkgutil. Receipts only exist for software installed via .pkg, so drag-installed apps and Homebrew formulae do not appear.

# SEE ALSO

[brew](/man/brew)(1)
