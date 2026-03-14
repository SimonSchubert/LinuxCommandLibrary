# TAGLINE

Convert Ghostscript pbmraw or bitcmyk format into a QPDL printer stream

# TLDR

**Convert PBM to** QPDL format

```foo2qpdl [options] < [input.pbm] > [output.prn]```

**Set resolution**

```foo2qpdl -r [600] < [input.pbm] > [output.prn]```

**Set paper size to A4**

```foo2qpdl -p 9 < [input.pbm] > [output.prn]```

**Color mode**

```foo2qpdl -c < [input.ppm] > [output.prn]```

**Set number of copies**

```foo2qpdl -n [3] < [input.pbm] > [output.prn]```

**Enable duplex printing (long edge)**

```foo2qpdl -d 2 < [input.pbm] > [output.prn]```

**Specify printer model**

```foo2qpdl -z [2] < [input.pbm] > [output.prn]```

# SYNOPSIS

**foo2qpdl** [_options_] < _input_ > _output_

# PARAMETERS

**-r** _xres_**x**_yres_
> Set resolution in pixels per inch [1200x600].

**-g** _xpix_**x**_ypix_
> Set page dimensions in pixels [10200x6600].

**-p** _paper_
> Paper code: 0=letter, 1=legal, 2=A5, 3=B5, 6=folio, 7=quarto, 8=10x14, 9=A4, 11=executive, and various envelope codes.

**-c**
> Force color mode.

**-m** _media_
> Media type code: 0=plain, 1=thick, 2=thin, 3=bond, 4=color, 5=card, 6=labels, 7=envelope, 8=preprinted, 9=cotton, 19=recycled, 20=archive.

**-n** _copies_
> Number of copies [1].

**-d** _duplex_
> Duplex mode: 1=off, 2=long edge, 3=short edge.

**-s** _source_
> Source (InputSlot) code: 1=auto, 2=manual, 3=multi, 4=tray1.

**-t**
> Draft mode. Every other pixel is white.

**-z** _model_
> Printer model: 0=CLP-300/CLX-2160/CLX-3160, 1=CLP-600, 2=CLP-310/CLP-315/CLP-610/CLX-3175, 3=CLP-620.

**-J** _filename_
> Filename string to send to the printer.

# DESCRIPTION

**foo2qpdl** converts Ghostscript pbmraw, bitcmyk, or pksmraw output formats to monochrome or color QPDL streams. It supports Samsung CLP-300, CLX-2160, CLP-600, CLX-3160, CLP-610, CLP-620, CLP-360, CLP-365, and Xerox Phaser 6110 printers.

The tool handles the printer-specific encoding required by QPDL printers, managing color modes, compression, and page setup. It is typically invoked through the foo2qpdl-wrapper script which handles Ghostscript conversion automatically.

# CAVEATS

Only for QPDL-compatible printers. Model support varies. Some features may not be available on all printers.

# HISTORY

foo2qpdl is part of **foo2zjs**, providing support for Samsung printers using the QPDL protocol through reverse-engineered drivers.

# SEE ALSO

[foo2qpdl-wrapper](/man/foo2qpdl-wrapper)(1), [foo2zjs](/man/foo2zjs)(1)
