# TAGLINE

extract font file information

# TLDR

**Query font file**

```fc-query [font.ttf]```

**Show specific property**

```fc-query --format '%{family}\n' [font.ttf]```

**List all properties**

```fc-query --format '%{=unparse}\n' [font.ttf]```

**Query font index**

```fc-query --index [0] [font.ttc]```

# SYNOPSIS

**fc-query** [_options_] _font-file_

# PARAMETERS

_FONT-FILE_
> Font file to query (.ttf, .otf, .ttc).

**--format** _FORMAT_
> Output format string.

**--index** _N_
> Font index in collection.

**-v**, **--verbose**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**fc-query** extracts and displays information from font files without installing them. It's part of fontconfig and shows font properties like family, style, weight, and supported languages.

The tool queries individual font files directly rather than the system font cache. Format strings allow extracting specific properties. For font collections (.ttc), specific fonts can be selected by index.

fc-query is useful for examining fonts before installation or scripting font management tasks.

# CAVEATS

Only reads single files, not directories. Format string syntax requires learning. Some fonts may have incomplete metadata.

# HISTORY

fc-query is part of **fontconfig**, the font configuration library created by Keith Packard for X.org. It provides programmatic access to font metadata used by the fontconfig system.

# SEE ALSO

[fc-scan](/man/fc-scan)(1), [fc-list](/man/fc-list)(1), [fc-cache](/man/fc-cache)(1)
