# TLDR

**View PGM format info**

```pamfile [image.pgm]```

**Convert JPEG to PGM**

```jpegtopnm [image.jpg] | ppmtopgm > [output.pgm]```

**Create PGM from text**

```echo "P2 3 2 255 0 128 255 64 192 32" > [output.pgm]```

**Display PGM image**

```display [image.pgm]```

# SYNOPSIS

PGM format specification and related utilities

# DESCRIPTION

**PGM** (Portable Graymap) is a grayscale image format in the Netpbm family. It stores images as grayscale values from 0 (black) to maxval (white).

Simple ASCII or binary format, easy to read and write programmatically.

# FORMAT

```
P2              # ASCII format (P5 for binary)
width height
maxval          # Maximum gray value (usually 255)
pixel_values    # Space-separated (ASCII) or raw (binary)
```

# EXAMPLE FILE

```
P2
# comment
3 2
255
0   128  255
64  192  32
```

# CONVERSIONS

```bash
# JPEG to PGM
jpegtopnm photo.jpg | ppmtopgm > photo.pgm

# PNG to PGM
pngtopam image.png | pamtopnm | ppmtopgm > image.pgm

# PGM to PNG
pnmtopng image.pgm > image.png
```

# CAVEATS

ASCII format is larger but human-readable. Binary more efficient. Part of Netpbm toolkit.

# HISTORY

PGM was designed by **Jef Poskanzer** as part of the **Netpbm** (formerly Pbmplus) toolkit for image manipulation.

# SEE ALSO

[ppm](/man/ppm)(5), [pbm](/man/pbm)(5), [pnm](/man/pnm)(5), [netpbm](/man/netpbm)(1)
