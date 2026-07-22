# TAGLINE

Convert SGI images to PNM format

# TLDR

**Convert SGI image to PNM**

```sgitopnm [input.rgb] > [output.pnm]```

**Extract specific channel** (0=red, 1=green, 2=blue)

```sgitopnm -channel [0] [input.rgb] > [output.pgm]```

**Convert with verbose output** showing image information

```sgitopnm -verbose [input.rgb] > [output.pnm]```

# SYNOPSIS

**sgitopnm** [_options_] [_file_]

# PARAMETERS

**-channel** _n_
> Extract specific channel (0=red, 1=green, 2=blue).

**-verbose**
> Print image information.

# DESCRIPTION

**sgitopnm** converts Silicon Graphics image format (SGI RGB) to PNM (Portable aNyMap). SGI images typically use .rgb, .rgba, or .bw extensions. Single-channel images produce PGM output; multi-channel images produce PPM. Part of the Netpbm toolkit.

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

[pnmtosgi](/man/pnmtosgi)(1), [rletopnm](/man/rletopnm)(1)

