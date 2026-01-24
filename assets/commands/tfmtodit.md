# TLDR

**Create a font description file** from a TeX font metrics file

```tfmtodit [tfm_file] [map_file] [font]```

**Create a special font** description file

```tfmtodit -s [tfm_file] [map_file] [font]```

**Use a gf file** for additional font metric information

```tfmtodit -g [gf_file] [tfm_file] [map_file] [font]```

**Specify a skew character** position

```tfmtodit -k [skewchar] [tfm_file] [map_file] [font]```

# SYNOPSIS

**tfmtodit** [**-sv**] [**-g** _gf_file_] [**-k** _skewchar_] _tfm_file_ _map_file_ _font_

# PARAMETERS

**-s**
> Add the special directive to the font description file. Use when the font should be searched whenever a glyph is not found in the current font.

**-g** _gf_file_
> Use the gf file produced by Metafont containing special and numspecial commands to obtain additional font metric information.

**-k** _skewchar_
> Specify the skew character position. Any kerns whose second component is the skew character are ignored. May be given in decimal, octal (leading 0), or hexadecimal (leading 0x).

**-v**
> Print the version number and exit.

# DESCRIPTION

**tfmtodit** creates font description files for use with groff's DVI output device. It converts TeX Font Metrics (TFM) files into the format required by groff.

The _tfm_file_ is the TeX font metric file for the font. The _map_file_ assigns groff character identifiers to glyph indices in the font, consisting of lines in the form `i c1 ... cn` where i is the glyph position and c1 through cn are glyph identifiers. Output is written in groff_font(5) format to the specified _font_ file.

For math typesetting, groff requires additional font metric information not present in TFM files. This is because TeX uses separate math italic fonts while groff uses normal italic fonts for math. The additional information comes from the math_fit macro arguments in Metafont programs for Computer Modern fonts.

# CAVEATS

The tool is specifically designed for the DVI output device and may not work correctly with other groff output devices. Proper math typesetting requires supplementary font metric data from Metafont gf files via the **-g** option.

# HISTORY

**tfmtodit** is part of the **groff** (GNU troff) project, which began in **1990** as a free software replacement for the Unix troff typesetting system. The tool bridges the gap between TeX font metrics and groff's font description format, enabling use of TeX fonts with groff's DVI output.

# SEE ALSO

[groff](/man/groff)(1), [grodvi](/man/grodvi)(1), [groff_font](/man/groff_font)(5)
