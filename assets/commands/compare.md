# TAGLINE

image difference detection and comparison

# TLDR

**Compare two images**

```compare [image1.png] [image2.png] [diff.png]```

**Highlight differences** in red

```compare -highlight-color red [image1.png] [image2.png] [diff.png]```

**Get difference metric**

```compare -metric AE [image1.png] [image2.png] null:```

**Compare with fuzz factor** (tolerance)

```compare -fuzz [5]% [image1.png] [image2.png] [diff.png]```

**Output only difference** regions

```compare -compose src [image1.png] [image2.png] [diff.png]```

**Use specific channel**

```compare -channel red [image1.png] [image2.png] [diff.png]```

# SYNOPSIS

**compare** [_options_] _image1_ _image2_ [_difference_]

# DESCRIPTION

**compare** is an ImageMagick utility that compares two images and highlights the differences. It can output a visual difference image and/or calculate numeric difference metrics.

The tool is useful for visual regression testing, detecting changes in rendered output, and quality assurance workflows. Various metrics quantify the difference between images.

# PARAMETERS

**-metric** _type_
> Output difference metric (AE, RMSE, MAE, PSNR, etc.).

**-fuzz** _percent_
> Allow color tolerance for comparison.

**-highlight-color** _color_
> Color to use for highlighting differences.

**-lowlight-color** _color_
> Color for matching areas.

**-compose** _method_
> Composition method for difference output.

**-channel** _type_
> Compare specific color channel.

**-subimage-search**
> Search for subimage in larger image.

**-dissimilarity-threshold** _value_
> Threshold for subimage matching.

# METRICS

**AE**: Absolute Error (pixel count)
**RMSE**: Root Mean Square Error
**MAE**: Mean Absolute Error
**PSNR**: Peak Signal to Noise Ratio
**SSIM**: Structural Similarity Index

# CAVEATS

Images must be same dimensions unless using subimage search. Large images can be slow to compare. Lossy formats may show differences from compression.

# HISTORY

**compare** is part of **ImageMagick**, created by **John Cristy** in **1987**. ImageMagick has been continuously developed for image manipulation and conversion. The compare tool became essential for automated visual testing in software development.

# SEE ALSO

[magick](/man/magick)(1), [convert](/man/convert)(1), [identify](/man/identify)(1), [diff](/man/diff)(1)
