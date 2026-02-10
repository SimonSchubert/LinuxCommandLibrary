# TAGLINE

normalizes contrast in PGM grayscale images

# TLDR

**Normalize image contrast**

```pgmnorm [input.pgm] > [output.pgm]```

**Normalize with percentile**

```pgmnorm -bpercent [2] -wpercent [1] [input.pgm] > [output.pgm]```

# SYNOPSIS

**pgmnorm** [_options_] [_file_]

# PARAMETERS

**-bpercent** _n_
> Black percentile cutoff.

**-wpercent** _n_
> White percentile cutoff.

**-bvalue** _n_
> Black value.

**-wvalue** _n_
> White value.

# DESCRIPTION

**pgmnorm** normalizes contrast in PGM grayscale images. Stretches histogram to use full dynamic range. Part of Netpbm toolkit for image enhancement.

# SEE ALSO

[pnmnorm](/man/pnmnorm)(1), [pgmhist](/man/pgmhist)(1)

