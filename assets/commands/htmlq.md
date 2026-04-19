# TAGLINE

extracts data from HTML using CSS selectors

# TLDR

**Extract elements by selector**

```cat [page.html] | htmlq [.class-name]```

**Get attribute value**

```htmlq -a href [a.link] < [page.html]```

**Get text content**

```htmlq -t [p] < [page.html]```

**Pretty print HTML**

```htmlq -p [body] < [page.html]```

**Remove nodes before extracting**

```htmlq --remove-nodes [.unwanted] [div.content] < [page.html]```

**From URL via curl**

```curl -s [url] | htmlq [selector]```

# SYNOPSIS

**htmlq** [_options_] _selector_

# PARAMETERS

_SELECTOR_
> CSS selector.

**-a**, **--attribute** _ATTR_
> Only return this attribute's value from selected elements.

**-t**, **--text**
> Output only the text content of selected elements.

**-p**, **--pretty**
> Pretty-print the serialised HTML output.

**-b**, **--base** _URL_
> Use this URL as the base for relative links.

**-B**, **--detect-base**
> Detect the base URL from the document's `<base>` tag.

**-f**, **--filename** _FILE_
> Input file (defaults to stdin).

**-o**, **--output** _FILE_
> Output file (defaults to stdout).

**-r**, **--remove-nodes** _SELECTOR_
> Remove matching nodes before output. May be specified multiple times.

**-w**, **--ignore-whitespace**
> When printing text nodes, ignore whitespace-only nodes.

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Show version information.

# DESCRIPTION

**htmlq** extracts data from HTML using CSS selectors. It's like jq for HTML, providing command-line HTML parsing.

The tool reads HTML from stdin or files and outputs matching elements. It supports extracting text, attributes, and formatted HTML.

# CAVEATS

Does not validate HTML; malformed input may produce unexpected results. CSS selector support covers most common patterns but may not support all CSS4 pseudo-selectors. Input is read entirely into memory, so very large HTML documents may be slow.

# HISTORY

htmlq was created as a command-line HTML querying tool inspired by jq for JSON processing.

# SEE ALSO

[pup](/man/pup)(1), [jq](/man/jq)(1), [xmllint](/man/xmllint)(1), [curl](/man/curl)(1)
