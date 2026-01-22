# TLDR

Create squashfs from **tar archive**

```sqfstar < [archive.tar] [filesystem.squashfs]```

Create with **specific compression**

```zcat [archive.tar.gz] | sqfstar -comp [gzip|lzo|lz4|xz|zstd] [filesystem.squashfs]```

Create and **exclude files**

```xzcat [archive.tar.xz] | sqfstar [filesystem.squashfs] [file1] [file2]```

Exclude by **pattern**

```zstdcat [archive.tar.zst] | sqfstar [filesystem.squashfs] "*.gz"```

Exclude by **regex**

```lz4cat [archive.tar.lz4] | sqfstar [filesystem.squashfs] -regex "[pattern]"```

Set **block size**

```cat [archive.tar] | sqfstar -b [131072] [filesystem.squashfs]```

# SYNOPSIS

**sqfstar** [_OPTIONS_] _FILESYSTEM_ [_exclude_files_...]

# PARAMETERS

**-comp** _compressor_
> Compression algorithm: gzip, lzo, lz4, xz, zstd, lzma

**-b** _block_size_
> Block size in bytes (4K-1MB, default: 128K)

**-noI**
> Do not compress inode table

**-noD**
> Do not compress data blocks

**-noF**
> Do not compress fragment blocks

**-no-duplicates**
> Do not detect duplicate files

**-all-root**
> Make all files owned by root

**-force-uid** _uid_
> Set all file UIDs

**-force-gid** _gid_
> Set all file GIDs

**-regex**
> Treat exclude patterns as POSIX regex

**-ignore-zeros**
> Allow concatenated tar archives

**-mkfs-time** _time_
> Set filesystem creation time

**-all-time** _time_
> Set all inode timestamps

**-processors** _num_
> Number of processors to use

**-mem** _size_
> Set memory limit

**-progress**
> Show progress bar

**-info**
> Print files as they are added

# DESCRIPTION

**sqfstar** creates a squashfs filesystem directly from a tar archive read from stdin. Squashfs is a highly compressed read-only filesystem supporting multiple compression algorithms with block sizes from 4K to 1MB.

The tool is useful for converting tar archives to squashfs without intermediate extraction. Compressed tar archives should be decompressed before piping (using zcat, xzcat, etc.). Files can be excluded by name, wildcard pattern, or regex.

# CAVEATS

Input must be tar format; compressed tars need external decompression. Squashfs is read-only after creation. Large archives require significant memory during creation. Block size affects compression ratio and random access performance.

# HISTORY

**sqfstar** is part of **squashfs-tools**, created by **Phillip Lougher**. The sqfstar utility was added to provide direct tar-to-squashfs conversion without intermediate files. Squashfs is widely used in Linux distributions for live systems, snap packages, and container images.

# SEE ALSO

[mksquashfs](/man/mksquashfs)(1), [unsquashfs](/man/unsquashfs)(1), [sqfscat](/man/sqfscat)(1), [tar](/man/tar)(1)
