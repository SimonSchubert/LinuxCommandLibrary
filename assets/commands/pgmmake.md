# TLDR

**Create solid gray image**

```pgmmake [0.5] [100] [100] > [gray.pgm]```

**Create white image**

```pgmmake 1.0 [200] [150] > [white.pgm]```

**Create black image**

```pgmmake 0.0 [640] [480] > [black.pgm]```

**Specify max value**

```pgmmake -maxval [65535] [0.5] [100] [100] > [gray16.pgm]```

# SYNOPSIS

**pgmmake** [_options_] _grayval_ _width_ _height_

# PARAMETERS

**grayval**
> Gray level (0.0 = black, 1.0 = white).

**width**
> Image width in pixels.

**height**
> Image height in pixels.

**-maxval** _n_
> Maximum gray value (default 255).

# DESCRIPTION

**pgmmake** creates a solid color PGM grayscale image of specified dimensions. The gray value is a fraction where 0.0 is black and 1.0 is white.

Useful for creating backgrounds, masks, or test images.

# EXAMPLES

```bash
# 50% gray 100x100 image
pgmmake 0.5 100 100 > gray.pgm

# Black background
pgmmake 0 1920 1080 > black.pgm

# 16-bit white image
pgmmake -maxval 65535 1.0 100 100 > white16.pgm

# Create and convert to PNG
pgmmake 0.75 200 200 | pnmtopng > gray.png
```

# CAVEATS

Creates grayscale only. For color use ppmmake. Part of Netpbm toolkit.

# HISTORY

pgmmake is part of **Netpbm**, the image manipulation toolkit originally created by **Jef Poskanzer**.

# SEE ALSO

[ppmmake](/man/ppmmake)(1), [pbmmake](/man/pbmmake)(1), [pnmtopng](/man/pnmtopng)(1), [netpbm](/man/netpbm)(1)
