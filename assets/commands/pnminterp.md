# TAGLINE

Enlarge PNM images by interpolation

# TLDR

**Interpolate image (scale up)**

```pnminterp [factor] [input.pnm] > [output.pnm]```

**Double image size**

```pnminterp 2 [input.pnm] > [output.pnm]```

**Triple image size**

```pnminterp 3 [input.pnm] > [output.pnm]```

# SYNOPSIS

**pnminterp** _n_ [_file_]

# PARAMETERS

_N_
> Scaling factor (integer multiplier).

_FILE_
> Input PNM file.

# DESCRIPTION

**pnminterp** enlarges PNM images by an integer factor using bilinear interpolation. Unlike simple pixel replication (as done by pnmenlarge), interpolation produces smoother results by computing weighted averages of neighboring pixels.

The scaling factor must be a positive integer, producing an output image that is N times larger in each dimension. This tool is a simplified interface to pamscale's interpolation mode. Part of the Netpbm toolkit; superseded by **pamscale**.

# CAVEATS

Only integer scale factors. Part of Netpbm suite.

# HISTORY

pnminterp was created as part of **Netpbm** for image interpolation.

# SEE ALSO

[pamscale](/man/pamscale)(1), [pnmscale](/man/pnmscale)(1), [pamenlarge](/man/pamenlarge)(1)

