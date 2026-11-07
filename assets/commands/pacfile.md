# TAGLINE

displays file information from the local pacman package database

# TLDR

Display information about **package files**

```pacfile [path/to/file_or_directory]```

**Compare** database values to the file system

```pacfile --check [path/to/file_or_directory]```

Limit output to files of a **specific package**

```pacfile --package [package] [path/to/file]```

Display **help**

```pacfile --help```

Display **version**

```pacfile --version```

# SYNOPSIS

**pacfile** [_options_] _path_...

# PARAMETERS

**--check**
> Compare database values against file system state

**--package** _pkgname_
> Limit information to the specified package; may be given multiple times

**--config** _file_
> Use alternate pacman configuration file

**--dbpath** _path_
> Use alternate database path

**--root** _path_
> Use alternate installation root

**--sysroot** _path_
> Use alternate system root (see pacutils-sysroot(7))

**--help**
> Display help information

**--version**
> Display version information

# DESCRIPTION

**pacfile** displays information about files from the local pacman database: the owning package(s), file type, and recorded metadata such as permissions, owner, size, modification time and checksums (from mtree data). With **--check**, the recorded values are compared against the file on disk to reveal modifications.

The tool is useful for troubleshooting file ownership conflicts, verifying file integrity, and understanding package relationships. It reads from pacman's local database to provide accurate ownership information.

# CAVEATS

Only shows information for files tracked in the pacman database. Files installed outside of pacman will show no ownership. Comparison checks may flag expected modifications (like edited configuration files).

# HISTORY

Part of **pacutils**, a collection of utilities for pacman developed by Andrew Gregory. Provides detailed file-level queries beyond what pacman's built-in query options offer.

# INSTALL

```pacman: sudo pacman -S pacutils```

<!-- packages: 2026-11-07 -->

# SEE ALSO

[pacman](/man/pacman)(8), [paccheck](/man/paccheck)(8), [pkgfile](/man/pkgfile)(1), [pacman-query](/man/pacman-query)(8)

# RESOURCES

```[Source code](https://github.com/andrewgregory/pacutils)```

<!-- verified: 2026-11-07 -->
