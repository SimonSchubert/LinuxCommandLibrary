# TLDR

**Convert SVG to PNG**

```rsvg-convert [input.svg] -o [output.png]```

**Convert to PDF**

```rsvg-convert -f pdf [input.svg] -o [output.pdf]```

**Resize output**

```rsvg-convert -w [800] -h [600] [input.svg] -o [output.png]```

**Set DPI**

```rsvg-convert -d [300] [input.svg] -o [output.png]```

# SYNOPSIS

**rsvg-convert** [_options_] [_files_...]

# PARAMETERS

**-o**, **--output** _file_
> Output file.

**-f**, **--format** _format_
> Output format (png, pdf, ps, eps, svg).

**-w**, **--width** _px_
> Width in pixels.

**-h**, **--height** _px_
> Height in pixels.

**-d**, **--dpi-x** _dpi_
> Horizontal DPI.

**-p**, **--dpi-y** _dpi_
> Vertical DPI.

**-a**, **--keep-aspect-ratio**
> Preserve aspect ratio.

**-b**, **--background-color** _color_
> Background color.

# DESCRIPTION

**rsvg-convert** renders SVG files to various raster and vector formats. It uses the librsvg library for high-quality SVG rendering.

# EXAMPLES

```bash
# SVG to PNG
rsvg-convert icon.svg -o icon.png

# SVG to PDF
rsvg-convert -f pdf diagram.svg -o diagram.pdf

# Resize to width
rsvg-convert -w 512 logo.svg -o logo.png

# High DPI for print
rsvg-convert -d 300 -p 300 graphic.svg -o print.png

# With background
rsvg-convert -b white input.svg -o output.png

# Multiple files
rsvg-convert -f pdf *.svg -o combined.pdf
```

# CAVEATS

Not all SVG features supported. Part of librsvg. For complex SVGs, consider Inkscape.

# HISTORY

rsvg-convert is part of **librsvg** by the **GNOME Project**, originally by **Raph Levien**, for SVG rendering.

# SEE ALSO

[inkscape](/man/inkscape)(1), [convert](/man/convert)(1), [cairosvg](/man/cairosvg)(1)
