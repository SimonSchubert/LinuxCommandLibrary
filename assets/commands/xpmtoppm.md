# TAGLINE

Convert XPM pixmaps to PPM format

# TLDR

**Convert XPM to PPM**

```xpmtoppm [input.xpm] > [output.ppm]```

**Extract alpha channel**

```xpmtoppm --alphaout=[alpha.pgm] [input.xpm] > [output.ppm]```

# SYNOPSIS

**xpmtoppm** [_options_] [_file_]

# PARAMETERS

**--alphaout** _file_
> Write alpha channel to file.

# DESCRIPTION

**xpmtoppm** converts X11 pixmap format (.xpm) to PPM. Handles transparency and color-mapped images. Part of Netpbm toolkit.

# SEE ALSO

[ppmtoxpm](/man/ppmtoxpm)(1), [xbmtopbm](/man/xbmtopbm)(1)

