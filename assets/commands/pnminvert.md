# TAGLINE

Invert colors of PNM images

# TLDR

**Invert image colors**

```pnminvert [input.pnm] > [output.pnm]```

**Invert from stdin**

```cat [image.pnm] | pnminvert > [output.pnm]```

# SYNOPSIS

**pnminvert** [_file_]

# DESCRIPTION

**pnminvert** produces a photographic negative of a PNM image by inverting all pixel values. Each sample value is replaced with the maximum value minus the original value, effectively swapping light and dark.

The tool works with all PNM types: PBM (black/white bits are flipped), PGM (grayscale values are inverted), and PPM (each color channel is independently inverted). If no file is given, input is read from stdin. Output is always written to stdout.

Part of the Netpbm toolkit. The more general **paminvert** supersedes this tool and handles PAM images as well.

# CAVEATS

`pnminvert` has no options of its own beyond the common libnetpbm options. Output must be redirected to a file; it is always written to stdout.

# HISTORY

**pnminvert** was created as part of the **Netpbm** package for portable bitmap image manipulation.

# SEE ALSO

[paminvert](/man/paminvert)(1), [pnmarith](/man/pnmarith)(1), [pnmgamma](/man/pnmgamma)(1)
