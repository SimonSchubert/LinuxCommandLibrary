# TAGLINE

converts images to colored ASCII art, outputting text that reproduces

# TLDR

Convert image with specific output **width** (columns)

```img2txt -W [10] [path/to/image]```

Convert image with specific output **height** (lines)

```img2txt -H [5] [path/to/image]```

Set output **font width**

```img2txt -x [12] [path/to/image]```

Set output **font height**

```img2txt -y [14] [path/to/image]```

Adjust image **brightness**

```img2txt -b [2] [path/to/image]```

# SYNOPSIS

**img2txt** [_options_] _image_

# PARAMETERS

**-W**, **--width** _COLS_
> Set output width in columns

**-H**, **--height** _LINES_
> Set output height in lines

**-x**, **--font-width** _PIXELS_
> Set assumed font width for aspect ratio

**-y**, **--font-height** _PIXELS_
> Set assumed font height for aspect ratio

**-b**, **--brightness** _VALUE_
> Adjust brightness (default 1.0)

**-c**, **--contrast** _VALUE_
> Adjust contrast

**-f**, **--format** _FORMAT_
> Output format (ansi, html, irc, etc.)

# DESCRIPTION

**img2txt** converts images to colored ASCII art, outputting text that reproduces the image using character patterns and terminal colors. It is part of the libcaca library, which provides ASCII art rendering.

The tool can produce output in various formats including ANSI terminal codes, HTML, IRC color codes, and plain text. The resulting ASCII art can be displayed in terminals or embedded in documents.

# CAVEATS

Output quality depends on terminal capabilities and font characteristics. Wide characters or non-monospace fonts will distort the output. Color support varies by terminal emulator.

# HISTORY

img2txt is part of libcaca, a graphics library for text terminals created by Sam Hocevar. The library was first released in **2003** and has been used in various projects including VLC media player for ASCII video rendering.

# SEE ALSO

[cacaview](/man/cacaview)(1), [jp2a](/man/jp2a)(1), [aview](/man/aview)(1)
