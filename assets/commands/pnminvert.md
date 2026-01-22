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

**pnminvert** inverts the colors of PNM images. Creates negative.

The tool swaps light and dark values. Works with all PNM types.

pnminvert creates negatives.

# CAVEATS

Simple color inversion. Part of Netpbm suite.

# HISTORY

pnminvert was created as part of **Netpbm** for image inversion operations.

# SEE ALSO

[paminvert](/man/paminvert)(1), [ppmchange](/man/ppmchange)(1), [pnmarith](/man/pnmarith)(1)

