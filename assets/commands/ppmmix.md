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

**ppmmix** blends two PPM images. Linear interpolation.

The tool creates crossfade effects. Part of Netpbm.

ppmmix blends images.

# CAVEATS

Images must be same size. Part of Netpbm suite.

# HISTORY

ppmmix was created as part of **Netpbm** for image blending.

# SEE ALSO

[ppmfade](/man/ppmfade)(1), [pamcomp](/man/pamcomp)(1), [ppm](/man/ppm)(5)

