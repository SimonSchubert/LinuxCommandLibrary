# TAGLINE

Display color histogram of PPM images

# TLDR

**Show color histogram**

```ppmhist [input.ppm]```

**Show as map file**

```ppmhist -map [input.ppm]```

**Limit output colors**

```ppmhist -noheader [input.ppm] | head -20```

# SYNOPSIS

**ppmhist** [_options_] [_file_]

# DESCRIPTION

**ppmhist** reads a PPM (Portable Pixmap) image and prints a color histogram showing each distinct color and the number of pixels using it. It is part of the Netpbm toolkit and is useful for analyzing palette usage, identifying dominant colors, and preparing colormaps for quantization.

By default the output is a sorted text table. With **-map**, the output is itself a valid PPM file representing the colormap, which can be fed to other Netpbm tools.

# PARAMETERS

**-map**
> Output a colormap as a PPM file rather than a text table.

**-nomap**
> Force text histogram output (the default).

**-noheader**
> Omit the leading header line from text output.

**-sort** _method_
> Sort entries by _frequency_ or _rgb_.

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

[pgmhist](/man/pgmhist)(1), [pnmcolormap](/man/pnmcolormap)(1), [ppmtopgm](/man/ppmtopgm)(1)

