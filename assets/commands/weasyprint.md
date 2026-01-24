# TLDR

**Convert HTML to PDF**

```weasyprint [input.html] [output.pdf]```

**Convert from URL**

```weasyprint [https://example.com] [output.pdf]```

**Convert HTML to PNG**

```weasyprint [input.html] [output.png]```

**Specify stylesheet**

```weasyprint -s [style.css] [input.html] [output.pdf]```

**Set base URL for resources**

```weasyprint -u [https://example.com/] [input.html] [output.pdf]```

**Render at specific resolution**

```weasyprint -r [150] [input.html] [output.png]```

**Multiple stylesheets**

```weasyprint -s [base.css] -s [print.css] [input.html] [output.pdf]```

# SYNOPSIS

**weasyprint** [_-s stylesheet_] [_-u base_url_] [_-r resolution_] [_options_] _input_ _output_

# PARAMETERS

**-s**, **--stylesheet** _FILE_
> Add CSS stylesheet.

**-u**, **--base-url** _URL_
> Base URL for relative resources.

**-m**, **--media-type** _TYPE_
> Media type (default: print).

**-r**, **--resolution** _DPI_
> Resolution for PNG output.

**-a**, **--attachment** _FILE_
> Attach file to PDF.

**-p**, **--presentational-hints**
> Follow HTML presentational hints.

**--pdf-identifier** _ID_
> PDF document identifier.

**--pdf-variant** _VARIANT_
> PDF variant: pdf/a-1b, pdf/a-2b, pdf/a-3b, pdf/ua-1.

**--pdf-version** _VERSION_
> PDF version: 1.4, 1.5, 1.6, 1.7, 2.0.

**--pdf-forms**
> Enable PDF forms.

**--optimize-images**
> Losslessly optimize images.

**--hinting**
> Enable font hinting.

**-e**, **--encoding** _ENCODING_
> Input encoding.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**WeasyPrint** renders HTML/CSS to PDF and PNG. It's designed for creating printable documents from web content, supporting CSS for paged media.

The tool processes HTML with full CSS support including modern features: flexbox, grid, CSS variables, and media queries. Print-specific CSS (page breaks, margins, headers/footers) works correctly.

CSS Paged Media enables sophisticated print layouts: multi-column, page numbers, running headers, cross-references, and footnotes. The @page rule controls page size and margins.

PDF output includes internal links, bookmarks from headings, and optional file attachments. PDF/A variants ensure archival quality for long-term storage.

Input can be files, URLs, or stdin. External stylesheets override or extend document styles. The base URL resolves relative resource paths.

Image optimization reduces file size without quality loss. Font embedding ensures consistent rendering regardless of system fonts.

# CAVEATS

Large documents may use significant memory. Some complex CSS may not render identically to browsers. JavaScript not supported - static HTML only. PDF form support is basic. Some font rendering differences from browsers.

# HISTORY

**WeasyPrint** was created by **Kozea** (Simon Sapin and others) around **2011**. It was designed as an alternative to wkhtmltopdf, using native Python libraries instead of a headless browser. The focus on CSS Paged Media makes it particularly suitable for document generation.

# SEE ALSO

[wkhtmltopdf](/man/wkhtmltopdf)(1), [pandoc](/man/pandoc)(1), [prince](/man/prince)(1), [puppeteer](/man/puppeteer)(1)
