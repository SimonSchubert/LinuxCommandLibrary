# TAGLINE

Combine YUV component files into a PPM image

# TLDR

**Combine YUV component files into a PPM image**

```yuvsplittoppm [base] [width] [height] > [output.ppm]```

**Combine using CCIR 601 (MPEG) colour scaling**

```yuvsplittoppm -ccir601 [base] [width] [height] > [output.ppm]```

# SYNOPSIS

**yuvsplittoppm** [_-ccir601_] _basename_ _width_ _height_

# PARAMETERS

_basename_
> Base name of the component files. Reads _basename_.Y, _basename_.U, and _basename_.V.

_width_
> Image width in pixels.

_height_
> Image height in pixels.

**-ccir601**
> Interpret YUV values using the CCIR 601 (MPEG) range rather than the default JFIF (JPEG) range.

# DESCRIPTION

**yuvsplittoppm** reads three raw files containing the Y, U, and V colour components and produces a PPM image on standard output. The filenames are derived from _basename_ by appending `.Y`, `.U`, and `.V`. Because the files are raw with no header, the image dimensions must be given on the command line.

It is the inverse of [ppmtoyuvsplit](/man/ppmtoyuvsplit)(1) and is part of the Netpbm toolkit.

# SEE ALSO

[ppmtoyuvsplit](/man/ppmtoyuvsplit)(1), [yuvtoppm](/man/yuvtoppm)(1), [rgb3toppm](/man/rgb3toppm)(1)

