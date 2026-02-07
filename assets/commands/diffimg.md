# TAGLINE

pixel-level image difference calculator

# TLDR

Calculate **difference** between images

```diffimg [path/to/image1.ext] [path/to/image2.ext] [path/to/output.ext]```

# SYNOPSIS

**diffimg** _image1_ _image2_ _output_

# DESCRIPTION

**diffimg** calculates pixel-level differences between two images by comparing corresponding pixels and generating a difference image. Each pixel in the output represents the delta between the input images at that position, making visual changes immediately apparent.

The tool performs per-pixel subtraction or comparison operations, highlighting areas where images differ. This is valuable for visual regression testing in web development, where screenshots of UI components can be compared across code changes to detect unintended visual modifications.

Common use cases include comparing rendered output before and after changes, detecting image manipulation, and automated quality assurance for graphics pipelines. The tool supports multiple image formats including PNG, JPEG, GIF, and PostScript.

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
