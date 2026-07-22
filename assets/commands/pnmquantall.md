# TAGLINE

Quantize multiple images to shared palette

# TLDR

**Quantize multiple images to same palette**

```pnmquantall [256] [image1.pnm] [image2.pnm] ...```

# SYNOPSIS

**pnmquantall** _ncolors_ _files_...

# PARAMETERS

_ncolors_
> Maximum number of colors.

_files_
> Input image files (modified in place).

# DESCRIPTION

**pnmquantall** reduces multiple PNM images to use a common color palette. Useful for creating consistent color animations. Part of Netpbm toolkit.

# CAVEATS

Modifies files in place.

# INSTALL

```apt: sudo apt install netpbm```

```dnf: sudo dnf install netpbm```

```pacman: sudo pacman -S netpbm```

```apk: sudo apk add netpbm-extras```

```zypper: sudo zypper install netpbm```

```brew: brew install netpbm```

```nix: nix profile install nixpkgs#netpbm```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[ppmquantall](/man/ppmquantall)(1), [pnmquant](/man/pnmquant)(1)

