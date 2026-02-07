# TAGLINE

pbmraw to HBPL2 converter for Dell and Xerox printers

# TLDR

**Convert pbmraw to HBPL2** stream for printing

```gs -q -dBATCH -dNOPAUSE -sDEVICE=pbmraw -sOutputFile=- [file.ps] | foo2hbpl2 > [output.hbpl]```

**Use the wrapper script** to convert PostScript directly

```foo2hbpl2-wrapper [file.ps] > [output.prn]```

**Convert with specific resolution**

```foo2hbpl2 -r[1200x600] < [input.pbm] > [output.hbpl]```

**Print color document** using bitcmyk input

```gs -sDEVICE=bitcmyk -sOutputFile=- [file.ps] | foo2hbpl2 -c > [output.hbpl]```

**Set page dimensions** in pixels

```foo2hbpl2 -p[10200x6600] < [input.pbm] > [output.hbpl]```

# SYNOPSIS

**foo2hbpl2** [_OPTIONS_] < _PBMFILE_ > _HBPL2FILE_

**foo2hbpl2-wrapper** [_OPTIONS_] [_PS-FILE_]

# PARAMETERS

**-c**
> Force color mode output.

**-r** _XRESxYRES_
> Set device resolution in pixels per inch (default: 1200x600).

**-p** _WIDTHxHEIGHT_
> Set page dimensions in pixels.

**-n** _COPIES_
> Number of copies to print (default: 1).

**-d** _DUPLEX_
> Duplex code to send to printer.

**-u** _XOFFxYOFF_
> Set offset of printable region from upper left corner in pixels.

**-A**
> AllIsBlack: convert C=1,M=1,Y=1 to K=1 (bitcmyk input only).

**-B**
> BlackClears: K=1 forces C,M,Y to 0 (bitcmyk input only).

**-D** _LEVEL_
> Set debug level.

# DESCRIPTION

**foo2hbpl2** converts Ghostscript pbmraw, bitcmyk, or pksmraw output to HBPL2 (HP Bi-directional Printer Language 2) streams for certain laser printers. Supported printers include Dell 1355, Dell C1765, Epson AcuLaser M1400, Fuji Xerox DocuPrint series, Xerox Phaser 3010/3040, and Xerox WorkCentre 3045/6015 MFP.

The tool is typically used in a pipeline with Ghostscript to convert PostScript or PDF files to printer-ready format. The **foo2hbpl2-wrapper** script provides a convenient interface that handles the Ghostscript conversion automatically.

foo2hbpl2 is part of the **foo2zjs** project, which provides open-source drivers for various laser printers that use proprietary page description languages.

# CAVEATS

Requires Ghostscript for PostScript/PDF processing. Only works with specific printer models that use HBPL2 protocol. The driver bypasses standard CUPS/PPD mechanisms, so printer-specific settings may need manual configuration.

# HISTORY

foo2hbpl2 is part of the **foo2zjs** project initiated by Rick Richardson. The project provides open-source drivers for printers that lack native Linux support, reverse-engineering proprietary protocols like ZjStream, HBPL, and others. The foo2zjs family has enabled Linux printing on numerous budget laser printers since the early 2000s.

# SEE ALSO

[gs](/man/gs)(1), [foo2zjs](/man/foo2zjs)(1), [cups](/man/cups)(8), [lpr](/man/lpr)(1)
