# TAGLINE

Combine RGB component files into PPM image

# TLDR

**Combine RGB components into PPM**

```rgb3toppm [red.pgm] [green.pgm] [blue.pgm] > [output.ppm]```

# SYNOPSIS

**rgb3toppm** _redfile_ _greenfile_ _bluefile_

# PARAMETERS

_redfile_
> PGM file for red channel.

_greenfile_
> PGM file for green channel.

_bluefile_
> PGM file for blue channel.

# DESCRIPTION

**rgb3toppm** combines three separate PGM grayscale files (red, green, blue channels) into a single PPM color image. All three input files must have the same dimensions. Output is written to standard output. Part of Netpbm toolkit.

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

[ppmtorgb3](/man/ppmtorgb3)(1), [pamstack](/man/pamstack)(1), [pgmtoppm](/man/pgmtoppm)(1), [ppmtopgm](/man/ppmtopgm)(1), [yuvsplittoppm](/man/yuvsplittoppm)(1)

