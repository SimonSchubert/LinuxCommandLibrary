# TAGLINE

Extract colormap from PPM image

# TLDR

**Extract colormap from image**

```ppmtomap [input.ppm] > [colormap.ppm]```

**Sort colors by frequency**

```ppmtomap -sort [input.ppm] > [colormap.ppm]```

# SYNOPSIS

**ppmtomap** [_options_] [_file_]

# PARAMETERS

**-sort**
> Sort colors by frequency.

**-square**
> Make output square.

# DESCRIPTION

**ppmtomap** extracts the unique colors from a PPM image as a one-row colormap image. Useful for analyzing or transferring palettes. Part of Netpbm toolkit.

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

[ppmhist](/man/ppmhist)(1), [pnmcolormap](/man/pnmcolormap)(1)

