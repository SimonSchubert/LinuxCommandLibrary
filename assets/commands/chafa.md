# TLDR

**Display image in terminal**

```chafa [image.png]```

**Specify output size**

```chafa -s [80x40] [image.jpg]```

**Use sixel graphics**

```chafa --format sixels [image.png]```

**Use kitty graphics protocol**

```chafa --format kitty [image.gif]```

**Limit colors**

```chafa --colors [256] [image.png]```

**Display animated GIF**

```chafa --animate [animation.gif]```

**ASCII only output**

```chafa --symbols ascii [image.jpg]```

# SYNOPSIS

**chafa** [_options_] _image_...

# DESCRIPTION

**chafa** converts images to character art for terminal display. Supports Sixels, Kitty, iTerm2 protocols, and Unicode mosaics. Handles JPEG, PNG, GIF (animated), AVIF, SVG, WebP, and more.

# PARAMETERS

**-s**, **--size** _WxH_
> Output size in characters

**-f**, **--format** _format_
> Output format: symbols, sixels, kitty, iterm

**-c**, **--colors** _n_
> Color mode: none, 2, 8, 16, 256, full

**--symbols** _set_
> Symbol set: all, ascii, block, braille

**--fg** _color_
> Foreground color

**--bg** _color_
> Background color

**--animate**
> Enable animation for GIFs

**--duration** _secs_
> Animation duration

**--speed** _factor_
> Animation speed multiplier

**-w**, **--watch**
> Watch file for changes

**--font-ratio** _ratio_
> Font width/height ratio

# SUPPORTED FORMATS

JPEG, PNG, GIF, AVIF, SVG, TIFF, WebP, JPEG XL, QOI, XWD

# CAVEATS

Output quality depends on terminal capabilities. Sixels require compatible terminal. Best results with Truecolor support.

# SEE ALSO

[catimg](/man/catimg)(1), [timg](/man/timg)(1), [img2txt](/man/img2txt)(1)
