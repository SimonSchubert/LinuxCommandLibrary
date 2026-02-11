# TAGLINE

Normalize PPM image contrast range

# TLDR

**Normalize image contrast**

```ppmnorm [input.ppm] > [output.ppm]```

**Specify percentile range**

```ppmnorm -bpercent [2] -wpercent [1] [input.ppm] > [output.ppm]```

# SYNOPSIS

**ppmnorm** [_options_] [_file_]

# PARAMETERS

_FILE_
> Input PPM file.

**-bpercent** _N_
> Black percentage.

**-wpercent** _N_
> White percentage.

**-bvalue** _N_
> Black cutoff value.

**-wvalue** _N_
> White cutoff value.

# DESCRIPTION

**ppmnorm** normalizes the contrast of a PPM image by stretching its color histogram to use the full available range. Dark images are brightened and washed-out images gain contrast, making it a quick automatic enhancement tool.

The black and white percentile parameters control how aggressively the ends of the histogram are clipped before stretching, preventing outlier pixels from limiting the enhancement. This is an alias for **pnmnorm** operating in color mode. Part of the Netpbm toolkit.

# CAVEATS

Alias for pnmnorm with color. Part of Netpbm suite.

# HISTORY

ppmnorm was created as part of **Netpbm** for color image normalization.

# SEE ALSO

[pnmnorm](/man/pnmnorm)(1), [ppmgamma](/man/ppmgamma)(1), [ppm](/man/ppm)(5)

