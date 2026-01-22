# TLDR

**Dim image**

```ppmdim [factor] [input.ppm] > [output.ppm]```

**Dim by 50%**

```ppmdim 0.5 [input.ppm] > [output.ppm]```

**Dim by 25%**

```ppmdim 0.25 [input.ppm] > [output.ppm]```

# SYNOPSIS

**ppmdim** _factor_ [_file_]

# PARAMETERS

_FACTOR_
> Dimming factor (0.0-1.0).

_FILE_
> Input PPM file.

# DESCRIPTION

**ppmdim** dims PPM images. Reduces brightness.

The tool darkens images by factor. Part of Netpbm.

ppmdim reduces brightness.

# CAVEATS

Factor 1.0 is no change, 0.0 is black. Part of Netpbm suite.

# HISTORY

ppmdim was created as part of **Netpbm** for image dimming.

# SEE ALSO

[ppmbrighten](/man/ppmbrighten)(1), [ppmgamma](/man/ppmgamma)(1), [ppm](/man/ppm)(5)

