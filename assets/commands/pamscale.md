# TLDR

**Scale to specific size**

```pamscale -width [800] -height [600] [input.pam] > [output.pam]```

**Scale by factor**

```pamscale [0.5] [input.pam] > [half.pam]```

**Scale preserving aspect ratio**

```pamscale -xyfit [800] [600] [input.pam] > [output.pam]```

**Scale width only**

```pamscale -xsize [800] [input.pam] > [output.pam]```

**High quality scaling**

```pamscale -filter=lanczos [0.5] [input.pam] > [output.pam]```

# SYNOPSIS

**pamscale** [_options_] [_scale_] [_pamfile_]

# PARAMETERS

**scale**
> Scale factor (0.5 = half).

**-width**, **-xsize** _n_
> Output width.

**-height**, **-ysize** _n_
> Output height.

**-xyfit** _w_ _h_
> Fit within box, keep aspect.

**-filter** _name_
> Resampling filter.

**-linear**
> Linear interpolation.

# DESCRIPTION

**pamscale** resizes PAM/PNM images using high-quality resampling. It can scale by factor, to specific dimensions, or fit within a bounding box while preserving aspect ratio.

Part of the Netpbm toolkit.

# FILTERS

```
point    - Nearest neighbor
box      - Box filter
triangle - Linear/bilinear
lanczos  - High quality (default)
```

# CAVEATS

Upscaling may blur. Very small scales may lose detail. Large images need memory.

# HISTORY

pamscale is part of **Netpbm**, providing high-quality image scaling with various resampling algorithms.

# SEE ALSO

[pamenlarge](/man/pamenlarge)(1), [pamstretch](/man/pamstretch)(1), [pnmscale](/man/pnmscale)(1)
