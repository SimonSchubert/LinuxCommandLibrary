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

**Search for a subimage** within a larger image

```magick compare -subimage-search [haystack.png] [needle.png] [result.png]```

**Print detailed per-channel** distortion stats

```magick compare -verbose -metric AE [image1.png] [image2.png] null:```

# SYNOPSIS

**magick** **compare** [_options_] _image1_ _image2_ [_diff_]

# PARAMETERS

**-metric** _type_
> Comparison metric (AE, RMSE, PSNR, MAE, MSE, NCC, PHASH, DSSIM). Default: RMSE.

**-highlight-color** _color_
> Color used to mark differing pixels.

**-lowlight-color** _color_
> Color used for matching pixels.

**-fuzz** _percent_
> Color tolerance for comparison.

**-subimage-search**
> Search for the smaller image inside the larger.

**-dissimilarity-threshold** _value_
> Maximum permitted distortion for a match (default: 0.2).

**-similarity-threshold** _value_
> Minimum distortion considered similar (default: 0.0).

**-channel** _type_
> Restrict comparison to specified channels.

**-verbose**
> Print per-channel distortion metrics.

# DESCRIPTION

**magick compare** compares two images and outputs their differences. Part of ImageMagick. Produces a difference image and/or calculates numerical metrics. Useful for regression testing and quality assurance.

# SEE ALSO

[magick](/man/magick)(1), [magick-convert](/man/magick-convert)(1)

