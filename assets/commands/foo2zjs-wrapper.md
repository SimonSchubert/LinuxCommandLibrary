# TLDR

**Print PostScript file**

```foo2zjs-wrapper [file.ps]```

**Set paper size**

```foo2zjs-wrapper -p [a4] [file.ps]```

**Color printing**

```foo2zjs-wrapper -c [file.ps]```

**Set resolution**

```foo2zjs-wrapper -r [1200] [file.ps]```

# SYNOPSIS

**foo2zjs-wrapper** [_options_] [_files_...]

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

**foo2zjs-wrapper** converts PostScript/PDF to ZjStream format for HP and Minolta/QMS printers. It combines Ghostscript rasterization with foo2zjs encoding.

The wrapper handles the complete document-to-printer pipeline, providing a simple interface for printing. It translates common options to the underlying tools.

foo2zjs-wrapper is the primary way to print documents to foo2zjs-supported printers.

# CAVEATS

Requires Ghostscript. Limited to supported printer models. Color support varies by printer.

# HISTORY

foo2zjs-wrapper is part of the **foo2zjs** project, providing user-friendly document printing for ZjStream protocol printers on Linux.

# SEE ALSO

[foo2zjs](/man/foo2zjs)(1), [gs](/man/gs)(1), [lpr](/man/lpr)(1)
