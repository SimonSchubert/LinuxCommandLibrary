# TAGLINE

Convert Windows icons to PAM format

# TLDR

**Convert Windows icon to PAM**

```winicontopam [input.ico] > [output.pam]```

**Extract specific image**

```winicontopam -image [0] [input.ico] > [output.pam]```

# SYNOPSIS

**winicontopam** [_options_] [_file_]

# PARAMETERS

**-image** _n_
> Extract specific image index.

**-allimages**
> Extract all images as multi-image PAM.

# DESCRIPTION

**winicontopam** converts Windows ICO/CUR files to PAM format with alpha channel. Part of Netpbm toolkit.

# SEE ALSO

[pamtowinicon](/man/pamtowinicon)(1), [winicontoppm](/man/winicontoppm)(1)

