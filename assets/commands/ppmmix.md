# TAGLINE

Blend two PPM images together

# TLDR

**Mix two images**

```ppmmix [factor] [image1.ppm] [image2.ppm] > [output.ppm]```

**50% blend**

```ppmmix 0.5 [a.ppm] [b.ppm] > [blend.ppm]```

**25% from first image**

```ppmmix 0.25 [a.ppm] [b.ppm] > [output.ppm]```

# SYNOPSIS

**ppmmix** _factor_ _file1_ _file2_

# PARAMETERS

_FACTOR_
> Mixing factor (0.0-1.0).

_FILE1_
> First input image.

_FILE2_
> Second input image.

# DESCRIPTION

**ppmmix** blends two PPM images together using linear interpolation. The mixing factor controls the contribution of each image: a factor of 0.0 produces entirely the first image, 1.0 produces entirely the second, and values between create a proportional blend.

Both input images must have the same dimensions. This tool is useful for creating crossfade effects, image compositing, and generating intermediate frames for transitions. Part of the Netpbm toolkit.

# CAVEATS

Images must be same size. Part of Netpbm suite.

# HISTORY

ppmmix was created as part of **Netpbm** for image blending.

# SEE ALSO

[ppmfade](/man/ppmfade)(1), [pamcomp](/man/pamcomp)(1), [ppm](/man/ppm)(5)

