# TLDR

**Convert PNM to Palm image**

```pnmtopalm [input.pnm] > [output.palm]```

**Specify color depth**

```pnmtopalm -depth [8] [input.pnm] > [output.palm]```

# SYNOPSIS

**pnmtopalm** [_options_] [_file_]

# PARAMETERS

**-depth** _n_
> Bits per pixel (1, 2, 4, 8, 16).

**-maxdepth** _n_
> Maximum color depth.

**-colormap**
> Use custom colormap.

# DESCRIPTION

**pnmtopalm** converts PNM images to Palm Pilot image format. Part of Netpbm toolkit.

# SEE ALSO

[palmtopnm](/man/palmtopnm)(1), [pnmtopng](/man/pnmtopng)(1)

