# TAGLINE

Convert BMP images to PNM format

# TLDR

**Convert a BMP image** to PNM format

```bmptopnm [image.bmp] > [output.pnm]```

**Convert from stdin** to stdout

```cat [image.bmp] | bmptopnm > [output.pnm]```

**Convert BMP to PNG** via pipe

```bmptopnm [image.bmp] | pnmtopng > [output.png]```

# SYNOPSIS

**bmptopnm** [**-verbose**] [_bmpfile_]

# PARAMETERS

**-verbose**
> Print additional information about the input file.

# DESCRIPTION

**bmptopnm** reads a Microsoft Windows or OS/2 BMP file as input and produces a PNM (Portable aNyMap) image as output. The output format (PBM, PGM, or PPM) depends on the input: grayscale images produce PGM, color images produce PPM, and monochrome images produce PBM.

This is part of the Netpbm package of image manipulation utilities. Input can be from a file or standard input; output is to standard output.

# CAVEATS

Some BMP variants may not be fully supported. For compressed BMP files, decompression is handled automatically for RLE-encoded images. Very old or non-standard BMP formats may cause errors.

# SEE ALSO

[pnmtobmp](/man/pnmtobmp)(1), [bmptoppm](/man/bmptoppm)(1), [pnmtopng](/man/pnmtopng)(1), [netpbm](/man/netpbm)(1)
