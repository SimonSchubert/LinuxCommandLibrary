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

**col** filters reverse and half-reverse line feeds from input, ensuring output displays in correct order. It replaces whitespace with tabs when feasible and is particularly useful for processing output from nroff and tbl commands.

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
