# TLDR

**Convert PAM to TGA format**

```pamtotga [input.pam] > [output.tga]```

**Create compressed TGA**

```pamtotga -rle [input.pam] > [output.tga]```

# SYNOPSIS

**pamtotga** [_options_] [_file_]

# PARAMETERS

**-rle**
> Use RLE compression.

**-norle**
> Disable compression.

# DESCRIPTION

**pamtotga** converts PAM/PNM images to TGA (Targa) format. Supports 24-bit and 32-bit with alpha. Part of Netpbm toolkit.

# SEE ALSO

[tgatoppm](/man/tgatoppm)(1), [ppmtotga](/man/ppmtotga)(1)

