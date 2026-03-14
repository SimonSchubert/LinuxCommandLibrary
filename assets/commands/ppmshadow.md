# TAGLINE

Add drop shadow effect to PPM images

# TLDR

**Add a default drop shadow**

```ppmshadow [input.ppm] > [output.ppm]```

**Specify blur radius for shadow softness**

```ppmshadow -b [8] [input.ppm] > [output.ppm]```

**Specify shadow offset direction**

```ppmshadow -x [5] -y [5] [input.ppm] > [output.ppm]```

**Create a translucent shadow**

```ppmshadow -t [input.ppm] > [output.ppm]```

# SYNOPSIS

**ppmshadow** [_options_] [_file_]

# PARAMETERS

_FILE_
> Input PPM file. Reads from stdin if omitted.

**-b** _N_
> Blur radius controlling shadow softness (default: 11).

**-x** _N_
> Horizontal shadow offset in pixels (default: blur radius / 2).

**-y** _N_
> Vertical shadow offset in pixels (default: same as -x).

**-t**
> Create a translucent shadow instead of a solid black one.

# DESCRIPTION

**ppmshadow** adds a drop shadow effect to a PPM image, creating the appearance of the image floating above a background. The shadow is created by blurring a darkened copy of the image and placing it offset behind the original.

The blur radius controls shadow softness, while x and y offsets control the apparent light direction. The **-t** option creates a translucent shadow that allows the background to show through. Part of the Netpbm toolkit.

The input image must have a transparent (black) background area for the shadow to be visible. The output image is larger than the input by the shadow offset.

# CAVEATS

Requires the image to have a transparent (black) background around the subject for the shadow to appear correctly. Internally uses pnmconvol for blurring, which can be slow for large blur radii. Part of the Netpbm suite.

# HISTORY

ppmshadow was created by **John Walker** as part of the **Netpbm** toolkit for image shadow effect generation.

# SEE ALSO

[ppm](/man/ppm)(5), [pnmcomp](/man/pnmcomp)(1), [netpbm](/man/netpbm)(1), [pnmconvol](/man/pnmconvol)(1)
