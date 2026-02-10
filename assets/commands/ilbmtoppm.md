# TAGLINE

converts an IFF ILBM file to PPM format

# TLDR

**Convert ILBM to PPM**

```ilbmtoppm [file.ilbm] > [output.ppm]```

**Convert from stdin**

```cat [file.ilbm] | ilbmtoppm > [output.ppm]```

# SYNOPSIS

**ilbmtoppm** [_options_] [_ilbmfile_]

# PARAMETERS

**-verbose**
> Verbose output.

**-ignore**
> Ignore unsupported chunks.

# DESCRIPTION

**ilbmtoppm** converts an IFF ILBM (Interleaved Bitmap) file to PPM (Portable Pixmap) format. ILBM was the standard image format on Amiga computers. Part of the Netpbm package of graphics manipulation tools.

# SEE ALSO

[ppmtoilbm](/man/ppmtoilbm)(1), [netpbm](/man/netpbm)(1)

