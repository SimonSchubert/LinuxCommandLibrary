# TAGLINE

extracts a rectangular region from a PAM or PNM image

# TLDR

**Cut region from image**

```pamcut [x] [y] [width] [height] [input.pam] > [output.pam]```

**Cut from coordinates**

```pamcut -left [100] -top [50] -width [200] -height [150] [input.pam] > [output.pam]```

**Cut right portion**

```pamcut -right [100] -bottom [100] -width [200] -height [200] [input.pam] > [output.pam]```

**Pad if outside bounds**

```pamcut -pad -left [-10] -top [-10] -width [300] -height [300] [input.pam] > [output.pam]```

# SYNOPSIS

**pamcut** [_options_] [_x_ _y_ _width_ _height_] [_pamfile_]

# PARAMETERS

**-left** _x_
> Left edge position.

**-right** _x_
> Right edge position.

**-top** _y_
> Top edge position.

**-bottom** _y_
> Bottom edge position.

**-width** _w_
> Output width.

**-height** _h_
> Output height.

**-pad**
> Pad with black if outside.

# DESCRIPTION

**pamcut** extracts a rectangular region from a PAM or PNM image. Coordinates can be specified from any corner using combinations of left/right and top/bottom.

# EXAMPLE

```bash
# Cut 100x100 from top-left corner
pamcut 0 0 100 100 photo.ppm > crop.ppm

# Cut center region
pamcut -left 100 -top 100 -width 200 -height 200 input.ppm > center.ppm
```

# CAVEATS

Coordinates are 0-indexed. Without -pad, region must be within image bounds.

# HISTORY

pamcut is part of **Netpbm**, evolving from the original PBMplus toolkit created by **Jef Poskanzer**.

# SEE ALSO

[pnmcut](/man/pnmcut)(1), [pamcomp](/man/pamcomp)(1), [pamscale](/man/pamscale)(1)
