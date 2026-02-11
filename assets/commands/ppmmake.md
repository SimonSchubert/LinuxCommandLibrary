# TAGLINE

Create solid color PPM images

# TLDR

**Create solid color image**

```ppmmake [color] [width] [height] > [output.ppm]```

**Create red image**

```ppmmake red 100 100 > [red.ppm]```

**Create using RGB values**

```ppmmake "rgb:ff/00/00" 200 200 > [output.ppm]```

# SYNOPSIS

**ppmmake** _color_ _width_ _height_

# PARAMETERS

_COLOR_
> Color specification.

_WIDTH_
> Image width.

_HEIGHT_
> Image height.

# DESCRIPTION

**ppmmake** creates a PPM image of the specified dimensions filled with a single solid color. Colors can be specified by name (red, blue, white), hex notation (#rrggbb), or RGB triplet format (rgb:rr/gg/bb).

This is useful for creating background images, test patterns, or blank canvases for compositing with other Netpbm tools. The companion tools **pgmmake** and **pbmmake** create grayscale and bitmap images respectively. Part of the Netpbm toolkit.

# CAVEATS

Color names or RGB values. Part of Netpbm suite.

# HISTORY

ppmmake was created as part of **Netpbm** for solid image generation.

# SEE ALSO

[ppm](/man/ppm)(5), [pgmmake](/man/pgmmake)(1), [pbmmake](/man/pbmmake)(1)

