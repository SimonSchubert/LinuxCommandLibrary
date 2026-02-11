# TAGLINE

Convert PPM images to PCX format

# TLDR

**Convert PPM to PCX**

```ppmtopcx [input.ppm] > [output.pcx]```

**Convert with 256 colors**

```ppmtopcx -256 [input.ppm] > [output.pcx]```

**Convert with 24-bit color**

```ppmtopcx -24bit [input.ppm] > [output.pcx]```

# SYNOPSIS

**ppmtopcx** [_options_] [_file_]

# PARAMETERS

**-256**
> 256 color palette.

**-24bit**
> 24-bit true color.

**-packed**
> Packed pixel mode.

# DESCRIPTION

**ppmtopcx** converts PPM images to PCX format. PCX is an older bitmap format commonly used in DOS applications. Part of Netpbm toolkit.

# SEE ALSO

[pcxtoppm](/man/pcxtoppm)(1), [ppmtobmp](/man/ppmtobmp)(1)

