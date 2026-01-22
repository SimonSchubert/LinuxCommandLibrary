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

**ppmnorm** normalizes PPM image contrast. Stretches histogram.

The tool enhances contrast automatically. Part of Netpbm.

ppmnorm normalizes colors.

# CAVEATS

Alias for pnmnorm with color. Part of Netpbm suite.

# HISTORY

ppmnorm was created as part of **Netpbm** for color image normalization.

# SEE ALSO

[pnmnorm](/man/pnmnorm)(1), [ppmgamma](/man/ppmgamma)(1), [ppm](/man/ppm)(5)

