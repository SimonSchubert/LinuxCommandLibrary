# TAGLINE

Create tiled patterns from PNM images

# TLDR

**Create tiled pattern from image**

```pnmtile [640] [480] [input.pnm] > [output.pnm]```

# SYNOPSIS

**pnmtile** _width_ _height_ [_file_]

# PARAMETERS

_width_
> Output width in pixels.

_height_
> Output height in pixels.

# DESCRIPTION

**pnmtile** creates an image by tiling (repeating) the input image to fill the specified dimensions. Useful for creating backgrounds. Part of Netpbm toolkit.

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

[pnmcat](/man/pnmcat)(1), [pnmmontage](/man/pnmmontage)(1)

