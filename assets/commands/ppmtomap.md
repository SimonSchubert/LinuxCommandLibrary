# TAGLINE

Extract colormap from PPM image

# TLDR

**Extract colormap from image**

```ppmtomap [input.ppm] > [colormap.ppm]```

**Sort colors by frequency**

```ppmtomap -sort [input.ppm] > [colormap.ppm]```

# SYNOPSIS

**ppmtomap** [_options_] [_file_]

# PARAMETERS

**-sort**
> Sort colors by frequency.

**-square**
> Make output square.

# DESCRIPTION

**ppmtomap** extracts the unique colors from a PPM image as a one-row colormap image. Useful for analyzing or transferring palettes. Part of Netpbm toolkit.

# SEE ALSO

[ppmhist](/man/ppmhist)(1), [pnmcolormap](/man/pnmcolormap)(1)

