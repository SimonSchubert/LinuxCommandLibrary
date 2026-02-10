# TAGLINE

creates shaded relief maps

# TLDR

**Create shaded relief**

```pamshadedrelief [heightmap.pgm] > [relief.ppm]```

**Set light angle**

```pamshadedrelief -gamma [2.0] [heightmap.pgm] > [relief.ppm]```

# SYNOPSIS

**pamshadedrelief** [_options_] [_file_]

# PARAMETERS

_FILE_
> Input grayscale height map.

**-gamma** _VALUE_
> Gamma correction.

# DESCRIPTION

**pamshadedrelief** creates shaded relief maps. Renders 3D terrain effect.

The tool simulates terrain lighting. Part of Netpbm.

# CAVEATS

Part of Netpbm. Input is height map. Grayscale to color.

# HISTORY

pamshadedrelief is part of **Netpbm** for terrain visualization.

# SEE ALSO

[pgmtoppm](/man/pgmtoppm)(1), [netpbm](/man/netpbm)(1)

