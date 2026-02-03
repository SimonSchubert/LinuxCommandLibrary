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

**giftopnm** converts GIF images to PNM (Portable Any Map) format. Part of the Netpbm image processing toolkit. Can extract individual frames from animated GIFs.

# SEE ALSO

[ppmtogif](/man/ppmtogif)(1), [pamtogif](/man/pamtogif)(1)

