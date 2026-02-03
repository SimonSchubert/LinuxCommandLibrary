# TLDR

**Quantize multiple images to same palette**

```pnmquantall [256] [image1.pnm] [image2.pnm] ...```

# SYNOPSIS

**pnmquantall** _ncolors_ _files_...

# PARAMETERS

_ncolors_
> Maximum number of colors.

_files_
> Input image files (modified in place).

# DESCRIPTION

**pnmquantall** reduces multiple PNM images to use a common color palette. Useful for creating consistent color animations. Part of Netpbm toolkit.

# CAVEATS

Modifies files in place.

# SEE ALSO

[ppmquantall](/man/ppmquantall)(1), [pnmquant](/man/pnmquant)(1)

