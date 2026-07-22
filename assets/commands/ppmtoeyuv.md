# TAGLINE

Convert PPM to Berkeley Encoder YUV format

# TLDR

**Convert a PPM image to EYUV format**

```ppmtoeyuv [input.ppm] > [output.eyuv]```

**Convert from stdin**

```cat [input.ppm] | ppmtoeyuv > [output.eyuv]```

# SYNOPSIS

**ppmtoeyuv** [_ppmfile_]

# DESCRIPTION

**ppmtoeyuv** converts a PPM image to Berkeley Encoder YUV (EYUV) format, which is used by MPEG encoders. Reads from a file argument or standard input. Output is written to standard output. Part of the Netpbm toolkit.

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

[eyuvtoppm](/man/eyuvtoppm)(1), [ppmtoyuv](/man/ppmtoyuv)(1), [ppmtojpeg](/man/ppmtojpeg)(1)

