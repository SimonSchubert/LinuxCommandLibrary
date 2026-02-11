# TAGLINE

Add text labels to PPM images

# TLDR

**Add text label to image**

```ppmlabel -text "[Hello World]" [input.ppm] > [output.ppm]```

**Add label at position**

```ppmlabel -x [10] -y [20] -text "[Label]" [input.ppm] > [output.ppm]```

**Add label with color**

```ppmlabel -color [white] -text "[Label]" [input.ppm] > [output.ppm]```

# SYNOPSIS

**ppmlabel** [_options_] [_file_]

# PARAMETERS

**-text** _string_
> Text to add.

**-x** _pixels_
> X position.

**-y** _pixels_
> Y position.

**-color** _color_
> Text color.

**-background** _color_
> Background color.

**-angle** _degrees_
> Rotation angle.

**-size** _pixels_
> Font size.

# DESCRIPTION

**ppmlabel** adds text labels to PPM images. Part of Netpbm toolkit. Useful for annotating images with captions or watermarks.

# SEE ALSO

[pbmtext](/man/pbmtext)(1), [pnmcomp](/man/pnmcomp)(1)

