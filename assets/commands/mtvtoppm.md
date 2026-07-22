# TAGLINE

converts MTV ray tracer format to PPM

# TLDR

**Convert MTV ray tracer output to PPM**

```mtvtoppm [input.mtv] > [output.ppm]```

# SYNOPSIS

**mtvtoppm** [_file_]

# DESCRIPTION

**mtvtoppm** reads an MTV ray tracer image file as input and produces a PPM image as output. MTV refers to the output format of the MTV ray tracer program by Mark T. VandeWettering (named after his initials). The format is a simple uncompressed truecolor raster format. Files typically use the .pic or .mtv extension. Part of the Netpbm toolkit.

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

[rawtoppm](/man/rawtoppm)(1), [qrttoppm](/man/qrttoppm)(1)

