# TAGLINE

PostScript/PDF to HP ZjStream wrapper script

# TLDR

**Print PostScript file**

```foo2hp2600-wrapper [file.ps]```

**Set paper size**

```foo2hp2600-wrapper -p [a4] [file.ps]```

**Color printing**

```foo2hp2600-wrapper -c [file.ps]```

**Set resolution**

```foo2hp2600-wrapper -r [600] [file.ps]```

# SYNOPSIS

**foo2hp2600-wrapper** [_options_] [_files_...]

# PARAMETERS

_FILES_
> PostScript or PDF files to print.

**-p** _PAPER_
> Paper size (letter, a4, legal).

**-r** _DPI_
> Resolution (300, 600, 1200).

**-c**
> Color printing.

**-n** _COPIES_
> Number of copies.

**-m** _MEDIA_
> Media type.

**--help**
> Display help information.

# DESCRIPTION

**foo2hp2600-wrapper** converts PostScript/PDF files to HP ZjStream format for HP Color LaserJet 2600n and similar printers. It wraps Ghostscript and foo2hp for simplified printing.

The script handles the complete conversion pipeline from input document to printer-ready data. It supports color and monochrome modes with various paper sizes and quality settings.

foo2hp2600-wrapper provides direct command-line printing for supported HP printers.

# CAVEATS

Requires Ghostscript. Only for supported HP printer models. Color accuracy depends on printer calibration.

# HISTORY

foo2hp2600-wrapper is part of the **foo2zjs** project, providing a user-friendly interface to print documents on HP Color LaserJet printers using reverse-engineered protocols.

# SEE ALSO

[foo2hp](/man/foo2hp)(1), [gs](/man/gs)(1), [lpr](/man/lpr)(1)
