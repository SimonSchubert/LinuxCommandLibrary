# TAGLINE

Generate random noise PNM images (often an alias for pgmnoise)

# TLDR

**Create grayscale noise image** (via pgmnoise)

```pgmnoise [width] [height] > [noise.pgm]```

**Build color noise** by combining three grayscale noise channels

```rgb3toppm <(pgmnoise 256 256) <(pgmnoise 256 256) <(pgmnoise 256 256) > noise.ppm```

**Add noise to an existing image**

```pamaddnoise -type=gaussian -lsigma=0.1 [image.pnm] > [noisy.pnm]```

# SYNOPSIS

**pgmnoise** [**-randomseed** _n_] _width_ _height_

# PARAMETERS

**width**
> Image width in pixels.

**height**
> Image height in pixels.

**-randomseed** _n_
> Seed the pseudo-random number generator for reproducible output.

# DESCRIPTION

There is no standalone **pnmnoise** program in modern Netpbm. The name is sometimes used loosely to refer to Netpbm's family of noise generators.

Use **pgmnoise** to generate a grayscale PGM of white noise, **pbmnoise** for a PBM (bitmap) of random black/white pixels, and combine three **pgmnoise** outputs with **rgb3toppm** to create a color PPM noise image. **pamaddnoise** adds several noise distributions (gaussian, impulse, multiplicative-gaussian, etc.) to an existing image.

# EXAMPLES

```bash
# Grayscale noise 512x512
pgmnoise 512 512 > noise.pgm

# Reproducible grayscale noise
pgmnoise -randomseed 12345 100 100 > noise.pgm

# Color noise by merging three channels
rgb3toppm <(pgmnoise 256 256) <(pgmnoise 256 256) <(pgmnoise 256 256) > noise.ppm

# Convert to PNG
pgmnoise 200 200 | pnmtopng > noise.png
```

# CAVEATS

**pnmnoise** is not a distinct binary; pgmnoise/pbmnoise produce single-channel noise only. Random distribution is uniform; for other distributions use pamaddnoise on a base image.

# HISTORY

The Netpbm noise generators are part of the **Netpbm** package (originally **pbmplus** by **Jef Poskanzer**, 1988). The older **pnmaddnoise** was renamed to **pamaddnoise** in Netpbm 10.30.

# SEE ALSO

[pgmnoise](/man/pgmnoise)(1), [ppmforge](/man/ppmforge)(1), [ppmmake](/man/ppmmake)(1), [netpbm](/man/netpbm)(1)
