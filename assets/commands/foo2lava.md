# TLDR

**Convert PBM to** LAVAFLOW

```foo2lava [options] < [input.pbm] > [output.prn]```

**Set resolution**

```foo2lava -r [600] < [input.pbm] > [output.prn]```

**Set paper size**

```foo2lava -p [letter] < [input.pbm] > [output.prn]```

**Color mode**

```foo2lava -c < [input.ppm] > [output.prn]```

# SYNOPSIS

**foo2lava** [_options_] < _input_ > _output_

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

**foo2lava** converts PBM/PPM images to LAVAFLOW protocol for Konica Minolta magicolor printers. It encodes raster data in the proprietary format these printers expect.

The tool handles grayscale and color printing, managing the printer-specific page setup and encoding. It serves as a CUPS filter backend for supported printers.

foo2lava enables Linux printing on magicolor 2530 DL, 2490 MF, and similar models.

# CAVEATS

Only for specific Konica Minolta models. Quality depends on input resolution. Some features may not be available.

# HISTORY

foo2lava is part of **foo2zjs**, adding support for Konica Minolta printers using the LAVAFLOW protocol, reverse-engineered to provide Linux compatibility.

# SEE ALSO

[foo2lava-wrapper](/man/foo2lava-wrapper)(1), [foo2zjs](/man/foo2zjs)(1)
