# TAGLINE

Quantize multiple images to shared palette

# TLDR

**Quantize images to same palette**

```ppmquantall [256] [*.ppm]```

# SYNOPSIS

**ppmquantall** _ncolors_ _files_...

# PARAMETERS

_ncolors_
> Maximum number of colors.

_files_
> PPM files to quantize.

# DESCRIPTION

**ppmquantall** reduces multiple PPM images to use a common color palette. Files are modified in place. Useful for GIF animations. Part of Netpbm toolkit.

# CAVEATS

Modifies input files in place.

# SEE ALSO

[pnmquantall](/man/pnmquantall)(1), [ppmquant](/man/ppmquant)(1)

