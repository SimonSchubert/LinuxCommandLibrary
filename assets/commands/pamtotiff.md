# TAGLINE

converts PAM images to TIFF format

# TLDR

**Convert PAM to TIFF**

```pamtotiff [input.pam] > [output.tiff]```

**Convert with LZW compression**

```pamtotiff -lzw [input.pam] > [output.tiff]```

**Convert with JPEG compression**

```pamtotiff -jpeg [input.pam] > [output.tiff]```

# SYNOPSIS

**pamtotiff** [_options_] [_file_]

# PARAMETERS

**-none**
> No compression.

**-lzw**
> LZW compression.

**-jpeg**
> JPEG compression.

**-packbits**
> PackBits compression.

**-append**
> Append to existing TIFF.

# DESCRIPTION

**pamtotiff** converts PAM images to TIFF format. Supports alpha channel and various compression methods. Part of Netpbm toolkit.

# SEE ALSO

[tifftopnm](/man/tifftopnm)(1), [pnmtotiff](/man/pnmtotiff)(1)

