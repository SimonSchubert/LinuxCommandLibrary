# TAGLINE

HTML/XML/JSON data extraction tool

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

**xidel** is a command-line tool for extracting and querying data from HTML, XML, and JSON documents. It supports multiple query languages including XPath, XQuery, and CSS selectors, making it versatile for a wide range of data extraction tasks from both local files and remote URLs.

XPath and XQuery expressions allow precise navigation of document structure, while CSS selectors provide a familiar syntax for those accustomed to web development. For JSON documents, xidel uses a path-based syntax to navigate object hierarchies. Multiple extraction expressions can be combined in a single invocation for complex data gathering.

The tool includes a link-following mode that enables web spidering, where xidel can traverse links on pages and apply extraction expressions to each visited page. Output can be formatted as plain text, JSON, or other structured formats, making it suitable for integration into data processing pipelines.

# CAVEATS

Complex syntax learning curve. Large documents may be slow. Encoding issues possible.

# HISTORY

**xidel** was created as a powerful command-line data extraction tool. It combines multiple query languages in one utility.

# SEE ALSO

[xmllint](/man/xmllint)(1), [jq](/man/jq)(1), [pup](/man/pup)(1)
