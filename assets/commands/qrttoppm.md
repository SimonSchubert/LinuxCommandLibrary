# TAGLINE

Convert QRT ray tracer output to PPM

# TLDR

**Convert QRT ray tracer output to PPM**

```qrttoppm [input.qrt] > [output.ppm]```

# SYNOPSIS

**qrttoppm** [_file_]

# DESCRIPTION

**qrttoppm** converts images from the QRT ray tracer output format to PPM (Portable Pixmap) format. QRT was an early ray tracing program, and this tool is part of the Netpbm image processing toolkit, enabling legacy QRT renders to be converted into a widely supported format for viewing or further processing.

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

[mtvtoppm](/man/mtvtoppm)(1), [rawtoppm](/man/rawtoppm)(1), [ppmtopgm](/man/ppmtopgm)(1)

