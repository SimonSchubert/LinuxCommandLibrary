# TAGLINE

Preview available FIGlet fonts

# TLDR

**Show all fonts**

```showfigfonts```

**Show specific text**

```showfigfonts "[Hello]"```

**Show fonts from directory**

```showfigfonts -d [/usr/share/figlet]```

# SYNOPSIS

**showfigfonts** [_-d dir_] [_text_]

# PARAMETERS

**-d** _DIR_
> Font directory.

_text_
> Sample text to display.

# DESCRIPTION

**showfigfonts** previews all available FIGlet fonts by rendering sample text in each one, making it easy to visually compare styles and select the right font for ASCII art. By default, each font's own name is used as the sample text, but custom text can be specified as an argument.

The **-d** option allows previewing fonts from any directory, not just the default FIGlet font path. Output shows the font name followed by the rendered text for each installed font, providing a convenient catalog for font selection.

# CAVEATS

Large font directories take time. Output can be very long. Some fonts are wide.

# HISTORY

**showfigfonts** is distributed with **figlet** for font preview. It helps users discover available fonts.

# SEE ALSO

[figlet](/man/figlet)(1), [toilet](/man/toilet)(1), [banner](/man/banner)(1)
