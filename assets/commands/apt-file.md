# TLDR

**Update** the metadata database

```sudo apt update```

**Search** for packages that contain a file or path

```apt-file search [path/to/file]```

**List** the contents of a specific package

```apt-file show [package]```

Search for packages that match a **regex**

```apt-file search -x [regex]```

# SYNOPSIS

**apt-file** [_options_] _command_ [_pattern_]

# DESCRIPTION

**apt-file** searches for files in apt packages, including packages that are not yet installed. This is useful for finding which package provides a specific file or command.

# PARAMETERS

**search, find pattern**
> Search for packages containing files matching pattern

**show, list package**
> List the contents of a specific package

**update**
> Update the package contents cache (usually via apt update)

**-x, --regexp**
> Treat pattern as a regular expression

**-l, --package-only**
> Only show package names, not file paths

**-F, --fixed-string**
> Do not treat pattern as a regex (faster)

**-i, --ignore-case**
> Case-insensitive search

**-a, --architecture arch**
> Search for a specific architecture

# CAVEATS

Requires the apt-file package to be installed. The database must be updated before searching.

# HISTORY

Part of the **APT** (Advanced Package Tool) ecosystem for Debian-based systems.

# SEE ALSO

[apt](/man/apt)(8), [apt-cache](/man/apt-cache)(8), [dpkg](/man/dpkg)(1)
