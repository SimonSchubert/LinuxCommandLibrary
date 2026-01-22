# TLDR

**Create fade transition**

```ppmfade -f [first.ppm] -l [last.ppm]```

**Fade to black**

```ppmfade -f [image.ppm] -mode black```

**Specify frame count**

```ppmfade -f [first.ppm] -l [last.ppm] -frames [30]```

# SYNOPSIS

**ppmfade** [_options_]

# PARAMETERS

**-f** _FILE_
> First image.

**-l** _FILE_
> Last image.

**-frames** _N_
> Number of frames.

**-mode** _MODE_
> Fade mode (mix, black, etc.).

**-base** _NAME_
> Output filename base.

# DESCRIPTION

**ppmfade** creates fade transitions between images. Animation tool.

The tool generates interpolated frames. Part of Netpbm.

ppmfade creates transitions.

# CAVEATS

Creates numbered output files. Part of Netpbm suite.

# HISTORY

ppmfade was created as part of **Netpbm** for video fade effects.

# SEE ALSO

[ppmmix](/man/ppmmix)(1), [ppmmorph](/man/ppmmorph)(1), [ppm](/man/ppm)(5)

