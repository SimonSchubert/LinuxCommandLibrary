# TAGLINE

Generate HSV color wheel image

# TLDR

**Generate color wheel**

```ppmwheel [diameter] > [output.ppm]```

**Create 200px color wheel**

```ppmwheel 200 > [wheel.ppm]```

# SYNOPSIS

**ppmwheel** _diameter_

# PARAMETERS

_DIAMETER_
> Wheel diameter in pixels.

# DESCRIPTION

**ppmwheel** generates a PPM image of an HSV color wheel with the specified diameter in pixels. The output is a square image with the color wheel centered. Hue varies around the circumference, saturation varies from center to edge, and value is constant at maximum.

Part of the Netpbm suite of image manipulation tools.

# CAVEATS

Output is always a square PPM image. Pipe through other Netpbm tools or ImageMagick to convert to other formats.

# HISTORY

ppmwheel was created as part of **Netpbm** for color wheel generation.

# SEE ALSO

[ppm](/man/ppm)(5), [ppmrainbow](/man/ppmrainbow)(1)

