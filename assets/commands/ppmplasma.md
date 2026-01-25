# TLDR

**Generate plasma pattern**

```ppmplasma [width] [height] > [plasma.ppm]```

**With random seed**

```ppmplasma -randomseed [42] [512] [512] > [plasma.ppm]```

**As PNG**

```ppmplasma [800] [600] | pnmtopng > [plasma.png]```

# SYNOPSIS

**ppmplasma** [_options_] _width_ _height_

# PARAMETERS

**width**
> Image width in pixels.

**height**
> Image height in pixels.

**-randomseed** _n_
> Seed for reproducibility.

# DESCRIPTION

**ppmplasma** generates a plasma fractal image with colorful, cloud-like patterns. It uses recursive subdivision to create smooth, organic-looking textures.

Part of Netpbm toolkit.

# EXAMPLES

```bash
# Basic plasma
ppmplasma 640 480 > plasma.ppm

# Reproducible result
ppmplasma -randomseed 12345 512 512 > plasma.ppm

# Convert to PNG
ppmplasma 800 600 | pnmtopng > plasma.png

# Create desktop background
ppmplasma 1920 1080 | pnmtojpeg > wallpaper.jpg
```

# ALGORITHM

Uses midpoint displacement algorithm:
1. Set corner colors
2. Recursively subdivide
3. Average colors with random displacement

# CAVEATS

Fixed color palette. For grayscale, pipe through ppmtopgm. Part of Netpbm.

# HISTORY

ppmplasma is part of **Netpbm**, implementing the plasma cloud algorithm popular in demoscene and computer graphics.

# SEE ALSO

[ppmforge](/man/ppmforge)(1), [pgmnoise](/man/pgmnoise)(1), [ppmmake](/man/ppmmake)(1), [netpbm](/man/netpbm)(1)
