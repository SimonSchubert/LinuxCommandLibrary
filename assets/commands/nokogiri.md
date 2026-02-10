# TAGLINE

ruby HTML/XML parser CLI

# TLDR

**Parse HTML file**

```nokogiri [file.html]```

**Fetch and parse URL**

```nokogiri [https://example.com]```

**Parse with CSS selector**

```nokogiri [file.html] -e "[doc.css('h1').text]"```

**Parse XML**

```nokogiri [file.xml] --type xml```

**Interactive mode**

```nokogiri [file.html] -i```

# SYNOPSIS

**nokogiri** [_options_] [_file_or_url_]

# PARAMETERS

_FILE_OR_URL_
> HTML/XML file or URL.

**-e** _CODE_
> Execute Ruby code.

**--type** _TYPE_
> Document type (html, xml).

**-i**
> Interactive mode (irb).

**--help**
> Display help information.

# DESCRIPTION

**nokogiri** is a Ruby HTML/XML parser CLI. It provides document parsing and querying.

The tool uses CSS and XPath selectors. Part of the Nokogiri Ruby gem.

# CAVEATS

Requires Ruby. Nokogiri gem must be installed. Ruby syntax for expressions.

# HISTORY

Nokogiri is a **Ruby gem** for parsing HTML/XML, with this CLI wrapper for quick operations.

# SEE ALSO

[xmllint](/man/xmllint)(1), [pup](/man/pup)(1), [xidel](/man/xidel)(1)

