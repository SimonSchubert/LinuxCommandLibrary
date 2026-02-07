# TAGLINE

Encoder YUV to PPM converter

# TLDR

**Convert EYUV to PPM**

```eyuvtoppm -w [width] -h [height] < [input.eyuv] > [output.ppm]```

# SYNOPSIS

**eyuvtoppm** [_options_] [_input_]

# PARAMETERS

**-w** _width_
> Image width.

**-h** _height_
> Image height.

# DESCRIPTION

**eyuvtoppm** converts Encoder YUV (EYUV) video format files to PPM (Portable Pixmap) format. EYUV is a Berkeley YUV format used in video encoding workflows, storing uncompressed YUV color space data.

The tool is part of the Netpbm suite of image processing utilities. It requires explicit width and height parameters since EYUV files don't contain image dimension metadata. The output PPM format is a simple, uncompressed format widely supported for image manipulation and conversion.

# SEE ALSO

[ppmtoeyuv](/man/ppmtoeyuv)(1), [yuvtoppm](/man/yuvtoppm)(1)

