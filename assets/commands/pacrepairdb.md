# TAGLINE

fixes corrupted database entries in the libalpm database

# TLDR

Perform a **basic repair** on a specific package

```sudo pacrepairdb [package]```

Update database entries **without extracting** packages

```sudo pacrepairdb --dbonly [package]```

**Preview** packages to be repaired and the cached files to be used

```sudo pacrepairdb --print-only [package]```

Display additional **progress** information

```sudo pacrepairdb --verbose [package]```

**Find and reinstall** all broken packages

```paccheck --list-broken --files --file-properties --db-files --require-mtree | sudo pacrepairdb```

Display **help**

```pacrepairdb --help```

# SYNOPSIS

**pacrepairdb** [_options_] _package_...

# PARAMETERS

**--cachedir=**_path_
> Set an alternate cache directory path.

**--config=**_path_
> Set an alternate configuration file path.

**--dbonly**
> Update database entries without extracting or removing packages

**--dbpath=**_path_
> Set an alternate database path.

**--debug**
> Display additional debugging information.

**--hookdir**
> Add additional user hook directories.

**--logfile=**_path_
> Set an alternate log file path.

**--no-confirm**
> Assume default responses to all prompts.

**--no-scriptlet**
> Do not run package install scripts.

**--no-hooks**
> Do not run transaction hooks.

**--no-timeout**
> Disable low-speed timeouts for downloads.

**--print-only**
> Display the packages to be repaired and the cache packages to be used, then exit

**--root=**_path_
> Set an alternate installation root.

**--sysroot=**_path_
> Set an alternate system root.

**--verbose**
> Show additional progress information

**--help**
> Display help message

**--version**
> Display version information

# DESCRIPTION

**pacrepairdb** fixes corrupted database entries in the libalpm database. Any missing essential files are created and the packages are then reinstalled from the cache.

This tool is useful when package database entries become corrupted due to interrupted transactions or filesystem issues. If stdin is not connected to a terminal, package names are read from stdin.

# CAVEATS

All packages being repaired must be in the cache. Cached packages matching an installed package's name and version are assumed to be identical and are not validated, so a mismatched file can worsen database problems. Leftover orphaned files are not detected.

When called from a script or function where stdin is not a terminal but holds no package names, close stdin with **<&-**.

# HISTORY

Part of **pacutils**, a collection of utilities for Arch Linux package management built on libalpm.

# INSTALL

```pacman: sudo pacman -S pacutils```

<!-- packages: 2026-11-08 -->

# SEE ALSO

[pacman](/man/pacman)(8), [pacrepairfile](/man/pacrepairfile)(1), [paccheck](/man/paccheck)(1)

# RESOURCES

```[Source code](https://github.com/andrewgregory/pacutils)```

```[Documentation](https://man.archlinux.org/man/pacrepairdb.1)```

<!-- verified: 2026-11-08 -->
