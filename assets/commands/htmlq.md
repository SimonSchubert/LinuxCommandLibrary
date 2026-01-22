# TLDR

**Extract elements by selector**

```cat [page.html] | htmlq [.class-name]```

**Get attribute value**

```htmlq -a href [a.link] < [page.html]```

**Get text content**

```htmlq -t [p] < [page.html]```

**Pretty print HTML**

```htmlq -p [body] < [page.html]```

**From URL via curl**

```curl [url] | htmlq [selector]```

# SYNOPSIS

**htmlq** [_options_] _selector_

# PARAMETERS

_SELECTOR_
> CSS selector.

**-a**, **--attribute** _ATTR_
> Extract attribute value.

**-t**, **--text**
> Extract text content.

**-p**, **--pretty**
> Pretty print output.

**-B**, **--remove-nodes** _SEL_
> Remove matching nodes.

**-f**, **--file** _FILE_
> Read from file.

**--help**
> Display help information.

# DESCRIPTION

**htmlq** extracts data from HTML using CSS selectors. It's like jq for HTML, providing command-line HTML parsing.

The tool reads HTML from stdin or files and outputs matching elements. It supports extracting text, attributes, and formatted HTML.

htmlq queries HTML with CSS selectors.

# CAVEATS

Requires valid HTML. Written in Rust. Similar to pup tool.

# HISTORY

htmlq was created as a command-line HTML querying tool inspired by jq for JSON processing.

# SEE ALSO

[pup](/man/pup)(1), [jq](/man/jq)(1), [xmllint](/man/xmllint)(1)
