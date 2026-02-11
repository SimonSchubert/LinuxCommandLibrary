# TAGLINE

Generate pixel value histogram images

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

**pnmhistmap** creates a visual histogram image showing the distribution of pixel values in a PNM image. The output is a PNM image where the horizontal axis represents sample values and the vertical axis shows how many pixels have each value.

For color images, separate histograms are drawn for each channel. The **-width** and **-height** options control the output image dimensions. The **-white** flag uses a white background instead of the default black, and **-verbose** prints statistical information about the distribution. Part of the Netpbm toolkit.

# SEE ALSO

[pgmhist](/man/pgmhist)(1), [ppmhist](/man/ppmhist)(1)

