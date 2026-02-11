# TAGLINE

Convert raw RGB data to PPM format

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

**rawtoppm** converts raw RGB color data into Portable Pixmap (PPM) format by interpreting a byte stream as red, green, and blue pixel values arranged according to specified image dimensions. The tool handles different memory layouts for the color channels: the default expects pixel-interleaved data (RGBRGB...), while **-interrow** reads row-interleaved data where each color plane is stored as a complete row before the next.

Since raw data contains no metadata, both width and height must be specified as arguments. The **-headerskip** option skips non-image data at the beginning of the file. It is part of the Netpbm image processing toolkit.

# SEE ALSO

[rawtopgm](/man/rawtopgm)(1), [ppmtorgb3](/man/ppmtorgb3)(1)

