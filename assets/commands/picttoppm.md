# TAGLINE

converts Macintosh PICT images to PPM

# TLDR

**Convert a Macintosh PICT file to PPM**

```picttoppm [input.pict] > [output.ppm]```

**Convert with full resolution output**

```picttoppm -fullres [input.pict] > [output.ppm]```

**Convert with verbose diagnostic output**

```picttoppm -verbose [input.pict] > [output.ppm]```

**Convert a PICT file without the 512-byte header**

```picttoppm -noheader [input.pict] > [output.ppm]```

# SYNOPSIS

**picttoppm** [_options_] [_file_]

# PARAMETERS

**-verbose** _n_
> Print diagnostic information about the PICT file and conversion process. Verbosity level ranges from 0 to 2.

**-fullres**
> Force images to retain their full resolution instead of being scaled down. Disables all PICT operations except images.

**-noheader**
> Do not assume the first 512 bytes of the file are a header. Useful for PICT data not stored in the data fork of a PICT file.

**-quickdraw**
> Execute only pure QuickDraw operations. Disables interpretation of special PostScript printer operations.

**-fontdir** _file_
> Specify a file containing BDF fonts for use when drawing text.

# DESCRIPTION

**picttoppm** reads a Macintosh PICT file (version 1 or 2) and outputs a PPM image. PICT was the native graphics format on classic Mac OS, encoded in QuickDraw commands. Part of the Netpbm toolkit.

# SEE ALSO

[ppmtopict](/man/ppmtopict)(1), [macptopbm](/man/macptopbm)(1)

