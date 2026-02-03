# TLDR

**Convert TIFF to PNM**

```tifftopnm [input.tiff] > [output.pnm]```

**Convert specific page**

```tifftopnm -page [2] [input.tiff] > [output.pnm]```

**List pages in TIFF**

```tifftopnm -headerdump [input.tiff]```

# SYNOPSIS

**tifftopnm** [_options_] [_file_]

# PARAMETERS

**-page** _n_
> Extract specific page.

**-headerdump**
> Dump TIFF headers.

**-alphaout** _file_
> Write alpha channel to file.

**-respectfillorder**
> Respect fill order tag.

# DESCRIPTION

**tifftopnm** converts TIFF images to PNM format. Part of Netpbm toolkit. Supports multi-page TIFF files and alpha channel extraction.

# SEE ALSO

[pnmtotiff](/man/pnmtotiff)(1), [pngtopnm](/man/pngtopnm)(1)

