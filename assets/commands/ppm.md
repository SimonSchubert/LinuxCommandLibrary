# TAGLINE

Portable Pixmap color image format

# TLDR

**Convert a color JPEG to PPM**

```jpegtopnm [image.jpg] > [output.ppm]```

**Convert PPM to PNG**

```pnmtopng [image.ppm] > [output.png]```

**View PPM info**

```pamfile [image.ppm]```

# SYNOPSIS

PPM format specification and related utilities

# DESCRIPTION

**PPM** (Portable Pixmap) is the color image format in the Netpbm family. Each pixel is stored as an RGB triplet, with values ranging from 0 to a specified maximum. The format exists in two variants: plain (ASCII text, human-readable) and raw (binary, compact).

PPM serves as the common interchange format for color images in Netpbm pipelines. Numerous tools convert to and from PPM, allowing image processing by chaining simple single-purpose utilities. PGM handles grayscale and PBM handles bitmaps in the same family.

# CAVEATS

Netpbm format family. PPM for color, PGM for grayscale, PBM for bitmap.

# HISTORY

PPM was created as part of **Netpbm** portable image format family.

# SEE ALSO

[pnm](/man/pnm)(5), [pgm](/man/pgm)(5), [pbm](/man/pbm)(5), [pamfile](/man/pamfile)(1)

