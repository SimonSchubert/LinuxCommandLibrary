# TAGLINE

converts PDF files to PostScript

# TLDR

**Convert PDF to PostScript**

```pdf2ps [input.pdf] [output.ps]```

**Convert specific pages**

```pdf2ps -f [1] -l [5] [input.pdf] [output.ps]```

**Convert for a Level 2 PostScript printer**

```pdf2ps -level2 [input.pdf] [output.ps]```

**Specify paper size**

```pdf2ps -paper [A4] [input.pdf] [output.ps]```

**Pipe output directly to a printer**

```pdf2ps [input.pdf] - | lpr```

# SYNOPSIS

**pdf2ps** [_options_] _input.pdf_ [_output.ps_]

# PARAMETERS

**-f** _num_
> First page to convert (default: 1).

**-l** _num_
> Last page to convert (default: last page of document).

**-level1**, **-level2**, **-level3**
> Set PostScript language level for output. Level 1 is most compatible, Level 2 adds color and compression, Level 3 supports the latest features.

**-paper** _size_
> Set paper size (e.g., letter, A4, legal).

**-r** _dpi_
> Set resolution in dots per inch for rasterized content.

**-q**
> Quiet mode. Suppress routine Ghostscript messages.

# DESCRIPTION

**pdf2ps** converts PDF files to PostScript. PostScript is needed for certain printers and print workflows. The output quality and compatibility depend on the PostScript level selected.

# POSTSCRIPT LEVELS

```
Level 1 - Most compatible
Level 2 - Color, compression
Level 3 - Latest features
```

# EXAMPLE

```bash
# Basic conversion
pdf2ps document.pdf document.ps

# Print via PostScript
pdf2ps document.pdf - | lpr
```

# CAVEATS

Output files can be large. Level affects compatibility. Consider pdftops from Poppler for better output.

# HISTORY

pdf2ps is part of **Ghostscript**, the PostScript/PDF interpreter originally developed by **Artifex Software**.

# SEE ALSO

[pdftops](/man/pdftops)(1), [ps2pdf](/man/ps2pdf)(1), [gs](/man/gs)(1), [lpr](/man/lpr)(1), [pdftotext](/man/pdftotext)(1), [enscript](/man/enscript)(1)
