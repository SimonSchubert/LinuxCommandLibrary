# TAGLINE

Convert raw grayscale data to PGM format

# TLDR

**Convert raw grayscale to PGM**

```rawtopgm [width] [height] [input.raw] > [output.pgm]```

**Convert with header bytes to skip**

```rawtopgm -headerskip [512] [width] [height] [input.raw] > [output.pgm]```

# SYNOPSIS

**rawtopgm** [_options_] _width_ _height_ [_file_]

# PARAMETERS

_width_
> Image width in pixels.

_height_
> Image height in pixels.

**-headerskip** _bytes_
> Skip header bytes.

**-maxval** _n_
> Maximum gray value.

**-bpp** _n_
> Bytes per pixel (1 or 2).

# DESCRIPTION

**rawtopgm** converts raw grayscale byte data into Portable Graymap (PGM) format by interpreting a stream of pixel values according to specified image dimensions. Since raw data contains no metadata, the width and height must be provided as arguments so the tool knows how to arrange the bytes into a proper image grid.

The **-headerskip** option allows skipping file headers that precede the actual pixel data, and **-bpp** handles 16-bit samples for higher dynamic range images. It is part of the Netpbm image processing toolkit.

# SEE ALSO

[rawtoppm](/man/rawtoppm)(1), [pgmtopbm](/man/pgmtopbm)(1)

