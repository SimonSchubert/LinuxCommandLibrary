# TAGLINE

Convert GIF images to PNM format

# TLDR

**Convert GIF to PNM**

```giftopnm [input.gif] > [output.pnm]```

**Convert specific frame**

```giftopnm --image [2] [input.gif] > [output.pnm]```

**Show comments**

```giftopnm --comments [input.gif]```

# SYNOPSIS

**giftopnm** [_options_] [_file_]

# PARAMETERS

**--image** _num_
> Select specific image/frame.

**--comments**
> Print image comments.

**--all-images**
> Output all frames.

# DESCRIPTION

**giftopnm** converts GIF images into the Portable Any Map (PNM) format family, which includes PBM (bitmap), PGM (grayscale), and PPM (color) formats. It is a core component of the Netpbm image processing toolkit.

The tool automatically selects the appropriate output format based on the input GIF's color characteristics. For animated GIFs, it can extract individual frames or output all frames sequentially. PNM formats are uncompressed, making them ideal intermediate formats for image processing pipelines.

# SEE ALSO

[ppmtogif](/man/ppmtogif)(1), [pamtogif](/man/pamtogif)(1)
