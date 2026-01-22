# TLDR

**Create ASCII art** text

```figlet "[Hello World]"```

**Use specific font**

```figlet -f [slant] "[text]"```

**Center output**

```figlet -c "[text]"```

**Set width**

```figlet -w [80] "[text]"```

**List available fonts**

```figlet -I 2 | xargs -I {} ls /usr/share/figlet/```

# SYNOPSIS

**figlet** [_options_] [_message_]

# PARAMETERS

_MESSAGE_
> Text to render as ASCII art.

**-f** _FONT_
> Font file to use.

**-w** _WIDTH_
> Output width.

**-c**
> Center output.

**-l**
> Left justify.

**-r**
> Right justify.

**-k**
> Kerning mode.

**-W**
> Full width (no smushing).

**--help**
> Display help information.

# DESCRIPTION

**figlet** renders text as large ASCII art characters using various fonts. It's commonly used for terminal banners, welcome messages, and stylized text output.

Multiple fonts provide different styles from simple block letters to elaborate designs. The tool adjusts character spacing (smushing) to create compact or spread-out output.

figlet reads from standard input if no message is provided, enabling piped input.

# CAVEATS

Font availability varies by installation. Very long text may wrap awkwardly. Some fonts work better at certain terminal widths.

# HISTORY

figlet (Frank, Ian & Glenn's Letters) was created in 1991 by Glenn Chappell and Ian Chai. It became a Unix classic for creating ASCII banners, spawning hundreds of community-created fonts.

# SEE ALSO

[toilet](/man/toilet)(1), [banner](/man/banner)(1), [cowsay](/man/cowsay)(1)
