# TLDR

**Calculate image texture measures**

```pgmtexture [input.pgm]```

**Specify distance**

```pgmtexture -d [1] [input.pgm]```

# SYNOPSIS

**pgmtexture** [_options_] [_file_]

# PARAMETERS

**-d** _n_
> Distance for co-occurrence matrix.

# DESCRIPTION

**pgmtexture** calculates Haralick texture features from a PGM image using gray level co-occurrence matrices. Outputs statistical measures for texture analysis. Part of Netpbm toolkit.

# SEE ALSO

[pgmhist](/man/pgmhist)(1), [pgmkernel](/man/pgmkernel)(1)

