# TLDR

**Create white noise image**

```pgmnoise [100] [100] > [noise.pgm]```

**Create large noise pattern**

```pgmnoise [1920] [1080] > [noise.pgm]```

**Create and convert to PNG**

```pgmnoise [256] [256] | pnmtopng > [noise.png]```

**With custom seed**

```pgmnoise -randomseed [12345] [100] [100] > [noise.pgm]```

# SYNOPSIS

**pgmnoise** [_options_] _width_ _height_

# PARAMETERS

**width**
> Image width in pixels.

**height**
> Image height in pixels.

**-randomseed** _n_
> Seed for random number generator.

**-maxval** _n_
> Maximum gray value.

# DESCRIPTION

**pgmnoise** creates a PGM image filled with random grayscale pixels (white noise). Each pixel is independently assigned a random gray value.

Useful for testing, creating textures, or generating random patterns.

# EXAMPLES

```bash
# Basic noise image
pgmnoise 512 512 > noise.pgm

# Reproducible noise
pgmnoise -randomseed 42 100 100 > noise.pgm

# Create texture and tile
pgmnoise 64 64 | pnmtile 256 256 > texture.pgm

# Convert to PNG
pgmnoise 200 200 | pnmtopng > noise.png
```

# CAVEATS

Uniform distribution. For other noise types, combine with other tools. Part of Netpbm.

# HISTORY

pgmnoise is part of **Netpbm** by **Jef Poskanzer** and contributors, providing basic noise generation.

# SEE ALSO

[pnmnoise](/man/pnmnoise)(1), [pgmmake](/man/pgmmake)(1), [ppmforge](/man/ppmforge)(1), [netpbm](/man/netpbm)(1)
