# TAGLINE

Convert PAM images to PNG format

# TLDR

**Convert PAM to PNG**

```pamtopng [input.pam] > [output.png]```

**Convert with maximum compression**

```pamtopng -compression [9] [input.pam] > [output.png]```

**Create interlaced PNG**

```pamtopng -interlace [input.pam] > [output.png]```

**Convert with transparency**

```pamtopng -transparent [white] [input.pam] > [output.png]```

# SYNOPSIS

**pamtopng** [_options_] [_file_]

# PARAMETERS

**-compression** _n_
> Compression level (0-9, default: 6).

**-interlace**
> Create interlaced (Adam7) PNG for progressive loading.

**-transparent** _color_
> Set fully transparent color.

**-background** _color_
> Background color for alpha blending.

**-gamma** _value_
> Gamma value for the image.

**-srgbintent** _intent_
> sRGB rendering intent: absolute, relative, perceptual, or saturation.

**-text** _file_
> Add tEXt chunks from a text file.

**-verbose**
> Print detailed progress information to standard error.

# DESCRIPTION

**pamtopng** converts Netpbm PAM images to PNG format. It is the preferred tool over **pnmtopng** for images with alpha channels, as it properly handles PAM's native alpha support. Part of the Netpbm toolkit.

Input is read from the specified file or standard input. Output is written to standard output.

# SEE ALSO

[pngtopam](/man/pngtopam)(1), [pnmtopng](/man/pnmtopng)(1)

