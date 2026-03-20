# TAGLINE

converts between image formats and applies transformations

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

**-strip**
> Remove metadata (EXIF, profiles).

**-density** _DPI_
> Set image resolution.

**-gravity** _type_
> Set placement gravity (Center, NorthWest, etc.).

**-compose** _operator_
> Set image composite operator.

**-extent** _geometry_
> Set image size, padding with background color if needed.

**-background** _color_
> Set background color.

**-alpha** _type_
> Activate, deactivate, or reset alpha channel (on, off, remove, set).

**-auto-orient**
> Auto-rotate image based on EXIF orientation.

# DESCRIPTION

**magick convert** converts between image formats and applies transformations as part of the **ImageMagick** suite. It supports hundreds of formats including PNG, JPEG, GIF, TIFF, PDF, SVG, and WebP.

Operations can be chained on a single command line, applying multiple transformations in sequence. The tool reads the input image, applies all specified operations in order, and writes the result to the output file. The output format is determined by the file extension.

# CAVEATS

In ImageMagick 7, the standalone `convert` command is deprecated in favor of `magick convert` or simply `magick`. For new work, use `magick` directly. Memory usage can be high for large images. PDF operations require Ghostscript. The `-limit` option can restrict memory, disk, and other resources.

# HISTORY

**ImageMagick** was created by **John Cristy** in **1987** at DuPont. The convert command has been the primary image conversion tool throughout its history.

# SEE ALSO

[magick](/man/magick)(1), [magick-mogrify](/man/magick-mogrify)(1)

