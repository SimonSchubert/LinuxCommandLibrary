# TAGLINE

parse and query HTML at the command line using CSS selectors

# TLDR

**Filter elements by selector** from stdin

```cat [file.html] | pup '[selector]'```

**Extract text content** of matching elements

```cat [file.html] | pup '[selector] text{}'```

**Extract an attribute value** (e.g. `href`)

```cat [file.html] | pup '[selector] attr{href}'```

**Read from a file instead of stdin**

```pup -f [file.html] '[selector]'```

**Parse HTML fetched from a URL**

```curl -s [url] | pup '[selector]'```

**Output matching elements as JSON**

```cat [file.html] | pup '[selector] json{}'```

**Number the matching elements**

```cat [file.html] | pup -n '[selector]'```

**Pretty-print with 4-space indent and color**

```cat [file.html] | pup -c --indent 4 '[selector]'```

**Limit printed nesting depth**

```cat [file.html] | pup -l [2] '[selector]'```

# SYNOPSIS

**pup** [_options_] ['_selectors_ [_display-function_]']

# PARAMETERS

**-f**, **--file** _FILE_
> Read HTML from _FILE_ instead of stdin.

**-c**, **--color**
> Colorize output.

**-p**, **--plain**
> Do not HTML-escape the output.

**--pre**
> Preserve whitespace (useful inside `<pre>`/`<code>`).

**-i**, **--indent** _N_|_CHAR_
> Indent by _N_ spaces (or by the given character).

**-l**, **--limit** _N_
> Limit output nesting depth to _N_ levels.

**-n**, **--number**
> Print the number of matching elements instead of the elements themselves.

**--charset** _ENCODING_
> Force input character encoding (default: auto-detect).

**-h**, **--help**
> Show help.

**--version**
> Show version.

# SELECTORS AND DISPLAY FUNCTIONS

**CSS selectors**
> Standard CSS syntax — `div.class`, `#id`, `a[href^="http"]`, `ul > li:first-child`, `tr:nth-child(even)`, etc. Multiple selectors can be chained with spaces to walk into nested structures.

**text{}**
> Emit text content (depth-first) of each matching element.

**attr{**_NAME_**}**
> Emit the value of the _NAME_ attribute of each matching element.

**json{}**
> Emit matching elements as a JSON array of `{tag, attrs, children, text}` objects.

**slice{**_N_**}** / **slice{**_N:M_**}**
> Return only the _N_th (or _N_ through _M_-1) of matching elements.

# DESCRIPTION

**pup** is the HTML counterpart to **jq** — it reads an HTML document from stdin (or a file via `-f`), applies a CSS-style selector to filter elements, and optionally runs a display function (`text{}`, `attr{…}`, `json{}`, `slice{…}`) to project matches into the form you want. It is a single static Go binary with no runtime dependencies, which makes it ideal for scraping pipelines and Makefiles.

Because it understands most of CSS3 (including common pseudo-classes), many scraping problems reduce to a single pipe: `curl | pup 'selector json{}' | jq`.

# CAVEATS

pup reads the whole input into memory — not suitable for multi-gigabyte HTML. The last upstream release was in 2016; fork `eiriklv/pup` and several drop-in replacements (`htmlq`, `xq`, `xidel`) provide newer features such as XPath or CSS4 selectors.

# HISTORY

**pup** was written by **Eric Chiang** in **Go**. Its syntax is explicitly modelled after **jq**: the same "query string + optional display function" mental model, applied to HTML.

# SEE ALSO

[jq](/man/jq)(1), [htmlq](/man/htmlq)(1), [xidel](/man/xidel)(1), [curl](/man/curl)(1)
