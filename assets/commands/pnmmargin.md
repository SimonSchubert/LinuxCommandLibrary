# TLDR

**Add border around image**

```pnmmargin [10] [input.pnm] > [output.pnm]```

**Add colored border**

```pnmmargin -color [blue] [20] [input.pnm] > [output.pnm]```

# SYNOPSIS

**pnmmargin** [_options_] _size_ [_file_]

# PARAMETERS

_size_
> Border width in pixels.

**-color** _color_
> Border color.

**-white**
> White border.

**-black**
> Black border.

# DESCRIPTION

**pnmmargin** adds a solid color border around a PNM image. Part of Netpbm toolkit.

# SEE ALSO

[pnmpad](/man/pnmpad)(1), [pamcut](/man/pamcut)(1)

