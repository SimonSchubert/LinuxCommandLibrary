# TAGLINE

creates EROFS images from a directory tree

# TLDR

Build an image from a **directory tree**

```mkfs.erofs [image.erofs] [path/to/root]```

Compress it with **LZ4 HC**

```mkfs.erofs -zlz4hc [image.erofs] [path/to/root]```

Compress with **LZMA**, which packs smaller but builds slower

```mkfs.erofs -zlzma [image.erofs] [path/to/root]```

Pick the **compression level**

```mkfs.erofs -zlz4hc,[12] [image.erofs] [path/to/root]```

Set the **block size**

```mkfs.erofs -b [4096] [image.erofs] [path/to/root]```

Pin the **UUID**, which reproducible builds need

```mkfs.erofs -U [uuid] [image.erofs] [path/to/root]```

Pin the **timestamp** as well

```mkfs.erofs -T [1700000000] -U [uuid] [image.erofs] [path/to/root]```

Make every file **owned by root**

```mkfs.erofs --all-root [image.erofs] [path/to/root]```

**Leave a path out** of the image

```mkfs.erofs --exclude-path=[path/to/skip] [image.erofs] [path/to/root]```

Exclude by **pattern**

```mkfs.erofs --exclude-regex=[\.git.*] [image.erofs] [path/to/root]```

Build straight from a **tarball**

```mkfs.erofs --tar=f [image.erofs] [path/to/archive.tar]```

Record **SELinux labels** from a file_contexts file

```mkfs.erofs --file-contexts=[path/to/file_contexts] [image.erofs] [path/to/root]```

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

# INSTALL

```apt: sudo apt install erofs-utils```

```dnf: sudo dnf install erofs-utils```

```pacman: sudo pacman -S erofs-utils```

```apk: sudo apk add erofs-utils```

```zypper: sudo zypper install erofs-utils```

```brew: brew install erofs-utils```

```nix: nix profile install nixpkgs#erofs-utils```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[mksquashfs](/man/mksquashfs)(1), [mount](/man/mount)(8), [losetup](/man/losetup)(8)
