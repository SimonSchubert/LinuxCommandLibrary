# TLDR

**Print PostScript file**

```foo2slx-wrapper [file.ps]```

**Set paper size**

```foo2slx-wrapper -p [a4] [file.ps]```

**Color printing**

```foo2slx-wrapper -c [file.ps]```

**Set resolution**

```foo2slx-wrapper -r [600] [file.ps]```

# SYNOPSIS

**foo2slx-wrapper** [_options_] [_files_...]

# PARAMETERS

_FILES_
> PostScript or PDF files to print.

**-p** _PAPER_
> Paper size (letter, a4, legal).

**-r** _DPI_
> Resolution.

**-c**
> Color printing.

**-n** _COPIES_
> Number of copies.

**-m** _MEDIA_
> Media type.

**--help**
> Display help information.

# DESCRIPTION

**foo2slx-wrapper** converts PostScript/PDF documents to SLX format for Lexmark printers. It combines Ghostscript rasterization with foo2slx encoding.

The wrapper handles the conversion pipeline for easy printing. It provides a command-line interface for supported Lexmark printers.

foo2slx-wrapper simplifies printing to SLX protocol printers.

# CAVEATS

Requires Ghostscript. Only for SLX-compatible Lexmark models. Feature support varies.

# HISTORY

foo2slx-wrapper is part of the **foo2zjs** driver collection, providing easy printing for Lexmark printers using the SLX protocol.

# SEE ALSO

[foo2slx](/man/foo2slx)(1), [gs](/man/gs)(1), [lpr](/man/lpr)(1)
