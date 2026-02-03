# TLDR

**Convert image format**

```magick convert [input.png] [output.jpg]```

**Resize image**

```magick convert [input.png] -resize [800x600] [output.png]```

**Change quality**

```magick convert [input.png] -quality [85] [output.jpg]```

**Convert to grayscale**

```magick convert [input.png] -colorspace Gray [output.png]```

**Rotate image**

```magick convert [input.png] -rotate [90] [output.png]```

**Add border**

```magick convert [input.png] -border [10x10] -bordercolor black [output.png]```

# SYNOPSIS

**magick** **convert** [_options_] _input_ _output_

# PARAMETERS

**-resize** _geometry_
> Resize image.

**-quality** _value_
> JPEG/PNG quality (1-100).

**-colorspace** _type_
> Convert color space.

**-rotate** _degrees_
> Rotate image.

**-crop** _geometry_
> Crop image.

**-border** _geometry_
> Add border.

**-flip**
> Flip vertically.

**-flop**
> Flip horizontally.

# DESCRIPTION

**magick convert** converts between image formats and applies transformations. Part of ImageMagick. Supports hundreds of formats including PNG, JPEG, GIF, TIFF, PDF, and WebP. Provides extensive image manipulation capabilities.

# SEE ALSO

[magick](/man/magick)(1), [magick-mogrify](/man/magick-mogrify)(1)

