# TAGLINE

Generate random color noise images

# TLDR

**Create color noise image**

```pnmnoise [width] [height] > [noise.ppm]```

**Create with seed**

```pnmnoise -randomseed [42] [256] [256] > [noise.ppm]```

**Grayscale noise**

```pnmnoise [100] [100] | ppmtopgm > [noise.pgm]```

# SYNOPSIS

**pnmnoise** [_options_] _width_ _height_

# PARAMETERS

**width**
> Image width in pixels.

**height**
> Image height in pixels.

**-randomseed** _n_
> Seed for reproducibility.

# DESCRIPTION

**pnmnoise** generates a PNM image filled with random colored pixels. Each pixel has independently random red, green, and blue values, producing visual noise.

Similar to pgmnoise but produces color output.

# EXAMPLES

```bash
# Color noise 512x512
pnmnoise 512 512 > noise.ppm

# Reproducible noise
pnmnoise -randomseed 12345 100 100 > noise.ppm

# Convert to PNG
pnmnoise 200 200 | pnmtopng > noise.png

# Grayscale version
pnmnoise 100 100 | ppmtopgm > gray_noise.pgm
```

# CAVEATS

Produces full color noise (PPM format). For grayscale use pgmnoise. Random distribution is uniform.

# HISTORY

pnmnoise is part of **Netpbm** by **Jef Poskanzer** and contributors for generating random images.

# SEE ALSO

[pgmnoise](/man/pgmnoise)(1), [ppmforge](/man/ppmforge)(1), [ppmmake](/man/ppmmake)(1), [netpbm](/man/netpbm)(1)
