# TAGLINE

Portable Bitmap (PBM) image file format

# TLDR

**Inspect a PBM file's** dimensions and type

```pnmfile [image.pbm]```

**Convert a PBM to ASCII art**

```pbmtoascii [image.pbm]```

**Convert any image to PBM** (1-bit)

```anytopnm [input] | pamditherbw | pnmtopnm > [output.pbm]```

**Convert PBM to PNG**

```pnmtopng [image.pbm] > [image.png]```

# SYNOPSIS

The PBM format is read and written by the **pbm*** tools in the **Netpbm** package.

# DESCRIPTION

**PBM** (Portable Bitmap) is the simplest of the Netpbm formats, storing 1-bit (black-and-white) raster images. It comes in two variants: a plain ASCII form (magic number **P1**) and a binary form (magic number **P4**). The header records the format, width, and height; pixel data follows, with **0** representing white and **1** representing black.

PBM is a lossless format intended as a least-common-denominator for image processing pipelines: nearly every Netpbm utility can read and write it, making it useful as an intermediate format when chaining conversion tools.

# CAVEATS

Stores only black and white (1 bit per pixel); for grayscale use PGM and for color use PPM. The binary form is more compact but the ASCII form is human-readable. Files have no compression, so they can be much larger than equivalent PNGs.

# HISTORY

PBM originated in **Jef Poskanzer's** PBMplus toolkit in **1988** and is now maintained as part of the **Netpbm** project.

# INSTALL

```nix: nix profile install nixpkgs#pbm```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pgm](/man/pgm)(5), [ppm](/man/ppm)(5), [pnm](/man/pnm)(5), [netpbm](/man/netpbm)(1), [pnmtopng](/man/pnmtopng)(1)

