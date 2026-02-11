# TAGLINE

Add drop shadow effect to images

# TLDR

**Add drop shadow**

```ppmshadow [input.ppm] > [output.ppm]```

**Specify blur radius**

```ppmshadow -b [8] [input.ppm] > [output.ppm]```

**Specify shadow offset**

```ppmshadow -x [5] -y [5] [input.ppm] > [output.ppm]```

# SYNOPSIS

**ppmshadow** [_options_] [_file_]

# PARAMETERS

_FILE_
> Input PPM file.

**-b** _N_
> Blur radius.

**-x** _N_
> X offset.

**-y** _N_
> Y offset.

**-t**
> Translucent shadow.

# DESCRIPTION

**ppmshadow** adds a drop shadow effect to a PPM image, creating the appearance of the image floating above a background. The shadow is created by blurring a darkened copy of the image and placing it offset behind the original.

The blur radius controls shadow softness, while x and y offsets control the apparent light direction. The **-t** option creates a translucent shadow that allows the background to show through. Part of the Netpbm toolkit.

# CAVEATS

Requires transparent background. Part of Netpbm suite.

# HISTORY

ppmshadow was created as part of **Netpbm** for shadow effect generation.

# SEE ALSO

[ppm](/man/ppm)(5), [pnmcomp](/man/pnmcomp)(1)

