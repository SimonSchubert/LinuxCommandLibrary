# TLDR

Calculate **compression ratio** for file or directory

```sudo compsize [path/to/file_or_directory]```

Don't traverse **filesystem boundaries**

```sudo compsize -x [path/to/file_or_directory]```

Show **raw byte counts** instead of human-readable sizes

```sudo compsize -b [path/to/file_or_directory]```

# SYNOPSIS

**compsize** [_options_] _path_...

# DESCRIPTION

**compsize** reports the compression ratio achieved on btrfs filesystems. It shows the actual disk space used versus the apparent size of files, broken down by compression algorithm.

Useful for evaluating the effectiveness of btrfs compression settings.

# PARAMETERS

**-x, --one-file-system**
> Don't cross filesystem boundaries

**-b, --bytes**
> Show raw byte counts

# CAVEATS

Only works on btrfs filesystems. Requires root privileges to access extent information. Results depend on file content and compression algorithm.

# SEE ALSO

[btrfs-filesystem](/man/btrfs-filesystem)(8), [btrfs](/man/btrfs)(8), [df](/man/df)(1)
