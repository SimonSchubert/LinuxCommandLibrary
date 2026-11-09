# TAGLINE

PostScript to HP ZjStream wrapper script

# TLDR

**Print a PostScript file in monochrome**

```foo2hp2600-wrapper [file.ps] > [/dev/usb/lp0]```

**Print in color**

```foo2hp2600-wrapper -c [file.ps] > [/dev/usb/lp0]```

**Set paper to A4** (paper code 9)

```foo2hp2600-wrapper -p 9 [file.ps] > [/dev/usb/lp0]```

**Set resolution**

```foo2hp2600-wrapper -r [1200x600] [file.ps] > [/dev/usb/lp0]```

**Print multiple copies**

```foo2hp2600-wrapper -n [3] [file.ps] > [/dev/usb/lp0]```

**Print duplex** along the long edge

```foo2hp2600-wrapper -d 2 [file.ps] > [/dev/usb/lp0]```

**Target an HP Color LaserJet CP1215**

```foo2hp2600-wrapper -z 1 -c [file.ps] > [/dev/usb/lp0]```

# SYNOPSIS

**foo2hp2600-wrapper** [_options_] [_ps-file_]

# PARAMETERS

_PS-FILE_
> PostScript file to convert. Reads standard input if omitted.

**-c**
> Print in color (otherwise monochrome).

**-b** _BITS_
> Bits per plane: 1 or 2 (default: 1).

**-d** _DUPLEX_
> Duplex code: 1=off, 2=long edge, 3=short edge (default: 1).

**-m** _MEDIA_
> Media code: 1=standard, 2=transparency, 3=glossy, 257=envelope, 259=letterhead, 261=thickstock, 262=postcard, 263=labels.

**-p** _PAPER_
> Paper code: 1=letter, 5=legal, 7=executive, 9=A4, 11=A5, 13=B5, 20=env#10, 27=envDL, 28=envC5, 34=envB5, 37=envMonarch (default: 1).

**-n** _COPIES_
> Number of copies.

**-r** _XRES_x_YRES_
> Resolution: 600x600 (default), 1200x600 or 2400x600.

**-s** _SOURCE_
> Source code: 1=tray2, 2=tray3, 4=manual/tray1, 7=auto (default: 7). May vary with printer model.

**-t**
> Draft mode: every other pixel is white.

**-2**, **-3**, **-4**, **-6**, **-8**, **-9**, **-10**, **-12**, **-14**, **-15**, **-16**, **-18**
> Print N-up (requires psutils).

**-o** _ORIENT_
> For N-up: **-op** portrait, **-ol** landscape, **-os** seascape.

**-z** _MODEL_
> Model: 0=HP CLJ 1600/2600n (default), 1=HP CLJ CP1215.

**-g** _GSOPTS_
> Additional options to pass to Ghostscript.

**-D** _LEVEL_
> Set debug level.

**-V**
> Show version information.

**-h**
> Display help information.

# DESCRIPTION

**foo2hp2600-wrapper** is a Foomatic printer wrapper that converts a PostScript file or standard input to HP ZjStream format for the HP Color LaserJet 1600, 2600n and CP1215. It wraps Ghostscript and foo2hp and writes the printer data to standard output.

The script handles the complete conversion pipeline from input document to printer-ready data. It supports color and monochrome modes with various paper sizes and quality settings.

# CAVEATS

Requires Ghostscript. Only for supported HP printer models. Color accuracy depends on printer calibration. Options use numeric codes rather than names, and **-2** selects 2-up rather than duplex. The original project site, foo2zjs.rkkda.com, is no longer reachable.

# HISTORY

foo2hp2600-wrapper is part of the **foo2zjs** project, providing a user-friendly interface to print documents on HP Color LaserJet printers using reverse-engineered protocols.

# SEE ALSO

[foo2hp](/man/foo2hp)(1), [foo2zjs](/man/foo2zjs)(1), [gs](/man/gs)(1), [lpr](/man/lpr)(1)
