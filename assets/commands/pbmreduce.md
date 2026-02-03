# TLDR

**Reduce bitmap by factor**

```pbmreduce [4] [input.pbm] > [output.pbm]```

**Reduce with Floyd-Steinberg dithering**

```pbmreduce -floyd [4] [input.pbm] > [output.pbm]```

# SYNOPSIS

**pbmreduce** [_options_] _n_ [_file_]

# PARAMETERS

_n_
> Reduction factor.

**-floyd**
> Use Floyd-Steinberg dithering.

**-threshold**
> Use simple threshold (default).

# DESCRIPTION

**pbmreduce** reduces PBM bitmap size by an integer factor. Can use threshold or dithering for the reduction. Part of Netpbm toolkit.

# SEE ALSO

[pbmpscale](/man/pbmpscale)(1), [pamscale](/man/pamscale)(1)

