# TAGLINE

reverse line feed filter for text processing

# TLDR

Filter **reverse line feeds** from input

```command | col```

Output with **spaces** instead of tabs

```command | col -x```

Remove **backspaces**, show final character only

```command | col -b```

Set **buffer size** in lines

```command | col -l 256```

Format **man page** for viewing

```man ls | col -b | less```

# SYNOPSIS

**col** [_options_]

# DESCRIPTION

**col** filters reverse line feeds and half-reverse line feeds from input text, ensuring output displays in the correct order on terminals that cannot handle these control sequences. It's a text processing filter that resolves line feed conflicts and optimizes whitespace representation.

The utility is particularly useful for processing output from nroff, tbl, and other text formatting commands that use reverse line feeds for underlining and overstriking. By default, col converts sequences of spaces to tabs for efficiency, though this can be disabled with the -x flag.

Originally designed for printing formatted text on line printers and simple terminals, col remains useful for converting man page output to plain text, preprocessing formatted documents, and handling legacy text formats. It reads from standard input and writes cleaned output to standard output, making it suitable for Unix pipelines.

# PARAMETERS

**-b, --no-backspaces**
> Do not output backspaces; display only the final character at each position

**-f, --fine**
> Enable half-forward line feeds (normally deferred to the following line)

**-h, --tabs**
> Convert multiple spaces to tab characters

**-l, --lines NUM**
> Set memory buffer to at least NUM lines (default: 128)

**-p, --pass**
> Allow unrecognized control sequences to pass through unchanged

**-x, --spaces**
> Output multiple spaces instead of tabs

**-H, --help**
> Display help information and exit

**-V, --version**
> Display version information and exit

# CAVEATS

All unrecognized control characters and escape sequences are discarded by default. The utility warns if input attempts to back up past the last flushed line. Input is assumed to be encoded in UTF-8.

# HISTORY

**col** is part of the **util-linux** package, originally from BSD Unix. It was designed to process output from nroff for display on terminals that could not handle reverse line feeds.

# SEE ALSO

[nroff](/man/nroff)(1), [tbl](/man/tbl)(1), [colcrt](/man/colcrt)(1), [expand](/man/expand)(1)
