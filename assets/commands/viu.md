# TLDR

**Display image**

```viu [image.png]```

**Set width**

```viu -w [80] [image.png]```

**Set height**

```viu -h [40] [image.png]```

**Display multiple images**

```viu [image1.png] [image2.png]```

**Use blocks instead of half-blocks**

```viu -b [image.png]```

**Transparent background**

```viu -t [image.png]```

**From stdin**

```cat [image.png] | viu -```

# SYNOPSIS

**viu** [_-w width_] [_-h height_] [_options_] _files_

# PARAMETERS

**-w**, **--width** _N_
> Output width.

**-h**, **--height** _N_
> Output height.

**-b**, **--blocks**
> Use full blocks.

**-t**, **--transparent**
> Transparent background.

**-n**, **--name**
> Show filename.

**-r**, **--recursive**
> Recursive directory.

**-f**, **--frame-rate** _N_
> GIF frame rate.

# DESCRIPTION

**viu** displays images in the terminal. It uses Unicode and ANSI colors.

Image formats include PNG, JPEG, GIF, WebP. Most common formats supported.

Size options control output dimensions. Aspect ratio preserved by default.

Block mode uses different characters. Varies appearance and density.

GIF animation plays in terminal. Frame rate controllable.

Piping enables integration. Display downloaded or generated images.

# CAVEATS

Quality depends on terminal. True color support improves output. Large images slow.

# HISTORY

**viu** is a Rust-based terminal image viewer. It provides fast, high-quality image display in modern terminals.

# SEE ALSO

[chafa](/man/chafa)(1), [catimg](/man/catimg)(1), [tiv](/man/tiv)(1)
