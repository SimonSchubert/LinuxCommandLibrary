# TAGLINE

applies an oil painting effect to PGM images by selecting the most common gray

# TLDR

**Apply oil painting effect**

```pgmoil [input.pgm] > [output.pgm]```

**Specify smear radius**

```pgmoil -n [3] [input.pgm] > [output.pgm]```

# SYNOPSIS

**pgmoil** [_options_] [_file_]

# PARAMETERS

**-n** _radius_
> Smear radius (default 3).

# DESCRIPTION

**pgmoil** applies an oil painting effect to PGM images by selecting the most common gray value in a neighborhood. Part of Netpbm toolkit.

# SEE ALSO

[pgmbentley](/man/pgmbentley)(1), [ppmspread](/man/ppmspread)(1)

