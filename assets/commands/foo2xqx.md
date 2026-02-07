# TAGLINE

PBM to XQX converter for HP LaserJet printers

# TLDR

**Convert PBM to** XQX format

```foo2xqx [options] < [input.pbm] > [output.prn]```

**Set resolution**

```foo2xqx -r [600] < [input.pbm] > [output.prn]```

**Set paper size**

```foo2xqx -p [letter] < [input.pbm] > [output.prn]```

# SYNOPSIS

**foo2xqx** [_options_] < _input_ > _output_

# PARAMETERS

**-r** _DPI_
> Resolution (300, 600, 1200).

**-p** _PAPER_
> Paper size (letter, a4, legal).

**-m** _MEDIA_
> Media type.

**-n** _COPIES_
> Number of copies.

**-d** _DUPLEX_
> Duplex mode.

**--help**
> Display help information.

# DESCRIPTION

**foo2xqx** converts PBM images to XQX format for HP LaserJet and compatible printers. It encodes raster data for printers using HP's XQX protocol.

The tool handles printer-specific encoding and compression for monochrome printing. It functions as a CUPS filter backend for supported HP printers.

foo2xqx enables Linux printing on certain HP LaserJet models that use XQX.

# CAVEATS

Monochrome only. Limited to XQX-compatible printers. Model support varies.

# HISTORY

foo2xqx is part of **foo2zjs**, adding support for HP printers using the XQX protocol, reverse-engineered to provide Linux compatibility.

# SEE ALSO

[foo2xqx-wrapper](/man/foo2xqx-wrapper)(1), [foo2zjs](/man/foo2zjs)(1)
