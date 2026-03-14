# TAGLINE

muPDF command-line tool

# TLDR

**Convert PDF to images**

```mutool draw -o [page%d.png] [input.pdf]```

**Extract text from PDF**

```mutool draw -F txt [input.pdf]```

**Show PDF info**

```mutool info [input.pdf]```

**Merge PDFs**

```mutool merge -o [output.pdf] [file1.pdf] [file2.pdf]```

**Extract pages**

```mutool merge -o [output.pdf] [input.pdf] [1-5]```

**Clean PDF**

```mutool clean [input.pdf] [output.pdf]```

# SYNOPSIS

**mutool** _command_ [_options_] _files_

# PARAMETERS

_COMMAND_
> Operation to perform.

**draw**
> Render document to image/text.

**info**
> Show document information.

**merge**
> Merge/extract pages.

**clean**
> Rewrite PDF file.

**convert**
> Transform files between formats.

**extract**
> Retrieve images and font files from a PDF.

**pages**
> Output page size and orientation information.

**poster**
> Divide pages into tiles for large-format printing.

**show**
> Print specified objects and streams to stdout.

**run**
> Execute a JavaScript program with MuPDF access.

**create**
> Generate a new PDF from graphics command input.

**-o** _FILE_
> Output file (used by draw, merge, and other subcommands).

**-r** _RESOLUTION_
> Rendering resolution in DPI (default: 72, for draw).

**-F** _FORMAT_
> Enforce specific output format (for draw).

**-w** _WIDTH_
> Page rendering width in pixels (for draw).

**-h** _HEIGHT_
> Page rendering height in pixels (for draw).

**-p** _PASSWORD_
> Password for encrypted files.

# DESCRIPTION

**mutool** is the MuPDF command-line tool for manipulating PDF and other document formats. It can render pages to images, extract text and images, merge and split PDFs, and run JavaScript programs with MuPDF bindings. Lightweight and fast.

# CAVEATS

Part of MuPDF. Some features require specific builds. Limited editing capabilities.

# HISTORY

mutool is part of **MuPDF**, a lightweight PDF renderer created by Artifex Software.

# SEE ALSO

[pdftk](/man/pdftk)(1), [gs](/man/gs)(1), [qpdf](/man/qpdf)(1)

