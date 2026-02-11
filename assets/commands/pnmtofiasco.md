# TAGLINE

Convert PNM to FIASCO wavelet format

# TLDR

**Convert PNM to FIASCO format**

```pnmtofiasco [input.pnm] -o [output.fco]```

**Specify quality**

```pnmtofiasco -q [50] [input.pnm] -o [output.fco]```

# SYNOPSIS

**pnmtofiasco** [_options_] [_file_]

# PARAMETERS

**-o** _file_
> Output filename.

**-q** _n_
> Quality level (1-100).

# DESCRIPTION

**pnmtofiasco** converts PNM images to FIASCO (Fractal Image And Sequence Codec) wavelet-based compression format. Part of Netpbm toolkit.

# SEE ALSO

[fiascotopnm](/man/fiascotopnm)(1), [pnmtojpeg](/man/pnmtojpeg)(1)

