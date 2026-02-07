# TAGLINE

Interpreter for PostScript and PDF file manipulation

# TLDR

**Convert PDF to images**

```gs -dNOPAUSE -dBATCH -sDEVICE=png16m -r300 -sOutputFile=[page-%d.png] [input.pdf]```

**Merge PDFs**

```gs -dNOPAUSE -dBATCH -sDEVICE=pdfwrite -sOutputFile=[merged.pdf] [file1.pdf] [file2.pdf]```

**Compress PDF**

```gs -dNOPAUSE -dBATCH -sDEVICE=pdfwrite -dPDFSETTINGS=/ebook -sOutputFile=[small.pdf] [large.pdf]```

**Convert PS to PDF**

```gs -dNOPAUSE -dBATCH -sDEVICE=pdfwrite -sOutputFile=[output.pdf] [input.ps]```

**Extract pages from PDF**

```gs -dNOPAUSE -dBATCH -sDEVICE=pdfwrite -dFirstPage=[2] -dLastPage=[5] -sOutputFile=[extract.pdf] [input.pdf]```

# SYNOPSIS

**gs** [_options_] [_files_]

# PARAMETERS

**-dNOPAUSE**
> Don't pause between pages.

**-dBATCH**
> Exit after processing.

**-sDEVICE** _device_
> Output device (pdfwrite, png16m, jpeg, etc.).

**-sOutputFile** _file_
> Output filename (use %d for page numbers).

**-r** _resolution_
> Resolution in DPI.

**-dPDFSETTINGS** _setting_
> PDF quality: /screen, /ebook, /printer, /prepress.

**-dFirstPage** _n_
> Start page.

**-dLastPage** _n_
> End page.

**-dCompatibilityLevel** _ver_
> PDF version (1.4, 1.5, etc.).

# DESCRIPTION

**Ghostscript** (gs) is an interpreter for PostScript and PDF. It renders documents to various output formats, converts between formats, and processes print jobs. It is the engine behind many PDF tools and print systems on Unix/Linux.

The tool supports a wide range of output devices for rasterization, format conversion, and print processing. PDF manipulation includes merging, splitting, compressing, and converting between quality levels.

# CONFIGURATION

**/etc/ghostscript/**
> System-wide configuration directory for font mappings, resource files, and initialization scripts.

**~/.ghostscript**
> User-specific Ghostscript resources and configuration overrides.

# CAVEATS

Complex command-line syntax. Some operations require specific device drivers. Font handling may need configuration. Security settings restrict file operations.

# HISTORY

Ghostscript was started by **L. Peter Deutsch** in **1988** as a free PostScript interpreter. It's now developed by Artifex Software and remains fundamental to Unix/Linux printing and PDF processing.

# SEE ALSO

[pdf2ps](/man/pdf2ps)(1), [ps2pdf](/man/ps2pdf)(1), [pdftk](/man/pdftk)(1), [convert](/man/convert)(1)
