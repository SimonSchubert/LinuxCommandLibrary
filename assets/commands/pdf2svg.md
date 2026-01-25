# TLDR

**Convert PDF page to SVG**

```pdf2svg [input.pdf] [output.svg]```

**Convert specific page**

```pdf2svg [input.pdf] [output.svg] [2]```

**Convert all pages**

```pdf2svg [input.pdf] [output_%d.svg] all```

# SYNOPSIS

**pdf2svg** _input.pdf_ _output.svg_ [_page_|all]

# PARAMETERS

**input.pdf**
> Input PDF file.

**output.svg**
> Output SVG file.

**page**
> Page number (1-indexed).

**all**
> Convert all pages.

# DESCRIPTION

**pdf2svg** converts PDF files to Scalable Vector Graphics (SVG) format. It preserves vector graphics, text, and formatting, making the output suitable for web use and editing.

Uses Poppler and Cairo libraries for high-quality conversion.

# EXAMPLES

```bash
# Convert first page
pdf2svg document.pdf page1.svg

# Convert page 3
pdf2svg document.pdf page3.svg 3

# Convert all pages (output_1.svg, output_2.svg, ...)
pdf2svg document.pdf page_%d.svg all
```

# CAVEATS

One page per SVG file. Complex PDFs may produce large SVGs. Fonts may be converted to paths.

# HISTORY

pdf2svg was created by **David Barton** using Poppler for PDF parsing and Cairo for SVG rendering.

# SEE ALSO

[inkscape](/man/inkscape)(1), [pdftohtml](/man/pdftohtml)(1), [rsvg-convert](/man/rsvg-convert)(1)
