# TAGLINE

Convert PPM images to GIF format

# TLDR

**Convert PPM to GIF**

```ppmtogif [input.ppm] > [output.gif]```

**With transparency**

```ppmtogif -transparent [color] [input.ppm] > [output.gif]```

**Interlaced GIF**

```ppmtogif -interlace [input.ppm] > [output.gif]```

**With alpha transparency** from a PGM file

```ppmtogif -alpha [mask.pgm] [input.ppm] > [output.gif]```

# SYNOPSIS

**ppmtogif** [_options_] [_ppmfile_]

# PARAMETERS

**-transparent** [**=**]_color_
> Make the specified color transparent. If prefixed with **=**, only an exact match is used; otherwise the closest color in the image is selected.

**-alpha** _pgmfile_
> Use a PGM file as an alpha (transparency) mask. White is opaque, black is transparent. Cannot be used with **-transparent**.

**-interlace**
> Produce an interlaced GIF file.

**-sort**
> Produce a GIF file with the colormap sorted in a predictable order.

**-map** _mapfile_
> Use colors from the specified PPM file as the colormap instead of the colors in the input image.

**-comment** _text_
> Include a comment in the GIF output.

**-nolzw**
> Do not use LZW compression. Produces larger but unencumbered output.

# DESCRIPTION

**ppmtogif** converts PPM images to GIF format. GIF is limited to 256 colors, so use ppmquant first if needed.

This program was superseded by **pamtogif** in Netpbm 10.37 (December 2006). New use of ppmtogif is discouraged; use pamtogif instead.

Part of the Netpbm toolkit.

# EXAMPLES

```bash
# Basic conversion
ppmtogif image.ppm > image.gif

# With transparency (exact color match)
ppmtogif -transparent =white logo.ppm > logo.gif

# With alpha mask from a PGM file
ppmtogif -alpha mask.pgm image.ppm > transparent.gif

# Quantize first for photos with many colors
ppmquant 256 photo.ppm | ppmtogif > photo.gif

# Interlaced for web
ppmtogif -interlace image.ppm > interlaced.gif

# From JPEG
jpegtopnm photo.jpg | ppmquant 256 | ppmtogif > photo.gif
```

# CAVEATS

GIF is limited to 256 colors. Use ppmquant to reduce colors before conversion. The **-transparent** and **-alpha** options cannot be used together. This command is deprecated in favor of pamtogif.

# HISTORY

ppmtogif is part of **Netpbm** by **Jef Poskanzer**, with LZW compression code by various contributors.

# SEE ALSO

[pamtogif](/man/pamtogif)(1), [giftopnm](/man/giftopnm)(1), [ppmquant](/man/ppmquant)(1), [netpbm](/man/netpbm)(1)
