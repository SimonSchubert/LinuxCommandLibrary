# TAGLINE

Virtual disk image format conversion

# TLDR

Mount **raw to DMG**

```xmount --in raw [path/to/image.dd] --out dmg [mountpoint]```

Mount **EWF to VHD** with cache

```xmount --cache [path/to/cache.ovl] --in ewf [path/to/image.E??] --out vhd [mountpoint]```

Mount **partition** at offset

```xmount --offset 2048 --in raw [path/to/image.dd] --out raw [mountpoint]```

# SYNOPSIS

**xmount** [_OPTIONS_] --in _FORMAT_ _IMAGE_ --out _FORMAT_ _MOUNTPOINT_

# PARAMETERS

**--in** _FORMAT_ _IMAGE_
> Input format and image file (raw, ewf, aff, etc.)

**--out** _FORMAT_
> Output format (raw, dmg, vhd, vdi, vmdk)

**--cache** _FILE_
> Write cache file for modifications

**--offset** _SECTORS_
> Offset to partition in sectors

**--sizelimit** _BYTES_
> Limit virtual image size

# DESCRIPTION

**xmount** creates virtual disk images using FUSE, converting between formats on-the-fly. It's useful for forensic analysis, allowing read-only access to disk images in different formats.

Write cache support enables modifications without altering the original image.

# CAVEATS

Requires FUSE support. Some format conversions may not support all features. Used primarily for forensic and virtualization purposes.

# SEE ALSO

[mount](/man/mount)(8), [losetup](/man/losetup)(8), [qemu-img](/man/qemu-img)(1)
