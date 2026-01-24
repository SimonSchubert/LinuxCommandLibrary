# TLDR

**Display an image** in the terminal

```timg [path/to/image.png]```

**Display multiple images** in a grid

```timg --grid=2 [image1.png] [image2.png]```

**Play a video** in the terminal

```timg [path/to/video.mp4]```

**Display an animated GIF** looping forever

```timg --loops=-1 [animation.gif]```

**Display image from stdin**

```curl -s [url/to/image.png] | timg -```

**Use Kitty graphics protocol** for high resolution

```timg -pk [path/to/image.png]```

**Display with specific dimensions**

```timg -g [80x24] [path/to/image.png]```

# SYNOPSIS

**timg** [_options_] _file_ [_file_...]

# PARAMETERS

**-g** _WxH_
> Output geometry in character cells. Default is terminal size.

**-p** _mode_
> Pixelation mode: h (half blocks), q (quarter blocks), k (kitty protocol), i (iTerm2 protocol), s (sixel).

**--grid**=_cols_
> Arrange images in a grid with specified number of columns.

**--loops**=_num_
> Number of animation loops. -1 for infinite, default is 1 for videos, infinite for GIFs.

**--frames**=_num_
> Only show first num frames of animation.

**--color8**
> Use 8-bit color mode (216 colors) for older terminals.

**--center**
> Center image in available space.

**--clear**
> Clear screen before displaying.

**-C**
> Clear screen before each frame in animations.

**-V**
> Interpret stdin as video stream.

**--threads**=_n_
> Number of threads for image decoding. Default is 3/4 of CPU cores.

**--verbose**
> Print information about terminal, pixelation, and frame rate.

**-h**, **--help**
> Show help message or detailed manpage.

**--version**
> Print version information and exit.

# DESCRIPTION

**timg** is a terminal image and video viewer that displays graphics directly in the terminal using Unicode block characters and 24-bit ANSI colors. It supports a wide range of formats including JPEG, PNG, GIF, WebP, BMP, and video formats like MP4, AVI, and MKV.

The viewer adapts to different terminal capabilities, using half-block or quarter-block Unicode characters for basic terminals, or native graphics protocols (Kitty, iTerm2, Sixel) when available for higher resolution output. This makes it useful for previewing images over SSH, in scripts, or in terminal-based workflows.

Images can be displayed individually, in sequence, or arranged in a grid layout. Animated GIFs and videos are played directly in the terminal with configurable loop counts and frame rates.

# CAVEATS

Image quality depends on terminal capabilities. Basic Unicode block rendering provides approximate colors and low resolution. For best results, use a terminal that supports Kitty graphics, iTerm2 graphics, or Sixel protocols. Video playback performance depends on terminal rendering speed.

# HISTORY

**timg** was created by **Henner Zeller** and development began around **2016**. It was designed to bring image and video viewing capabilities to the terminal, leveraging modern terminal features like 24-bit color support and graphics protocols. The project continues active development with regular additions of new features and format support.

# SEE ALSO

[imgcat](/man/imgcat)(1), [viu](/man/viu)(1), [chafa](/man/chafa)(1), [feh](/man/feh)(1)
