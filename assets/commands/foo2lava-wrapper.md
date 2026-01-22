# TLDR

**Print PostScript file**

```foo2lava-wrapper [file.ps]```

**Set paper size**

```foo2lava-wrapper -p [a4] [file.ps]```

**Color printing**

```foo2lava-wrapper -c [file.ps]```

**Print multiple copies**

```foo2lava-wrapper -n [3] [file.ps]```

# SYNOPSIS

**foo2lava-wrapper** [_options_] [_files_...]

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

**foo2lava-wrapper** converts PostScript/PDF documents to LAVAFLOW format for Konica Minolta magicolor printers. It chains Ghostscript rasterization with foo2lava encoding.

The wrapper provides a simplified interface for printing, handling format conversion automatically. It translates standard print options to the underlying tools.

foo2lava-wrapper enables direct command-line printing to supported Konica Minolta printers.

# CAVEATS

Requires Ghostscript. Limited to supported printer models. Color output quality varies.

# HISTORY

foo2lava-wrapper is part of the **foo2zjs** driver collection, providing easy document printing for Konica Minolta printers using the LAVAFLOW protocol.

# SEE ALSO

[foo2lava](/man/foo2lava)(1), [gs](/man/gs)(1), [lpr](/man/lpr)(1)
