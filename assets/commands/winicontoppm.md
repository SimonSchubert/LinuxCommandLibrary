# TAGLINE

Convert Windows icons to PPM format

# TLDR

**Convert Windows icon to PPM**

```winicontoppm [input.ico] > [output.ppm]```

**Extract specific image**

```winicontoppm -image [0] [input.ico] > [output.ppm]```

# SYNOPSIS

**winicontoppm** [_options_] [_file_]

# PARAMETERS

**-image** _n_
> Extract specific image index.

**-verbose**
> Print icon information.

# DESCRIPTION

**winicontoppm** converts Windows ICO files to PPM format. Does not preserve transparency; use winicontopam for alpha channel. Part of Netpbm toolkit.

# SEE ALSO

[ppmtowinicon](/man/ppmtowinicon)(1), [winicontopam](/man/winicontopam)(1)

