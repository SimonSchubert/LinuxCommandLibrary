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

**pnmcomp** composites PNM images. Layer with transparency.

The tool combines images. Part of Netpbm.

pnmcomp layers images.

# CAVEATS

Part of Netpbm. Use pamcomp for newer version.

# HISTORY

pnmcomp is part of **Netpbm** for image compositing.

# SEE ALSO

[pamcomp](/man/pamcomp)(1), [pnmpaste](/man/pnmpaste)(1), [netpbm](/man/netpbm)(1)

