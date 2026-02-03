# TLDR

**Convert HIPS file to PGM**

```hipstopgm [file.hip] > [output.pgm]```

**Convert from stdin**

```cat [file.hip] | hipstopgm > [output.pgm]```

# SYNOPSIS

**hipstopgm** [_hipsfile_]

# DESCRIPTION

**hipstopgm** converts a HIPS (Human Information Processing Laboratory) image file to PGM (Portable Graymap) format. Part of the Netpbm package of graphics manipulation tools. If the HIPS file contains multiple frames, they are concatenated vertically in the output.

# SEE ALSO

[pgmtoppm](/man/pgmtoppm)(1), [ppmtogif](/man/ppmtogif)(1), [netpbm](/man/netpbm)(1)

