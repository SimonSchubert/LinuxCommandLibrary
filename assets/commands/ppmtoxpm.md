# TAGLINE

Convert PPM to X11 pixmap format

# TLDR

**Convert PPM to XPM**

```ppmtoxpm [input.ppm] > [output.xpm]```

**Convert with custom name**

```ppmtoxpm -name [icon] [input.ppm] > [icon.xpm]```

# SYNOPSIS

**ppmtoxpm** [_options_] [_file_]

# PARAMETERS

**-name** _name_
> Variable name in output.

**-hexonly**
> Use hex color codes only.

**-rgb** _file_
> RGB color name file.

# DESCRIPTION

**ppmtoxpm** converts PPM images to X11 pixmap format (.xpm). XPM is a C source format for color images in X11. Part of Netpbm toolkit.

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

[xpmtoppm](/man/xpmtoppm)(1), [pbmtoxbm](/man/pbmtoxbm)(1)

