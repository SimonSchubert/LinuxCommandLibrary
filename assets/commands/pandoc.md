# TAGLINE

converts document formats

# TLDR

**Convert Markdown to HTML**

```pandoc [input.md] -o [output.html]```

**Convert to PDF**

```pandoc [input.md] -o [output.pdf]```

**Convert to Word**

```pandoc [input.md] -o [output.docx]```

**Specify input format**

```pandoc -f [latex] -t [html] [input.tex] -o [output.html]```

**With table of contents**

```pandoc [input.md] --toc -o [output.html]```

**Use template**

```pandoc [input.md] --template=[template.html] -o [output.html]```

# SYNOPSIS

**pandoc** [_options_] [_input_...]

# PARAMETERS

_INPUT_
> Input file(s).

**-o** _FILE_
> Output file.

**-f** _FORMAT_
> Input format.

**-t** _FORMAT_
> Output format.

**--toc**
> Include table of contents.

**--template** _FILE_
> Use template.

**--help**
> Display help information.

# DESCRIPTION

**pandoc** converts document formats. Universal document converter.

The tool handles many formats. Markdown, LaTeX, HTML, DOCX, PDF, and more.

# CAVEATS

PDF output requires LaTeX or wkhtmltopdf. Format support varies.

# HISTORY

Pandoc was created by **John MacFarlane** as a universal document converter.

# SEE ALSO

[markdown](/man/markdown)(1), [latex](/man/latex)(1), [groff](/man/groff)(1)

