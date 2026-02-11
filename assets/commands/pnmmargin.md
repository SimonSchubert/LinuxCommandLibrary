# TAGLINE

Add solid color borders to PNM images

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

**pnmmargin** adds a uniform solid-color border around all four sides of a PNM image. The border width is specified in pixels and is applied equally on all sides.

By default the border color is white. Use **-color** to specify a custom color, or the shortcuts **-white** and **-black** for common choices. This is a convenience wrapper around pnmpad. Part of the Netpbm toolkit.

# SEE ALSO

[pnmpad](/man/pnmpad)(1), [pamcut](/man/pamcut)(1)

