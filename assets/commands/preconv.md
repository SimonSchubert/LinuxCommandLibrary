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

**preconv** converts encoding for groff input. Preprocessor.

The tool handles Unicode input. Part of groff suite.

preconv encodes for groff.

# CAVEATS

Groff preprocessor. Usually called automatically.

# HISTORY

preconv was created as a **groff preprocessor** for encoding conversion.

# SEE ALSO

[groff](/man/groff)(1), [troff](/man/troff)(1), [iconv](/man/iconv)(1)

