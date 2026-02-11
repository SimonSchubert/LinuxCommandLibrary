# TAGLINE

Reduce colors with dithering patterns

# TLDR

**Dither image**

```ppmdither [input.ppm] > [output.ppm]```

**Specify colors per channel**

```ppmdither -red [4] -green [4] -blue [4] [input.ppm] > [output.ppm]```

**Floyd-Steinberg dithering**

```ppmdither -fs [input.ppm] > [output.ppm]```

# SYNOPSIS

**ppmdither** [_options_] [_file_]

# PARAMETERS

_FILE_
> Input PPM file.

**-red** _N_
> Red channel levels.

**-green** _N_
> Green channel levels.

**-blue** _N_
> Blue channel levels.

**-fs**
> Floyd-Steinberg dithering.

# DESCRIPTION

**ppmdither** reduces the number of colors in a PPM image using dithering, which simulates unavailable colors by arranging available colors in patterns that appear blended at a distance. The number of levels per color channel can be specified independently for red, green, and blue.

The default uses ordered dithering, while the **-fs** option selects Floyd-Steinberg error diffusion dithering which generally produces higher quality results with less visible patterning. Unlike quantization (ppmquant), dithering does not choose optimal colors but distributes error across neighboring pixels. Part of the Netpbm toolkit.

# CAVEATS

Different from quantization. Part of Netpbm suite.

# HISTORY

ppmdither was created as part of **Netpbm** for color dithering.

# SEE ALSO

[ppmquant](/man/ppmquant)(1), [pnmremap](/man/pnmremap)(1), [ppm](/man/ppm)(5)

