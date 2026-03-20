# TAGLINE

converts man page encodings

# TLDR

**Convert encoding from** ISO-8859-1 to UTF-8

```manconv -f [ISO-8859-1] -t [UTF-8] < [input] > [output]```

**Try multiple input** encodings in sequence

```manconv -f [ISO-8859-1:UTF-8] -t [UTF-8] [input.man]```

**Convert man page** with quiet mode

```manconv -q -f [latin1] -t [utf-8] [oldpage.1] > [newpage.1]```

# SYNOPSIS

**manconv** [_options_] [_file_]

# PARAMETERS

_FILE_
> Input file.

**-f** _ENCODINGS_, **--from-code** _ENCODINGS_
> Source encodings (colon-separated list to try in sequence).

**-t** _ENCODING_, **--to-code** _ENCODING_
> Target encoding.

**-q**, **--quiet**
> Suppress error messages when the page cannot be converted.

**-d**, **--debug**
> Print debugging information.

**-V**, **--version**
> Display version information.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**manconv** converts a manual page from one encoding to another, similar to iconv. Unlike iconv, it can try multiple possible input encodings in sequence. This is useful for manual pages installed in directories without an explicit encoding declaration, since they may be in UTF-8 or in a legacy character set.

If an encoding declaration is found on the first line of the manual page, that declaration overrides any input encodings specified on the command line. The tool is part of **man-db**.

# CAVEATS

If an encoding declaration is found in the file, it overrides the -f option. Part of man-db; primarily designed for man pages rather than general text conversion.

# HISTORY

manconv is part of **man-db**, handling encoding conversion for manual pages.

# SEE ALSO

[man](/man/man)(1), [iconv](/man/iconv)(1), [groff](/man/groff)(1)

