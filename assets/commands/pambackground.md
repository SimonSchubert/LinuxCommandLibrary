# TAGLINE

creates a bitmap mask identifying background pixels in a PAM/PNM image

# TLDR

**Create background mask from image**

```pambackground [input.pam] > [output.pbm]```

# SYNOPSIS

**pambackground** [_options_] [_file_]

# PARAMETERS

**-verbose**
> Print processing information.

# DESCRIPTION

**pambackground** creates a bitmap mask identifying background pixels in a PAM/PNM image. Uses corner pixels to determine background color and flood-fills to find connected background regions. Part of Netpbm toolkit.

# SEE ALSO

[ppmcolormask](/man/ppmcolormask)(1), [pamcut](/man/pamcut)(1)

