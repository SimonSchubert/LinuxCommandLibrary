# TAGLINE

creates a Flash-Friendly File System on block devices

# TLDR

Create an **F2FS filesystem** inside partition Y on device X

```sudo mkfs.f2fs [/dev/sdXY]```

Create an F2FS filesystem with a **volume label**

```sudo mkfs.f2fs -l [volume_label] [/dev/sdXY]```

Create an F2FS filesystem with **encryption support** enabled

```sudo mkfs.f2fs -O encrypt [/dev/sdXY]```

Create an F2FS filesystem with **compression** enabled

```sudo mkfs.f2fs -O compress [/dev/sdXY]```

**Force** creation by overwriting an existing filesystem

```sudo mkfs.f2fs -f [/dev/sdXY]```

# SYNOPSIS

**mkfs.f2fs** [**-l** _label_] [**-a** _0|1_] [**-o** _overprovision-ratio_] [**-s** _#-of-segments-per-section_] [**-z** _#-of-sections-per-zone_] [**-e** _cold-file-extensions_] [**-E** _hot-file-extensions_] [**-w** _sector-size_] [**-R** _root-uid:root-gid_] [**-f**] [**-q**] [**-O** _feature_] [**-c** _device_] _device_ [_size_]

# PARAMETERS

**-l _label_**
> Set the volume label for the filesystem

**-a _0|1_**
> Use heap-based block allocation (1) or not (0); default is 1

**-o _ratio_**
> Set overprovision ratio as a percentage; default is 5%

**-s _segments_**
> Number of segments per section; default is 1

**-z _sections_**
> Number of sections per zone; default is 1

**-e _extensions_**
> Extensions for cold files (e.g., multimedia files)

**-E _extensions_**
> Extensions for hot files (e.g., database files)

**-w _size_**
> Sector size in bytes

**-R _uid:gid_**
> Set root directory owner UID and GID

**-f**
> Force overwrite if filesystem already exists on device

**-q**
> Quiet mode; suppress output messages

**-O _feature_**
> Enable filesystem features: encrypt, compress, quota, verity, casefold

**-c _device_**
> Add additional device for multi-device volume (up to 7 devices)

**-t _0|1_**
> Set discard policy; 1 enables discard support

**-d _level_**
> Set debug level for verbose output

**-T _timestamp_**
> Set inode timestamps to specified value

**-S**
> Enable sparse mode for creating image files

# DESCRIPTION

**mkfs.f2fs** creates a Flash-Friendly File System (F2FS) on block devices. F2FS is a modern filesystem designed specifically for flash-based storage like SSDs, eMMC, and SD cards.

The filesystem employs log-structured design principles optimized for NAND flash characteristics, providing better performance and extended device lifespan compared to traditional filesystems on flash media. It supports features like inline data, inline directories, extent-based mapping, and atomic writes.

When creating a filesystem, the tool partitions the device into segments, sections, and zones for efficient garbage collection and wear leveling. The overprovision ratio reserves space for this purpose. Exit status is 0 on success, 1 on failure.

# CAVEATS

F2FS requires a minimum device size and may not work on very small partitions. The overprovision ratio directly impacts available space versus performance and device longevity. Enabling multiple features simultaneously increases metadata overhead. Multi-device volumes require all devices to be available for mounting.

# HISTORY

F2FS was developed by **Samsung Electronics** and introduced in the **Linux kernel 3.8** in **2012**. It was designed from scratch to address the unique characteristics of flash-based storage devices, focusing on performance optimization and wear leveling to extend device lifespan.

# SEE ALSO

[mkfs](/man/mkfs)(8), [fsck.f2fs](/man/fsck.f2fs)(8), [dump.f2fs](/man/dump.f2fs)(8), [resize.f2fs](/man/resize.f2fs)(8)
