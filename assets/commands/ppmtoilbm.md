# TLDR

**Convert PPM to IFF ILBM format**

```ppmtoilbm [input.ppm] > [output.ilbm]```

**Specify bit planes**

```ppmtoilbm -planes [8] [input.ppm] > [output.ilbm]```

# SYNOPSIS

**ppmtoilbm** [_options_] [_file_]

# PARAMETERS

**-planes** _n_
> Number of bit planes.

**-ham6**
> Use HAM6 mode.

**-ham8**
> Use HAM8 mode.

# DESCRIPTION

**ppmtoilbm** converts PPM images to IFF ILBM (Interleaved Bitmap) format used by Amiga computers. Supports HAM (Hold-And-Modify) modes. Part of Netpbm toolkit.

# SEE ALSO

[ilbmtoppm](/man/ilbmtoppm)(1), [ppmtoneo](/man/ppmtoneo)(1)

