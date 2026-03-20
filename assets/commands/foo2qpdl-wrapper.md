# TAGLINE

PostScript/PDF to QPDL wrapper script

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
> Paper size (letter, legal, a4, a5, a6, b5, etc.).

**-r** _XRESxYRES_
> Resolution in pixels/inch (default 1200x600).

**-c**
> Print in color (default is monochrome).

**-n** _COPIES_
> Number of copies (default 1).

**-m** _MEDIA_
> Media type code (0=plain, 1=thick, 2=thin, 3=bond, 4=color, 5=card, 6=labels, 7=envelope).

**-s** _SOURCE_
> Input slot (1=auto, 2=manual, 3=multi, 4=tray1; default 255).

**-d** _DUPLEX_
> Duplex mode (1=off, 2=long edge, 3=short edge; default 1).

**-t**
> Draft mode. Every other pixel is white.

**-z** _MODEL_
> Printer model (0=CLP-300, 1=CLP-600, 2=CLP-310, 3=CLP-620).

**-D** _LEVEL_
> Set debug level (default 0).

**-g** _GSOPTS_
> Additional options to pass to Ghostscript.

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
