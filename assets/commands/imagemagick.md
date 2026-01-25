# TLDR

**Convert image format**

```convert [input.png] [output.jpg]```

**Resize image**

```convert [input.jpg] -resize [800x600] [output.jpg]```

**Create thumbnail**

```convert [input.jpg] -thumbnail [150x150^] -gravity center -extent [150x150] [thumb.jpg]```

**Add text watermark**

```convert [input.jpg] -gravity south -annotate +0+10 "[Copyright]" [output.jpg]```

**Combine images horizontally**

```convert [a.jpg] [b.jpg] +append [combined.jpg]```

**Create GIF from images**

```convert -delay [100] [*.png] [animation.gif]```

**Identify image info**

```identify [image.jpg]```

# SYNOPSIS

**convert** [_options_] _input_ [_operations_] _output_

**identify** [_options_] _image_

**mogrify** [_options_] _images_

# PARAMETERS

**-resize** _geometry_
> Resize image.

**-crop** _geometry_
> Crop image.

**-rotate** _degrees_
> Rotate image.

**-quality** _value_
> JPEG/PNG quality (1-100).

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
> Set resolution.

# DESCRIPTION

**ImageMagick** is a suite of tools for image manipulation. It can convert, resize, crop, rotate, combine, and apply effects to images in over 200 formats.

Key tools: **convert** (transform), **identify** (info), **mogrify** (in-place edit), **composite** (combine), **montage** (collage).

# CAVEATS

Memory-intensive for large images. Security policy may restrict some operations. Syntax can be complex. convert renamed to magick in v7.

# HISTORY

ImageMagick was created by **John Cristy** in **1987** at DuPont. It's been continuously developed and remains the most widely used command-line image processing toolkit.

# SEE ALSO

[convert](/man/convert)(1), [identify](/man/identify)(1), [mogrify](/man/mogrify)(1), [ffmpeg](/man/ffmpeg)(1)
