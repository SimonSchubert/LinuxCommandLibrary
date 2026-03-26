# TAGLINE

list directory contents in columns

# TLDR

**List files** in the current directory in columns

```dir```

**List all files** including hidden files

```dir -a```

**List with detailed** information in long format

```dir -l```

**List with human-readable** file sizes

```dir -lh```

**List sorted by modification time** (newest first)

```dir -t```

**List sorted by file size** (largest first)

```dir -S```

**List recursively** including subdirectories

```dir -R```

# SYNOPSIS

**dir** [_options_] [_files..._]

# DESCRIPTION

**dir** lists directory contents, equivalent to **ls -C -b**. By default, files are listed in columns sorted vertically, and non-graphic characters are displayed as C-style backslash escape sequences.

Unlike **ls**, which changes its output format depending on whether output goes to a terminal or a pipe, **dir** always produces columnar output with escaped special characters. This makes it more predictable for scripting.

The command is part of GNU coreutils and accepts the same options as **ls**.

# PARAMETERS

**-a, --all**
> Include hidden files (starting with .)

**-A, --almost-all**
> Like -a but exclude . and ..

**-l**
> Long listing format with details

**-h, --human-readable**
> Human-readable file sizes (1K, 234M, 2G)

**-t**
> Sort by modification time (newest first)

**-S**
> Sort by file size (largest first)

**-r, --reverse**
> Reverse sort order

**-R, --recursive**
> List subdirectories recursively

**-d, --directory**
> List directories themselves, not their contents

**-F, --classify**
> Append indicator (*/=>@|) to entries

**-i, --inode**
> Print inode number of each file

**-s, --size**
> Print allocated size of each file in blocks

**--color**[=_WHEN_]
> Colorize output (always, auto, never)

# CAVEATS

Equivalent to **ls -C -b**. GNU coreutils specific; not available on all Unix systems. Use **ls** for maximum portability.

# HISTORY

**dir** is part of **GNU coreutils**, written by Richard M. Stallman and David MacKenzie. It provides consistent columnar output with escaped special characters regardless of output destination.

# SEE ALSO

[ls](/man/ls)(1), [vdir](/man/vdir)(1), [tree](/man/tree)(1), [find](/man/find)(1)
