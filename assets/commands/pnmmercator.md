# TAGLINE

Convert between map projections for images

# TLDR

**Apply Mercator projection**

```pnmmercator [input.pnm] > [output.pnm]```

**Inverse projection**

```pnmmercator -inverse [input.pnm] > [output.pnm]```

# SYNOPSIS

**pnmmercator** [_options_] [_file_]

# PARAMETERS

**-inverse**
> Convert from Mercator to equirectangular.

# DESCRIPTION

**pnmmercator** converts PNM images between equirectangular (plate carr&eacute;e) and Mercator map projections. The input image is treated as a map where rows correspond to latitude lines and columns to longitude lines.

The forward transform converts equirectangular to Mercator projection, stretching areas near the poles. The **-inverse** option reverses this, converting from Mercator back to equirectangular. Part of the Netpbm toolkit.

# SEE ALSO

[pamscale](/man/pamscale)(1), [pnmshear](/man/pnmshear)(1)

