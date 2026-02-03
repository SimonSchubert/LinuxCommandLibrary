# TLDR

**Convert PPM to BMP**

```ppmtobmp [input.ppm] > [output.bmp]```

**Create Windows BMP**

```ppmtobmp -windows [input.ppm] > [output.bmp]```

**Create OS/2 BMP**

```ppmtobmp -os2 [input.ppm] > [output.bmp]```

# SYNOPSIS

**ppmtobmp** [_options_] [_file_]

# PARAMETERS

**-windows**
> Windows BMP format.

**-os2**
> OS/2 BMP format.

**-bpp** _bits_
> Bits per pixel (1, 4, 8, 24).

# DESCRIPTION

**ppmtobmp** converts PPM images to BMP (Windows/OS2 bitmap) format. Part of Netpbm toolkit for image format conversion.

# SEE ALSO

[bmptopnm](/man/bmptopnm)(1), [pnmtopng](/man/pnmtopng)(1)

