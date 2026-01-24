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

**showfigfonts** previews all figlet fonts. It renders sample text in each available font.

Default text shows font name. Custom text can be specified.

Font directories can be specified. Shows fonts from any location.

Useful for font selection. Find the right style for your ASCII art.

Output shows font name and rendering. Easy visual comparison.

# CAVEATS

Large font directories take time. Output can be very long. Some fonts are wide.

# HISTORY

**showfigfonts** is distributed with **figlet** for font preview. It helps users discover available fonts.

# SEE ALSO

[figlet](/man/figlet)(1), [toilet](/man/toilet)(1), [banner](/man/banner)(1)
