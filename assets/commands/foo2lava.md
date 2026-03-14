# TAGLINE

Convert Ghostscript pbmraw or bitcmyk format into a LAVAFLOW printer stream

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

**-r** _XRESxYRES_
> Set resolution in pixels/inch (default 1200x600).

**-g** _XPIXxYPIX_
> Set page dimensions in pixels (default 10200x6600).

**-p** _PAPER_
> Paper code to send to printer (default 2 for letter).

**-c**
> Force color mode.

**-m** _MEDIA_
> Media type code to send to printer (default 0).

**-n** _COPIES_
> Number of copies (default 1).

**-d** _DUPLEX_
> Duplex code (1=off, 2=long-edge, 3=short-edge).

**-s** _SOURCE_
> Source (InputSlot) code (default 255, auto).

**-t**
> Draft mode. Every other pixel is white.

**-S** _PLANE_
> Output a single color plane for debugging.

# DESCRIPTION

**foo2lava** converts Ghostscript pbmraw, bitcmyk, or pksmraw output formats to monochrome or color LAVAFLOW or OPL streams for Konica Minolta magicolor printers.

Supported printers include the magicolor 2530 DL, 2490 MF, and other Zenographics-based LAVAFLOW printers. It serves as a backend for the foo2lava-wrapper CUPS filter.

# CAVEATS

Only for specific Konica Minolta models. Quality depends on input resolution. Some features may not be available.

# HISTORY

foo2lava is part of **foo2zjs**, adding support for Konica Minolta printers using the LAVAFLOW protocol, reverse-engineered to provide Linux compatibility.

# SEE ALSO

[foo2lava-wrapper](/man/foo2lava-wrapper)(1), [foo2zjs](/man/foo2zjs)(1)
