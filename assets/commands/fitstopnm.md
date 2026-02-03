# TLDR

**Convert FITS to PNM**

```fitstopnm [input.fits] > [output.pnm]```

**Convert specific image in file**

```fitstopnm -image [2] [input.fits] > [output.pnm]```

# SYNOPSIS

**fitstopnm** [_options_] [_file_]

# PARAMETERS

**-image** _num_
> Select specific image from multi-image file.

**-noraw**
> Output in plain format.

# DESCRIPTION

**fitstopnm** converts FITS (Flexible Image Transport System) files to PNM format. FITS is an astronomical image format. Part of the Netpbm toolkit.

# SEE ALSO

[pnmtofits](/man/pnmtofits)(1), [pamtofits](/man/pamtofits)(1)

