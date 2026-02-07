# TAGLINE

bitmap font to SFNT converter

# TLDR

**Convert BDF to** sfnt

```fonttosfnt -o [output.ttf] [input.bdf]```

**Convert PCF font**

```fonttosfnt -o [output.otb] [input.pcf]```

**Verbose output**

```fonttosfnt -v -o [output.ttf] [input.bdf]```

**Process multiple fonts**

```fonttosfnt -o [output.ttf] [font1.bdf] [font2.bdf]```

# SYNOPSIS

**fonttosfnt** [_options_] _input-files_...

# PARAMETERS

_INPUT-FILES_
> BDF or PCF font files.

**-o** _FILE_
> Output file name.

**-v**
> Verbose output.

**-g** _N_
> Gamma correction value.

**-m**
> Merge glyphs into single font.

**--help**
> Display help information.

# DESCRIPTION

**fonttosfnt** converts bitmap fonts (BDF, PCF) to SFNT format (TrueType/OpenType with bitmap data). It preserves bitmap glyphs while providing modern font file format.

The tool embeds bitmap strikes in SFNT wrappers, enabling use of legacy bitmap fonts in systems expecting modern font formats. Multiple input fonts can be merged.

fonttosfnt bridges classic X11 bitmap fonts with contemporary font infrastructure.

# CAVEATS

Output remains bitmap, not vector. Limited font metadata support. Best for specific sizes.

# HISTORY

fonttosfnt is part of the **X.Org** font utilities, providing conversion between traditional X11 bitmap formats and modern SFNT containers for compatibility with newer systems.

# SEE ALSO

[bdftopcf](/man/bdftopcf)(1), [mkfontscale](/man/mkfontscale)(1), [fontforge](/man/fontforge)(1)
