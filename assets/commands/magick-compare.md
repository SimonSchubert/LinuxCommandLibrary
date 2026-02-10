# TAGLINE

compares two images and outputs their differences

# TLDR

**Compare two images**

```magick compare [image1.png] [image2.png] [diff.png]```

**Calculate difference metric**

```magick compare -metric AE [image1.png] [image2.png] null:```

**Use specific comparison method**

```magick compare -metric RMSE [image1.png] [image2.png] null:```

**Highlight differences in red**

```magick compare -highlight-color red [image1.png] [image2.png] [diff.png]```

# SYNOPSIS

**magick** **compare** [_options_] _image1_ _image2_ [_diff_]

# PARAMETERS

**-metric** _type_
> Comparison metric (AE, RMSE, PSNR, MAE).

**-highlight-color** _color_
> Color for highlighting differences.

**-lowlight-color** _color_
> Color for similar areas.

**-fuzz** _percent_
> Color tolerance for comparison.

# DESCRIPTION

**magick compare** compares two images and outputs their differences. Part of ImageMagick. Produces a difference image and/or calculates numerical metrics. Useful for regression testing and quality assurance.

# SEE ALSO

[magick](/man/magick)(1), [magick-convert](/man/magick-convert)(1)

