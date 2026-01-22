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

**pnminterp** enlarges PNM images by interpolation. Smooth scaling method.

The tool scales by integer factor. Uses bilinear interpolation.

pnminterp enlarges images.

# CAVEATS

Only integer scale factors. Part of Netpbm suite.

# HISTORY

pnminterp was created as part of **Netpbm** for image interpolation.

# SEE ALSO

[pamscale](/man/pamscale)(1), [pnmscale](/man/pnmscale)(1), [pamenlarge](/man/pamenlarge)(1)

