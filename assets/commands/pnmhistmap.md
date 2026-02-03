# TLDR

**Create histogram visualization**

```pnmhistmap [input.pnm] > [histogram.pgm]```

**Specify output dimensions**

```pnmhistmap -width [256] -height [100] [input.pnm] > [histogram.pgm]```

# SYNOPSIS

**pnmhistmap** [_options_] [_file_]

# PARAMETERS

**-width** _n_
> Output width.

**-height** _n_
> Output height.

**-white**
> Use white background.

**-verbose**
> Print statistics.

# DESCRIPTION

**pnmhistmap** creates a visual histogram of pixel values in a PNM image. Output is a grayscale image showing value distribution. Part of Netpbm toolkit.

# SEE ALSO

[pgmhist](/man/pgmhist)(1), [ppmhist](/man/ppmhist)(1)

