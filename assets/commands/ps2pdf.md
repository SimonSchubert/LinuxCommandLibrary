# TLDR

**Convert PS to PDF**

```ps2pdf [input.ps] [output.pdf]```

**Convert with quality settings**

```ps2pdf -dPDFSETTINGS=/prepress [input.ps] [output.pdf]```

**Convert for screen viewing**

```ps2pdf -dPDFSETTINGS=/screen [input.ps] [output.pdf]```

**Convert EPS to PDF**

```ps2pdf [input.eps] [output.pdf]```

# SYNOPSIS

**ps2pdf** [_options_] _input.ps_ [_output.pdf_]

# DESCRIPTION

**ps2pdf** converts PostScript files to PDF format using Ghostscript. It's a convenient wrapper around gs (Ghostscript) with PDF output options.

The tool is commonly used in document processing pipelines and print workflows.

# PARAMETERS

**-dPDFSETTINGS=** _setting_
> Quality preset:
> - /screen: Low resolution
> - /ebook: Medium resolution
> - /printer: High resolution
> - /prepress: Maximum resolution

**-dCompatibilityLevel=** _level_
> PDF version (1.3, 1.4, 1.5, etc.).

**-dEmbedAllFonts=** _bool_
> Embed all fonts.

**-dSubsetFonts=** _bool_
> Subset embedded fonts.

**-sPAPERSIZE=** _size_
> Paper size (a4, letter, etc.).

# CAVEATS

Output quality depends on input. Font embedding may increase size. Some PS features may not convert. Ghostscript must be installed.

# HISTORY

**ps2pdf** is part of **Ghostscript**, originally created by **L. Peter Deutsch** in **1988**. Ghostscript provides PostScript and PDF interpretation, making ps2pdf a standard conversion tool.

# SEE ALSO

[gs](/man/gs)(1), [pdf2ps](/man/pdf2ps)(1), [epstopdf](/man/epstopdf)(1), [pdflatex](/man/pdflatex)(1)
