# TLDR

**Convert TGA to PPM**

```tgatoppm [input.tga] > [output.ppm]```

**Extract alpha channel**

```tgatoppm --alphaout=[alpha.pgm] [input.tga] > [output.ppm]```

# SYNOPSIS

**tgatoppm** [_options_] [_file_]

# PARAMETERS

**--alphaout** _file_
> Write alpha channel to file.

# DESCRIPTION

**tgatoppm** converts TGA (Targa) images to PPM format. Handles compressed and uncompressed TGA files. Part of Netpbm toolkit.

# SEE ALSO

[ppmtotga](/man/ppmtotga)(1), [pngtopnm](/man/pngtopnm)(1)

