# TAGLINE

PBM to ZjStream converter for HP and Minolta printers

# TLDR

**Convert PBM to** ZjStream format

```foo2zjs [options] < [input.pbm] > [output.prn]```

**Set resolution**

```foo2zjs -r [600] < [input.pbm] > [output.prn]```

**Set paper size (1=letter, 9=A4, 5=legal)**

```foo2zjs -p [9] < [input.pbm] > [output.prn]```

**Color mode**

```foo2zjs -c < [input.ppm] > [output.prn]```

**Print multiple copies**

```foo2zjs -n [3] < [input.pbm] > [output.prn]```

# SYNOPSIS

**foo2zjs** [_options_] < _input_ > _output_

# PARAMETERS

**-r** _DPI_
> Resolution (300, 600, 1200).

**-p** _CODE_
> Paper size code: 1=letter, 5=legal, 7=executive, 9=A4, 11=A5, 13=B5. Default is 1.

**-c**
> Color mode (input must be PPM).

**-m** _MEDIA_
> Media type code.

**-n** _COPIES_
> Number of copies.

**-d** _DUPLEX_
> Duplex mode: 1=off, 2=long edge, 3=short edge.

**-g** _XPIXxYPIX_
> Page dimensions in pixels (default 10200x6600).

**--help**
> Display help information.

# DESCRIPTION

**foo2zjs** converts PBM/PPM images to ZjStream format for HP LaserJet and Minolta/QMS magicolor printers. It's the core tool of the foo2zjs printer driver suite.

The tool encodes raster data in the proprietary ZjStream protocol, handling page setup, compression, and printer commands. It works as a CUPS filter for supported printers.

foo2zjs enables Linux printing on numerous "GDI printers" that lack standard driver support.

# CAVEATS

Only for ZjStream-compatible printers. Model support varies. Check compatibility before use.

# HISTORY

foo2zjs was created by **Rick Richardson** to provide Linux drivers for "Windows-only" GDI printers. The project reverse-engineered proprietary protocols, enabling Linux support for many consumer laser printers.

# SEE ALSO

[foo2zjs-wrapper](/man/foo2zjs-wrapper)(1), [foo2hp](/man/foo2hp)(1), [foo2lava](/man/foo2lava)(1)
