# TAGLINE

Convert PPM images to GIF format

# TLDR

**Convert PPM to GIF**

```ppmtogif [input.ppm] > [output.gif]```

**With transparency**

```ppmtogif -transparent [color] [input.ppm] > [output.gif]```

**Interlaced GIF**

```ppmtogif -interlace [input.ppm] > [output.gif]```

**Animated GIF**

```pamtogif [frame1.ppm] [frame2.ppm] > [animated.gif]```

# SYNOPSIS

**ppmtogif** [_options_] [_ppmfile_]

# PARAMETERS

**-transparent** _color_
> Make color transparent.

**-interlace**
> Create interlaced GIF.

**-sort**
> Sort colormap.

**-map** _file_
> Use specified colormap.

**-comment** _text_
> Add comment.

# DESCRIPTION

**ppmtogif** converts PPM images to GIF format. GIF is limited to 256 colors, so use ppmquant first if needed. Superseded by pamtogif.

Part of Netpbm toolkit.

# EXAMPLES

```bash
# Basic conversion
ppmtogif image.ppm > image.gif

# With transparency
ppmtogif -transparent white logo.ppm > logo.gif

# Quantize first for photos
ppmquant 256 photo.ppm | ppmtogif > photo.gif

# Interlaced for web
ppmtogif -interlace image.ppm > interlaced.gif

# From JPEG
jpegtopnm photo.jpg | ppmquant 256 | ppmtogif > photo.gif
```

# CAVEATS

GIF limited to 256 colors. Use ppmquant for more colors. Use pamtogif for animation.

# HISTORY

ppmtogif is part of **Netpbm** by **Jef Poskanzer**, with LZW compression code by various contributors.

# SEE ALSO

[pamtogif](/man/pamtogif)(1), [giftopnm](/man/giftopnm)(1), [ppmquant](/man/ppmquant)(1), [netpbm](/man/netpbm)(1)
