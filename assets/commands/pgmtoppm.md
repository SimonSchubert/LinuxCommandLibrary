# TAGLINE

converts a PGM grayscale image to a PPM color image

# TLDR

**Convert grayscale to color**

```pgmtoppm [color] [input.pgm] > [output.ppm]```

**Colorize with specific color**

```pgmtoppm [red] [input.pgm] > [output.ppm]```

**Map black-white to color range**

```pgmtoppm [black]-[blue] [input.pgm] > [output.ppm]```

**Use color map file**

```pgmtoppm -map [colormap.ppm] [input.pgm] > [output.ppm]```

# SYNOPSIS

**pgmtoppm** _colorspec_ [_pgmfile_]

**pgmtoppm** **-map** _mapfile_ [_pgmfile_]

# PARAMETERS

**colorspec**
> Color name or black-white range (e.g., "red", "black-blue").

**-map** _file_
> Color map file.

# DESCRIPTION

**pgmtoppm** converts a PGM grayscale image to a PPM color image. It maps gray values to colors, either a single color, a color range, or via a colormap.
# Grayscale to red tint
pgmtoppm red image.pgm > red.ppm

# Map to blue gradient
pgmtoppm black-blue image.pgm > blue.ppm

# Heat map style
pgmtoppm blue-red image.pgm > heat.ppm

# Using hex colors
pgmtoppm "#000000-#ff5500" image.pgm > orange.ppm

# From color map
pgmtoppm -map palette.ppm image.pgm > colored.ppm
```

# COLOR FORMATS

```
Color names: red, blue, green, yellow...
Hex: #rrggbb
RGB: rgb:rr/gg/bb
Range: color1-color2
```

# CAVEATS

Input must be PGM. For the reverse, use ppmtopgm. Part of Netpbm toolkit.

# HISTORY

pgmtoppm is part of **Netpbm** by **Jef Poskanzer**, providing grayscale to color conversion.

# SEE ALSO

[ppmtopgm](/man/ppmtopgm)(1), [pgmramp](/man/pgmramp)(1), [ppmchange](/man/ppmchange)(1), [netpbm](/man/netpbm)(1)
