# TLDR

**Convert EPS to PDF**

```epstopdf [image.eps]```

**Specify output file**

```epstopdf --outfile=[output.pdf] [image.eps]```

**Convert with Ghostscript options**

```epstopdf --gsopt=[-dPDFSETTINGS=/prepress] [image.eps]```

**Restricted mode** (safer)

```epstopdf --restricted [image.eps]```

**Embed fonts**

```epstopdf --embed [image.eps]```

# SYNOPSIS

**epstopdf** [_options_] _file.eps_

# DESCRIPTION

**epstopdf** converts Encapsulated PostScript (EPS) files to PDF format. It uses Ghostscript for the conversion and is commonly used in TeX/LaTeX workflows.

The tool handles bounding box calculations, font embedding, and produces PDF output suitable for inclusion in documents.

# PARAMETERS

**--outfile=** _file_
> Output PDF file name.

**--restricted**
> Restricted mode (no shell escapes).

**--gsopt=** _options_
> Pass options to Ghostscript.

**--gscmd=** _command_
> Ghostscript command to use.

**--hires**
> Use HiResBoundingBox.

**--exact**
> Use ExactBoundingBox.

**--embed**
> Embed fonts.

**--debug**
> Enable debug output.

**--help**
> Display help.

# CAVEATS

Requires Ghostscript installation. Bounding box must be valid in source EPS. Some PostScript features may not convert correctly. Output quality depends on source.

# HISTORY

**epstopdf** is part of the **TeX Live** distribution, essential for LaTeX users who need to include EPS graphics in PDF documents. It has been maintained by various TeX developers over the years, with **Karl Berry** and others contributing to its development.

# SEE ALSO

[gs](/man/gs)(1), [ps2pdf](/man/ps2pdf)(1), [pdflatex](/man/pdflatex)(1), [convert](/man/convert)(1)
