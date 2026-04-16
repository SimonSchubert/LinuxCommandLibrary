# TAGLINE

converts PAM/PNM images to QOI format

# TLDR

**Convert PAM to QOI format**

```pamtoqoi [input.pam] > [output.qoi]```

# SYNOPSIS

**pamtoqoi** [_file_]

# DESCRIPTION

**pamtoqoi** converts PAM/PNM images to QOI (Quite OK Image) format. QOI is a fast, lossless image format designed for simplicity and speed. Part of Netpbm toolkit.

# PARAMETERS

**-quiet**
> Suppress informational messages.

**-version**
> Display program version and exit.

# CAVEATS

Input must be a PAM (Portable Arbitrary Map) or PNM image. QOI supports RGB and RGBA only; grayscale inputs may be rejected or converted.

# SEE ALSO

[qoitopam](/man/qoitopam)(1), [pnmtopng](/man/pnmtopng)(1), [pamtopnm](/man/pamtopnm)(1), [pam](/man/pam)(5), [pnm](/man/pnm)(5)

