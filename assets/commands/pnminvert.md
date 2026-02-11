# TAGLINE

Invert colors of PNM images

# TLDR

**Invert image colors**

```pnminvert [input.pnm] > [output.pnm]```

**Invert from stdin**

```cat [image.pnm] | pnminvert > [output.pnm]```

# SYNOPSIS

**pnminvert** [_file_]

# PARAMETERS

_FILE_
> Input PNM file.

# DESCRIPTION

**pnminvert** produces a photographic negative of a PNM image by inverting all pixel values. Each sample value is replaced with the maximum value minus the original value, effectively swapping light and dark.

The tool works with all PNM types: PBM (black/white bits are flipped), PGM (grayscale values are inverted), and PPM (each color channel is independently inverted). Part of the Netpbm toolkit; superseded by **paminvert**.

# CAVEATS

Simple color inversion. Part of Netpbm suite.

# HISTORY

pnminvert was created as part of **Netpbm** for image inversion operations.

# SEE ALSO

[paminvert](/man/paminvert)(1), [ppmchange](/man/ppmchange)(1), [pnmarith](/man/pnmarith)(1)

