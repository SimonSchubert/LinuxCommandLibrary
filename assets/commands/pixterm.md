# TAGLINE

Render images in terminal using ANSI colors

# TLDR

**Display image in terminal**

```pixterm [image.png]```

**Scale to terminal width**

```pixterm -s [2] [image.png]```

**Set character cell size**

```pixterm -tc [2] -tr [6] [image.png]```

**Use specific palette**

```pixterm -d [24bit] [image.png]```

**Dithering mode**

```pixterm -m [0] [image.png]```

**Output to file**

```pixterm [image.png] > [output.txt]```

# SYNOPSIS

**pixterm** [_-s scale_] [_-tc cols_] [_-tr rows_] [_-d depth_] [_options_] _image_

# PARAMETERS

**-s** _SCALE_
> Scale factor.

**-tc** _N_
> Character columns per pixel.

**-tr** _N_
> Character rows per pixel.

**-d** _DEPTH_
> Color depth (8, 24bit).

**-m** _MODE_
> Dithering mode.

**-noresize**
> Don't resize image.

**-matte** _COLOR_
> Background color.

# DESCRIPTION

**pixterm** renders images directly in the terminal using ANSI escape codes and Unicode half-block characters. Each text character cell represents two vertical pixels, achieving higher resolution than character-only renderers.

Color depth can be set to 24-bit true color for maximum quality or 8-bit (256 colors) for broader terminal compatibility. Dithering algorithms improve gradient and color transition rendering at the cost of processing time.

Output is standard ANSI text that can be redirected to a file for later display. The scale and cell size parameters control how the image maps to terminal dimensions.

# CAVEATS

Quality depends on terminal capabilities. Large images may be slow. Font affects appearance.

# HISTORY

**pixterm** is a Go-based terminal image viewer. It provides high-quality image rendering using modern terminal capabilities.

# SEE ALSO

[catimg](/man/catimg)(1), [chafa](/man/chafa)(1), [tiv](/man/tiv)(1), [viu](/man/viu)(1)
