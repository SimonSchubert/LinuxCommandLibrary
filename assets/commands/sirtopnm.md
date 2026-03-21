# TAGLINE

Convert Solitaire image recorder files to PNM format

# TLDR

**Convert** a Solitaire image to PNM

```sirtopnm [input.sir] > [output.pnm]```

**Convert** and pipe to a PNG encoder

```sirtopnm [input.sir] | pnmtopng > [output.png]```

# SYNOPSIS

**sirtopnm** [_sirfile_]

# DESCRIPTION

**sirtopnm** reads a Solitaire Image Recorder file (`.sir`) as input and produces a PNM (Portable Any Map) image as output on standard output. The Solitaire Image Recorder was a high-resolution film recorder used for producing slides and transparencies from digital images.

If no input file is specified, **sirtopnm** reads from standard input. The output format (PBM, PGM, or PPM) depends on the content of the input image.

This tool is part of the **Netpbm** toolkit, a collection of image manipulation utilities for converting between various image formats.

# PARAMETERS

_sirfile_
> Path to the Solitaire Image Recorder file to convert. Reads from standard input if omitted.

# SEE ALSO

[pnmtosir](/man/pnmtosir)(1), [sgitopnm](/man/sgitopnm)(1), [anytopnm](/man/anytopnm)(1), [pnmtopng](/man/pnmtopng)(1), [pnmtojpeg](/man/pnmtojpeg)(1)

