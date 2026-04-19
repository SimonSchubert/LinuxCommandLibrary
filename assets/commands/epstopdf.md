# TAGLINE

Encapsulated PostScript to PDF converter

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

**Read EPS from stdin, write PDF to stdout**

```cat [image.eps] | epstopdf --filter > [out.pdf]```

**Use HiResBoundingBox**

```epstopdf --hires [image.eps]```

# SYNOPSIS

**epstopdf** [_options_] _file.eps_

# DESCRIPTION

**epstopdf** converts Encapsulated PostScript (EPS) files to PDF format. It uses Ghostscript for the conversion and is commonly used in TeX/LaTeX workflows.

The tool handles bounding box calculations, font embedding, and produces PDF output suitable for inclusion in documents.

# PARAMETERS

**-o**, **--outfile=** _file_
> Output PDF file name.

**--filter**
> Read EPS from stdin and write PDF to stdout.

**--restricted**
> Restricted mode (no shell escapes or unsafe options).

**--gsopt=** _option_
> Pass a single option to Ghostscript (repeatable).

**--gsopts=** _options_
> Pass multiple space-separated options to Ghostscript.

**--gscmd=** _command_
> Ghostscript command to use.

**--gs**, **--nogs**
> Run Ghostscript (default) or output intermediate PostScript instead.

**--hires**
> Scan and use the HiResBoundingBox.

**--exact**
> Scan and use the ExactBoundingBox.

**--embed**, **--noembed**
> Control font embedding.

**--compress**, **--nocompress**
> Toggle output compression.

**--gray**, **--nogray**
> Convert output to grayscale.

**--autorotate=** _MODE_
> Set page rotation behavior (None, All, or PageByPage).

**--pdfsettings=** _LEVEL_
> Ghostscript PDF quality preset (e.g., screen, ebook, printer, prepress).

**--res=** _DPI_
> Set raster image resolution.

**--safer**, **--nosafer**
> Toggle Ghostscript safety restrictions.

**--quiet**, **--noquiet**
> Suppress or show output messages.

**--debug**
> Enable debug output.

**--version**
> Display version information.

**--help**
> Display help.

# CAVEATS

Requires Ghostscript installation. Bounding box must be valid in source EPS. Some PostScript features may not convert correctly. Output quality depends on source.

# HISTORY

**epstopdf** is part of the **TeX Live** distribution, essential for LaTeX users who need to include EPS graphics in PDF documents. It has been maintained by various TeX developers over the years, with **Karl Berry** and others contributing to its development.

# SEE ALSO

[gs](/man/gs)(1), [ps2pdf](/man/ps2pdf)(1), [pdflatex](/man/pdflatex)(1), [convert](/man/convert)(1)
