# TLDR

**Reduce to N colors**

```ppmquant [256] [input.ppm] > [output.ppm]```

**Reduce to 16 colors**

```ppmquant [16] [input.ppm] > [output.ppm]```

**With Floyd-Steinberg dithering**

```ppmquant -fs [256] [input.ppm] > [output.ppm]```

**Use existing colormap**

```ppmquant -map [palette.ppm] [input.ppm] > [output.ppm]```

# SYNOPSIS

**ppmquant** [_options_] _ncolors_ [_ppmfile_]

# PARAMETERS

**ncolors**
> Maximum number of colors.

**-fs**
> Floyd-Steinberg dithering.

**-map** _file_
> Use colormap from file.

**-spreadbrightness**
> Spread by brightness.

**-spreadluminosity**
> Spread by luminosity.

# DESCRIPTION

**ppmquant** reduces the number of colors in a PPM image using median-cut quantization. Essential for creating GIF images or reducing file size.

Superseded by pnmquant in modern Netpbm.

# EXAMPLES

```bash
# Reduce to 256 colors
ppmquant 256 photo.ppm > reduced.ppm

# 16 colors with dithering
ppmquant -fs 16 image.ppm > dithered.ppm

# Use web-safe palette
ppmquant -map websafe.ppm image.ppm > websafe.ppm

# Convert for GIF
ppmquant 256 image.ppm | ppmtogif > image.gif
```

# CAVEATS

Use pnmquant for new work. Dithering can increase file size. Part of Netpbm.

# HISTORY

ppmquant is part of **Netpbm** by **Jef Poskanzer**, implementing the median-cut color quantization algorithm by **Paul Heckbert**.

# SEE ALSO

[pnmquant](/man/pnmquant)(1), [pnmcolormap](/man/pnmcolormap)(1), [ppmtogif](/man/ppmtogif)(1), [netpbm](/man/netpbm)(1)
