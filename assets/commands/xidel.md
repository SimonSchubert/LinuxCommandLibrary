# TLDR

**Extract with XPath**

```xidel [file.html] -e "//title"```

**Extract from URL**

```xidel [https://example.com] -e "//h1"```

**CSS selector**

```xidel [file.html] --css "div.content"```

**Extract JSON**

```xidel [file.json] -e "$json/key"```

**Multiple extractions**

```xidel [file.html] -e "//title" -e "//h1"```

**Output JSON**

```xidel [file.html] -e "//a/@href" --output-format=json```

**Follow links**

```xidel [url] -f "//a/@href" -e "//title"```

# SYNOPSIS

**xidel** [_-e expression_] [_--css selector_] [_options_] _input_

# PARAMETERS

**-e**, **--extract** _EXPR_
> XPath/XQuery expression.

**--css** _SELECTOR_
> CSS selector.

**-f**, **--follow** _EXPR_
> Follow links.

**--output-format** _FORMAT_
> Output format.

**--input-format** _FORMAT_
> Input format.

**-s**, **--silent**
> Suppress status.

**--user-agent** _UA_
> User agent.

# DESCRIPTION

**xidel** extracts data from HTML/XML/JSON. It supports XPath, XQuery, and CSS.

XPath expressions query document structure. Powerful selection.

CSS selectors are familiar. Same as browser styling.

JSON querying uses path syntax. Navigate object trees.

Link following enables spidering. Traverse and extract.

Multiple expressions combine results. Complex extractions.

# CAVEATS

Complex syntax learning curve. Large documents may be slow. Encoding issues possible.

# HISTORY

**xidel** was created as a powerful command-line data extraction tool. It combines multiple query languages in one utility.

# SEE ALSO

[xmllint](/man/xmllint)(1), [jq](/man/jq)(1), [pup](/man/pup)(1)
