# TAGLINE

converts PAM/PNM images to GIF format

# TLDR

**Convert PAM to GIF**

```pamtogif [input.pam] > [output.gif]```

**Create interlaced GIF**

```pamtogif -interlace [input.pam] > [output.gif]```

**Set transparent color**

```pamtogif -transparent [#ffffff] [input.pam] > [output.gif]```

# SYNOPSIS

**pamtogif** [_options_] [_file_]

# PARAMETERS

**-interlace**
> Create interlaced GIF.

**-transparent** _color_
> Transparent color.

**-alphacolor** _color_
> Alpha color.

**-comment** _text_
> Add comment.

# DESCRIPTION

**pamtogif** converts PAM/PNM images to GIF format. Part of Netpbm toolkit. Automatically reduces colors to 256 for GIF format.

# SEE ALSO

[giftopnm](/man/giftopnm)(1), [ppmtogif](/man/ppmtogif)(1)

