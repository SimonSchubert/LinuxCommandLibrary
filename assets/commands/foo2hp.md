# TLDR

**Convert PBM to** HP format

```foo2hp [options] < [input.pbm] > [output.prn]```

**Set resolution**

```foo2hp -r [600] < [input.pbm] > [output.prn]```

**Set paper size**

```foo2hp -p [letter] < [input.pbm] > [output.prn]```

**Color mode**

```foo2hp -c < [input.ppm] > [output.prn]```

# SYNOPSIS

**foo2hp** [_options_] < _input_ > _output_

# PARAMETERS

**-r** _DPI_
> Resolution (300, 600, 1200).

**-p** _PAPER_
> Paper size (letter, a4, legal).

**-c**
> Color mode (requires PPM input).

**-m** _MEDIA_
> Media type.

**-n** _COPIES_
> Number of copies.

**-d** _DUPLEX_
> Duplex mode.

**--help**
> Display help information.

# DESCRIPTION

**foo2hp** converts PBM/PPM images to HP's proprietary ZjStream format for certain HP Color LaserJet printers. It enables printing on printers that lack native Linux drivers.

The tool handles raster-to-printer protocol conversion, managing page setup, color handling, and HP-specific encoding. It works as a CUPS filter backend.

foo2hp supports HP Color LaserJet 1600, 2600n, and similar models using ZjStream protocol.

# CAVEATS

Only for specific HP printer models. Quality depends on input resolution. May not support all printer features.

# HISTORY

foo2hp is part of **foo2zjs**, Rick Richardson's open source driver collection. It reverse-engineered HP's ZjStream protocol to provide Linux support for GDI-based HP printers.

# SEE ALSO

[foo2hp2600-wrapper](/man/foo2hp2600-wrapper)(1), [foo2zjs](/man/foo2zjs)(1)
