# TAGLINE

Convert HTML pages to PDF

# TLDR

**Convert HTML to PDF**

```wkhtmltopdf [input.html] [output.pdf]```

**Convert URL to PDF**

```wkhtmltopdf [https://example.com] [output.pdf]```

**Set page size**

```wkhtmltopdf --page-size [A4] [input.html] [output.pdf]```

**Set orientation**

```wkhtmltopdf --orientation [Landscape] [input.html] [output.pdf]```

**Add margins**

```wkhtmltopdf --margin-top [20mm] --margin-bottom [20mm] [input.html] [output.pdf]```

**Disable JavaScript**

```wkhtmltopdf --disable-javascript [input.html] [output.pdf]```

**Add header and footer**

```wkhtmltopdf --header-center "[title]" --footer-center "[page]/[topage]" [input.html] [output.pdf]```

**Multiple pages**

```wkhtmltopdf [page1.html] [page2.html] [output.pdf]```

# SYNOPSIS

**wkhtmltopdf** [_--page-size size_] [_--orientation orient_] [_--margin-* size_] [_options_] _input_ _output_

# PARAMETERS

**--page-size** _SIZE_
> Paper size: A4, Letter, Legal, etc.

**--orientation** _ORIENT_
> Landscape or Portrait.

**--margin-top** _SIZE_
> Top margin (e.g., 10mm, 1in).

**--margin-bottom** _SIZE_
> Bottom margin.

**--margin-left** _SIZE_
> Left margin.

**--margin-right** _SIZE_
> Right margin.

**--dpi** _DPI_
> Output resolution.

**--zoom** _FACTOR_
> Zoom factor.

**--grayscale**
> Generate grayscale PDF.

**--disable-javascript**
> Don't run JavaScript.

**--javascript-delay** _MS_
> Wait before printing.

**--header-html** _FILE_
> HTML header file.

**--header-center** _TEXT_
> Centered header text.

**--footer-html** _FILE_
> HTML footer file.

**--footer-center** _TEXT_
> Centered footer text.

**--toc**
> Include table of contents.

**--cover** _FILE_
> Cover page HTML.

**--cookie** _NAME_ _VALUE_
> Set cookie.

**--username** _USER_
> HTTP authentication user.

**--password** _PASS_
> HTTP authentication password.

**--no-images**
> Don't load images.

# DESCRIPTION

**wkhtmltopdf** converts HTML to PDF using the WebKit rendering engine. It renders pages as a browser would, then outputs to PDF.

Multiple input pages combine into a single PDF. Table of contents can be auto-generated from headings. Cover pages and headers/footers frame the content.

Headers and footers support variables: [page], [topage], [title], [section], [subsection], [date], [time], [webpage]. These enable automatic page numbers and running headers.

Page breaks can be controlled via CSS print media rules. The tool respects page-break-before, page-break-after, and related properties.

JavaScript delay handles dynamic content that loads asynchronously. For heavily JS-dependent pages, increasing delay ensures complete rendering.

Authentication options handle basic auth, cookies, and custom headers. This enables converting protected pages.

# CAVEATS

Based on old QtWebKit - some modern CSS/JS may not work. Project is no longer maintained. Security concerns with untrusted content. Large pages use significant memory. Some fonts may not embed correctly. Consider WeasyPrint or Chrome headless as alternatives.

# HISTORY

**wkhtmltopdf** was created by **Jakob Truelsen** around **2008**. It provided command-line HTML to PDF conversion before headless browsers existed. Despite being based on an older WebKit version, it became widely used. Development slowed as headless Chrome/Firefox emerged as alternatives.

# SEE ALSO

[weasyprint](/man/weasyprint)(1), [chromium](/man/chromium)(1), [pandoc](/man/pandoc)(1), [htmldoc](/man/htmldoc)(1)
