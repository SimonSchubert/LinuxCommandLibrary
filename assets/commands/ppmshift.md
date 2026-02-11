# TAGLINE

Randomly shift image rows horizontally

# TLDR

**Shift image horizontally**

```ppmshift [shift] [input.ppm] > [output.ppm]```

**Random horizontal shift**

```ppmshift 10 [input.ppm] > [output.ppm]```

# SYNOPSIS

**ppmshift** _shift_ [_file_]

# PARAMETERS

_SHIFT_
> Maximum shift amount.

_FILE_
> Input PPM file.

**-seed** _N_
> Random seed.

# DESCRIPTION

**ppmshift** randomly shifts each row of a PPM image horizontally by a random amount up to the specified maximum. This creates a glitch-like distortion effect where the image appears to have horizontal tearing or displacement.

A random seed option allows reproducible results. The effect is similar to analog video signal interference or digital glitch art. Part of the Netpbm toolkit.

# CAVEATS

Random per-row shift. Part of Netpbm suite.

# HISTORY

ppmshift was created as part of **Netpbm** for image distortion effects.

# SEE ALSO

[ppm](/man/ppm)(5), [ppmspread](/man/ppmspread)(1)

