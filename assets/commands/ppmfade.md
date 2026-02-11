# TAGLINE

Create fade transition between images

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

**ppmfade** generates a sequence of PPM frames that create a fade transition between two images. The output is a series of numbered files that can be assembled into an animation or video sequence.

Multiple fade modes are available, including crossfade between two images, fade to black, and fade to white. The number of intermediate frames controls the transition speed and smoothness. Part of the Netpbm toolkit.

# CAVEATS

Creates numbered output files. Part of Netpbm suite.

# HISTORY

ppmfade was created as part of **Netpbm** for video fade effects.

# SEE ALSO

[ppmmix](/man/ppmmix)(1), [ppmmorph](/man/ppmmorph)(1), [ppm](/man/ppm)(5)

