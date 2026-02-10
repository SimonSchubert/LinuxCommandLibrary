# TAGLINE

flips and rotates PAM/PNM images

# TLDR

**Flip horizontally**

```pamflip -leftright [input.pam] > [output.pam]```

**Flip vertically**

```pamflip -topbottom [input.pam] > [output.pam]```

**Rotate 90 clockwise**

```pamflip -rotate90 [input.pam] > [output.pam]```

**Rotate 180**

```pamflip -rotate180 [input.pam] > [output.pam]```

# SYNOPSIS

**pamflip** [_options_] [_file_]

# PARAMETERS

**-leftright**
> Flip horizontally.

**-topbottom**
> Flip vertically.

**-rotate90**
> Rotate 90 degrees clockwise.

**-rotate180**
> Rotate 180 degrees.

**-rotate270**
> Rotate 270 degrees clockwise.

**-transpose**
> Transpose image.

# DESCRIPTION

**pamflip** flips and rotates PAM/PNM images. Modern replacement for pnmflip with PAM support. Part of Netpbm toolkit.

# SEE ALSO

[pnmflip](/man/pnmflip)(1), [pnmrotate](/man/pnmrotate)(1)

