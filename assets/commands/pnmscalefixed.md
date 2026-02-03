# TLDR

**Scale image using fixed-point math**

```pnmscalefixed [2.0] [input.pnm] > [output.pnm]```

**Scale to specific dimensions**

```pnmscalefixed -width [800] -height [600] [input.pnm] > [output.pnm]```

# SYNOPSIS

**pnmscalefixed** [_options_] _scale_ [_file_]

# PARAMETERS

_scale_
> Scale factor.

**-width** _n_
> Target width.

**-height** _n_
> Target height.

# DESCRIPTION

**pnmscalefixed** scales PNM images using faster fixed-point arithmetic instead of floating-point. Less accurate but faster than pamscale. Part of Netpbm toolkit.

# SEE ALSO

[pamscale](/man/pamscale)(1), [pnmenlarge](/man/pnmenlarge)(1)

