# TAGLINE

save ext filesystem metadata images

# TLDR

Write metadata to **file**

```e2image [/dev/sdXN] [path/to/image_file]```

Print metadata to **stdout**

```e2image [/dev/sdXN] -```

**Restore** metadata to device

```e2image -I [/dev/sdXN] [path/to/image_file]```

Create **raw sparse** image

```e2image -r [/dev/sdXN] [path/to/image_file]```

Create **QCOW2** image

```e2image -Q [/dev/sdXN] [path/to/image_file]```

Create raw image with **scrambled** directory entries (for bug reports)

```e2image -r -s [/dev/sdXN] - | bzip2 > [hda1.e2i.bz2]```

# SYNOPSIS

**e2image** [_options_] _device_ _image-file_

# DESCRIPTION

**e2image** saves critical ext2/ext3/ext4 filesystem metadata to a file. This is useful for backing up filesystem structure for disaster recovery or debugging filesystem corruption issues.

The image file contains only metadata (superblock, block groups, inode tables, etc.), not file contents, making it much smaller than a full backup. This allows filesystem experts to diagnose problems without access to the actual data or the need to copy entire filesystems.

# PARAMETERS

**-I**
> Restore metadata from image to device

**-r**
> Create raw sparse image (metadata at proper offsets)

**-Q**
> Create QCOW2 format image

**-a**
> Include all data (not just metadata)

**-f**
> Force operation even if the filesystem is mounted (result may be unreliable)

**-s**
> Scramble directory entries and zero unused directory block portions

**-o** _src_offset_
> Offset in bytes where the filesystem starts on the source device

**-O** _dest_offset_
> Offset to seek to in the destination before writing

**-b** _blocksize_
> Set filesystem blocksize in bytes (normally auto-detected)

**-p**
> Compare blocks before writing; skip identical blocks (useful for flash storage)

# CAVEATS

Does not backup file contents by default. Part of e2fsprogs. Useful for debugging and recovery scenarios. QCOW2 format is compatible with QEMU. The -f flag allows imaging a mounted filesystem but the result is likely unreliable.

# SEE ALSO

[dumpe2fs](/man/dumpe2fs)(8), [e2fsck](/man/e2fsck)(8), [debugfs](/man/debugfs)(8), [tune2fs](/man/tune2fs)(8)
