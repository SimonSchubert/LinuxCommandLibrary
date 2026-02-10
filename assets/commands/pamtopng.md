# TAGLINE

converts PAM images to PNG format

# TLDR

**Convert PAM to PNG**

```pamtopng [input.pam] > [output.png]```

**Convert with compression**

```pamtopng -compression [9] [input.pam] > [output.png]```

**Create interlaced PNG**

```pamtopng -interlace [input.pam] > [output.png]```

# SYNOPSIS

**pamtopng** [_options_] [_file_]

# PARAMETERS

**-compression** _n_
> Compression level (0-9).

**-interlace**
> Create interlaced PNG.

**-transparent** _color_
> Transparent color.

**-background** _color_
> Background color.

**-gamma** _value_
> Gamma value.

# DESCRIPTION

**pamtopng** converts PAM images to PNG format. Part of Netpbm toolkit. Preferred over pnmtopng for images with alpha channels.

# SEE ALSO

[pngtopam](/man/pngtopam)(1), [pnmtopng](/man/pnmtopng)(1)

