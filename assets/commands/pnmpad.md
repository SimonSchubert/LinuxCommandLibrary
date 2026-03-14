# TAGLINE

Add padding to PNM images

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
> Padding color (default: black).

**-white**
> Pad with white (shortcut).

**-halign** _RATIO_
> Horizontal alignment ratio (0.0=left, 0.5=center, 1.0=right).

**-valign** _RATIO_
> Vertical alignment ratio (0.0=bottom, 0.5=center, 1.0=top).

**-mwidth** _N_
> Pad width to a multiple of N pixels.

**-mheight** _N_
> Pad height to a multiple of N pixels.

**-extend-edge**
> Pad by duplicating adjacent edge pixels.

**-detect-background**
> Detect and use image background color for padding.

**-reportonly**
> Print padding description instead of producing output.

# DESCRIPTION

**pnmpad** adds padding (blank space) around PNM images, extending the canvas size without scaling the original content. Padding can be added independently to each side using **-left**, **-right**, **-top**, and **-bottom**.

Alternatively, **-width** and **-height** specify the desired output dimensions, with **-halign** and **-valign** controlling alignment within the padded canvas (default is centered). The **-color** option sets the padding color (default is black). The **-mwidth** and **-mheight** options pad to a multiple of a given pixel count. This is the inverse of pnmcrop. Part of the Netpbm toolkit.

# CAVEATS

Opposite of pnmcrop. Part of Netpbm suite. The **-extend-edge** and **-detect-background** options require Netpbm 11.05 or later.

# SEE ALSO

[pnmcrop](/man/pnmcrop)(1), [pamcomp](/man/pamcomp)(1), [pnmcat](/man/pnmcat)(1)

