# TAGLINE

Markdown to PDF converter

# TLDR

**Convert** a Markdown file to PDF

```mdpdf [input.md] -o [output.pdf]```

**Convert** with a specific paper size

```mdpdf [input.md] -o [output.pdf] --paper [A4]```

**Set PDF metadata** (title and author)

```mdpdf [input.md] -o [output.pdf] --title "[title]" --author "[author]"```

**Add a header** to each page

```mdpdf [input.md] -o [output.pdf] --header "[header text]"```

**Add a footer** to each page

```mdpdf [input.md] -o [output.pdf] --footer "[footer text]"```

**Convert multiple** input files into a single PDF

```mdpdf [file1.md] [file2.md] -o [combined.pdf]```

# SYNOPSIS

**mdpdf** [_options_] [_INPUTS_]...

# PARAMETERS

**-o, --output** _FILE_
> Destination path for the PDF output (required)

**-h, --header** _template_
> Set a header template for each page

**-f, --footer** _template_
> Set a footer template for each page

**-t, --title** _TEXT_
> PDF title metadata

**-s, --subject** _TEXT_
> PDF subject metadata

**-a, --author** _TEXT_
> PDF author metadata

**-k, --keywords** _TEXT_
> PDF keywords metadata

**-p, --paper** _[letter|A4]_
> Paper size (default: letter)

**--version**
> Display version information

**--help**
> Show help message

# DESCRIPTION

**mdpdf** is a command-line application for converting Markdown files to PDF. It supports CommonMark markdown syntax and produces clean, left-aligned PDF output using base-14 PDF fonts.

The tool converts Markdown headings into PDF bookmarks for easy navigation, transforms file links into PDF attachments, and embeds images with optional captions and width specifications. Multiple input files can be combined into a single output PDF.

mdpdf is designed for simplicity and minimal dependencies, relying on **commonmark** for Markdown parsing, **PyMuPDF** for PDF generation, and **click** for the command-line interface.

# CAVEATS

mdpdf uses a one-size-fits-all styling approach with no custom CSS or template support. Users requiring advanced formatting control, complex layouts, or custom styling should consider alternatives like **Pandoc** with LaTeX, **WeasyPrint**, or **md-to-pdf**.

# HISTORY

mdpdf was created by **Norman Lorrain** and written in **Python**. It is released under the **MIT** license and available via **pip** from PyPI. The project focuses on providing a straightforward, dependency-light Markdown-to-PDF conversion workflow.

# SEE ALSO

[pandoc](/man/pandoc)(1), [wkhtmltopdf](/man/wkhtmltopdf)(1), [groff](/man/groff)(1)
