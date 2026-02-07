# TAGLINE

PBM to OAKT converter for Oak Technology printers

# TLDR

**Convert PBM to** OAKT format

```foo2oak [options] < [input.pbm] > [output.prn]```

**Set resolution**

```foo2oak -r [600] < [input.pbm] > [output.prn]```

**Set paper size**

```foo2oak -p [letter] < [input.pbm] > [output.prn]```

**Color mode**

```foo2oak -c < [input.ppm] > [output.prn]```

# SYNOPSIS

**foo2oak** [_options_] < _input_ > _output_

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

**foo2oak** converts PBM/PPM images to OAKT protocol for certain HP and Kyocera printers. It encodes raster data for printers using Oak Technology chips.

The tool manages the proprietary OAKT encoding required by these printers, handling page setup and color conversion. It functions as a CUPS filter backend.

foo2oak supports printers like HP LaserJet 1000 and similar models using Oak Technology controllers.

# CAVEATS

Only for printers with Oak Technology chipsets. Printer model support varies. Not all features available.

# HISTORY

foo2oak is part of **foo2zjs**, supporting printers using Oak Technology's OAKT protocol through reverse-engineered drivers.

# SEE ALSO

[foo2oak-wrapper](/man/foo2oak-wrapper)(1), [foo2zjs](/man/foo2zjs)(1)
