# TAGLINE

Rasterize SVG vector graphics to PNG

# TLDR

**Convert SVG to PNG**

```svg2png [input.svg] [output.png]```

**With specific width**

```svg2png -w [800] [input.svg] [output.png]```

**With specific height**

```svg2png -h [600] [input.svg] [output.png]```

**Scale factor**

```svg2png --scale [2] [input.svg] [output.png]```

# SYNOPSIS

**svg2png** [_-w width_] [_-h height_] [_options_] _input_ _output_

# PARAMETERS

**-w** _WIDTH_
> Output width.

**-h** _HEIGHT_
> Output height.

**--scale** _FACTOR_
> Scale multiplier.

**--background** _COLOR_
> Background color.

**--help**
> Show help.

# DESCRIPTION

**svg2png** converts SVG vector graphics files to PNG raster images. It rasterizes the scalable vector content at a specified resolution, producing pixel-based output suitable for web use, documentation, or any context requiring bitmap images.

Output dimensions can be controlled by specifying width, height, or a scale factor relative to the original SVG viewport size. The background is transparent by default, preserving alpha channel information from the SVG source. Various implementations exist based on different rendering libraries such as librsvg or Node.js-based engines.

# CAVEATS

Various implementations exist. Rendering may vary. librsvg or Node based.

# HISTORY

**svg2png** tools exist in various implementations for converting SVG vector graphics to PNG raster format.

# SEE ALSO

[inkscape](/man/inkscape)(1), [convert](/man/convert)(1), [rsvg-convert](/man/rsvg-convert)(1)
