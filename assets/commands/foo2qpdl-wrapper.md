# TLDR

**Print PostScript file**

```foo2qpdl-wrapper [file.ps]```

**Set paper size**

```foo2qpdl-wrapper -p [a4] [file.ps]```

**Color printing**

```foo2qpdl-wrapper -c [file.ps]```

**Print multiple copies**

```foo2qpdl-wrapper -n [3] [file.ps]```

# SYNOPSIS

**foo2qpdl-wrapper** [_options_] [_files_...]

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

**foo2qpdl-wrapper** converts PostScript/PDF documents to QPDL format for Samsung and Xerox laser printers. It chains Ghostscript rasterization with foo2qpdl encoding.

The wrapper provides a simplified printing interface, handling the conversion pipeline automatically. It translates common print options to the underlying tools.

foo2qpdl-wrapper enables command-line printing to QPDL protocol printers.

# CAVEATS

Requires Ghostscript. Only for QPDL-compatible printers. Color quality varies by model.

# HISTORY

foo2qpdl-wrapper is part of the **foo2zjs** driver collection, simplifying document printing for Samsung printers using the QPDL protocol.

# SEE ALSO

[foo2qpdl](/man/foo2qpdl)(1), [gs](/man/gs)(1), [lpr](/man/lpr)(1)
