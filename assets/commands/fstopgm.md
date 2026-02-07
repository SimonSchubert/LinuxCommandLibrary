# TAGLINE

Usenix FaceSaver to PGM converter

# TLDR

**Convert Usenix FaceSaver to PGM**

```fstopgm < [input.fs] > [output.pgm]```

# SYNOPSIS

**fstopgm** [_input_]

# DESCRIPTION

**fstopgm** converts Usenix FaceSaver format images to PGM (Portable Graymap) format. The Usenix FaceSaver was an early format used for storing grayscale face images in online directory systems. This tool is part of the Netpbm image processing toolkit, which provides utilities for converting between numerous graphics formats.

The conversion reads from standard input and writes to standard output, making it suitable for pipeline operations with other Netpbm tools.

# SEE ALSO

[pgmtofs](/man/pgmtofs)(1), [pgm](/man/pgm)(5)

