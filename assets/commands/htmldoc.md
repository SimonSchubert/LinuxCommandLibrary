# TAGLINE

converts HTML files to PDF or PostScript

# TLDR

**Convert HTML to PDF**

```htmldoc --webpage -f [output.pdf] [input.html]```

**Convert to PostScript**

```htmldoc --webpage --format ps -f [output.ps] [input.html]```

**Convert multiple files**

```htmldoc --book -f [output.pdf] [chapter1.html] [chapter2.html]```

**Set page size**

```htmldoc --webpage --size [letter] -f [output.pdf] [input.html]```

**Add header**

```htmldoc --webpage --header [.t.] -f [output.pdf] [input.html]```

# SYNOPSIS

**htmldoc** [_options_] _files_...

# PARAMETERS

**--webpage**
> Single page mode.

**--book**
> Multi-chapter book mode.

**-f** _file_
> Output filename.

**--format** _format_
> Output format: pdf, ps, html.

**--size** _size_
> Page size: letter, a4, legal.

**--landscape**
> Landscape orientation.

**--header** _format_
> Header format.

**--footer** _format_
> Footer format.

**--title**
> Include title page.

**--toc**
> Include table of contents.

**--numbered**
> Number headings.

**--gray**
> Grayscale output.

# DESCRIPTION

**HTMLDOC** converts HTML files to PDF or PostScript. It can process single pages or combine multiple HTML files into a book with table of contents and headers/footers.

The tool is useful for generating printable documentation from HTML sources. It handles basic HTML and CSS, creating well-formatted output.

# HEADER/FOOTER FORMAT

```
.   - Blank
t   - Title
h   - Heading
c   - Chapter
d   - Date
T   - Time
D   - Date/time
/   - Page number
:   - Total pages
```

# CAVEATS

Limited CSS support. Complex layouts may not render correctly. JavaScript is not executed. Best for simple, structured HTML.

# HISTORY

HTMLDOC was created by **Michael Sweet** and was originally released by Easy Software Products. It has been used for documentation generation and is now an open-source project.

# SEE ALSO

[wkhtmltopdf](/man/wkhtmltopdf)(1), [weasyprint](/man/weasyprint)(1), [pandoc](/man/pandoc)(1)
