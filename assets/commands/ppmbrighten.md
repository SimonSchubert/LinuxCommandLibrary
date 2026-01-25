# TLDR

**Increase brightness**

```ppmbrighten -v [50] [input.ppm] > [output.ppm]```

**Decrease saturation**

```ppmbrighten -s [-30] [input.ppm] > [output.ppm]```

**Adjust both**

```ppmbrighten -v [20] -s [10] [input.ppm] > [output.ppm]```

**Normalize first**

```ppmbrighten -n -v [30] [input.ppm] > [output.ppm]```

# SYNOPSIS

**ppmbrighten** [_options_] [_ppmfile_]

# PARAMETERS

**-v** _value_
> Value (brightness) change (-100 to 100).

**-s** _saturation_
> Saturation change (-100 to 100).

**-n**
> Normalize value range first.

# DESCRIPTION

**ppmbrighten** adjusts the brightness and saturation of a PPM image. It works in HSV color space, changing value (V) and saturation (S) components.

Part of Netpbm toolkit.

# EXAMPLES

```bash
# Brighten image
ppmbrighten -v 30 photo.ppm > bright.ppm

# Desaturate (toward grayscale)
ppmbrighten -s -50 photo.ppm > muted.ppm

# Increase vibrancy
ppmbrighten -s 40 photo.ppm > vivid.ppm

# Normalize and brighten
ppmbrighten -n -v 20 dark.ppm > fixed.ppm

# Chain operations
jpegtopnm photo.jpg | ppmbrighten -v 20 | pnmtojpeg > bright.jpg
```

# CAVEATS

Values outside -100 to 100 are clamped. Works on PPM only. Consider pamaltsat for more options.

# HISTORY

ppmbrighten is part of **Netpbm** by **Jef Poskanzer** and contributors for basic color adjustment.

# SEE ALSO

[ppmcolormask](/man/ppmcolormask)(1), [ppmgamma](/man/ppmgamma)(1), [pamaltsat](/man/pamaltsat)(1), [netpbm](/man/netpbm)(1)
