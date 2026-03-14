# TAGLINE

Scale PNM images (obsoleted by pamscale)

# TLDR

**Scale by factor**

```pnmscale [0.5] [input.pnm] > [output.pnm]```

**Scale to specific width**

```pnmscale -width [640] [input.pnm] > [output.pnm]```

**Scale to specific dimensions**

```pnmscale -width [800] -height [600] [input.pnm] > [output.pnm]```

**Scale by X and Y factors**

```pnmscale -xscale [2] -yscale [1.5] [input.pnm] > [output.pnm]```

# SYNOPSIS

**pnmscale** [_options_] [_pnmfile_]

# PARAMETERS

**-width** _n_
> Output width.

**-height** _n_
> Output height.

**-xscale** _n_
> Horizontal scale factor.

**-yscale** _n_
> Vertical scale factor.

**-reduce** _n_
> Reduce by integer factor.

**-xysize** _x_ _y_
> Fit within dimensions (synonym for -xyfit in pamscale).

**-pixels** _n_
> Scale to a given total number of pixels.

# DESCRIPTION

**pnmscale** scales PNM images up or down. It uses pixel mixing for smooth results when scaling down. This command was obsoleted by **pamscale** as of Netpbm 10.20 (January 2004) and removed in Netpbm 10.46 (March 2009). Use **pamscale** for new work, which is backward-compatible and supports PAM images.

Part of the Netpbm toolkit.

# EXAMPLES

```bash
# Half size
pnmscale 0.5 image.ppm > half.ppm

# Specific width, maintain aspect
pnmscale -width 640 image.ppm > resized.ppm

# Exact dimensions
pnmscale -width 800 -height 600 image.ppm > exact.ppm

# Integer reduction (faster)
pnmscale -reduce 4 huge.ppm > quarter.ppm

# Chain with conversion
jpegtopnm photo.jpg | pnmscale 0.25 | pnmtojpeg > thumb.jpg
```

# CAVEATS

Obsoleted by pamscale; use pamscale for new work. Pixel mixing can blur. Integer reduction (-reduce) is faster than fractional scaling.

# HISTORY

pnmscale is part of **Netpbm** by **Jef Poskanzer**, later superseded by pamscale with additional features.

# SEE ALSO

[pamscale](/man/pamscale)(1), [pnmenlarge](/man/pnmenlarge)(1), [pnmcut](/man/pnmcut)(1), [netpbm](/man/netpbm)(1)
