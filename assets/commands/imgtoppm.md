# TAGLINE

converts an Img-whatnot image file to PPM format

# TLDR

**Convert IMG to PPM**

```imgtoppm [file.img] > [output.ppm]```

**Convert from stdin**

```cat [file.img] | imgtoppm > [output.ppm]```

# SYNOPSIS

**imgtoppm** [_imgfile_]

# DESCRIPTION

**imgtoppm** converts an Img-whatnot image file to PPM (Portable Pixmap) format. Part of the Netpbm package of graphics manipulation tools. Reads from stdin if no file is specified.

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

[ppmtogif](/man/ppmtogif)(1), [netpbm](/man/netpbm)(1)

