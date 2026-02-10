# TAGLINE

converts man page encodings

# TLDR

**Convert encoding**

```manconv -f [ISO-8859-1] -t [UTF-8] < [input] > [output]```

**Auto-detect input encoding**

```manconv -t [UTF-8] [input.man]```

**Convert man page**

```manconv -f [latin1] -t [utf-8] [oldpage.1] > [newpage.1]```

# SYNOPSIS

**manconv** [_options_] [_file_]

# PARAMETERS

_FILE_
> Input file.

**-f** _ENCODING_
> Source encoding.

**-t** _ENCODING_
> Target encoding.

**-d**
> Debug output.

**--help**
> Display help information.

# DESCRIPTION

**manconv** converts man page encodings. It transforms between character sets.

The tool is part of man-db. Used to convert legacy man pages to UTF-8.

# CAVEATS

Part of man-db. Encoding detection may fail. Primarily for man pages.

# HISTORY

manconv is part of **man-db**, handling encoding conversion for manual pages.

# SEE ALSO

[man](/man/man)(1), [iconv](/man/iconv)(1), [groff](/man/groff)(1)

