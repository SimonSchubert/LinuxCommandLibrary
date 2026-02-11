# TAGLINE

Render TheDraw ANSI font text

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

**tdf** renders text using TheDraw font files (.tdf), a format originating from the BBS era for creating colorful ANSI art text banners. Each TDF file can contain multiple fonts, and specific fonts can be selected by name.

The tool reads TheDraw font definitions and uses them to transform plain text into large, stylized ANSI art rendered with colors and special characters. The **-l** flag lists all available fonts within a TDF file, making it easy to browse font collections before rendering.

# CAVEATS

TDF files needed. Retro format. Limited font availability.

# HISTORY

**tdf** displays text using **TheDraw** ANSI font files, a popular format from the BBS era.

# SEE ALSO

[figlet](/man/figlet)(1), [toilet](/man/toilet)(1), [banner](/man/banner)(1)
