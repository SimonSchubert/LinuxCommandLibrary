# TLDR

**Convert raw RGB to PPM**

```rawtoppm [width] [height] [input.raw] > [output.ppm]```

**Convert with interleaved format**

```rawtoppm -interrow [width] [height] [input.raw] > [output.ppm]```

# SYNOPSIS

**rawtoppm** [_options_] _width_ _height_ [_file_]

# PARAMETERS

_width_
> Image width in pixels.

_height_
> Image height in pixels.

**-headerskip** _bytes_
> Skip header bytes.

**-interrow**
> Row-interleaved RGB.

**-interpixel**
> Pixel-interleaved RGB.

# DESCRIPTION

**rawtoppm** converts raw RGB data to PPM format. Supports various RGB interleaving modes. Part of Netpbm toolkit.

# SEE ALSO

[rawtopgm](/man/rawtopgm)(1), [ppmtorgb3](/man/ppmtorgb3)(1)

