# TLDR

Convert **SVG to PNG**

```ksvgtopng5 [width] [height] [path/to/file.svg] [output.png]```

# SYNOPSIS

**ksvgtopng5** _width_ _height_ _input.svg_ _output.png_

# DESCRIPTION

**ksvgtopng5** converts SVG (Scalable Vector Graphics) files to PNG (Portable Network Graphics) format at a specified resolution. It is part of the KDE CLI tools and uses Qt's SVG rendering.

# PARAMETERS

**width**
> Output image width in pixels

**height**
> Output image height in pixels

**input.svg**
> Path to input SVG file (should be absolute path)

**output.png**
> Path for output PNG file

# CAVEATS

The SVG input path should be an absolute path for reliable operation. Complex SVG features may not render identically to web browsers.

# SEE ALSO

[rsvg-convert](/man/rsvg-convert)(1), [inkscape](/man/inkscape)(1), [convert](/man/convert)(1)
