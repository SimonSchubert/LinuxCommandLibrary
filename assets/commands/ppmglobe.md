# TAGLINE

Create printable paper globe strips

# TLDR

**Create globe strips**

```ppmglobe [strips] [input.ppm] [output]```

**Create 12-strip globe**

```ppmglobe 12 [map.ppm] globe```

# SYNOPSIS

**ppmglobe** _strips_ _input_ _output_

# PARAMETERS

_STRIPS_
> Number of globe strips.

_INPUT_
> Input map image.

_OUTPUT_
> Output filename base.

# DESCRIPTION

**ppmglobe** converts an equirectangular map projection image into a set of tapered strips that can be printed, cut out, and assembled into a paper globe. The number of strips determines how many pieces the globe is divided into, with more strips producing a smoother sphere.

The input image should be in equirectangular (plate carrée) projection, where longitude maps linearly to the x-axis and latitude to the y-axis. Each output strip is saved as a separate numbered PPM file. Part of the Netpbm toolkit.

# CAVEATS

Assumes equirectangular input. Part of Netpbm suite.

# HISTORY

ppmglobe was created as part of **Netpbm** for paper globe generation.

# SEE ALSO

[ppm](/man/ppm)(5)

