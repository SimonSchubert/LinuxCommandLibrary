# TLDR

**Convert PBM to** QPDL format

```foo2qpdl [options] < [input.pbm] > [output.prn]```

**Set resolution**

```foo2qpdl -r [600] < [input.pbm] > [output.prn]```

**Set paper size**

```foo2qpdl -p [letter] < [input.pbm] > [output.prn]```

**Color mode**

```foo2qpdl -c < [input.ppm] > [output.prn]```

# SYNOPSIS

**foo2qpdl** [_options_] < _input_ > _output_

# PARAMETERS

**-r** _DPI_
> Resolution (300, 600, 1200).

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

**foo2qpdl** converts PBM/PPM images to QPDL (Quick Page Description Language) for Samsung and Xerox laser printers. It encodes raster data in Samsung's proprietary protocol.

The tool handles the printer-specific encoding required by QPDL printers, managing color modes, compression, and page setup. It serves as a CUPS filter backend.

foo2qpdl enables Linux printing on Samsung CLP, CLX, and compatible Xerox printer models.

# CAVEATS

Only for QPDL-compatible printers. Model support varies. Some features may not be available on all printers.

# HISTORY

foo2qpdl is part of **foo2zjs**, providing support for Samsung printers using the QPDL protocol through reverse-engineered drivers.

# SEE ALSO

[foo2qpdl-wrapper](/man/foo2qpdl-wrapper)(1), [foo2zjs](/man/foo2zjs)(1)
