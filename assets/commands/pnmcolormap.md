# TAGLINE

Generate color palette from PNM images

# TLDR

**Generate color map with N colors**

```pnmcolormap [256] [image.ppm] > [colormap.ppm]```

**Use median cut algorithm**

```pnmcolormap -center [16] [image.ppm] > [colormap.ppm]```

**Spread colors evenly**

```pnmcolormap -spreadluminosity [256] [image.ppm] > [colormap.ppm]```

**From multiple images**

```pnmcolormap [256] [image1.ppm] [image2.ppm] > [colormap.ppm]```

# SYNOPSIS

**pnmcolormap** [_options_] _ncolors_ [_pnmfile_...]

# PARAMETERS

**ncolors**
> Maximum colors in map.

**-center**
> Use center of cluster.

**-meancolor**
> Use mean color of cluster.

**-meanpixel**
> Use mean weighted by pixel count.

**-spreadbrightness**
> Spread by brightness.

**-spreadluminosity**
> Spread by luminosity.

# DESCRIPTION

**pnmcolormap** creates a color map (palette) from an image using median cut quantization. The output is a small image where each pixel is a color from the palette.

Used with pnmremap for color reduction.

# EXAMPLES

```bash
# Create 256-color palette
pnmcolormap 256 photo.ppm > palette.ppm

# Reduce colors using map
pnmcolormap 16 image.ppm > map.ppm
pnmremap -mapfile=map.ppm image.ppm > reduced.ppm

# Combined color reduction
pnmcolormap 256 image.ppm | pnmremap -mapfile=- image.ppm > reduced.ppm
```

# CAVEATS

Output is the colormap, not the remapped image. Use pnmremap to apply. Part of Netpbm.

# HISTORY

pnmcolormap is part of **Netpbm**, implementing median-cut color quantization algorithm.

# SEE ALSO

[pnmremap](/man/pnmremap)(1), [ppmquant](/man/ppmquant)(1), [ppmquantall](/man/ppmquantall)(1), [netpbm](/man/netpbm)(1)
