# TAGLINE

Convert PPM to Windows icon format

# TLDR

**Convert PPM to Windows icon**

```ppmtowinicon [input.ppm] > [output.ico]```

**Include AND mask**

```ppmtowinicon -andmask [mask.pbm] [input.ppm] > [output.ico]```

# SYNOPSIS

**ppmtowinicon** [_options_] [_file_]

# PARAMETERS

**-andmask** _file_
> Transparency mask file.

# DESCRIPTION

**ppmtowinicon** converts PPM images to Windows ICO format. Supports transparency via AND mask. Part of Netpbm toolkit.

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

[winicontoppm](/man/winicontoppm)(1), [pamtowinicon](/man/pamtowinicon)(1)

