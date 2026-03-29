# TAGLINE

Convert Interleaf image format to PPM

# TLDR

**Convert an Interleaf image to PPM**

```leaftoppm [input.lf] > [output.ppm]```

**Read from stdin and convert to PPM**

```cat [input.lf] | leaftoppm > [output.ppm]```

# SYNOPSIS

**leaftoppm** [_leaffile_]

# DESCRIPTION

**leaftoppm** reads an Interleaf image file as input and produces a PPM (Portable Pixmap) image as output. If no input file is specified, input is read from standard input. Output is written to standard output.

Interleaf was a technical publishing software company popular in the 1980s and 1990s, acquired by BroadVision around 2000. This program is part of the Netpbm toolkit.

# SEE ALSO

[ppmtoleaf](/man/ppmtoleaf)(1), [tifftopnm](/man/tifftopnm)(1), [bmptoppm](/man/bmptoppm)(1)
