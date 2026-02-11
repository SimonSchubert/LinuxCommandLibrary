# TAGLINE

Convert SGI images to PNM format

# TLDR

**Convert SGI image to PNM**

```sgitopnm [input.rgb] > [output.pnm]```

**Extract specific channel**

```sgitopnm -channel [0] [input.rgb] > [output.pgm]```

# SYNOPSIS

**sgitopnm** [_options_] [_file_]

# PARAMETERS

**-channel** _n_
> Extract specific channel (0=red, 1=green, 2=blue).

**-verbose**
> Print image information.

# DESCRIPTION

**sgitopnm** converts Silicon Graphics image format (SGI RGB) to PNM. SGI images use .rgb, .rgba, .bw extensions. Part of Netpbm toolkit.

# SEE ALSO

[pnmtosgi](/man/pnmtosgi)(1), [rletopnm](/man/rletopnm)(1)

