# TLDR

**Enhance image sharpness**

```pgmenhance [input.pgm] > [output.pgm]```

**Enhance with custom amount**

```pgmenhance -[3] [input.pgm] > [output.pgm]```

# SYNOPSIS

**pgmenhance** [_options_] [_file_]

# PARAMETERS

**-** _n_
> Enhancement amount (1-9, default 3).

# DESCRIPTION

**pgmenhance** sharpens PGM grayscale images using edge enhancement. Applies unsharp masking to increase apparent sharpness. Part of Netpbm toolkit.

# SEE ALSO

[pnmsharpen](/man/pnmsharpen)(1), [pgmnorm](/man/pgmnorm)(1)

