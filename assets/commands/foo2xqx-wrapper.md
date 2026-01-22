# TLDR

**Print PostScript file**

```foo2xqx-wrapper [file.ps]```

**Set paper size**

```foo2xqx-wrapper -p [a4] [file.ps]```

**Set resolution**

```foo2xqx-wrapper -r [600] [file.ps]```

**Print multiple copies**

```foo2xqx-wrapper -n [3] [file.ps]```

# SYNOPSIS

**foo2xqx-wrapper** [_options_] [_files_...]

# PARAMETERS

_FILES_
> PostScript or PDF files to print.

**-p** _PAPER_
> Paper size (letter, a4, legal).

**-r** _DPI_
> Resolution.

**-n** _COPIES_
> Number of copies.

**-m** _MEDIA_
> Media type.

**--help**
> Display help information.

# DESCRIPTION

**foo2xqx-wrapper** converts PostScript/PDF documents to XQX format for HP LaserJet printers. It chains Ghostscript rasterization with foo2xqx encoding.

The wrapper provides simplified printing by handling the conversion pipeline automatically. It translates standard print options to the underlying tools.

foo2xqx-wrapper enables command-line printing to XQX protocol HP printers.

# CAVEATS

Requires Ghostscript. Monochrome only. Limited to XQX-compatible HP models.

# HISTORY

foo2xqx-wrapper is part of the **foo2zjs** driver collection, providing document printing for HP printers using the XQX protocol.

# SEE ALSO

[foo2xqx](/man/foo2xqx)(1), [gs](/man/gs)(1), [lpr](/man/lpr)(1)
