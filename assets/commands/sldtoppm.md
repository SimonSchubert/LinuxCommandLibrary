# TLDR

**Convert AutoCAD slide to PPM**

```sldtoppm [input.sld] > [output.ppm]```

**Specify size**

```sldtoppm -xsize [640] -ysize [480] [input.sld] > [output.ppm]```

# SYNOPSIS

**sldtoppm** [_options_] [_file_]

# PARAMETERS

**-xsize** _n_
> Output width.

**-ysize** _n_
> Output height.

**-verbose**
> Print slide information.

# DESCRIPTION

**sldtoppm** converts AutoCAD slide files to PPM format. Slides were used for presentations in AutoCAD. Part of Netpbm toolkit.

# SEE ALSO

[ppmtoacad](/man/ppmtoacad)(1), [pnmtops](/man/pnmtops)(1)

