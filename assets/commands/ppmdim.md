# TAGLINE

Dim PPM image by brightness factor

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

**ppmdim** reduces the brightness of a PPM image by multiplying each pixel value by the specified factor. A factor of 1.0 leaves the image unchanged, while 0.0 produces a completely black image. Reads from stdin if no file is specified.

This is the complement of **ppmflash**, which brightens toward white. Both tools are useful for creating fade-to-black or fade-to-white animation effects when applied with varying factors across a sequence of frames. Part of the Netpbm toolkit.

This program is largely superseded by **pamfunc** (with the -multiplier option), which is more general. ppmdim remains available for backward compatibility and may be faster due to its use of integer arithmetic.

# CAVEATS

Factor 1.0 is no change, 0.0 is black. Only works with PPM format images. Part of Netpbm suite.

# HISTORY

ppmdim was created as part of **Netpbm** for image dimming.

# SEE ALSO

[ppmflash](/man/ppmflash)(1), [pamfunc](/man/pamfunc)(1), [ppmbrighten](/man/ppmbrighten)(1), [ppm](/man/ppm)(5)

