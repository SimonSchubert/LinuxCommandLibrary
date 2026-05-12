# TAGLINE

driver for Minolta PagePro printers

# TLDR

**Print file**

```min12xxw [file.prn]```

**Set resolution**

```min12xxw -r [600] [file.prn]```

**Set paper size**

```min12xxw -p [a4] [file.prn]```

**Verbose output**

```min12xxw -v [file.prn]```

# SYNOPSIS

**min12xxw** [_options_] [_file_]

# PARAMETERS

_FILE_
> PostScript or pre-converted input file. If omitted, reads from stdin.

**-r** _DPI_
> Resolution: 300, 600, or 1200 dpi (default 600).

**-p** _SIZE_
> Paper size: a4, letter, legal, executive, com10, monarch, dl, c5.

**-m**
> Use maximum-density (darker) printing mode.

**-e**
> Use economy (toner-saving) mode.

**-t**
> Thick paper mode.

**-c** _N_
> Number of copies.

**-v**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**min12xxw** is a CUPS filter and standalone converter for the Minolta PagePro 12xxW host-based laser printer family (PagePro 1200W, 1250W, 1300W, 1350W, 1400W, etc.). These printers use a proprietary host-based protocol rather than PCL or PostScript; min12xxw produces the binary stream the printer expects from input data.

It is typically invoked automatically by CUPS via the bundled PPD files, but can also be used standalone to convert a print job into raw printer data.

# CAVEATS

Only supports the PagePro 12xxW/13xxW/14xxW series. The printer must be reachable as a raw device for the produced stream to print correctly. Higher resolutions require more memory in the printer.

# HISTORY

**min12xxw** was originally written by **Manuel Tobias Schiller** and packaged in Debian and other distributions as the Linux driver for Minolta's host-based PagePro laser printers, which lack a built-in PostScript or PCL interpreter.

# SEE ALSO

[lp](/man/lp)(1), [lpr](/man/lpr)(1), [cups](/man/cups)(1), [cupsd](/man/cupsd)(8)

