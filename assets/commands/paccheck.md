# TAGLINE

checks installed packages for missing files, broken dependencies and modifications on Arch-based systems

# TLDR

**Check** all installed packages (dependencies and basic file info)

```paccheck```

**Check** specific packages

```paccheck [package1] [package2]```

**Check package files** against MTREE data, showing only problems

```paccheck --file-properties --quiet```

**Verify checksums** of all package files

```paccheck --sha256sum --quiet```

**List only** packages with missing files

```paccheck --files --list-broken```

**Check dependencies** of a package recursively

```paccheck --depends --recursive [package]```

**Check packages read from stdin**

```pacman -Qqe | paccheck --files```

# SYNOPSIS

**paccheck** [_options_] [_package_...]

**paccheck** (**--help**|**--version**)

# PARAMETERS

**--quiet**
> Only display messages if a problem is found.

**--list-broken**
> Only print the names of packages that fail the selected checks.

**--recursive**
> Also check the packages' dependencies.

**--depends**
> Check that all dependencies are satisfied.

**--opt-depends**
> Check that all optional dependencies are satisfied.

**--files**
> Check package files against the local database.

**--file-properties**
> Check package files against MTREE data (type, permissions, ownership, size, mtime, link target).

**--md5sum**
> Check file MD5 sums against MTREE data.

**--sha256sum**
> Check file SHA-256 sums against MTREE data.

**--require-mtree**
> Treat missing MTREE data as an error for **--db-files** and/or **--file-properties**.

**--db-files**
> Include package database files in **--files** and **--file-properties** checks.

**--backup**
> Include backup (config) files in modification checks.

**--noextract**
> Include NoExtract files in modification checks.

**--noupgrade**
> Include NoUpgrade files in modification checks.

**--null**[=_sep_]
> Separator for package names read from stdin (default newline, NUL if no value given).

**--config**=_path_, **--dbpath**=_path_, **--root**=_path_, **--sysroot**=_path_
> Use an alternate configuration file, database, installation root or system root.

**--help**
> Display usage information and exit.

**--version**
> Display version information and exit.

# DESCRIPTION

**paccheck** checks installed packages on Arch-based systems. If no packages are given on the command line or stdin, all installed packages are checked. By default only dependencies and basic file information are checked; options enable verification of files, file properties and checksums against the MTREE data recorded by pacman.

It is useful for detecting corruption after disk errors, finding missing or modified files and unsatisfied dependencies, similar to **rpm -V** on RPM-based systems.

# CAVEATS

**paccheck** decides whether to read packages from stdin with a naive **isatty(3)** check. In scripts or shell functions where stdin is not a terminal but holds no package list, close stdin with **<&-**. Backup files are skipped by default because user-edited configs are expected to differ. Checksum checks read every file and can be slow.

# HISTORY

Part of **pacutils**, a collection of helper tools for libalpm and pacman written by **Andrew Gregory**.

# INSTALL

```pacman: sudo pacman -S pacutils```

<!-- packages: 2026-11-07 -->

# SEE ALSO

[pacman](/man/pacman)(8), [pacconf](/man/pacconf)(8), [pacsift](/man/pacsift)(8), [paccapability](/man/paccapability)(1), [rpm](/man/rpm)(8)

# RESOURCES

```[Source code](https://github.com/andrewgregory/pacutils)```

<!-- verified: 2026-11-07 -->
