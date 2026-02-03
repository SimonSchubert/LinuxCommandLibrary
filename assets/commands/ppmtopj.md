# TLDR

**Convert PPM to HP PaintJet format**

```ppmtopj [input.ppm] > [output.pj]```

**Specify gamma correction**

```ppmtopj -gamma [1.0] [input.ppm] > [output.pj]```

# SYNOPSIS

**ppmtopj** [_options_] [_file_]

# PARAMETERS

**-gamma** _n_
> Gamma correction value.

**-xres** _n_
> Horizontal resolution.

**-yres** _n_
> Vertical resolution.

# DESCRIPTION

**ppmtopj** converts PPM images to HP PaintJet printer format for direct printing. Part of Netpbm toolkit.

# SEE ALSO

[pjtoppm](/man/pjtoppm)(1), [ppmtopjxl](/man/ppmtopjxl)(1)

