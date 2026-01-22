# TLDR

Calculate **difference** between images

```diffimg [path/to/image1.ext] [path/to/image2.ext] [path/to/output.ext]```

# SYNOPSIS

**diffimg** _image1_ _image2_ _output_

# DESCRIPTION

**diffimg** calculates the intersection between two images. It outputs an image where each pixel represents the difference between corresponding pixels in the input images.

Useful for visual regression testing, comparing screenshots, and image analysis.

# PARAMETERS

_image1_
> First input image

_image2_
> Second input image

_output_
> Output difference image

# SUPPORTED FORMATS

Supports .png, .gif, .jpg, and .ps image formats.

# CAVEATS

Images should be the same size for meaningful comparison. Output shows pixel differences, not perceptual differences.

# SEE ALSO

[compare](/man/compare)(1), [diff](/man/diff)(1)
