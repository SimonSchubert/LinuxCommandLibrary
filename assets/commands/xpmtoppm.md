# TAGLINE

Convert XPM pixmaps to PPM format

# TLDR

Convert an **XPM** image to **PPM**

```xpmtoppm [input.xpm] > [output.ppm]```

Read from **standard input**

```cat [input.xpm] | xpmtoppm > [output.ppm]```

Extract the **alpha (transparency) channel** to a separate PBM file

```xpmtoppm --alphaout=[alpha.pbm] [input.xpm] > [output.ppm]```

# SYNOPSIS

**xpmtoppm** [_options_] [_file_]

# PARAMETERS

**--alphaout=**_file_
> Write the transparency mask to the specified PBM file. If the input has no transparency information, the file contains all white (opaque) values. Specify `-` to write the alpha output to standard output instead of the image.

# DESCRIPTION

**xpmtoppm** reads an X11 pixmap (XPM version 1 or 3) as input and produces a PPM image as output. It handles transparency and color-mapped images. Part of the Netpbm toolkit.

# CAVEATS

Only a limited set of XPM version 3 features are supported; many valid XPM images may be rejected. Input lines longer than 8K characters cause an error.

# SEE ALSO

[ppmtoxpm](/man/ppmtoxpm)(1), [xbmtopbm](/man/xbmtopbm)(1), [netpbm](/man/netpbm)(1)

