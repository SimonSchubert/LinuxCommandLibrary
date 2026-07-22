# TAGLINE

Apply TV scan line effect to images

# TLDR

**Apply TV scan line effect**

```ppmtv [input.ppm] > [output.ppm]```

**Read from stdin in a pipeline**

```pnmtopnm [input.png] | ppmtv > [output.ppm]```

# SYNOPSIS

**ppmtv** [_ppmfile_]

# DESCRIPTION

**ppmtv** applies a CRT television scan line effect to PPM images, simulating the appearance of an old interlaced TV display by darkening alternating rows. Reads from standard input if no file is specified. Part of the Netpbm toolkit.

# CAVEATS

Input must be in PPM format. Use conversion tools (e.g., jpegtopnm, pngtopam) to convert other formats first.

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

[ppmquant](/man/ppmquant)(1), [pamdeinterlace](/man/pamdeinterlace)(1), [netpbm](/man/netpbm)(1)

