# TLDR

**Spread pixels randomly**

```ppmspread [amount] [input.ppm] > [output.ppm]```

**Light spread effect**

```ppmspread 5 [input.ppm] > [output.ppm]```

**Heavy spread effect**

```ppmspread 20 [input.ppm] > [output.ppm]```

# SYNOPSIS

**ppmspread** _amount_ [_file_]

# PARAMETERS

_AMOUNT_
> Spread radius in pixels.

_FILE_
> Input PPM file.

# DESCRIPTION

**ppmspread** randomly displaces pixels. Creates noise/blur effect.

The tool produces scattered appearance. Part of Netpbm.

ppmspread disperses pixels.

# CAVEATS

Random displacement. Part of Netpbm suite.

# HISTORY

ppmspread was created as part of **Netpbm** for pixel dispersion effects.

# SEE ALSO

[ppm](/man/ppm)(5), [ppmshift](/man/ppmshift)(1), [pnmnoise](/man/pnmnoise)(1)

