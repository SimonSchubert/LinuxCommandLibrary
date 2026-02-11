# TAGLINE

Convert PNM to CMYK TIFF for printing

# TLDR

**Convert PNM to CMYK TIFF**

```pnmtotiffcmyk [input.pnm] > [output.tiff]```

**Specify UCR percentage**

```pnmtotiffcmyk -ucr [20] [input.pnm] > [output.tiff]```

# SYNOPSIS

**pnmtotiffcmyk** [_options_] [_file_]

# PARAMETERS

**-ucr** _percent_
> Under color removal percentage.

**-gcr** _percent_
> Gray component replacement.

# DESCRIPTION

**pnmtotiffcmyk** converts PNM images to CMYK (Cyan, Magenta, Yellow, Key/Black) TIFF format for professional print production. It performs the RGB to CMYK color space conversion required by commercial printing processes.

The **-ucr** (Under Color Removal) and **-gcr** (Gray Component Replacement) options control how the black channel is generated from the CMY components, affecting ink usage and print quality. Part of the Netpbm toolkit.

# SEE ALSO

[pamtotiff](/man/pamtotiff)(1), [pnmtotiff](/man/pnmtotiff)(1)

