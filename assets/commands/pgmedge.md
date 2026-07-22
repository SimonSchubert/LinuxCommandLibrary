# TAGLINE

detects edges in a PGM grayscale image using the Sobel edge detection algorithm

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

**pgmedge** detects edges in a PGM grayscale image using the Sobel edge detection algorithm. Output is a PGM where bright pixels indicate strong edges.

The algorithm computes the horizontal and vertical image gradients using Sobel kernels and combines them, producing a single intensity per pixel proportional to the local gradient magnitude.

# CAVEATS

Input must be a grayscale PGM. Convert color images with **ppmtopgm** first. **pgmedge** is the legacy tool — **pamedge** offers more options including thresholding and direction output.

# HISTORY

pgmedge is part of **Netpbm** by **Jef Poskanzer** and contributors, implementing classic image processing algorithms.

# INSTALL

```apt: sudo apt install netpbm```

```dnf: sudo dnf install netpbm```

```pacman: sudo pacman -S netpbm```

```apk: sudo apk add netpbm```

```zypper: sudo zypper install netpbm```

```brew: brew install netpbm```

```nix: nix profile install nixpkgs#netpbm```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pamedge](/man/pamedge)(1), [pgmenhance](/man/pgmenhance)(1), [ppmtopgm](/man/ppmtopgm)(1), [netpbm](/man/netpbm)(1)
