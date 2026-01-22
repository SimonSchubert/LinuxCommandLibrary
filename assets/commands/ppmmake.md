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

**ppmmake** creates solid color PPM images. Simple image generator.

The tool creates uniform color images. Part of Netpbm.

ppmmake generates solid images.

# CAVEATS

Color names or RGB values. Part of Netpbm suite.

# HISTORY

ppmmake was created as part of **Netpbm** for solid image generation.

# SEE ALSO

[ppm](/man/ppm)(5), [pgmmake](/man/pgmmake)(1), [pbmmake](/man/pbmmake)(1)

