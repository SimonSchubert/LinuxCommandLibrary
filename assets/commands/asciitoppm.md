# TAGLINE

Convert ASCII art to PPM color image

# TLDR

**Convert** ASCII to PPM image

```asciitoppm [width] [height] < [ascii.txt] > [output.ppm]```

# SYNOPSIS

**asciitoppm** _width_ _height_

# DESCRIPTION

**asciitoppm** converts ASCII text to a PPM (Portable Pixmap) color image. Each character in the input is mapped to a colored pixel, producing a visual representation of the text content.

Unlike **asciitopgm** which produces grayscale output, **asciitoppm** generates full-color images. The input is read from standard input and the output image dimensions must be specified. It is part of the Netpbm image processing toolkit.

# PARAMETERS

**width**
> Image width in pixels

**height**
> Image height in pixels

# HISTORY

Part of the Netpbm toolkit for image processing.

# SEE ALSO

[asciitopgm](/man/asciitopgm)(1), [ppmtopgm](/man/ppmtopgm)(1)
