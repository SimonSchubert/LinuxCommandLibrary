# TAGLINE

converts PGM grayscale images to PBM bitmap

# TLDR

**Convert grayscale to bitmap using default Floyd-Steinberg dithering**

```pgmtopbm [input.pgm] > [output.pbm]```

**Convert with explicit Floyd-Steinberg dithering**

```pgmtopbm -fs [input.pgm] > [output.pbm]```

**Convert with simple threshold**

```pgmtopbm -threshold -value [0.5] [input.pgm] > [output.pbm]```

**Convert with clustered dithering**

```pgmtopbm -cluster3 [input.pgm] > [output.pbm]```

# SYNOPSIS

**pgmtopbm** [**-floyd** | **-fs** | **-threshold** | **-hilbert** | **-dither8** | **-d8** | **-cluster3** | **-c3** | **-cluster4** | **-c4** | **-cluster8** | **-c8**] [**-value** _val_] [**-clump** _size_] [**-randomseed** _integer_] [_pgmfile_]

# PARAMETERS

**-floyd**, **-fs**
> Floyd-Steinberg dithering (default).

**-threshold**
> Simple threshold conversion. Pixels above the threshold become white; below become black.

**-value** _val_
> Threshold value between 0.0 and 1.0. Default is 0.5. Used with **-threshold**.

**-hilbert**
> Hilbert curve dithering.

**-dither8**, **-d8**
> Ordered dithering using an 8x8 matrix.

**-cluster3**, **-c3**
> Clustered dithering using a 3x3 pattern.

**-cluster4**, **-c4**
> Clustered dithering using a 4x4 pattern.

**-cluster8**, **-c8**
> Clustered dithering using an 8x8 pattern.

**-clump** _size_
> Clump size for Hilbert curve dithering.

**-randomseed** _integer_
> Seed for randomization to produce reproducible results.

# DESCRIPTION

**pgmtopbm** converts PGM grayscale images to PBM bitmap format. It uses dithering or thresholding to create 1-bit output from grayscale input. Part of the Netpbm toolkit. This tool is largely obsolete since Netpbm 10.23 (July 2004); [pamditherbw](/man/pamditherbw)(1) is the recommended replacement with better gamma handling.

# SEE ALSO

[pbmtopgm](/man/pbmtopgm)(1), [pamditherbw](/man/pamditherbw)(1), [pgmtoppm](/man/pgmtoppm)(1)

