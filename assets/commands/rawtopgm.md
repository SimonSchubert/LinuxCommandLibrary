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

**rawtopgm** converts raw grayscale data to PGM format. Requires knowing image dimensions. Part of Netpbm toolkit.

# SEE ALSO

[rawtoppm](/man/rawtoppm)(1), [pgmtopbm](/man/pgmtopbm)(1)

