# TAGLINE

Convert reStructuredText to HTML

# TLDR

**Convert RST to HTML**

```rst2html [input.rst] [output.html]```

**Convert to stdout**

```rst2html [input.rst]```

**With stylesheet**

```rst2html --stylesheet=[style.css] [input.rst] [output.html]```

**Standalone document**

```rst2html --embed-stylesheet [input.rst] [output.html]```

# SYNOPSIS

**rst2html** [_options_] [_source_] [_destination_]

# PARAMETERS

**--stylesheet** _file_
> CSS stylesheet path.

**--embed-stylesheet**
> Embed CSS in HTML.

**--template** _file_
> Document template.

**--no-doc-title**
> No document title.

**--strict**
> Strict mode.

**--quiet**, **-q**
> Suppress warnings.

# DESCRIPTION

**rst2html** converts reStructuredText documents to HTML. It's part of Docutils, providing the reference implementation for RST processing.

# RST SYNTAX

```rst
Title
=====

Subtitle
--------

Paragraph text with **bold** and *italic*.

* List item 1
* List item 2

::

    Code block
```

# CAVEATS

Part of Docutils package (python-docutils). Multiple variants: rst2html, rst2html4, rst2html5.

# HISTORY

rst2html is part of **Docutils** by **David Goodger** and contributors, implementing reStructuredText processing.

# SEE ALSO

[sphinx-build](/man/sphinx-build)(1), [pandoc](/man/pandoc)(1)
