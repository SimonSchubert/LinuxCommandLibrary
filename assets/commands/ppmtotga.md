# TAGLINE

Convert PPM images to TGA format

# TLDR

**Convert PPM to TGA**

```ppmtotga [input.ppm] > [output.tga]```

**Convert with compression**

```ppmtotga -rle [input.ppm] > [output.tga]```

# SYNOPSIS

**ppmtotga** [_options_] [_file_]

# PARAMETERS

**-rle**
> Run-length encoding compression.

**-norle**
> No compression.

# DESCRIPTION

**ppmtotga** converts PPM images to TGA (Targa) format. TGA is commonly used in game development and 3D graphics. Part of Netpbm toolkit.

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

[tgatoppm](/man/tgatoppm)(1), [ppmtobmp](/man/ppmtobmp)(1)

