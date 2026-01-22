# TLDR

**Composite images**

```pamcomp [overlay.pam] [base.pam] > [output.pam]```

**With transparency**

```pamcomp -alpha=[mask.pgm] [overlay.pam] [base.pam] > [output.pam]```

**Specify position**

```pamcomp -xoff=[100] -yoff=[50] [overlay.pam] [base.pam] > [output.pam]```

# SYNOPSIS

**pamcomp** [_options_] _overlay_ _base_

# PARAMETERS

_OVERLAY_
> Foreground image.

_BASE_
> Background image.

**-alpha** _FILE_
> Alpha mask file.

**-xoff** _PIXELS_
> X offset.

**-yoff** _PIXELS_
> Y offset.

**-align** _POS_
> Alignment position.

# DESCRIPTION

**pamcomp** composites two images. Overlays with transparency support.

The tool combines PAM/PNM images. Part of Netpbm.

pamcomp composites images.

# CAVEATS

Part of Netpbm. PAM/PNM format. Alpha channel support.

# HISTORY

pamcomp is part of **Netpbm** for image compositing operations.

# SEE ALSO

[pnmcomp](/man/pnmcomp)(1), [pnmpaste](/man/pnmpaste)(1), [netpbm](/man/netpbm)(1)

