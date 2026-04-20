# TAGLINE

Convert SPOT satellite images to PGM

# TLDR

**Convert the default band** of a SPOT image to PGM

```spottopgm [input.spot] > [output.pgm]```

**Select a specific band** (1, 2 or 3)

```spottopgm -2 [input.spot] > [output.pgm]```

**Crop to a rectangular region** of columns and lines

```spottopgm [firstcol] [firstline] [lastcol] [lastline] [input.spot] > [output.pgm]```

# SYNOPSIS

**spottopgm** [**-1**|**-2**|**-3**] [_firstcol_ _firstline_ _lastcol_ _lastline_] [_file_]

# PARAMETERS

**-1**, **-2**, **-3**
> Select which of the three spectral bands to extract (infrared, visible, and ultraviolet, though the Netpbm author acknowledges the exact mapping is uncertain). Only one band at a time is produced; combined multispectral PPM output is not supported.

_firstcol_ _firstline_ _lastcol_ _lastline_
> When supplied, crop the output to the rectangle bounded by the given column/line indices.

# DESCRIPTION

**spottopgm** converts images in the SPOT satellite format to PGM (Portable Graymap) format. The SPOT format is used by imagery from the SPOT (Satellite Pour l'Observation de la Terre) Earth-observation satellite system, which captures high-resolution imagery for cartography, agriculture, and environmental monitoring. This tool is part of the Netpbm image-processing toolkit, which provides converters between many image formats.

# SEE ALSO

[fitstopnm](/man/fitstopnm)(1), [pgmnorm](/man/pgmnorm)(1)

