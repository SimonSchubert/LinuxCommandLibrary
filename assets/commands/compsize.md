# TAGLINE

report btrfs filesystem compression ratios

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

**compsize** is a specialized utility for btrfs filesystems that reports detailed statistics on transparent filesystem compression. Btrfs supports multiple compression algorithms (zlib, lzo, zstd) that can compress data on-the-fly, and compsize reveals how much space is actually being saved versus the apparent uncompressed file sizes.

The tool operates by examining btrfs extent metadata to determine both the logical size (what applications see) and the physical disk space consumed. It breaks down the results by compression type, showing which algorithm is achieving what compression ratio. This is invaluable for evaluating whether compression is providing value, as some file types (already compressed images, videos) may show little to no benefit and could even waste CPU cycles.

Running compsize requires root privileges because it needs low-level access to filesystem extent information through btrfs ioctls. Results are typically displayed showing total bytes, compressed bytes, and the compression ratio as a percentage. The tool can operate on individual files, directories, or entire subvolumes, making it useful for identifying which parts of a filesystem benefit most from compression.

# PARAMETERS

**-x, --one-file-system**
> Don't cross filesystem boundaries

**-b, --bytes**
> Show raw byte counts

# CAVEATS

Only works on btrfs filesystems. Requires root privileges to access extent information. Results depend on file content and compression algorithm.

# SEE ALSO

[btrfs-filesystem](/man/btrfs-filesystem)(8), [btrfs](/man/btrfs)(8), [df](/man/df)(1)
