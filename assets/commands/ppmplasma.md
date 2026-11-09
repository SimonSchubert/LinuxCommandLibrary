# TAGLINE

Not a Netpbm program: use ppmforge for fractal clouds

# TLDR

**Generate fractal clouds** with the real Netpbm tool

```ppmforge -clouds -width [800] -height [600] > [clouds.ppm]```

**Use a fixed seed** for a reproducible result

```ppmforge -clouds -seed [42] -width [512] -height [512] > [clouds.ppm]```

**Save as PNG**

```ppmforge -clouds -width [800] -height [600] | pnmtopng > [clouds.png]```

# SYNOPSIS

**ppmforge** [**-clouds**] [**-seed** _seed_] [**-width** _width_] [**-height** _height_]

# DESCRIPTION

No program named **ppmplasma** could be found in the Netpbm program directory or its distribution packages, so its existence and options cannot be confirmed.

The closest Netpbm tool is **ppmforge**, which generates fractal forgeries of clouds, planets and starry skies. For other generated images, see **ppmpat** (patterns), **pgmnoise** (noise) and **ppmmake** (solid color).

# SEE ALSO

[ppmforge](/man/ppmforge)(1), [ppmpat](/man/ppmpat)(1), [pgmnoise](/man/pgmnoise)(1), [ppmmake](/man/ppmmake)(1), [netpbm](/man/netpbm)(1)
