# TAGLINE

Convert Ghostscript output to HBPL2 format for Dell and Xerox printers

# TLDR

**Convert PBM to HBPL2**

```foo2hbpl2 [options] < [input.pbm] > [output.hbpl]```

**Set resolution**

```foo2hbpl2 -r [1200x600] < [input.pbm] > [output.hbpl]```

**Set paper size to letter**

```foo2hbpl2 -p 4 < [input.pbm] > [output.hbpl]```

**Print multiple copies**

```foo2hbpl2 -n [3] < [input.pbm] > [output.hbpl]```

**Enable duplex long-edge binding**

```foo2hbpl2 -d 2 < [input.pbm] > [output.hbpl]```

**Force color mode**

```foo2hbpl2 -c < [input.pbm] > [output.hbpl]```

# SYNOPSIS

**foo2hbpl2** [_options_] < _input_ > _output_

# PARAMETERS

**-c**
> Force color mode if autodetect does not work.

**-d** _duplex_
> Duplex code: 1=off (default), 2=long edge, 3=short edge.

**-g** _xpix_**x**_ypix_
> Page dimensions in pixels [10200x6600].

**-m** _media_
> Media code: 1=plain (default), 2=bond, 3=lwcard, 4=lwgcard, 5=labels, 6=envelope, 7=recycled.

**-n** _copies_
> Number of copies [1].

**-p** _paper_
> Paper code: 1=A4, 2=B5jis, 3=A5, 4=letter, 5=executive, 6=folio, 7=legal, 9=env#10, 10=envMonarch, 11=envC5, 12=envDL.

**-r** _xres_**x**_yres_
> Device resolution in pixels/inch [1200x600].

**-s** _source_
> Input slot code: 1=upper, 2=lower, 4=manual, 7=auto (default).

**-t**
> Draft mode. Every other pixel is white.

**-J** _filename_
> Filename string to send to the printer.

**-U** _username_
> Username string to send to the printer.

**-u** _xoff_**x**_yoff_
> Upper-left offset of printable region in pixels [0x0].

**-l** _xoff_**x**_yoff_
> Lower-right offset of printable region in pixels [0x0].

**-L** _mask_
> Logical clipping: 0=disabled, 1=Y only, 2=X only, 3=both (default).

**-A**
> AllIsBlack: convert C=1,M=1,Y=1 to K=1 (bitcmyk input).

**-B**
> BlackClears: K=1 forces C,M,Y to 0 (bitcmyk input).

**-D** _level_
> Debug verbosity level [0].

# DESCRIPTION

**foo2hbpl2** converts Ghostscript pbmraw, bitcmyk, or pksmraw output formats to monochrome or color HBPL version 2 streams. It supports printers including the Dell 1355, Dell C1765, Epson AcuLaser M1400, Fuji Xerox DocuPrint CM205/CM215/M215/P205, Xerox Phaser 3010/3040, and Xerox WorkCentre 3045/6015.

It is part of the **foo2zjs** printer driver collection and works as a CUPS filter backend to enable printing on otherwise unsupported GDI printers.

# CAVEATS

Requires a compatible printer model. Input data must come from Ghostscript in the correct raster format. Quality depends on input resolution.

# HISTORY

foo2hbpl2 is part of **foo2zjs**, a collection of open source printer drivers created by Rick Richardson that reverse-engineered proprietary protocols to support GDI printers on Linux.

# SEE ALSO

[foo2hbpl2-wrapper](/man/foo2hbpl2-wrapper)(1), [foo2zjs](/man/foo2zjs)(1), [hbpldecode](/man/hbpldecode)(1)
