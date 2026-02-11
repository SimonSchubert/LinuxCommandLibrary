# TAGLINE

Scale images using fixed-point arithmetic

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

**pnmscalefixed** scales PNM images using fixed-point integer arithmetic instead of floating-point math. This makes it faster than pamscale on systems without hardware floating-point support, at the cost of slightly reduced accuracy.

The tool accepts a scale factor or target dimensions via **-width** and **-height**. For most modern systems, pamscale is preferred for better quality. Part of the Netpbm toolkit.

# SEE ALSO

[pamscale](/man/pamscale)(1), [pnmenlarge](/man/pnmenlarge)(1)

