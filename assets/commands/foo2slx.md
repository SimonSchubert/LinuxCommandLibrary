# TLDR

**Convert PBM to** SLX format

```foo2slx [options] < [input.pbm] > [output.prn]```

**Set resolution**

```foo2slx -r [600] < [input.pbm] > [output.prn]```

**Set paper size**

```foo2slx -p [letter] < [input.pbm] > [output.prn]```

**Color mode**

```foo2slx -c < [input.ppm] > [output.prn]```

# SYNOPSIS

**foo2slx** [_options_] < _input_ > _output_

# PARAMETERS

**-r** _DPI_
> Resolution.

**-p** _PAPER_
> Paper size (letter, a4, legal).

**-c**
> Color mode.

**-m** _MEDIA_
> Media type.

**-n** _COPIES_
> Number of copies.

**-d** _DUPLEX_
> Duplex mode.

**--help**
> Display help information.

# DESCRIPTION

**foo2slx** converts PBM/PPM images to SLX format for Lexmark C500 and similar printers. It encodes raster data in Lexmark's Software Imaging Solutions protocol.

The tool manages printer-specific encoding, compression, and page formatting. It functions as a CUPS filter backend for supported Lexmark printers.

foo2slx enables Linux printing on Lexmark color laser printers using SLX protocol.

# CAVEATS

Only for SLX-compatible Lexmark printers. Limited model support. Some features may not work.

# HISTORY

foo2slx is part of **foo2zjs**, providing Linux support for Lexmark printers using the SLX protocol through reverse-engineered drivers.

# SEE ALSO

[foo2slx-wrapper](/man/foo2slx-wrapper)(1), [foo2zjs](/man/foo2zjs)(1)
