# TLDR

**Convert image to PDF**

```sam2p [input.png] [output.pdf]```

**Convert to EPS**

```sam2p [input.png] [output.eps]```

**Convert with compression**

```sam2p -c:zip [input.png] [output.pdf]```

**Convert to grayscale**

```sam2p -c:gray [input.png] [output.pdf]```

# SYNOPSIS

**sam2p** [_options_] _input_ _output_

# PARAMETERS

**-c:** _method_
> Compression (none, zip, lzw, jpeg, fax, gray).

**-j:** _quality_
> JPEG quality.

**-m:** _mask_
> Transparency mask.

**-p** _pagesize_
> Page size (a4, letter).

**-o:** _option_
> Output options.

# DESCRIPTION

**sam2p** converts raster images to PDF, EPS, or PS with minimal size. Optimizes images for document embedding. Supports various compression methods and transparency.

# SEE ALSO

[convert](/man/convert)(1), [img2pdf](/man/img2pdf)(1)

