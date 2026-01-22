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

**ppmshift** randomly shifts image rows horizontally. Distortion effect.

The tool creates glitch-like effects. Part of Netpbm.

ppmshift distorts images.

# CAVEATS

Random per-row shift. Part of Netpbm suite.

# HISTORY

ppmshift was created as part of **Netpbm** for image distortion effects.

# SEE ALSO

[ppm](/man/ppm)(5), [ppmspread](/man/ppmspread)(1)

