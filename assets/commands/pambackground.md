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

[ppmcolormask](/man/ppmcolormask)(1), [pamcut](/man/pamcut)(1)

