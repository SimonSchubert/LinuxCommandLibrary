# TAGLINE

Convert encoding for groff input processing

# TLDR

**Convert encoding for groff**

```preconv [file]```

**Specify input encoding**

```preconv -e [utf-8] [file]```

**Debug mode**

```preconv -d [file]```

# SYNOPSIS

**preconv** [_options_] [_files_]

# PARAMETERS

_FILES_
> Input files.

**-e** _ENCODING_
> Input encoding.

**-d**
> Debug output.

**-r**
> Do not add .lf lines.

# DESCRIPTION

**preconv** is a groff preprocessor that converts input files from various character encodings (UTF-8, Latin-1, etc.) into a format that groff can process. It translates non-ASCII characters into groff escape sequences, enabling groff to handle Unicode and other multi-byte encodings.

The tool is typically invoked automatically by groff when needed, but can also be used explicitly in preprocessing pipelines. It detects the input encoding from BOM markers, coding tags, or locale settings.

# CAVEATS

Groff preprocessor. Usually called automatically.

# HISTORY

preconv was created as a **groff preprocessor** for encoding conversion.

# SEE ALSO

[groff](/man/groff)(1), [troff](/man/troff)(1), [iconv](/man/iconv)(1)

