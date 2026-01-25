# TLDR

**Detect edges in image**

```pgmedge [input.pgm] > [output.pgm]```

**From another format**

```jpegtopnm [image.jpg] | ppmtopgm | pgmedge > [edges.pgm]```

**Chain with conversion**

```pgmedge [input.pgm] | pnmtopng > [edges.png]```

# SYNOPSIS

**pgmedge** [_pgmfile_]

# PARAMETERS

**pgmfile**
> Input PGM file. Uses stdin if not specified.

# DESCRIPTION

**pgmedge** detects edges in a PGM grayscale image using the Sobel edge detection algorithm. Output is a PGM where bright pixels indicate edges.

Part of the Netpbm toolkit for image processing.

# EXAMPLES

```bash
# Basic edge detection
pgmedge photo.pgm > edges.pgm

# From JPEG
jpegtopnm photo.jpg | ppmtopgm | pgmedge > edges.pgm

# Complete pipeline
jpegtopnm photo.jpg | ppmtopgm | pgmedge | pnmtopng > edges.png
```

# ALGORITHM

Uses Sobel operator:
- Computes horizontal and vertical gradients
- Combines to detect edges
- Brighter output = stronger edge

# CAVEATS

Input must be grayscale PGM. For color images, convert first with ppmtopgm. Consider pamedge for more options.

# HISTORY

pgmedge is part of **Netpbm** by **Jef Poskanzer** and contributors, implementing classic image processing algorithms.

# SEE ALSO

[pamedge](/man/pamedge)(1), [pgmenhance](/man/pgmenhance)(1), [ppmtopgm](/man/ppmtopgm)(1), [netpbm](/man/netpbm)(1)
