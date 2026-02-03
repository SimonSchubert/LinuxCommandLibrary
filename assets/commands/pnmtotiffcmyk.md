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

**pnmtotiffcmyk** converts PNM images to CMYK TIFF format for print production. Performs RGB to CMYK color separation. Part of Netpbm toolkit.

# SEE ALSO

[pamtotiff](/man/pamtotiff)(1), [pnmtotiff](/man/pnmtotiff)(1)

