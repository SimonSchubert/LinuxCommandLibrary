# TAGLINE

Composite PNM images with transparency

# TLDR

**Composite images**

```pnmcomp [overlay.pnm] [background.pnm] > [output.pnm]```

**With alpha mask**

```pnmcomp -alpha=[mask.pgm] [overlay.pnm] [background.pnm] > [output.pnm]```

**Position overlay**

```pnmcomp -xoff=[100] -yoff=[50] [overlay.pnm] [background.pnm] > [output.pnm]```

# SYNOPSIS

**pnmcomp** [_options_] _overlay_ _background_

# PARAMETERS

_OVERLAY_
> Foreground image.

_BACKGROUND_
> Background image.

**-alpha** _FILE_
> Alpha mask.

**-xoff** _PIXELS_
> X offset.

**-yoff** _PIXELS_
> Y offset.

**-align** _POS_
> Alignment.

# DESCRIPTION

**pnmcomp** composites two PNM images by overlaying one on top of another with optional alpha transparency. An alpha mask (PGM file) controls the blending between overlay and background pixels.

Position offsets (**-xoff**, **-yoff**) control where the overlay is placed on the background. Part of the Netpbm toolkit; superseded by **pamcomp** in newer versions.

# CAVEATS

Part of Netpbm. Use pamcomp for newer version.

# HISTORY

pnmcomp is part of **Netpbm** for image compositing.

# SEE ALSO

[pamcomp](/man/pamcomp)(1), [pnmpaste](/man/pnmpaste)(1), [netpbm](/man/netpbm)(1)

