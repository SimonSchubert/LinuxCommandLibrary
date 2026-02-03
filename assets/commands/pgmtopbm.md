# TLDR

**Convert grayscale to bitmap**

```pgmtopbm [input.pgm] > [output.pbm]```

**Convert with dithering**

```pgmtopbm -fs [input.pgm] > [output.pbm]```

**Convert with threshold**

```pgmtopbm -threshold -value [0.5] [input.pgm] > [output.pbm]```

# SYNOPSIS

**pgmtopbm** [_options_] [_file_]

# PARAMETERS

**-fs**
> Floyd-Steinberg dithering.

**-threshold**
> Simple threshold conversion.

**-value** _n_
> Threshold value.

**-hilbert**
> Hilbert curve dithering.

# DESCRIPTION

**pgmtopbm** converts PGM grayscale images to PBM bitmap. Uses dithering or thresholding to create 1-bit output. Part of Netpbm toolkit.

# SEE ALSO

[pbmtopgm](/man/pbmtopgm)(1), [pamditherbw](/man/pamditherbw)(1)

