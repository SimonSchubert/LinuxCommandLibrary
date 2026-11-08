# TAGLINE

grayscale image format in the Netpbm family

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
maxval          # Maximum gray value (1 to 65535, usually 255)
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

ASCII (plain, P2) format is larger but human-readable. Binary (raw, P5) is more efficient and uses 1 byte per sample when maxval is below 256, otherwise 2 bytes. Part of Netpbm toolkit.

# HISTORY

PGM was designed by **Jef Poskanzer** as part of the **Netpbm** (formerly Pbmplus) toolkit for image manipulation.

# SEE ALSO

[ppm](/man/ppm)(5), [pbm](/man/pbm)(5), [pnm](/man/pnm)(5), [netpbm](/man/netpbm)(1)

# RESOURCES

```[Homepage](https://netpbm.sourceforge.net/)```

```[Documentation](https://netpbm.sourceforge.net/doc/pgm.html)```

<!-- verified: 2026-11-08 -->
