# TAGLINE

Apply non-linear smoothing filters to images

# TLDR

**Smooth noise** with alpha-trimmed mean filter

```pnmnlfilt [0.4] [0.8] [input.pnm] > [output.pnm]```

**Optimal estimation smoothing** (alpha 1.0-2.0)

```pnmnlfilt [1.2] [1.0] [input.pnm] > [output.pnm]```

**Edge enhancement** (negative alpha)

```pnmnlfilt [-0.3] [0.8] [input.pnm] > [output.pnm]```

# SYNOPSIS

**pnmnlfilt** _alpha_ _radius_ [_pnmfile_]

# PARAMETERS

_alpha_
> Filter mode selector. 0.0-0.5: alpha-trimmed mean (smoothing). 1.0-2.0: optimal estimation smoothing. -0.1 to -0.9: edge enhancement.

_radius_
> Hexagonal neighborhood radius. Recommended 0.55-1.0 for smoothing, 0.5-0.9 for edge enhancement. Smaller values reduce effect.

# DESCRIPTION

**pnmnlfilt** applies a non-linear filter to a PNM image, combining noise reduction with edge preservation. The single alpha parameter selects between three distinct modes: alpha-trimmed mean filter for smoothing and noise reduction (alpha 0.0-0.5), optimal estimation smoothing that adapts to local variance (alpha 1.0-2.0), and edge enhancement that sharpens transitions (negative alpha).

The radius parameter controls the hexagonal pixel neighborhood size. Larger radii produce stronger effect but may blur fine details. Unlike simple convolution filters, pnmnlfilt avoids destroying sharp edges during smoothing.

# CAVEATS

No pnmnlfilt-specific command-line flags exist; only standard libnetpbm options apply. Part of the Netpbm toolkit.

# SEE ALSO

[pnmsmooth](/man/pnmsmooth)(1), [pnmconvol](/man/pnmconvol)(1)

