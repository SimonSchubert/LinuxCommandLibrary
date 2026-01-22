# TLDR

**Convert** ASCII art to PGM

```asciitopgm [width] [height] < [ascii.txt] > [output.pgm]```

# SYNOPSIS

**asciitopgm** _width_ _height_ [_asciifile_]

# DESCRIPTION

**asciitopgm** converts ASCII art text to PGM (Portable Graymap) image format. It maps characters to grayscale values based on their visual density, creating an image from text.

This is useful for converting legacy ASCII artwork to modern image formats or for creating images from text patterns.

# PARAMETERS

**width**
> Output image width in pixels

**height**
> Output image height in pixels

**asciifile**
> Input ASCII file (or stdin)

# CAVEATS

Character-to-grayscale mapping may not produce optimal results for all ASCII art styles. Output dimensions must be specified manually.

# HISTORY

**asciitopgm** is part of the Netpbm image processing toolkit, which evolved from PBMPLUS in the late **1980s**.

# SEE ALSO

[pgmtopbm](/man/pgmtopbm)(1), [pnmtopng](/man/pnmtopng)(1), [img2txt](/man/img2txt)(1)
