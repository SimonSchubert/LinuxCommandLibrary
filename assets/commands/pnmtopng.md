# TAGLINE

Convert PNM images to PNG format

# TLDR

**Convert PNM to PNG**

```pnmtopng [input.pnm] > [output.png]```

**Convert with compression**

```pnmtopng -compression [9] [input.pnm] > [output.png]```

**Add alpha channel**

```pnmtopng -alpha [alpha.pgm] [input.ppm] > [output.png]```

**Create interlaced PNG**

```pnmtopng -interlace [input.pnm] > [output.png]```

# SYNOPSIS

**pnmtopng** [_options_] [_file_]

# PARAMETERS

**-alpha** _file_
> Alpha channel file.

**-compression** _n_
> Compression level (0-9).

**-interlace**
> Create interlaced PNG.

**-transparent** _color_
> Transparent color.

**-gamma** _value_
> Gamma value.

# DESCRIPTION

**pnmtopng** converts PNM (PBM, PGM, PPM) images to PNG format with lossless compression. It automatically selects the optimal PNG color type based on the input image.

The **-alpha** option attaches a separate PGM file as an alpha transparency channel. The **-compression** level (0-9) controls the deflate compression effort, and **-interlace** creates Adam7 interlaced PNGs for progressive display. The **-transparent** option designates a specific color as fully transparent. Part of the Netpbm toolkit; superseded by **pamtopng**.

# SEE ALSO

[pngtopnm](/man/pngtopnm)(1), [pamtopng](/man/pamtopng)(1)

