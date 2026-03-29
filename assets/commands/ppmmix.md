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

**ppmmix** _fadefactor_ _ppmfile1_ _ppmfile2_

# PARAMETERS

_FADEFACTOR_
> Mixing factor (0.0-1.0). 0.0 produces entirely the first image, 1.0 produces entirely the second image.

_PPMFILE1_
> First input PPM image.

_PPMFILE2_
> Second input PPM image.

# DESCRIPTION

**ppmmix** blends two PPM images together using the specified fade factor. The factor controls the contribution of each image: 0.0 produces entirely the first image, 1.0 produces entirely the second, and values between create a proportional blend.

The fade factor is applied to brightness, not light intensity. This means a linearly increasing fade factor between a black and white image produces linearly increasing perceived brightness, but the actual light intensity increases faster at the bright end. For light-intensity-based mixing, use **pamcomp** instead.

Both input images must have the same dimensions and the same maxval. Part of the Netpbm toolkit.

# CAVEATS

Both images must have the same dimensions and maxval. There are no ppmmix-specific options; it only recognizes common libnetpbm options.

# HISTORY

ppmmix was created as part of **Netpbm** for image blending.

# SEE ALSO

[ppmfade](/man/ppmfade)(1), [pamcomp](/man/pamcomp)(1), [ppm](/man/ppm)(5)

