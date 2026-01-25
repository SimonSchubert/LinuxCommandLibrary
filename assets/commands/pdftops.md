# TLDR

**Convert PDF to PostScript**

```pdftops [input.pdf] [output.ps]```

**Convert specific pages**

```pdftops -f [1] -l [10] [input.pdf] [output.ps]```

**Level 2 PostScript output**

```pdftops -level2 [input.pdf] [output.ps]```

**Optimize for printing**

```pdftops -optimizecolorspace [input.pdf] [output.ps]```

# SYNOPSIS

**pdftops** [_options_] _PDF-file_ [_PS-file_]

# PARAMETERS

**-f** _num_
> First page.

**-l** _num_
> Last page.

**-level1**, **-level2**, **-level3**
> PostScript level.

**-eps**
> Generate EPS.

**-optimizecolorspace**
> Optimize colors.

**-paper** _size_
> Paper size.

**-r** _dpi_
> Resolution for images.

# DESCRIPTION

**pdftops** converts PDF to PostScript format. Part of Poppler utilities, it produces higher quality output than pdf2ps from Ghostscript for most documents.

# EXAMPLES

```bash
# Basic conversion
pdftops document.pdf document.ps

# Create EPS from first page
pdftops -eps -f 1 -l 1 figure.pdf figure.eps

# Print to PostScript printer
pdftops document.pdf - | lpr -P ps_printer
```

# POSTSCRIPT LEVELS

```
Level 1 - Maximum compatibility
Level 2 - Color, compression
Level 3 - Smooth shading, masks
```

# CAVEATS

Output can be large. EPS mode only for single pages. Part of poppler-utils package.

# HISTORY

pdftops is part of **Poppler**, the PDF rendering library forked from **Xpdf** by **Derek Noonburg**.

# SEE ALSO

[pdf2ps](/man/pdf2ps)(1), [pdftotext](/man/pdftotext)(1), [ps2pdf](/man/ps2pdf)(1), [poppler-utils](/man/poppler-utils)(1)
