# TAGLINE

converts grayscale images to black and white using dithering

# TLDR

**Dither to black and white**

```pamditherbw [input.pgm] > [output.pbm]```

**Dither with Floyd-Steinberg**

```pamditherbw -fs [input.pgm] > [output.pbm]```

**Dither with threshold**

```pamditherbw -threshold -value [0.5] [input.pgm] > [output.pbm]```

# SYNOPSIS

**pamditherbw** [_options_] [_file_]

# PARAMETERS

**-fs**
> Floyd-Steinberg dithering.

**-threshold**
> Simple threshold.

**-hilbert**
> Hilbert curve dithering.

**-value** _n_
> Threshold value (0.0-1.0).

# DESCRIPTION

**pamditherbw** converts grayscale images to black and white using dithering. Multiple algorithms available for different quality/speed tradeoffs. Part of Netpbm toolkit.

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

[pgmtopbm](/man/pgmtopbm)(1), [ppmquant](/man/ppmquant)(1)

