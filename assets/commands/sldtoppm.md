# TAGLINE

Convert AutoCAD slide files to PPM

# TLDR

**Convert AutoCAD slide to PPM**

```sldtoppm [input.sld] > [output.ppm]```

**Specify output size**

```sldtoppm -xsize [640] -ysize [480] [input.sld] > [output.ppm]```

**Extract a slide from a library**

```sldtoppm -lib [slide_name] [library.slb] > [output.ppm]```

**Adjust for square pixels**

```sldtoppm -adjust [input.sld] > [output.ppm]```

**List slides in a library**

```sldtoppm -dir [library.slb]```

# SYNOPSIS

**sldtoppm** [_options_] [_file_]

# PARAMETERS

**-xsize** _n_, **-width** _n_
> Output width in pixels.

**-ysize** _n_, **-height** _n_
> Output height in pixels.

**-adjust**
> Scale width so output pixels are square.

**-lib** _name_
> Extract named slide from library (converts name to upper case).

**-Lib** _name_
> Extract named slide from library (case-sensitive).

**-dir**
> List slides in a slide library.

**-scale** _s_
> Scale the image by factor s (floating point, > 0).

**-info**
> Dump slide header and vectors to stderr.

**-verbose**
> Print slide information to stderr.

# DESCRIPTION

**sldtoppm** converts AutoCAD slide (.sld) files and slide library (.slb) files to PPM format. Slides were used for presentations in AutoCAD. Part of the Netpbm toolkit.

# SEE ALSO

[ppmtoacad](/man/ppmtoacad)(1), [netpbm](/man/netpbm)(1)

