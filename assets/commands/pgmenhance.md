# TAGLINE

Edge-enhance a PGM grayscale image

# TLDR

**Enhance image sharpness** with default intensity (9)

```pgmenhance [input.pgm] > [output.pgm]```

**Enhance with custom intensity** (1 = lowest, 9 = highest)

```pgmenhance -[3] [input.pgm] > [output.pgm]```

**Read from stdin**

```cat [input.pgm] | pgmenhance -[5] > [output.pgm]```

# SYNOPSIS

**pgmenhance** [_-N_] [_pgmfile_]

# PARAMETERS

**-** _N_
> Enhancement intensity from **1** (lowest) to **9** (highest). Default is **9**.

# DESCRIPTION

**pgmenhance** reads a PGM image as input, enhances the edges, and writes a PGM image as output. The enhancement technique is derived from Philip R. Thompson's **xim** program. Part of the **Netpbm** toolkit.

# SEE ALSO

[pgmnorm](/man/pgmnorm)(1), [pgmedge](/man/pgmedge)(1), [pamedge](/man/pamedge)(1)

