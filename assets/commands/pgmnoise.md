# TAGLINE

create a PGM image filled with random grayscale pixels

# TLDR

**Create a 100x100 white noise image**

```pgmnoise [100] [100] > [noise.pgm]```

**Create a full HD noise image**

```pgmnoise [1920] [1080] > [noise.pgm]```

**Create noise and convert to PNG**

```pgmnoise [256] [256] | pnmtopng > [noise.png]```

**Create reproducible noise with a fixed seed**

```pgmnoise -randomseed [12345] [100] [100] > [noise.pgm]```

**Create a small noise tile and repeat it**

```pgmnoise [64] [64] | pnmtile [256] [256] > [texture.pgm]```

# SYNOPSIS

**pgmnoise** [_options_] _width_ _height_

# PARAMETERS

_width_
> Image width in pixels.

_height_
> Image height in pixels.

**-randomseed** _n_
> Seed for the random number generator, allowing reproducible output.

**-maxval** _n_
> Maximum gray value for pixels. Defaults to the PGM compile-time maximum (typically 255 or 65535).

# DESCRIPTION

**pgmnoise** creates a portable graymap (PGM) image where each pixel is independently assigned a uniformly distributed random gray value between 0 and the maximum value. The output is written to standard output in PGM format.

The tool is useful for testing image processing pipelines, creating noise textures, or generating random patterns that can be piped into other Netpbm tools.

# CAVEATS

Uses uniform random distribution only. For Gaussian or other noise types, use **pamaddnoise** or combine with other tools. Output goes to stdout and must be redirected. Part of the Netpbm toolkit.

# HISTORY

**pgmnoise** is part of **Netpbm**, the graphics toolkit originally created by **Jef Poskanzer** in the late 1980s and maintained by **Bryan Henderson** since 2000.

# SEE ALSO

[pnmnoise](/man/pnmnoise)(1), [pgmmake](/man/pgmmake)(1), [ppmforge](/man/ppmforge)(1), [pnmtopng](/man/pnmtopng)(1), [netpbm](/man/netpbm)(1)
