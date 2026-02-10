# TAGLINE

creates EROFS images from a directory tree

# TLDR

Create an **EROFS filesystem** based on the root directory

```mkfs.erofs [image.erofs] [root/]```

Create an EROFS image with a **specific UUID**

```mkfs.erofs -U [UUID] [image.erofs] [root/]```

Create a **compressed** EROFS image

```mkfs.erofs -zlz4hc [image.erofs] [root/]```

Create an EROFS image where **all files are owned by root**

```mkfs.erofs --all-root [image.erofs] [root/]```

# SYNOPSIS

**mkfs.erofs** [_options_] _image_ _source_

# PARAMETERS

**-U _uuid_**
> Set a specific filesystem UUID

**-z _algorithm_**
> Enable compression (lz4, lz4hc, lzma, deflate, zstd)

**--all-root**
> Make all files owned by root (UID/GID 0)

**-L _label_**
> Set the volume label

**-T _timestamp_**
> Use a fixed timestamp for all files (reproducible builds)

**--exclude-path _pattern_**
> Exclude files matching the pattern

**-E _options_**
> Extended options for fine-tuning

# DESCRIPTION

**mkfs.erofs** creates EROFS (Enhanced Read-Only File System) images from a directory tree. EROFS is a lightweight read-only filesystem designed for performance-sensitive scenarios like Android system partitions, container images, and embedded systems.

The filesystem supports transparent compression, enabling significant space savings while maintaining fast random read access. Unlike SquashFS, EROFS provides better random access performance due to its fixed-size block design.

Output is a file containing the complete filesystem image, suitable for mounting via loopback or writing to a read-only partition.

# CAVEATS

EROFS is read-only; the source directory is not modified. Large directories may take time to process with compression enabled. Kernel support (CONFIG_EROFS_FS) is required to mount images. Best suited for scenarios where data doesn't change after creation.

# HISTORY

EROFS was developed by Huawei and merged into the Linux kernel in version 4.19 (2018). It has since been adopted by Android for system partitions and various embedded Linux distributions.

# SEE ALSO

[mksquashfs](/man/mksquashfs)(1), [mount](/man/mount)(8), [losetup](/man/losetup)(8)
