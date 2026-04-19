# TAGLINE

PostScript/PDF to ZjStream wrapper script

# TLDR

**Print PostScript file**

```foo2zjs-wrapper [file.ps]```

**Set paper size**

```foo2zjs-wrapper -p [a4] [file.ps]```

**Color printing**

```foo2zjs-wrapper -c [file.ps]```

**Set resolution**

```foo2zjs-wrapper -r [1200x600] [file.ps]```

**Duplex (long edge)**

```foo2zjs-wrapper -d 2 [file.ps]```

**Specify printer model**

```foo2zjs-wrapper -z [model] [file.ps]```

# SYNOPSIS

**foo2zjs-wrapper** [_options_] [_files_...]

# PARAMETERS

_FILES_
> PostScript or PDF files to print.

**-p** _CODE_
> Paper size code (e.g., letter, a4, legal).

**-r** _XxY_
> Device resolution in DPI (default 1200x600).

**-c**
> Print in color (otherwise monochrome).

**-n** _COPIES_
> Number of copies.

**-m** _CODE_
> Media type code.

**-d** _MODE_
> Duplex: 1=off, 2=long edge, 3=short edge.

**-s** _CODE_
> Input slot code.

**-t**
> Draft mode (every other pixel white).

**-T** _DENSITY_
> Print density (1-5).

**-z** _MODEL_
> Printer model.

**-g** _OPTIONS_
> Additional Ghostscript options.

**-D** _LEVEL_
> Set debug level.

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
