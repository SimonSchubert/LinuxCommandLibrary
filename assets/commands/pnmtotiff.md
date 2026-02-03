# TLDR

**Convert PNM to TIFF**

```pnmtotiff [input.pnm] > [output.tiff]```

**Convert with LZW compression**

```pnmtotiff -lzw [input.pnm] > [output.tiff]```

**Convert with JPEG compression**

```pnmtotiff -jpeg [input.pnm] > [output.tiff]```

**Create multi-page TIFF**

```pnmtotiff -append [input.pnm] >> [output.tiff]```

# SYNOPSIS

**pnmtotiff** [_options_] [_file_]

# PARAMETERS

**-none**
> No compression.

**-lzw**
> LZW compression.

**-jpeg**
> JPEG compression.

**-packbits**
> PackBits compression.

**-g3**
> Group 3 fax compression.

**-append**
> Append to existing TIFF.

**-resolution** _dpi_
> Set resolution.

# DESCRIPTION

**pnmtotiff** converts PNM images to TIFF format. Part of Netpbm toolkit. Supports various compression methods and multi-page TIFF files.

# SEE ALSO

[tifftopnm](/man/tifftopnm)(1), [pnmtojpeg](/man/pnmtojpeg)(1)

