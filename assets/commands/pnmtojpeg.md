# TAGLINE

Convert PNM images to JPEG format

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

**pnmtojpeg** converts PNM (PBM, PGM, PPM) images to JPEG/JFIF format. The **-quality** option controls the compression-to-quality tradeoff, with higher values producing larger files with better image quality.

The **-progressive** option creates progressive JPEGs that render in increasing detail during loading. The **-optimize** flag reduces file size by computing optimal Huffman coding tables. The **-grayscale** option forces single-channel output even for color inputs. Part of the Netpbm toolkit.

# SEE ALSO

[jpegtopnm](/man/jpegtopnm)(1), [pnmtopng](/man/pnmtopng)(1)

