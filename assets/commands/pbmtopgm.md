# TAGLINE

converts PBM bitmap to PGM grayscale by averaging pixel regions

# TLDR

**Convert bitmap to grayscale**

```pbmtopgm [width] [height] [input.pbm] > [output.pgm]```

# SYNOPSIS

**pbmtopgm** _width_ _height_ [_file_]

# PARAMETERS

_width_
> Averaging width.

_height_
> Averaging height.

# DESCRIPTION

**pbmtopgm** converts PBM bitmap to PGM grayscale by averaging pixel regions. Anti-aliases bitmap edges. Part of Netpbm toolkit.

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

[pgmtopbm](/man/pgmtopbm)(1), [ppmtopgm](/man/ppmtopgm)(1)

