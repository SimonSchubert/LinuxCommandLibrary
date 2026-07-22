# TAGLINE

Convert ASCII art to PGM grayscale image

# TLDR

**Convert** ASCII art to PGM (note: height comes before width)

```asciitopgm [height] [width] < [ascii.txt] > [output.pgm]```

**Brighten** the output with a divisor

```asciitopgm -divisor=[2] [height] [width] [ascii.txt] > [output.pgm]```

# SYNOPSIS

**asciitopgm** [_-divisor=integer_] _height_ _width_ [_asciifile_]

# DESCRIPTION

**asciitopgm** converts ASCII art text to PGM (Portable Graymap) image format. Each character becomes one pixel; a large character such as a capital M produces a dark pixel, while a small one such as a period produces a light pixel.

This is useful for converting legacy ASCII artwork to image formats or for creating images from text patterns. Output values range from 0 to a maximum of 127.

# PARAMETERS

**height**
> Output image height in pixels (number of rows)

**width**
> Output image width in pixels (number of columns)

**asciifile**
> Input ASCII file (reads from stdin if omitted)

**-divisor** _integer_
> Divide each character's blackness value, brightening the output. Default is 1; larger positive values produce brighter images.

# CAVEATS

Character-to-grayscale mapping may not produce optimal results for all ASCII art styles. Output dimensions must be specified manually.

# HISTORY

**asciitopgm** is part of the Netpbm image processing toolkit, which evolved from PBMPLUS in the late **1980s**.

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

[pgmtopbm](/man/pgmtopbm)(1), [pnmtopng](/man/pnmtopng)(1), [img2txt](/man/img2txt)(1)

# RESOURCES

```[Homepage](https://netpbm.sourceforge.net/)```

```[Documentation](https://netpbm.sourceforge.net/doc/asciitopgm.html)```

<!-- verified: 2026-06-17 -->
