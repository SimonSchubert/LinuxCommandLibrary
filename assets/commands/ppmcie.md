# TAGLINE

Generate CIE chromaticity diagram images

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

**ppmcie** generates a CIE chromaticity diagram as a PPM image, showing the full gamut of visible colors plotted on the standard CIE 1931 xy color space. The diagram is a standard reference in color science for visualizing color gamuts and comparing display or printing capabilities.

Options control the output size, illuminant white point, and whether spectral wavelength labels are included. The generated image can be used for color science education, display calibration documentation, or as a reference overlay for gamut comparisons. Part of the Netpbm toolkit.

# CAVEATS

Color science tool. Part of Netpbm suite.

# HISTORY

ppmcie was created as part of **Netpbm** for color science visualization.

# SEE ALSO

[ppm](/man/ppm)(5), [ppmgamma](/man/ppmgamma)(1)

