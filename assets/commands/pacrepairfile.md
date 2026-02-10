# TAGLINE

resets properties on files managed by alpm

# TLDR

Search for package and **reset file properties**

```pacrepairfile path/to/file --package```

Reset a file **quietly**

```pacrepairfile package_name --quiet --package```

Reset specific **file properties** (mode, uid, gid, or mtime)

```pacrepairfile package_name --mode --package```

Display **help**

```pacrepairfile --help```

# SYNOPSIS

**pacrepairfile** [_options_] _target_

# PARAMETERS

**--package**
> Search for the package owning the file

**--mode**
> Reset file permissions mode

**--uid**
> Reset file owner UID

**--gid**
> Reset file group GID

**--mtime**
> Reset file modification time

**--quiet**
> Suppress non-essential output

**--help**
> Display help message

**--version**
> Display version information

# DESCRIPTION

**pacrepairfile** resets properties on files managed by alpm (Arch Linux Package Manager). It can restore file permissions, ownership, and modification times to their original values as recorded in the package database.

This is useful when file properties have been accidentally changed or corrupted.

# CAVEATS

Only works on files tracked by installed packages. Cannot repair files that were never part of a package.

# HISTORY

Part of **pacutils**, a collection of utilities for Arch Linux package management built on libalpm.

# SEE ALSO

[pacman](/man/pacman)(8), [pacrepairdb](/man/pacrepairdb)(1)
