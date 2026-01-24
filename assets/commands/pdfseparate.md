# TLDR

**Extract all pages**

```pdfseparate [document.pdf] [output_%d.pdf]```

**Extract specific page range**

```pdfseparate -f [1] -l [10] [document.pdf] [output_%d.pdf]```

**Extract single page**

```pdfseparate -f [5] -l [5] [document.pdf] [page5.pdf]```

# SYNOPSIS

**pdfseparate** [_-f first_] [_-l last_] [_options_] _input.pdf_ _output_pattern_

# PARAMETERS

**-f** _PAGE_
> First page to extract.

**-l** _PAGE_
> Last page to extract.

**-v**
> Print version.

**-h**
> Print help.

# OUTPUT PATTERN

The output pattern uses %d for page numbers:
- `page_%d.pdf` produces page_1.pdf, page_2.pdf, etc.
- `output-%03d.pdf` produces output-001.pdf, output-002.pdf, etc.

# DESCRIPTION

**pdfseparate** splits a PDF into individual pages. Each page becomes a separate PDF file.

The output pattern must contain %d (or variants like %03d) which is replaced with the page number. This enables organized naming of output files.

Page range options extract subsets of the document. Combined with specific page numbers, single pages can be extracted.

The resulting files are standalone PDFs containing one page each. They can be recombined using pdfunite or used individually.

All page content is preserved including annotations, links, and embedded resources.

# CAVEATS

Cannot select non-contiguous pages. Each page is a separate file (no multi-page extraction to single file). Encrypted PDFs need password.

# HISTORY

**pdfseparate** is part of **poppler-utils**, the open-source PDF utilities derived from **Xpdf**. It provides simple page extraction without complex dependencies.

# SEE ALSO

[pdfunite](/man/pdfunite)(1), [pdftk](/man/pdftk)(1), [qpdf](/man/qpdf)(1), [pdfinfo](/man/pdfinfo)(1)
