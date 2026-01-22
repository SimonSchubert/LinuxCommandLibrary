# TLDR

Read an image from a **file** and print in ASCII

```asciiart [path/to/image.jpg]```

Read an image from a **URL** and print in ASCII

```asciiart [www.example.com/image.jpg]```

Choose the output **width**

```asciiart -w [50] [path/to/image.jpg]```

**Colorize** the ASCII output

```asciiart -c [path/to/image.jpg]```

Choose the output **format**

```asciiart -f [text|html] [path/to/image.jpg]```

**Invert** the character map

```asciiart -i [path/to/image.jpg]```

# SYNOPSIS

**asciiart** [_options_] _image_

# DESCRIPTION

**asciiart** converts images to ASCII art, rendering pictures using text characters. It analyzes the brightness of each region in the image and maps it to appropriate ASCII characters.

The tool supports reading images from local files or URLs and can output plain text or HTML. Color output uses ANSI escape codes for terminal display.

# PARAMETERS

**-w, --width** _n_
> Set the output width in characters (default: 100)

**-c, --color**
> Enable colorized output using ANSI codes

**-f, --format** _type_
> Output format: **text** (default) or **html**

**-i, --invert-chars**
> Invert the character mapping (swap light and dark)

# CAVEATS

Output quality depends on the terminal font and character width. Monospace fonts produce the best results. HTML output can be viewed in web browsers for better color support. Very wide images may wrap in terminals.

# SEE ALSO

[jp2a](/man/jp2a)(1), [img2txt](/man/img2txt)(1), [figlet](/man/figlet)(1)
