# TAGLINE

displays information about files in the pacman database, showing which package

# TLDR

Display information about **package files**

```pacfile [path/to/file_or_directory]```

**Compare** database values to the file system

```pacfile [path/to/file_or_directory] --check```

Display **help**

```pacfile --help```

Display **version**

```pacfile --version```

# SYNOPSIS

**pacfile** [_options_] _path_...

# PARAMETERS

**--check**
> Compare database values against file system state

**--package** _pkg_
> Restrict output to files owned by specified package

**--config** _file_
> Use alternate pacman configuration file

**--dbpath** _path_
> Use alternate database path

**--root** _path_
> Use alternate installation root

**--help**
> Display help information

**--version**
> Display version information

# DESCRIPTION

**pacfile** displays information about files in the pacman database, showing which package owns a file and comparing stored metadata against the current file system state. It can identify modified files, missing files, and ownership information.

The tool is useful for troubleshooting file ownership conflicts, verifying file integrity, and understanding package relationships. It reads from pacman's local database to provide accurate ownership information.

# CAVEATS

Only shows information for files tracked in the pacman database. Files installed outside of pacman will show no ownership. Comparison checks may flag expected modifications (like edited configuration files).

# HISTORY

Part of **pacutils**, a collection of utilities for pacman developed by Andrew Gregory. Provides detailed file-level queries beyond what pacman's built-in query options offer.

# SEE ALSO

[pacman](/man/pacman)(8), [paccheck](/man/paccheck)(8), [pkgfile](/man/pkgfile)(1)
