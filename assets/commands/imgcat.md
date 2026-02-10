# TAGLINE

displays images directly in the terminal using various terminal graphics

# TLDR

**Display an image** in the terminal

```imgcat [path/to/image.png]```

**Display multiple images**

```imgcat [image1.jpg] [image2.png]```

**Display image from URL**

```curl -s [https://example.com/image.jpg] | imgcat```

**Display with specific width**

```imgcat --width [80] [image.png]```

**Display preserving aspect ratio** at specific height

```imgcat --height [24] [image.png]```

**Display image inline** (iTerm2)

```imgcat -p [image.png]```

**Display with depth** (color depth)

```imgcat --depth [24] [image.png]```

# SYNOPSIS

**imgcat** [_options_] [_file ..._]

# PARAMETERS

**-w**, **--width** _n_
> Output width in characters or pixels.

**-h**, **--height** _n_
> Output height in characters or pixels.

**-d**, **--depth** _n_
> Color depth (8, 16, 24).

**-p**, **--preserve-aspect-ratio**
> Maintain original aspect ratio.

**-r**, **--no-remote**
> Don't output files from remote URLs.

**-u**, **--url**
> Treat argument as URL.

**--version**
> Show version information.

**--help**
> Show help.

# DESCRIPTION

**imgcat** displays images directly in the terminal using various terminal graphics protocols. Different implementations exist for different terminals: the original for iTerm2, and others supporting Kitty graphics protocol, Sixel, or fallback to block characters.

The iTerm2 version uses the iTerm2 inline images protocol, which supports full-color images with transparency. The image is encoded in base64 and sent via escape sequences, rendering inline with text output.

For terminals supporting the Kitty graphics protocol (Kitty, Ghostty, etc.), images are displayed at high resolution using a similar mechanism. Sixel-capable terminals (xterm, mlterm, some others) use a legacy but widely compatible graphics format.

Fallback implementations convert images to Unicode block characters or braille patterns for terminals without graphics support, providing a low-resolution but universal display method.

The tool is commonly used for quick image preview during development, viewing images over SSH sessions, and integrating visual output into command-line workflows.

# CAVEATS

Terminal must support a graphics protocol (iTerm2, Kitty, Sixel, etc.). Functionality varies significantly between implementations. Large images may slow terminal rendering. SSH sessions may not support graphics without port forwarding or special configuration. Not all image formats are supported by all implementations.

# HISTORY

The original **imgcat** was created by George Nachman for iTerm2 around **2014**, introducing inline image display to terminal emulators. The concept inspired implementations for other terminals, leading to multiple tools named "imgcat" with different feature sets. The Kitty terminal later introduced its own graphics protocol, and various tools emerged to support it.

# SEE ALSO

[timg](/man/timg)(1), [viu](/man/viu)(1), [chafa](/man/chafa)(1), [catimg](/man/catimg)(1), [pixterm](/man/pixterm)(1)
