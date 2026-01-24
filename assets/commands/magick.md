# TLDR

**Convert image format**

```magick [input.png] [output.jpg]```

**Resize image**

```magick [input.jpg] -resize [800x600] [output.jpg]```

**Create thumbnail**

```magick [input.jpg] -thumbnail [100x100] [thumb.jpg]```

**Rotate image**

```magick [input.jpg] -rotate [90] [output.jpg]```

**Add text watermark**

```magick [input.jpg] -gravity south -annotate +0+10 "[text]" [output.jpg]```

**Batch convert**

```magick mogrify -format jpg [*.png]```

**Create montage**

```magick montage [*.jpg] -geometry +2+2 [montage.jpg]```

# SYNOPSIS

**magick** [_options_] _input_ [_operations_] _output_

# DESCRIPTION

**magick** is the primary command for ImageMagick 7+, replacing separate commands like convert, mogrify, and identify. It performs image manipulation including format conversion, resizing, and compositing.

The tool supports over 200 image formats and provides extensive transformation capabilities.

# PARAMETERS

**-resize** _geometry_
> Resize image.

**-crop** _geometry_
> Crop image.

**-rotate** _degrees_
> Rotate image.

**-flip**
> Flip vertically.

**-flop**
> Flip horizontally.

**-quality** _n_
> JPEG/PNG quality.

**-strip**
> Remove metadata.

**-colorspace** _space_
> Convert colorspace.

**-density** _dpi_
> Set resolution.

**-gravity** _type_
> Positioning reference.

**-annotate** _+x+y_ _text_
> Add text.

**-composite**
> Combine images.

# CAVEATS

Complex operations need quoting. Large images use much memory. Some formats have limitations. PDF support may need Ghostscript.

# HISTORY

**ImageMagick** was created by **John Cristy** in **1987**. The magick command was introduced in ImageMagick 7 (2016) to unify the various utility commands under a single interface.

# SEE ALSO

[convert](/man/convert)(1), [identify](/man/identify)(1), [mogrify](/man/mogrify)(1), [montage](/man/montage)(1)
