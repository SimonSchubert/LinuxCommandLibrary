# TAGLINE

Gould scanner file to PPM converter

# TLDR

**Convert Gould scanner file to PPM**

```gouldtoppm [file.gould] > [output.ppm]```

**Convert from stdin**

```cat [file.gould] | gouldtoppm > [output.ppm]```

# SYNOPSIS

**gouldtoppm** [_gouldfile_]

# DESCRIPTION

**gouldtoppm** reads a file produced by a Gould scanner and converts it to PPM (Portable Pixmap) format. It is part of the Netpbm package of graphics manipulation tools.

The command reads from a file argument or standard input and writes PPM output to standard output.

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

[ppmtogif](/man/ppmtogif)(1), [pnmtopng](/man/pnmtopng)(1), [netpbm](/man/netpbm)(1)

# RESOURCES

```[Homepage](https://netpbm.sourceforge.net/)```

```[Documentation](https://netpbm.sourceforge.net/doc/gouldtoppm.html)```

<!-- verified: 2026-07-17 -->
