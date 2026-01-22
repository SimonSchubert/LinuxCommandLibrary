# TLDR

**Convert PBM to** HBPL

```foo2hbpl2 [options] < [input.pbm] > [output.hbpl]```

**Set resolution**

```foo2hbpl2 -r [600] < [input.pbm] > [output.hbpl]```

**Set paper size**

```foo2hbpl2 -p [a4] < [input.pbm] > [output.hbpl]```

**Color mode**

```foo2hbpl2 -c < [input.pbm] > [output.hbpl]```

# SYNOPSIS

**foo2hbpl2** [_options_] < _input_ > _output_

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

**foo2hbpl2** converts PBM (Portable BitMap) images to HBPL2 format for Dell and Xerox laser printers. It's part of the foo2zjs printer driver collection.

The tool processes rasterized page images and encodes them in the proprietary HBPL2 protocol. It works with CUPS filters to enable printing on otherwise unsupported printers.

foo2hbpl2 handles page formatting, resolution scaling, and printer-specific encoding.

# CAVEATS

Requires compatible printer. Works as CUPS filter backend. Quality depends on input resolution.

# HISTORY

foo2hbpl2 is part of **foo2zjs**, a collection of open source printer drivers created by Rick Richardson. It reverse-engineered proprietary protocols to support GDI printers on Linux.

# SEE ALSO

[foo2hbpl2-wrapper](/man/foo2hbpl2-wrapper)(1), [foo2zjs](/man/foo2zjs)(1)
