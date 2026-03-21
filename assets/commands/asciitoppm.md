# TAGLINE

Convert ASCII text to PPM color image

# TLDR

**Convert ASCII text file to a PPM image**

```asciitoppm < [ascii.txt] > [output.ppm]```

**Convert using a specific color definition file**

```asciitoppm -d [colorfile] < [ascii.txt] > [output.ppm]```

# SYNOPSIS

**asciitoppm** [_options_] [_height_ _width_] < _input_ > _output_

# DESCRIPTION

**asciitoppm** converts ASCII text to a PPM (Portable Pixmap) color image. Each character in the input is mapped to a colored pixel, producing a visual representation of the text content.

Unlike **asciitopgm** which produces grayscale output, **asciitoppm** generates full-color images. The input is read from standard input and written to standard output. It is part of the Netpbm image processing toolkit.

# PARAMETERS

**-d** _colorfile_
> Use the specified color definition file to map characters to colors.

# HISTORY

Part of the Netpbm toolkit for image processing.

# SEE ALSO

[asciitopgm](/man/asciitopgm)(1), [ppmtopgm](/man/ppmtopgm)(1), [pbmtoascii](/man/pbmtoascii)(1), [ppmtoascii](/man/ppmtoascii)(1)
