# TAGLINE

Convert PPM to Berkeley Encoder YUV format

# TLDR

**Convert a PPM image to EYUV format**

```ppmtoeyuv [input.ppm] > [output.eyuv]```

**Convert from stdin**

```cat [input.ppm] | ppmtoeyuv > [output.eyuv]```

# SYNOPSIS

**ppmtoeyuv** [_ppmfile_]

# DESCRIPTION

**ppmtoeyuv** converts a PPM image to Berkeley Encoder YUV (EYUV) format, which is used by MPEG encoders. Reads from a file argument or standard input. Output is written to standard output. Part of the Netpbm toolkit.

# SEE ALSO

[eyuvtoppm](/man/eyuvtoppm)(1), [ppmtoyuv](/man/ppmtoyuv)(1), [ppmtojpeg](/man/ppmtojpeg)(1)

