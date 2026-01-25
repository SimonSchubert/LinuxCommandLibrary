# TLDR

**Cut rectangular region**

```pnmcut [x] [y] [width] [height] [input.pnm] > [output.pnm]```

**Cut from top-left corner**

```pnmcut -left [0] -top [0] -width [100] -height [100] [input.pnm] > [output.pnm]```

**Cut using bottom-right**

```pnmcut -left [10] -top [10] -right [200] -bottom [150] [input.pnm] > [output.pnm]```

**Pad if outside bounds**

```pnmcut -pad [x] [y] [width] [height] [input.pnm] > [output.pnm]```

# SYNOPSIS

**pnmcut** [_options_] _x_ _y_ _width_ _height_ [_pnmfile_]

# PARAMETERS

**-left** _n_
> Left column.

**-right** _n_
> Right column.

**-top** _n_
> Top row.

**-bottom** _n_
> Bottom row.

**-width** _n_
> Width in pixels.

**-height** _n_
> Height in pixels.

**-pad**
> Pad with black if out of bounds.

# DESCRIPTION

**pnmcut** extracts a rectangular region from a PNM image. Coordinates are zero-indexed from top-left corner.

Part of Netpbm toolkit for image manipulation.

# EXAMPLES

```bash
# Cut 100x100 from position 50,50
pnmcut 50 50 100 100 image.ppm > crop.ppm

# Using named parameters
pnmcut -left 100 -top 100 -width 200 -height 150 image.ppm > crop.ppm

# Cut with padding
pnmcut -pad -10 -10 120 120 image.ppm > padded.ppm

# Chain with conversion
jpegtopnm photo.jpg | pnmcut 0 0 640 480 | pnmtojpeg > thumb.jpg
```

# CAVEATS

Superseded by pamcut with more features. Negative coordinates cut from opposite edge.

# HISTORY

pnmcut is part of **Netpbm** by **Jef Poskanzer**, providing basic cropping functionality.

# SEE ALSO

[pamcut](/man/pamcut)(1), [pnmpaste](/man/pnmpaste)(1), [pnmcrop](/man/pnmcrop)(1), [netpbm](/man/netpbm)(1)
