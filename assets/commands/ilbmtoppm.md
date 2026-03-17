# TAGLINE

Convert an IFF ILBM file into a PPM image

# TLDR

**Convert an ILBM file to PPM**

```ilbmtoppm [file.ilbm] > [output.ppm]```

**Convert from stdin**

```cat [file.ilbm] | ilbmtoppm > [output.ppm]```

**Convert only the color map, not the image**

```ilbmtoppm -cmaponly [file.ilbm] > [output.ppm]```

**Convert with verbose output**

```ilbmtoppm -verbose [file.ilbm] > [output.ppm]```

**Force interpretation as HAM format**

```ilbmtoppm -isham [file.ilbm] > [output.ppm]```

# SYNOPSIS

**ilbmtoppm** [_options_] [_ilbmfile_]

# PARAMETERS

**-verbose**
> Display information about the ILBM file during conversion.

**-ignore** _chunkID_
> Skip the specified 4-letter IFF chunk during processing.

**-isham**
> Treat the input as a HAM (Hold-And-Modify) picture, even if the CAMG chunk does not indicate this.

**-isnotham**
> Do not treat the input as HAM, even if the CAMG chunk indicates it.

**-isehb**
> Treat the input as Extra_Halfbrite (EHB), even if not indicated in the CAMG chunk.

**-isnotehb**
> Do not treat the input as EHB.

**-isdeep**
> Treat the input as a deep (direct color) image.

**-isnotdeep**
> Do not treat the input as a deep image.

**-cmaponly**
> Output a PPM of the color map only, not the image itself.

**-adjustcolors**
> Scale the color map to 8 bits per channel.

**-transparent** _color_
> Set the transparency color.

**-maskfile** _filename_
> Write the transparency mask to the specified PBM file.

# DESCRIPTION

**ilbmtoppm** converts an IFF ILBM (Interleaved Bitmap) file to PPM (Portable Pixmap) format. ILBM was the standard image format on Amiga computers.

The program handles normal ILBMs with 1-16 planes, Amiga Extra_Halfbrite (EHB), Amiga HAM with 3-16 planes, Multipalette pictures (normal or HAM), color map only images, and unofficial direct color formats. It is part of the **Netpbm** package of graphics manipulation tools.

# CAVEATS

Some ILBM files use non-standard or unofficial extensions that may not be correctly auto-detected. Use the **-isham**, **-isehb**, or **-isdeep** flags to force the correct interpretation when auto-detection fails.

# SEE ALSO

[ppmtoilbm](/man/ppmtoilbm)(1), [netpbm](/man/netpbm)(1)

