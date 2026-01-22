# TLDR

**Display image in terminal**

```img2sixel [image.png]```

**Set width**

```img2sixel -w [800] [image.png]```

**Set height**

```img2sixel -h [600] [image.png]```

**Specify colors**

```img2sixel -p [256] [image.png]```

**Pipe output**

```curl [url/image.png] | img2sixel```

# SYNOPSIS

**img2sixel** [_options_] [_file_]

# PARAMETERS

_FILE_
> Image file to display.

**-w** _WIDTH_
> Output width in pixels.

**-h** _HEIGHT_
> Output height in pixels.

**-p** _COLORS_
> Number of colors.

**-d** _DIFFUSION_
> Dithering method.

**-e**
> Encode only (no display).

**--help**
> Display help information.

# DESCRIPTION

**img2sixel** converts images to Sixel format for terminal display. Sixel enables inline graphics in compatible terminals.

The tool supports various image formats and outputs Sixel escape sequences. It works with terminals like xterm, mlterm, and others.

img2sixel displays images in terminals.

# CAVEATS

Requires Sixel-capable terminal. Part of libsixel. Quality depends on colors.

# HISTORY

img2sixel is part of **libsixel** by **Hayaki Saito** for terminal graphics.

# SEE ALSO

[viu](/man/viu)(1), [chafa](/man/chafa)(1), [timg](/man/timg)(1)
