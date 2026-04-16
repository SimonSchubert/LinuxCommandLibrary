# TAGLINE

Convert Windows icons to PAM format

# TLDR

**Convert Windows icon to PAM** (selects highest-quality image by default)

```winicontopam [input.ico] > [output.pam]```

**Extract a specific image index**

```winicontopam -image=[0] [input.ico] > [output.pam]```

**Extract all images as a multi-image PAM**

```winicontopam -allimages [input.ico] > [output.pam]```

**Include AND mask as a fifth channel**

```winicontopam -andmasks [input.ico] > [output.pam]```

# SYNOPSIS

**winicontopam** [_options_] [_file_]

# PARAMETERS

**-image=**_N_
> Extract image at index _N_ (zero-based). Cannot be combined with **-allimages**.

**-allimages**
> Extract every image in the ICO/CUR file as a multi-image PAM stream.

**-andmasks**
> Emit five-channel PAM with the AND mask as the fifth plane (in addition to RGBA).

**-verbose**
> Print informational messages about the input file.

**-quiet**
> Suppress informational output (standard libnetpbm option).

# DESCRIPTION

**winicontopam** converts Microsoft Windows ICO or CUR files into Netpbm PAM images with an alpha channel. Windows icon files may contain several images at different resolutions and color depths; by default, winicontopam picks the highest-quality one (largest size, then most bits per pixel).

Part of the **Netpbm** toolkit. Read from stdin when no file is given.

# SEE ALSO

[pamtowinicon](/man/pamtowinicon)(1), [winicontoppm](/man/winicontoppm)(1)

