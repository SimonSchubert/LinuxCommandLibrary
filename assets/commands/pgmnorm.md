# TAGLINE

Normalize the contrast in a Netpbm image

# TLDR

**Normalize image contrast**

```pgmnorm [input.pgm] > [output.pgm]```

**Normalize with custom percentile cutoffs**

```pgmnorm -bpercent [2] -wpercent [1] [input.pgm] > [output.pgm]```

**Specify exact pixel values for black and white mapping**

```pgmnorm -bvalue [30] -wvalue [220] [input.pgm] > [output.pgm]```

**Normalize while preserving hues** in color images

```pgmnorm -keephues [input.ppm] > [output.ppm]```

# SYNOPSIS

**pgmnorm** [_options_] [_file_]

# PARAMETERS

**-bpercent** _n_
> Percentage of darkest pixels to map to black. Default: 2.

**-wpercent** _n_
> Percentage of lightest pixels to map to white. Default: 1.

**-bvalue** _n_
> Exact pixel value to map to black (overrides -bpercent if it produces less change).

**-wvalue** _n_
> Exact pixel value to map to white (overrides -wpercent if it produces less change).

**-keephues**
> Keep each pixel the same hue; only adjust brightness. Without this, components are normalized independently, which may shift hues.

**-brightmax**
> Use the most intense RGB component as the pixel's brightness instead of luminosity.

# DESCRIPTION

**pgmnorm** reads a PNM image (PBM, PGM, or PPM), normalizes the contrast by forcing the darkest pixels to black and the lightest pixels to white, and linearly rescales the values in between. It outputs the same kind of image. This is an older name for **pnmnorm**.

By default, the darkest 2 percent of pixels are mapped to black and the lightest 1 percent to white. These thresholds can be changed with **-bpercent** and **-wpercent**, or exact cutoff values can be specified with **-bvalue** and **-wvalue**. If both percentage and value options are given for the same end, the one producing the least change is used.

Part of the **Netpbm** toolkit.

# SEE ALSO

[pnmnorm](/man/pnmnorm)(1), [pgmhist](/man/pgmhist)(1), [pnmhisteq](/man/pnmhisteq)(1), [pgmenhance](/man/pgmenhance)(1)

