# TLDR

**Apply non-linear filter**

```pnmnlfilt [0.5] [0.5] [input.pnm] > [output.pnm]```

# SYNOPSIS

**pnmnlfilt** _alpha_ _radius_ [_file_]

# PARAMETERS

_alpha_
> Filter type selector (0-1).

_radius_
> Filter radius.

# DESCRIPTION

**pnmnlfilt** applies non-linear filters to PNM images. Provides alpha-trimmed mean and edge-preserving smoothing. Part of Netpbm toolkit.

# SEE ALSO

[pnmsmooth](/man/pnmsmooth)(1), [pnmconvol](/man/pnmconvol)(1)

