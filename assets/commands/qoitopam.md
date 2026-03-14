# TAGLINE

Convert QOI images to PAM format

# TLDR

**Convert a QOI file to PAM**

```qoitopam [input.qoi] > [output.pam]```

**Convert from stdin**

```qoitopam < [input.qoi] > [output.pam]```

**Convert and pipe to another Netpbm tool**

```qoitopam [input.qoi] | pamtopng > [output.png]```

# SYNOPSIS

**qoitopam** [_qoifile_]

# DESCRIPTION

**qoitopam** converts images from QOI (Quite OK Image) format to PAM (Portable Arbitrary Map) format. QOI is a fast lossless image compression format designed for simplicity and speed, and PAM is the flexible container format used by the Netpbm image processing toolkit.

The tool reads a QOI file from the specified argument or from standard input if no file is given. It writes PAM data to standard output, making it easy to chain with other Netpbm tools for further image processing and format conversion.

This program is part of Netpbm.

# SEE ALSO

[pamtoqoi](/man/pamtoqoi)(1), [pngtopam](/man/pngtopam)(1)

