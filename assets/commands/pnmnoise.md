# TAGLINE

Generate random noise PNM images (often an alias for pgmnoise)

# TLDR

**Create grayscale noise image** (via pgmnoise)

```pgmnoise [width] [height] > [noise.pgm]```

Create **reproducible** noise with a fixed seed

```pgmnoise -randomseed=[12345] [width] [height] > [noise.pgm]```

**Create color noise** in one step (Netpbm 11.16+)

```pamnoise -width=[256] -height=[256] -depth=3 -tupletype=RGB | pamtopnm > [noise.ppm]```

**Build color noise** by combining three grayscale noise channels

```rgb3toppm <(pgmnoise 256 256) <(pgmnoise 256 256) <(pgmnoise 256 256) > [noise.ppm]```

**Add noise to an existing image**

```pamaddnoise -type=gaussian -sigma2=[20] [image.pnm] > [noisy.pnm]```

# SYNOPSIS

**pgmnoise** [**-maxval=**_n_] [**-randomseed=**_n_] _width_ _height_

**pamnoise** [**-width=**_n_] [**-height=**_n_] [**-depth=**_n_] [**-maxval=**_n_] [**-tupletype=**_text_] [**-randomseed=**_n_]

# PARAMETERS

**width**
> Image width in pixels.

**height**
> Image height in pixels.

**-maxval=**_n_
> Maximum sample value of the generated image (default 255).

**-randomseed=**_n_
> Seed the pseudo-random number generator for reproducible output. By default the seed is derived from the time and process ID.

**-depth=**_n_
> (pamnoise only) Number of planes; use 3 with **-tupletype=RGB** for color noise.

# DESCRIPTION

There is no standalone **pnmnoise** program in Netpbm. The name is sometimes used loosely to refer to Netpbm's family of noise generators.

Use **pgmnoise** to generate a grayscale PGM of white noise, **pbmnoise** for a PBM (bitmap) of random black/white pixels, and **pamnoise** (Netpbm 11.16 and later) for PAM images with any number of planes. On older Netpbm, combine three **pgmnoise** outputs with **rgb3toppm** to create a color PPM noise image. **pamaddnoise** adds several noise distributions (gaussian, multiplicative_gaussian, impulse, laplacian, poisson) to an existing image.

# EXAMPLES

```bash
# Grayscale noise 512x512
pgmnoise 512 512 > noise.pgm

# Reproducible grayscale noise
pgmnoise -randomseed=12345 100 100 > noise.pgm

# Color noise by merging three channels
rgb3toppm <(pgmnoise 256 256) <(pgmnoise 256 256) <(pgmnoise 256 256) > noise.ppm

# Salt-and-pepper noise on an existing image
pamaddnoise -type=impulse -tolerance=0.05 image.pnm > noisy.pnm

# Convert to PNG
pgmnoise 200 200 | pnmtopng > noise.png
```

# CAVEATS

**pnmnoise** is not a distinct binary; pgmnoise/pbmnoise produce single-channel noise only. Random distribution is uniform; for other distributions use pamaddnoise on a base image. Since Netpbm 11.16, **pgmnoise** is a thin backward-compatibility wrapper around **pamnoise**. Before Netpbm 10.37, two runs in the same second could produce identical output.

# HISTORY

The Netpbm noise generators are part of the **Netpbm** package (originally **pbmplus** by **Jef Poskanzer**, 1988). **pgmnoise** was written by Frank Neumann in 1993. The older **pnmaddnoise** was renamed to **pamaddnoise** in Netpbm 10.30. **pamnoise** was added in Netpbm 11.16 (September 2026).

# SEE ALSO

[pgmnoise](/man/pgmnoise)(1), [pbmnoise](/man/pbmnoise)(1), [rgb3toppm](/man/rgb3toppm)(1), [pamtopnm](/man/pamtopnm)(1), [ppmforge](/man/ppmforge)(1), [ppmmake](/man/ppmmake)(1), [netpbm](/man/netpbm)(1)

# RESOURCES

```[Homepage](https://netpbm.sourceforge.net/)```

```[Documentation](https://netpbm.sourceforge.net/doc/pamnoise.html)```

<!-- verified: 2026-11-23 -->
