# TAGLINE

generates synthetic terrain with impact craters, useful for creating planetary

# TLDR

**Generate terrain with craters**

```pamcrater -width [512] -height [512] > [output.pam]```

**Generate with specific crater count**

```pamcrater -number [1000] -width [256] -height [256] > [output.pam]```

# SYNOPSIS

**pamcrater** [_options_]

# PARAMETERS

**-width** _n_
> Output width in pixels.

**-height** _n_
> Output height in pixels.

**-number** _n_
> Number of craters to generate.

**-randomseed** _n_
> Random seed for reproducibility.

# DESCRIPTION

**pamcrater** generates synthetic terrain with impact craters, useful for creating planetary surface textures or heightmaps. Output is grayscale elevation data. Part of Netpbm toolkit.

# SEE ALSO

[pgmcrater](/man/pgmcrater)(1), [pamgauss](/man/pamgauss)(1)

