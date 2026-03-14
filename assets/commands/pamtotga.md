# TAGLINE

converts PAM/PNM images to TGA format

# TLDR

**Convert PAM to TGA format**

```pamtotga [input.pam] > [output.tga]```

**Convert with colormapped output**

```pamtotga -cmap [input.pam] > [output.tga]```

**Convert as monochrome**

```pamtotga -mono [input.pam] > [output.tga]```

**Convert without RLE compression**

```pamtotga -norle [input.pam] > [output.tga]```

**Set image ID in TGA header**

```pamtotga -name=[label] [input.pam] > [output.tga]```

# SYNOPSIS

**pamtotga** [_options_] [_file_]

# PARAMETERS

**-mono**
> Output monochrome 8-bit TGA. Input must be PBM, PGM, or PAM with BLACKANDWHITE or GRAYSCALE tuple type.

**-cmap**
> Output colormapped TGA using a palette. Input must have no more than 256 distinct colors and no transparency.

**-cmap16**
> Like -cmap but uses 16-bit (5 bits per channel) color map entries instead of 24-bit.

**-rgb**
> Output 24-bit unmapped color TGA.

**-norle**
> Disable RLE (Run-Length Encoding) compression.

**-name=**_name_
> Set the image ID in the TGA header.

**-verbose**
> Print information about the conversion process.

# DESCRIPTION

**pamtotga** converts PAM/PNM images to TGA (Targa) format. Supports 24-bit and 32-bit with alpha. By default, the most constrained compatible type is chosen (monochrome over colormapped over unmapped). RLE compression is enabled by default. Part of the Netpbm toolkit.

# SEE ALSO

[tgatoppm](/man/tgatoppm)(1), [ppmtotga](/man/ppmtotga)(1)

