# TLDR

**Generate CIE chromaticity diagram**

```ppmcie > [output.ppm]```

**Specify size**

```ppmcie -size [512] > [output.ppm]```

**Generate with specific illuminant**

```ppmcie -illuminant [D65] > [output.ppm]```

# SYNOPSIS

**ppmcie** [_options_]

# PARAMETERS

**-size** _N_
> Output size in pixels.

**-illuminant** _NAME_
> White point illuminant.

**-spectral** _N_
> Spectral type.

# DESCRIPTION

**ppmcie** generates CIE chromaticity diagram. Color science visualization.

The tool creates color space charts. Part of Netpbm.

ppmcie creates CIE diagrams.

# CAVEATS

Color science tool. Part of Netpbm suite.

# HISTORY

ppmcie was created as part of **Netpbm** for color science visualization.

# SEE ALSO

[ppm](/man/ppm)(5), [ppmgamma](/man/ppmgamma)(1)

