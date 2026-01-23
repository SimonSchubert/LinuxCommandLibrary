# TLDR

**Convert an AsciiDoc file** to HTML

```asciidoc [document.txt]```

**Convert to HTML5** format

```asciidoc -b html5 [document.txt]```

**Convert to DocBook** format

```asciidoc -b docbook [document.txt]```

**Generate a man page**

```asciidoc -b html5 -d manpage [command.1.txt]```

**Set document attributes** (table of contents, icons)

```asciidoc -a toc -a icons [document.txt]```

**Specify output file**

```asciidoc -o [output.html] [document.txt]```

**Enable section numbering**

```asciidoc --section-numbers [document.txt]```

# SYNOPSIS

**asciidoc** [_options_] _FILE_

# PARAMETERS

**-b** _backend_, **--backend=**_backend_
> Output format: html, html5, xhtml11, html4, docbook, docbook45, docbook5, slidy, wordpress, latex

**-d** _doctype_, **--doctype=**_doctype_
> Document type: article (default), book, manpage

**-o** _file_, **--out-file=**_file_
> Write output to file (default: input filename with new extension)

**-a** _name=value_, **--attribute=**_name=value_
> Set a document attribute

**-f** _file_, **--conf-file=**_file_
> Use additional configuration file

**-n**, **--section-numbers**
> Auto-number section titles

**-s**, **--no-header-footer**
> Output document body only (no HTML head/body tags)

**--safe**
> Enable safe mode (disable potentially dangerous features)

**-v**, **--verbose**
> Print processing information to stderr

**--help** _topic_
> Print help (topics: syntax, manpage)

**--version**
> Print version number

# DESCRIPTION

**asciidoc** converts plain text documents written in AsciiDoc markup to HTML, DocBook, and other formats. AsciiDoc is a lightweight markup language designed for writing documentation, articles, books, and man pages.

The default backend is HTML (xhtml11). DocBook output can be further processed with tools like **dblatex** for PDF generation or **xmlto** for various formats. The tool reads configuration from **/etc/asciidoc/** and **~/.asciidoc/**.

Document attributes control output features like table of contents (**-a toc**), embedded images (**-a data-uri**), icons (**-a icons**), and maximum width (**-a max-width=55em**). Attributes can also be set within the document itself.

If FILE is **-**, input is read from standard input, enabling pipeline processing.

# CAVEATS

The original Python-based **asciidoc** is considered legacy. **Asciidoctor** (written in Ruby) is the actively maintained implementation with more features and faster processing. Some advanced features may differ between implementations.

# HISTORY

AsciiDoc was created by **Stuart Rackham** in **2002** as a more readable alternative to DocBook XML. The format was designed to be human-readable while still capable of producing professional documentation. **Asciidoctor**, a modern reimplementation, was started in **2012** by **Dan Allen** and has become the primary implementation, used by projects like GitHub, GitLab, and the Eclipse Foundation.

# SEE ALSO

[asciidoctor](/man/asciidoctor)(1), [pandoc](/man/pandoc)(1), [markdown](/man/markdown)(1), [rst2html](/man/rst2html)(1)
