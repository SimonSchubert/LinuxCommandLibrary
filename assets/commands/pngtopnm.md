# TAGLINE

Convert PNG images to PNM format

# TLDR

**Convert PNG to PNM**

```pngtopnm [input.png] > [output.pnm]```

**Extract alpha to separate file**

```pngtopnm -alpha [input.png] > [alpha.pgm]```

# SYNOPSIS

**pngtopnm** [_options_] [_file_]

# PARAMETERS

**-alpha**
> Extract alpha channel as PGM.

**-mix**
> Mix with background color.

**-background** _color_
> Background color for mixing.

**-verbose**
> Verbose output.

# DESCRIPTION

**pngtopnm** converts PNG images to PNM (PBM/PGM/PPM) format. Part of Netpbm toolkit for image conversion. Output type depends on PNG color depth.

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

[pnmtopng](/man/pnmtopng)(1), [pngtopam](/man/pngtopam)(1)

