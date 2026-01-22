# TLDR

**Convert** to HTML

```asciidoctor [document.adoc]```

Convert to **PDF**

```asciidoctor-pdf [document.adoc]```

Convert with **custom output**

```asciidoctor -o [output.html] [document.adoc]```

Convert with **backend**

```asciidoctor -b [docbook] [document.adoc]```

Enable **safe mode**

```asciidoctor -S [secure] [document.adoc]```

# SYNOPSIS

**asciidoctor** [_-b backend_] [_-o output_] [_-a attribute=value_] [_options_] _files_

# DESCRIPTION

**asciidoctor** is a fast text processor for converting AsciiDoc markup to HTML, DocBook, man pages, and other formats. It's a Ruby implementation of the AsciiDoc standard, supporting extensions and customization.

AsciiDoc is a lightweight markup language for writing documentation, articles, books, and technical content.

# PARAMETERS

**-b** _backend_
> Output backend (html5, docbook5, manpage)

**-o** _file_
> Output file

**-D** _dir_
> Output directory

**-a** _attr=val_
> Set document attribute

**-r** _lib_
> Require library/extension

**-S** _level_
> Safe mode (unsafe, safe, server, secure)

**-v**, **--verbose**
> Verbose output

**--trace**
> Show backtrace on errors

**-s**, **--no-header-footer**
> Output without HTML wrapper

# CAVEATS

PDF output requires asciidoctor-pdf gem. Some features require additional gems. Safe mode restricts certain features.

# HISTORY

**Asciidoctor** was created by Dan Allen and Ryan Waldron, first released in **2012** as a faster, Ruby-based alternative to the original Python AsciiDoc implementation.

# SEE ALSO

[asciidoc](/man/asciidoc)(1), [pandoc](/man/pandoc)(1), [markdown](/man/markdown)(1)
