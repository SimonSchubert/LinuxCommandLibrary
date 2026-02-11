# TAGLINE

Generate multi-color gradient images

# TLDR

**Generate rainbow gradient**

```ppmrainbow -width [100] -height [50] [color1] [color2] > [output.ppm]```

**Create red to blue gradient**

```ppmrainbow -width 200 -height 100 red blue > [gradient.ppm]```

**Multiple color gradient**

```ppmrainbow -width 300 -height 50 red yellow green blue > [rainbow.ppm]```

# SYNOPSIS

**ppmrainbow** [_options_] _colors_

# PARAMETERS

_COLORS_
> Color stops.

**-width** _N_
> Output width.

**-height** _N_
> Output height.

**-norepeat**
> Don't repeat spectrum.

# DESCRIPTION

**ppmrainbow** creates a horizontal color gradient image that smoothly transitions through the specified color stops. Any number of named colors can be provided, and the tool interpolates between them evenly across the image width.

This is useful for creating gradient backgrounds, color bars for testing, or decorative elements. The **-norepeat** option prevents the gradient from wrapping back to the first color. Part of the Netpbm toolkit.

# CAVEATS

Horizontal gradient only. Part of Netpbm suite.

# HISTORY

ppmrainbow was created as part of **Netpbm** for gradient generation.

# SEE ALSO

[ppm](/man/ppm)(5), [ppmmake](/man/ppmmake)(1)

