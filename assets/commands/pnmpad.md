# TLDR

**Add padding to image**

```pnmpad -left [10] -right [10] [input.pnm] > [output.pnm]```

**Add uniform padding**

```pnmpad -width [100] -height [100] [input.pnm] > [output.pnm]```

**Pad with specific color**

```pnmpad -color [white] -left [5] [input.pnm] > [output.pnm]```

# SYNOPSIS

**pnmpad** [_options_] [_file_]

# PARAMETERS

_FILE_
> Input PNM file.

**-left** _N_
> Pixels to add on left.

**-right** _N_
> Pixels to add on right.

**-top** _N_
> Pixels to add on top.

**-bottom** _N_
> Pixels to add on bottom.

**-width** _N_
> Target width (centered).

**-height** _N_
> Target height (centered).

**-color** _COLOR_
> Padding color.

# DESCRIPTION

**pnmpad** adds borders to PNM images. Extends canvas size.

The tool pads images with color. Useful for resizing canvas.

pnmpad adds borders.

# CAVEATS

Opposite of pnmcrop. Part of Netpbm suite.

# HISTORY

pnmpad was created as part of **Netpbm** for image padding operations.

# SEE ALSO

[pnmcrop](/man/pnmcrop)(1), [pamcomp](/man/pamcomp)(1), [pnmcat](/man/pnmcat)(1)

