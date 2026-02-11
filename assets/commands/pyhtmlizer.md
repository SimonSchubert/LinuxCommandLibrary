# TAGLINE

Convert Python source to syntax-highlighted HTML

# TLDR

**Convert Python to HTML**

```pyhtmlizer [file.py]```

**Output to file**

```pyhtmlizer [file.py] > [output.html]```

# SYNOPSIS

**pyhtmlizer** [_file_]

# PARAMETERS

_FILE_
> Python file to convert.

# DESCRIPTION

**pyhtmlizer** converts Python source code files into syntax-highlighted HTML documents. It is distributed as part of the Twisted framework's utility collection and uses Twisted's internal tokenizer to parse Python syntax and apply color-coded markup.

The generated HTML preserves the structure of the original source with colored keywords, strings, comments, and identifiers. Output goes to stdout by default, making it easy to redirect into an HTML file for embedding in documentation or web pages.

# CAVEATS

Part of Twisted. Basic highlighting.

# HISTORY

pyhtmlizer is part of **Twisted framework** utilities.

# SEE ALSO

[pygmentize](/man/pygmentize)(1), [highlight](/man/highlight)(1)

