# TAGLINE

Convert PostScript image data to PGM

# TLDR

**Convert PostScript image to PGM**

```psidtopgm [width] [height] [bits] [input.ps] > [output.pgm]```

# SYNOPSIS

**psidtopgm** _width_ _height_ _bits_ [_file_]

# PARAMETERS

_width_
> Image width.

_height_
> Image height.

_bits_
> Bits per sample.

# DESCRIPTION

**psidtopgm** extracts a grayscale image from a PostScript image data operator output and converts to PGM. Part of Netpbm toolkit.

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

[pstopnm](/man/pstopnm)(1), [pgmtopbm](/man/pgmtopbm)(1)

