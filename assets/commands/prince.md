# TLDR

**Convert HTML to PDF**

```prince [input.html] -o [output.pdf]```

**Apply CSS stylesheet**

```prince -s [style.css] [input.html] -o [output.pdf]```

**Convert from URL**

```prince [https://example.com] -o [page.pdf]```

**Multiple inputs**

```prince [page1.html] [page2.html] -o [combined.pdf]```

# SYNOPSIS

**prince** [_options_] _files_... [**-o** _output.pdf_]

# PARAMETERS

**-o**, **--output** _file_
> Output PDF file.

**-s**, **--style** _file_
> Additional CSS file.

**--javascript**
> Enable JavaScript.

**--media** _type_
> CSS media type.

**--page-size** _size_
> Page dimensions.

**--page-margin** _margin_
> Page margins.

**--encrypt**
> Encrypt PDF.

# DESCRIPTION

**Prince** is a commercial HTML/CSS to PDF converter with excellent standards compliance. It produces high-quality PDFs suitable for print production.

# EXAMPLES

```bash
# Basic conversion
prince document.html -o document.pdf

# With custom styles
prince -s print.css report.html -o report.pdf

# From URL
prince https://example.com/page -o page.pdf

# Multiple files combined
prince cover.html content.html appendix.html -o book.pdf

# With JavaScript
prince --javascript dynamic.html -o output.pdf

# Custom page size
prince --page-size="A4" document.html -o a4.pdf
```

# CAVEATS

Commercial license required for production use. Free for non-commercial. Excellent CSS Paged Media support.

# HISTORY

Prince was developed by **YesLogic** starting in 2003 as a high-quality HTML to PDF converter for publishing.

# SEE ALSO

[wkhtmltopdf](/man/wkhtmltopdf)(1), [weasyprint](/man/weasyprint)(1), [pandoc](/man/pandoc)(1)
