# TAGLINE

generates synthetic terrain with impact craters as grayscale heightmap

# TLDR

**Generate crater terrain**

```pgmcrater -number [5000] > [output.pgm]```

**Specify dimensions**

```pgmcrater -width [512] -height [512] -number [1000] > [output.pgm]```

# SYNOPSIS

**pgmcrater** [_options_]

# PARAMETERS

**-width** _n_, **-xsize** _n_
> Output width in pixels (default 256).

**-height** _n_, **-ysize** _n_
> Output height in pixels (default 256).

**-number** _n_
> Number of craters to generate.

**-gamma** _g_
> Gamma correction value applied to the shaded relief output.

**-randomseed** _n_
> Seed for the random number generator; use a fixed value for reproducible output.

# DESCRIPTION

**pgmcrater** generates synthetic terrain populated with impact craters and outputs it as a grayscale PGM heightmap rendered via shaded relief. It is useful for creating planetary surface textures and procedural terrain.

As of Netpbm 10.27 **pgmcrater** is obsolete; it is now a thin wrapper that pipes **pamcrater** into **pamshadedrelief** and **pamtopnm**. Prefer those primitives for new workflows.

# SEE ALSO

[pamcrater](/man/pamcrater)(1), [pgmnoise](/man/pgmnoise)(1)

