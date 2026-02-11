# TAGLINE

Convert PNM images to TIFF format

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

**pnmtotiff** converts PNM images to TIFF (Tagged Image File Format), widely used for high-quality image storage and print workflows. Multiple compression methods are supported including LZW, JPEG, PackBits, and Group 3 fax encoding.

The **-append** option allows building multi-page TIFF files by appending images to an existing file. The **-resolution** option embeds DPI metadata for print sizing. Part of the Netpbm toolkit; superseded by **pamtotiff**.

# SEE ALSO

[tifftopnm](/man/tifftopnm)(1), [pnmtojpeg](/man/pnmtojpeg)(1)

