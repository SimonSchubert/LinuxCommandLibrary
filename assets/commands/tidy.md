# TAGLINE

Validate and reformat HTML markup

# TLDR

**Clean HTML file**

```tidy [input.html]```

**Write to file**

```tidy -o [output.html] [input.html]```

**Modify in place**

```tidy -m [file.html]```

**Convert to XHTML**

```tidy -asxhtml [input.html]```

**Show only errors**

```tidy -e [input.html]```

**Indent output**

```tidy -i [input.html]```

**Quiet mode**

```tidy -q [input.html]```

**Wrap at column**

```tidy -w [80] [input.html]```

# SYNOPSIS

**tidy** [_-o output_] [_-m_] [_-i_] [_options_] [_files_]

# PARAMETERS

**-o** _FILE_
> Output file.

**-m**, **--modify**
> Modify in place.

**-i**, **--indent**
> Indent content.

**-e**, **--errors**
> Show errors only.

**-q**, **--quiet**
> Quiet mode.

**-w** _N_, **--wrap** _N_
> Wrap at column.

**-asxhtml**
> Output as XHTML.

**-ashtml**
> Output as HTML.

**--indent-spaces** _N_
> Spaces per indent.

# DESCRIPTION

**tidy** validates and reformats HTML documents, detecting markup errors such as missing closing tags, improper nesting, and deprecated elements. It can automatically fix many common problems while producing consistently formatted output with standardized indentation and line wrapping.

The tool can convert HTML to XHTML (**-asxhtml**) for stricter XML-compliant output, or reformat in place with **-m**. Error-only mode (**-e**) reports problems without modifying the document, useful for quick validation checks. Output wrapping width is configurable with the **-w** flag.

# CAVEATS

May change whitespace. Some fixes alter rendering. Complex pages need care.

# HISTORY

**HTML Tidy** was originally developed by **Dave Raggett** at **W3C**. It's maintained by HTACG (HTML Tidy Advocacy Community Group).

# SEE ALSO

[xmllint](/man/xmllint)(1), [prettier](/man/prettier)(1)
