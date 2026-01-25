# TLDR

**Extract text from PDF**

```pdftotext [document.pdf] [output.txt]```

**Get PDF information**

```pdfinfo [document.pdf]```

**Convert PDF to images**

```pdftoppm [document.pdf] [output] -png```

**Extract images from PDF**

```pdfimages [document.pdf] [prefix]```

**Merge PDF files**

```pdfunite [file1.pdf] [file2.pdf] [output.pdf]```

# SYNOPSIS

Collection of PDF utilities from Poppler library

# UTILITIES

**pdftotext**
> Extract text content.

**pdfinfo**
> Display PDF metadata.

**pdftoppm**
> Convert to PPM/PNG/JPEG images.

**pdfimages**
> Extract embedded images.

**pdfunite**
> Merge multiple PDFs.

**pdfseparate**
> Split PDF into pages.

**pdffonts**
> List fonts used.

**pdfdetach**
> Extract attachments.

# EXAMPLES

```bash
# Extract text
pdftotext document.pdf output.txt

# Convert to PNG images
pdftoppm -png document.pdf page

# Get PDF info
pdfinfo document.pdf

# Extract images
pdfimages -j document.pdf images/

# Merge PDFs
pdfunite doc1.pdf doc2.pdf combined.pdf

# Split pages
pdfseparate document.pdf page-%d.pdf

# List fonts
pdffonts document.pdf
```

# DESCRIPTION

**poppler-utils** is a collection of command-line utilities for working with PDF files, based on the Poppler PDF rendering library. It provides tools for extraction, conversion, and manipulation.

# CAVEATS

Text extraction quality varies by PDF structure. Some PDFs are image-only. Install poppler-utils package.

# HISTORY

Poppler was forked from **Xpdf** by **Derek Noonburg** and is maintained by the freedesktop.org project.

# SEE ALSO

[pdftk](/man/pdftk)(1), [gs](/man/gs)(1), [qpdf](/man/qpdf)(1), [pdftohtml](/man/pdftohtml)(1)
