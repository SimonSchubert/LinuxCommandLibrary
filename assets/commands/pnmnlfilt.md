# TAGLINE

Apply non-linear smoothing filters to images

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

**pnmnlfilt** applies non-linear filters to PNM images for noise reduction while preserving edges. The filter type is controlled by the alpha parameter: values near 0 produce an alpha-trimmed mean filter (noise reduction), values near 0.5 produce an optimal estimation filter, and values near 1 produce an edge enhancement filter.

The radius parameter controls the filter's spatial extent. Larger radii produce stronger smoothing but may blur fine details. This tool is useful for removing noise without destroying sharp edges, unlike simple convolution filters. Part of the Netpbm toolkit.

# SEE ALSO

[pnmsmooth](/man/pnmsmooth)(1), [pnmconvol](/man/pnmconvol)(1)

