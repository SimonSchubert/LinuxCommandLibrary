# TLDR

**Print PostScript file**

```foo2oak-wrapper [file.ps]```

**Set paper size**

```foo2oak-wrapper -p [a4] [file.ps]```

**Print in color**

```foo2oak-wrapper -c [file.ps]```

**Set resolution**

```foo2oak-wrapper -r [600] [file.ps]```

# SYNOPSIS

**foo2oak-wrapper** [_options_] [_files_...]

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

**foo2oak-wrapper** converts PostScript/PDF to OAKT format for printing on HP and Kyocera printers using Oak Technology controllers. It combines Ghostscript and foo2oak.

The wrapper handles the complete conversion process from document to printer data. It provides a simple interface for common printing tasks.

foo2oak-wrapper enables command-line printing to OAKT protocol printers.

# CAVEATS

Requires Ghostscript. Only for OAKT-compatible printers. Some features printer-specific.

# HISTORY

foo2oak-wrapper is part of the **foo2zjs** driver collection, simplifying printing to printers using Oak Technology's OAKT protocol.

# SEE ALSO

[foo2oak](/man/foo2oak)(1), [gs](/man/gs)(1), [lpr](/man/lpr)(1)
