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

**pnmtopng** converts PNM (PBM/PGM/PPM) images to PNG format. Part of Netpbm toolkit. Supports alpha channels, compression, and interlacing.

# SEE ALSO

[pngtopnm](/man/pngtopnm)(1), [pamtopng](/man/pamtopng)(1)

