# TLDR

**Convert PNM to JPEG**

```pnmtojpeg [input.pnm] > [output.jpg]```

**Convert with quality**

```pnmtojpeg -quality [85] [input.pnm] > [output.jpg]```

**Create progressive JPEG**

```pnmtojpeg -progressive [input.pnm] > [output.jpg]```

**Optimize Huffman tables**

```pnmtojpeg -optimize [input.pnm] > [output.jpg]```

# SYNOPSIS

**pnmtojpeg** [_options_] [_file_]

# PARAMETERS

**-quality** _n_
> Quality (0-100, default 75).

**-progressive**
> Create progressive JPEG.

**-optimize**
> Optimize Huffman tables.

**-grayscale**
> Force grayscale output.

**-baseline**
> Force baseline JPEG.

# DESCRIPTION

**pnmtojpeg** converts PNM images to JPEG format. Part of Netpbm toolkit. Supports quality control, progressive encoding, and optimization.

# SEE ALSO

[jpegtopnm](/man/jpegtopnm)(1), [pnmtopng](/man/pnmtopng)(1)

