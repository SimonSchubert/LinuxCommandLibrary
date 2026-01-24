# TLDR

**View TheDraw file**

```tdf [font.tdf]```

**List fonts in file**

```tdf -l [font.tdf]```

**Render text**

```tdf -f [font.tdf] "[text]"```

**Specific font from file**

```tdf -f [font.tdf] -n [fontname] "[text]"```

# SYNOPSIS

**tdf** [_-f file_] [_-l_] [_-n name_] [_options_] [_text_]

# PARAMETERS

**-f** _FILE_
> Font file.

**-l**
> List fonts.

**-n** _NAME_
> Font name.

**-c** _COLOR_
> Color mode.

**--help**
> Show help.

# DESCRIPTION

**tdf** renders TheDraw fonts. It displays ANSI art text.

TheDraw font support. Classic BBS format.

Text rendering. ASCII art output.

Multiple fonts per file. Select by name.

Terminal output. ANSI colors.

# CAVEATS

TDF files needed. Retro format. Limited font availability.

# HISTORY

**tdf** displays text using **TheDraw** ANSI font files, a popular format from the BBS era.

# SEE ALSO

[figlet](/man/figlet)(1), [toilet](/man/toilet)(1), [banner](/man/banner)(1)
