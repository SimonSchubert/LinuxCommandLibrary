# TLDR

**Print PostScript file**

```foo2hbpl2-wrapper [file.ps]```

**Set paper size**

```foo2hbpl2-wrapper -p [a4] [file.ps]```

**Print multiple copies**

```foo2hbpl2-wrapper -n [3] [file.ps]```

**Set resolution**

```foo2hbpl2-wrapper -r [600] [file.ps]```

# SYNOPSIS

**foo2hbpl2-wrapper** [_options_] [_files_...]

# PARAMETERS

_FILES_
> PostScript or PDF files to print.

**-p** _PAPER_
> Paper size (letter, a4, legal).

**-r** _DPI_
> Resolution (300, 600, 1200).

**-n** _COPIES_
> Number of copies.

**-m** _MEDIA_
> Media type.

**-d** _DUPLEX_
> Duplex printing mode.

**--help**
> Display help information.

# DESCRIPTION

**foo2hbpl2-wrapper** is a wrapper script that converts PostScript/PDF to HBPL2 format for printing. It chains Ghostscript rasterization with foo2hbpl2 encoding.

The wrapper simplifies printing by handling the conversion pipeline automatically. It accepts common print options and translates them to the underlying tools.

foo2hbpl2-wrapper provides a user-friendly interface to the foo2hbpl2 conversion process.

# CAVEATS

Requires Ghostscript installed. Color output depends on printer support. Some options printer-specific.

# HISTORY

foo2hbpl2-wrapper is part of the **foo2zjs** driver collection, providing easy command-line printing for HBPL2 protocol printers supported by the foo2hbpl2 converter.

# SEE ALSO

[foo2hbpl2](/man/foo2hbpl2)(1), [gs](/man/gs)(1), [lpr](/man/lpr)(1)
