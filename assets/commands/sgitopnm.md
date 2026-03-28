# TAGLINE

Convert SGI images to PNM format

# TLDR

**Convert SGI image to PNM**

```sgitopnm [input.rgb] > [output.pnm]```

**Extract specific channel** (0=red, 1=green, 2=blue)

```sgitopnm -channel [0] [input.rgb] > [output.pgm]```

**Convert with verbose output** showing image information

```sgitopnm -verbose [input.rgb] > [output.pnm]```

# SYNOPSIS

**sgitopnm** [_options_] [_file_]

# PARAMETERS

**-channel** _n_
> Extract specific channel (0=red, 1=green, 2=blue).

**-verbose**
> Print image information.

# DESCRIPTION

**sgitopnm** converts Silicon Graphics image format (SGI RGB) to PNM (Portable aNyMap). SGI images typically use .rgb, .rgba, or .bw extensions. Single-channel images produce PGM output; multi-channel images produce PPM. Part of the Netpbm toolkit.

# SEE ALSO

[pnmtosgi](/man/pnmtosgi)(1), [rletopnm](/man/rletopnm)(1)

