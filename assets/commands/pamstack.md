# TAGLINE

combines multiple single-plane images into a multi-plane PAM

# TLDR

**Stack images as layers**

```pamstack [red.pgm] [green.pgm] [blue.pgm] > [rgb.pam]```

**Stack with alpha channel**

```pamstack [image.ppm] [alpha.pgm] > [rgba.pam]```

# SYNOPSIS

**pamstack** [_options_] _files_...

# PARAMETERS

_files_
> Input image files (same dimensions).

**-tupletype** _type_
> Output tuple type.

# DESCRIPTION

**pamstack** combines multiple single-plane images into a multi-plane PAM. Creates RGB from separate R, G, B files or adds alpha channel. Part of Netpbm toolkit.

# SEE ALSO

[pamsplit](/man/pamsplit)(1), [pamchannel](/man/pamchannel)(1)

