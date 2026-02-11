# TAGLINE

Apply embossed relief effect to images

# TLDR

**Create embossed relief effect**

```ppmrelief [input.ppm] > [output.ppm]```

# SYNOPSIS

**ppmrelief** [_file_]

# PARAMETERS

_FILE_
> Input PPM file.

# DESCRIPTION

**ppmrelief** applies a convolution filter to a PPM image that creates an embossed relief effect, giving the image a three-dimensional chiseled appearance. Edges in the original image appear as raised ridges lit from one direction, while flat areas become a neutral gray.

The effect works by computing the difference between adjacent pixels, which highlights edges while suppressing uniform regions. Part of the Netpbm toolkit.

# CAVEATS

Simple convolution filter. Part of Netpbm suite.

# HISTORY

ppmrelief was created as part of **Netpbm** for relief effect generation.

# SEE ALSO

[ppm](/man/ppm)(5), [pnmconvol](/man/pnmconvol)(1), [pgmedge](/man/pgmedge)(1)

