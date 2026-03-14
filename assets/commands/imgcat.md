# TAGLINE

Display images inline in the terminal

# TLDR

**Display an image** in the terminal

```imgcat [path/to/image.png]```

**Display multiple images**

```imgcat [image1.jpg] [image2.png]```

**Display image from URL**

```curl -s [https://example.com/image.jpg] | imgcat```

**Display with specific width** in character cells

```imgcat -w [80] [image.png]```

**Display at specific height** in character cells

```imgcat -H [24] [image.png]```

**Read image from stdin**

```curl -s [https://example.com/image.jpg] | imgcat -```

# SYNOPSIS

**imgcat** [_options_] [_file ..._]

# PARAMETERS

**-w**, **--width** _n_
> Output width in character cells.

**-H**, **--height** _n_
> Output height in character cells.

**-R**, **--no-stretch**
> Do not stretch the image to fill the available space.

**--version**
> Show version information.

**--help**
> Show help.

# DESCRIPTION

**imgcat** displays images inline in the terminal. Multiple implementations exist: the original iTerm2 shell script uses the iTerm2 inline images protocol, while standalone versions (such as the one from posva or the one bundled with iTerm2) support additional options.

The image is encoded in base64 and sent via escape sequences, rendering inline with text output. This allows quick image previewing during development, viewing images over SSH sessions, and integrating visual output into command-line workflows.

Note that there are several distinct tools named "imgcat" with different flag sets. The parameters listed here reflect common options but may vary by implementation.

# CAVEATS

Terminal must support an inline image protocol (iTerm2, Kitty, Sixel). Functionality and flags vary significantly between implementations. Large images may slow terminal rendering. SSH sessions may not support inline images without special configuration.

# HISTORY

The original **imgcat** was created by George Nachman for iTerm2 around **2014**, introducing inline image display to terminal emulators. The concept inspired implementations for other terminals, leading to multiple tools named "imgcat" with different feature sets. The Kitty terminal later introduced its own graphics protocol, and various tools emerged to support it.

# SEE ALSO

[timg](/man/timg)(1), [viu](/man/viu)(1), [chafa](/man/chafa)(1), [catimg](/man/catimg)(1), [pixterm](/man/pixterm)(1)
