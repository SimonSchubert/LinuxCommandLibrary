# TLDR

**Convert PPM to JPEG**

```ppmtojpeg [input.ppm] > [output.jpg]```

**Convert with quality**

```ppmtojpeg -quality [90] [input.ppm] > [output.jpg]```

**Create progressive JPEG**

```ppmtojpeg -progressive [input.ppm] > [output.jpg]```

# SYNOPSIS

**ppmtojpeg** [_options_] [_file_]

# PARAMETERS

**-quality** _n_
> Quality (0-100).

**-progressive**
> Progressive JPEG.

**-optimize**
> Optimize encoding.

# DESCRIPTION

**ppmtojpeg** converts PPM images to JPEG format. Alias for pnmtojpeg. Part of Netpbm toolkit for image conversion.

# SEE ALSO

[pnmtojpeg](/man/pnmtojpeg)(1), [jpegtopnm](/man/jpegtopnm)(1)

