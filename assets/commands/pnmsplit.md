# TLDR

**Split multi-image PNM file**

```pnmsplit [input.pnm] [output%d.pnm]```

**Split with custom naming**

```pnmsplit [input.pnm] [frame_%03d.pnm]```

# SYNOPSIS

**pnmsplit** [_options_] _input_ _output_

# PARAMETERS

_INPUT_
> Multi-image PNM file.

_OUTPUT_
> Output filename pattern with %d.

**-padname** _N_
> Zero-padding width for numbers.

# DESCRIPTION

**pnmsplit** splits multi-image PNM files. Separates concatenated images.

The tool extracts individual frames. Useful for animation processing.

pnmsplit separates images.

# CAVEATS

Requires %d in output name. Part of Netpbm suite.

# HISTORY

pnmsplit was created as part of **Netpbm** for multi-image file handling.

# SEE ALSO

[pnmcat](/man/pnmcat)(1), [pnmindex](/man/pnmindex)(1), [pamcut](/man/pamcut)(1)

