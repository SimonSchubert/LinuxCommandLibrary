# TAGLINE

Encoder YUV to PPM converter

# TLDR

**Convert EYUV to PPM**

```eyuvtoppm --width [width] --height [height] [input.eyuv] > [output.ppm]```

# SYNOPSIS

**eyuvtoppm** [**--width** _width_] [**--height** _height_] [_eyuvfile_]

# PARAMETERS

**--width** _width_
> Image width in pixels (must be even). Required.

**--height** _height_
> Image height in pixels (must be even). Required.

_eyuvfile_
> Input EYUV file; reads from standard input if omitted.

**-quiet**
> Suppress informational messages (common libnetpbm option).

# DESCRIPTION

**eyuvtoppm** converts Encoder YUV (EYUV) video format files to PPM (Portable Pixmap) format. EYUV is a Berkeley YUV format used in video encoding workflows, storing uncompressed YUV color space data.

The tool is part of the Netpbm suite of image processing utilities. It requires explicit **--width** and **--height** options since EYUV files don't contain image dimension metadata. The output PPM format is a simple, uncompressed format widely supported for image manipulation and conversion.

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

[ppmtoeyuv](/man/ppmtoeyuv)(1), [yuvtoppm](/man/yuvtoppm)(1)

# RESOURCES

```[Source code](https://sourceforge.net/projects/netpbm/)```

```[Documentation](https://netpbm.sourceforge.net/doc/eyuvtoppm.html)```

<!-- verified: 2026-07-15 -->

