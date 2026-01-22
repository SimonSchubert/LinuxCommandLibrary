# TLDR

**Change specific color**

```ppmchange [oldcolor] [newcolor] [input.ppm] > [output.ppm]```

**Change red to blue**

```ppmchange red blue [input.ppm] > [output.ppm]```

**Change multiple colors**

```ppmchange [old1] [new1] [old2] [new2] [input.ppm] > [output.ppm]```

# SYNOPSIS

**ppmchange** [_options_] _oldcolor_ _newcolor_ [_file_]

# PARAMETERS

_OLDCOLOR_
> Color to replace.

_NEWCOLOR_
> Replacement color.

_FILE_
> Input PPM file.

**-closeness** _N_
> Color matching tolerance.

# DESCRIPTION

**ppmchange** replaces colors in PPM images. Color substitution tool.

The tool changes specific colors. Part of Netpbm.

ppmchange swaps colors.

# CAVEATS

Exact color matching by default. Part of Netpbm suite.

# HISTORY

ppmchange was created as part of **Netpbm** for color replacement.

# SEE ALSO

[ppmcolormask](/man/ppmcolormask)(1), [pnmremap](/man/pnmremap)(1), [ppm](/man/ppm)(5)

