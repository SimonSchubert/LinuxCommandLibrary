# TLDR

**Copy an image to a device** using bmap

```sudo bmaptool copy [image.img] [/dev/sdX]```

**Copy a compressed image**

```sudo bmaptool copy [image.img.xz] [/dev/sdX]```

**Copy with explicit bmap file**

```sudo bmaptool copy --bmap [image.bmap] [image.img] [/dev/sdX]```

**Copy without bmap** (falls back to dd-like behavior)

```sudo bmaptool copy --nobmap [image.img] [/dev/sdX]```

**Create a bmap file** for an image

```bmaptool create -o [image.bmap] [image.img]```

**Copy from a URL**

```sudo bmaptool copy [https://example.com/image.img.xz] [/dev/sdX]```

# SYNOPSIS

**bmaptool** _command_ [_options_] [_arguments_]

# DESCRIPTION

**bmaptool** is a utility for creating block maps (bmap) and copying images to block devices efficiently. It only writes data blocks, skipping empty or zero-filled areas, making it significantly faster than **dd** for sparse images.

The tool provides integrity verification using SHA256 checksums and includes safety features to prevent accidental writes to mounted devices. It supports compressed images and can decompress on-the-fly during copy operations.

# SUBCOMMANDS

**copy**
> Copy an image file to a block device using bmap

**create**
> Generate a bmap file for an image

# PARAMETERS

**--bmap** _file_
> Path to the bmap file (auto-detected if not specified)

**--nobmap**
> Copy without using bmap (entire image is written)

**-o, --output** _file_
> Output file for create command

**--no-verify**
> Skip SHA256 checksum verification

**--no-sig-verify**
> Skip OpenPGP signature verification

# CAVEATS

Requires root privileges for writing to block devices. The bmap file must match the image file; mismatches cause verification failures. Protection mechanisms prevent writing to mounted devices. Without a bmap file, the tool falls back to copying the entire image like dd.

# HISTORY

bmaptool was developed by the **Yocto Project** and **Intel** for efficient embedded Linux image deployment. It was designed to address the slow and unsafe nature of using **dd** for flashing large disk images, particularly those with significant empty space.

# SEE ALSO

[dd](/man/dd)(1), [pv](/man/pv)(1), [xzcat](/man/xzcat)(1)
