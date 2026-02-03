# TLDR

**Generate crater terrain**

```pgmcrater -number [5000] > [output.pgm]```

**Specify dimensions**

```pgmcrater -width [512] -height [512] -number [1000] > [output.pgm]```

# SYNOPSIS

**pgmcrater** [_options_]

# PARAMETERS

**-width** _n_
> Output width in pixels.

**-height** _n_
> Output height in pixels.

**-number** _n_
> Number of craters.

**-gamma** _n_
> Gamma correction value.

# DESCRIPTION

**pgmcrater** generates synthetic terrain with impact craters as grayscale heightmap. Useful for creating planetary surface textures. Part of Netpbm toolkit.

# SEE ALSO

[pamcrater](/man/pamcrater)(1), [pgmnoise](/man/pgmnoise)(1)

