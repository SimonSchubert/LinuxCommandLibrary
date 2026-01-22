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

**pup** parses HTML with CSS selectors. Command-line HTML processor.

The tool extracts elements from HTML. Similar to jq for HTML.

pup queries HTML.

# CAVEATS

CSS selector syntax. Written in Go.

# HISTORY

pup was created as a **command-line HTML parser** using CSS selectors.

# SEE ALSO

[jq](/man/jq)(1), [htmlq](/man/htmlq)(1), [xidel](/man/xidel)(1)

