# TAGLINE

save ext filesystem metadata images

# TLDR

Write metadata to **file**

```e2image [/dev/sdXN] [path/to/image_file]```

Print metadata to **stdout**

```e2image [/dev/sdXN] -```

**Restore** metadata to device

```e2image -I [/dev/sdXN] [path/to/image_file]```

Create **raw sparse** file

```e2image -r [/dev/sdXN] [path/to/image_file]```

Create **QCOW2** image

```e2image -Q [/dev/sdXN] [path/to/image_file]```

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

# CAVEATS

Does not backup file contents by default. Part of e2fsprogs. Useful for debugging and recovery scenarios. QCOW2 format is compatible with QEMU.

# SEE ALSO

[dumpe2fs](/man/dumpe2fs)(8), [e2fsck](/man/e2fsck)(8), [debugfs](/man/debugfs)(8)
