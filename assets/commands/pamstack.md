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

# INSTALL

```apt: sudo apt install netpbm```

```dnf: sudo dnf install netpbm```

```pacman: sudo pacman -S netpbm```

```apk: sudo apk add netpbm```

```zypper: sudo zypper install netpbm```

```brew: brew install netpbm```

```nix: nix profile install nixpkgs#netpbm```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pamsplit](/man/pamsplit)(1)

