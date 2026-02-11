# TAGLINE

Parse HTML using CSS selectors

# TLDR

**Extract element by selector**

```cat [file.html] | pup '[selector]'```

**Get text content**

```cat [file.html] | pup '[selector] text{}'```

**Get attribute**

```cat [file.html] | pup '[selector] attr{href}'```

**Extract from URL**

```curl -s [url] | pup '[selector]'```

**Output as JSON**

```cat [file.html] | pup '[selector] json{}'```

# SYNOPSIS

**pup** [_options_] [_selectors_]

# PARAMETERS

_SELECTORS_
> CSS selectors.

**text{}**
> Extract text content.

**attr{NAME}**
> Extract attribute.

**json{}**
> JSON output.

**-p**
> Pretty print.

**-n**
> Number results.

# DESCRIPTION

**pup** is a command-line tool for parsing and extracting data from HTML documents using CSS selectors. It reads HTML from standard input and applies selectors to filter elements, making it straightforward to extract structured data from web pages when combined with tools like **curl** or **wget**.

Selectors follow standard CSS syntax including element names, classes, IDs, attributes, and pseudo-classes. Special display functions like **text{}** extract text content, **attr{name}** retrieves attribute values, and **json{}** outputs matching elements as structured JSON. Multiple selectors can be chained to navigate nested document structures.

pup fills a similar role to **jq** but for HTML rather than JSON, providing a lightweight alternative to full-featured scraping frameworks for quick data extraction tasks in shell scripts and pipelines.

# CAVEATS

CSS selector syntax. Written in Go.

# HISTORY

pup was created as a **command-line HTML parser** using CSS selectors.

# SEE ALSO

[jq](/man/jq)(1), [htmlq](/man/htmlq)(1), [xidel](/man/xidel)(1)

