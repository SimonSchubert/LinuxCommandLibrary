# TAGLINE

Convert PNG images to PAM format

# TLDR

**Convert PNG to PAM**

```pngtopam [input.png] > [output.pam]```

**Convert with alpha channel**

```pngtopam -alpha [input.png] > [output.pam]```

# SYNOPSIS

**pngtopam** [_options_] [_file_]

# PARAMETERS

**-alpha**
> Extract alpha channel.

**-mix**
> Mix with background color.

**-background** _color_
> Background color.

**-verbose**
> Verbose output.

# DESCRIPTION

**pngtopam** converts PNG images to PAM (Portable Arbitrary Map) format. Part of Netpbm toolkit for image conversion and manipulation.

# SEE ALSO

[pamtopng](/man/pamtopng)(1), [pngtopnm](/man/pngtopnm)(1)

