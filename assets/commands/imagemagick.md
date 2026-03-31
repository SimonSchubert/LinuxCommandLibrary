# TAGLINE

suite of tools for image manipulation

# TLDR

**Convert image format** (v7 syntax)

```magick [input.png] [output.jpg]```

**Resize image**

```magick [input.jpg] -resize [800x600] [output.jpg]```

**Create thumbnail**

```magick [input.jpg] -thumbnail [150x150^] -gravity center -extent [150x150] [thumb.jpg]```

**Add text watermark**

```magick [input.jpg] -gravity south -annotate +0+10 "[Copyright]" [output.jpg]```

**Combine images horizontally**

```magick [a.jpg] [b.jpg] +append [combined.jpg]```

**Create GIF from images**

```magick -delay [100] [*.png] [animation.gif]```

**Identify image info**

```magick identify [image.jpg]```

**Batch convert all PNGs to JPEGs** in the current directory

```magick mogrify -format jpg [*.png]```

# SYNOPSIS

**magick** [_input_] [_operations_] _output_

**magick identify** [_options_] _image_

**magick mogrify** [_options_] _images_

# PARAMETERS

**-resize** _geometry_
> Resize image.

**-crop** _geometry_
> Crop image.

**-rotate** _degrees_
> Rotate image.

**-quality** _value_
> Compression quality (JPEG: 1-100, PNG: 0-9 for zlib compression level).

**-gravity** _type_
> Anchor point for operations.

**-annotate** _geometry_ _text_
> Add text annotation.

**-blur** _radius_
> Apply blur.

**-sharpen** _radius_
> Sharpen image.

**-colorspace** _type_
> Convert colorspace.

**-density** _value_
> Set resolution (DPI).

**-strip**
> Remove all metadata and profiles from image.

**-format** _type_
> Set the output image format.

# DESCRIPTION

**ImageMagick** is a suite of tools for image manipulation. It can convert, resize, crop, rotate, combine, and apply effects to images in over 200 formats.

Key tools: **magick** (transform, replaces convert in v7), **identify** (info), **mogrify** (in-place edit), **composite** (combine), **montage** (collage). In v7, all subcommands are invoked via `magick` (e.g., `magick identify`, `magick mogrify`).

# CAVEATS

Memory-intensive for large images. The default security policy (policy.xml) may restrict some operations and file formats. In v7, the `convert` command is deprecated in favor of `magick`; legacy v6 syntax still works but emits warnings.

# HISTORY

ImageMagick was created by **John Cristy** in **1987** at DuPont. It's been continuously developed and remains the most widely used command-line image processing toolkit.

# SEE ALSO

[magick](/man/magick)(1), [convert](/man/convert)(1), [identify](/man/identify)(1), [mogrify](/man/mogrify)(1), [composite](/man/composite)(1), [montage](/man/montage)(1), [ffmpeg](/man/ffmpeg)(1)
