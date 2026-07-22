# TAGLINE

Convert raw grayscale data to PGM format

# TLDR

**Convert raw grayscale to PGM**

```rawtopgm [width] [height] [input.raw] > [output.pgm]```

**Convert with header bytes to skip**

```rawtopgm -headerskip [512] [width] [height] [input.raw] > [output.pgm]```

# SYNOPSIS

**rawtopgm** [_options_] _width_ _height_ [_file_]

# PARAMETERS

_width_
> Image width in pixels.

_height_
> Image height in pixels.

**-headerskip** _BYTES_
> Skip the first _BYTES_ bytes of the input before reading pixel data (for files with proprietary headers).

**-rowskip** _BYTES_
> Skip _BYTES_ at the end of each scanline (e.g., padding to a row stride).

**-bpp** _N_
> Bytes per pixel: _1_ (default, 8-bit) or _2_ (16-bit big-endian samples).

**-littleendian**
> When **-bpp 2**, interpret 16-bit samples as little-endian.

**-maxval** _N_
> Override the maxval written to the output PGM (default _255_, or _65535_ when **-bpp 2**).

**-topbottom**
> Treat row 0 as the top of the image (default; pair with **-bottomtop** to flip).

**-bottomtop**
> Treat row 0 as the bottom of the image.

# DESCRIPTION

**rawtopgm** converts raw grayscale byte data into Portable Graymap (PGM) format by interpreting a stream of pixel values according to specified image dimensions. Since raw data contains no metadata, the width and height must be provided as arguments so the tool knows how to arrange the bytes into a proper image grid.

The **-headerskip** option allows skipping file headers that precede the actual pixel data, and **-bpp** handles 16-bit samples for higher dynamic range images. It is part of the Netpbm image processing toolkit.

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

[rawtoppm](/man/rawtoppm)(1), [pgmtopbm](/man/pgmtopbm)(1)

