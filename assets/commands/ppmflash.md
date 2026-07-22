# TAGLINE

Brighten PPM image toward white

# TLDR

**Brighten image by factor**

```ppmflash [0.5] [input.ppm] > [output.ppm]```

# SYNOPSIS

**ppmflash** _factor_ [_file_]

# PARAMETERS

_factor_
> Flash factor (0-1, where 1 is white).

# DESCRIPTION

**ppmflash** brightens a PPM image toward white by the specified factor. Useful for creating flash/fade effects. Part of Netpbm toolkit.

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

[ppmbrighten](/man/ppmbrighten)(1), [ppmdim](/man/ppmdim)(1)

