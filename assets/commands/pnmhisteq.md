# TLDR

**Equalize histogram**

```pnmhisteq [input.pnm] > [output.pnm]```

**Verbose output**

```pnmhisteq -verbose [input.pnm] > [output.pnm]```

**Equalize grayscale**

```ppmtopgm [input.ppm] | pnmhisteq > [output.pgm]```

# SYNOPSIS

**pnmhisteq** [_options_] [_pnmfile_]

# PARAMETERS

**-gray**
> Equalize on gray value.

**-verbose**
> Print information.

# DESCRIPTION

**pnmhisteq** performs histogram equalization on a PNM image. This process spreads out the most frequent intensity values, improving contrast in images with clustered brightness levels.

Part of Netpbm toolkit for image enhancement.

# EXAMPLES

```bash
# Basic histogram equalization
pnmhisteq photo.pgm > enhanced.pgm

# Color image via grayscale
jpegtopnm photo.jpg | pnmhisteq > enhanced.ppm

# Chain with conversion
pnmhisteq dark.pgm | pnmtopng > enhanced.png
```

# ALGORITHM

Histogram equalization maps input intensities to output intensities so that the output histogram is approximately uniform. This maximizes image contrast.

# CAVEATS

May increase noise in uniform areas. Results depend on image content. Better for grayscale than color images.

# HISTORY

pnmhisteq is part of **Netpbm** by **Jef Poskanzer** and contributors, implementing classic histogram equalization.

# SEE ALSO

[pgmhist](/man/pgmhist)(1), [pnmnorm](/man/pnmnorm)(1), [pgmenhance](/man/pgmenhance)(1), [netpbm](/man/netpbm)(1)
