# TAGLINE

CPIO firmware image creator

# TLDR

Create a **CPIO archive** from current directory

```create-image -o [path/to/output.cpio]```

Display **help**

```create-image -h```

# SYNOPSIS

**create-image** [_options_]

# DESCRIPTION

**create-image** creates CPIO images from the current directory. It is part of the BlueZ Bluetooth stack tools and is used for creating firmware images.

The tool packages directory contents into the CPIO archive format commonly used for initramfs and firmware images.

# PARAMETERS

**-o, --output** _file_
> Output file path

**-h, --help**
> Display help information

# CAVEATS

Part of BlueZ tools. Works on the current directory contents. CPIO format is uncompressed; use gzip separately if needed.

# SEE ALSO

[cpio](/man/cpio)(1), [find](/man/find)(1)
