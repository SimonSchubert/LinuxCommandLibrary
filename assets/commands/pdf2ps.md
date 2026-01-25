# TLDR

**Convert PDF to PostScript**

```pdf2ps [input.pdf] [output.ps]```

**Convert specific pages**

```pdf2ps -f [1] -l [5] [input.pdf] [output.ps]```

**Convert for Level 2 printer**

```pdf2ps -level2 [input.pdf] [output.ps]```

**Specify paper size**

```pdf2ps -paper [A4] [input.pdf] [output.ps]```

# SYNOPSIS

**pdf2ps** [_options_] _input.pdf_ [_output.ps_]

# PARAMETERS

**-f** _num_
> First page.

**-l** _num_
> Last page.

**-level1**, **-level2**, **-level3**
> PostScript level.

**-paper** _size_
> Paper size.

**-r** _dpi_
> Resolution.

# DESCRIPTION

**pdf2ps** converts PDF files to PostScript. PostScript is needed for certain printers and print workflows. The output quality and compatibility depend on the PostScript level selected.

Part of the Ghostscript/Poppler utilities.

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

[pdftops](/man/pdftops)(1), [ps2pdf](/man/ps2pdf)(1), [gs](/man/gs)(1), [lpr](/man/lpr)(1)
