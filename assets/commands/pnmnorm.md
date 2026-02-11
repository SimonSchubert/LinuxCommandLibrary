# TAGLINE

Normalize contrast in PNM images

# TLDR

**Normalize image contrast**

```pnmnorm [input.pnm] > [output.pnm]```

**Specify brightness range**

```pnmnorm -bpercent [5] -wpercent [5] [input.pnm] > [output.pnm]```

**Preserve midpoint**

```pnmnorm -midvalue [127] [input.pnm] > [output.pnm]```

# SYNOPSIS

**pnmnorm** [_options_] [_file_]

# PARAMETERS

_FILE_
> Input PNM file.

**-bpercent** _N_
> Black point percentage.

**-wpercent** _N_
> White point percentage.

**-bvalue** _N_
> Black cutoff value.

**-wvalue** _N_
> White cutoff value.

**-midvalue** _N_
> Middle gray value to preserve.

# DESCRIPTION

**pnmnorm** normalizes the contrast of PNM images by stretching the histogram to use the full dynamic range. It finds the darkest and brightest pixel values and linearly maps them to the minimum and maximum possible values.

The **-bpercent** and **-wpercent** options control how aggressively the black and white points are clipped, ignoring a percentage of outlier pixels at each end. The **-midvalue** option preserves a specific middle gray value during the normalization. Part of the Netpbm toolkit.

# CAVEATS

May clip extreme values. Part of Netpbm suite.

# HISTORY

pnmnorm was created as part of **Netpbm** for automatic contrast enhancement.

# SEE ALSO

[pnmhisteq](/man/pnmhisteq)(1), [pnmgamma](/man/pnmgamma)(1), [ppmnorm](/man/ppmnorm)(1)

