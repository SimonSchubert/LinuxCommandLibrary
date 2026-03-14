# TAGLINE

Quantize multiple PPM images to a shared color palette

# TLDR

**Quantize images to same 256-color palette**

```ppmquantall [256] [*.ppm]```

**Quantize with output to new files** (using extension)

```ppmquantall -ext [.quant] [256] [*.ppm]```

# SYNOPSIS

**ppmquantall** [**-ext** _extension_] _ncolors_ _files_...

# PARAMETERS

**-ext** _extension_
> Write output files with this extension appended instead of overwriting originals.

_ncolors_
> Maximum number of colors in the shared palette.

_files_
> PPM files to quantize.

# DESCRIPTION

**ppmquantall** takes multiple PPM images as input, chooses the best _ncolors_ colors to represent all images, maps existing colors to the new palette, and overwrites the input files with the quantized versions. Useful for creating GIF animations where all frames must share a single palette.

Part of the Netpbm toolkit. Superseded by **pnmquantall** (Netpbm 10.58, March 2012), which handles all Netpbm input formats.

# CAVEATS

Modifies input files in place unless **-ext** is specified. Use **-ext** to preserve originals.

# SEE ALSO

[pnmquantall](/man/pnmquantall)(1), [ppmquant](/man/ppmquant)(1)

