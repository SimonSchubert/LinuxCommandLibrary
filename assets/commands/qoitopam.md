# TAGLINE

Convert QOI images to PAM format

# TLDR

**Convert QOI to PAM format**

```qoitopam [input.qoi] > [output.pam]```

# SYNOPSIS

**qoitopam** [_file_]

# DESCRIPTION

**qoitopam** converts images from QOI (Quite OK Image) format to PAM (Portable Arbitrary Map) format. QOI is a fast lossless image compression format designed for simplicity and speed, and PAM is the flexible container format used by the Netpbm image processing toolkit.

The tool reads a QOI file from its argument or standard input and writes PAM data to standard output, making it easy to chain with other Netpbm tools for further image processing and format conversion.

# SEE ALSO

[pamtoqoi](/man/pamtoqoi)(1), [pngtopam](/man/pngtopam)(1)

