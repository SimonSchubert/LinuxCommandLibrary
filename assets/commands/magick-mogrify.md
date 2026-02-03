# TLDR

**Resize images in place**

```magick mogrify -resize [800x600] [*.jpg]```

**Convert format in place**

```magick mogrify -format png [*.jpg]```

**Change quality of all JPEGs**

```magick mogrify -quality [85] [*.jpg]```

**Rotate images**

```magick mogrify -rotate [90] [*.png]```

**Strip metadata**

```magick mogrify -strip [*.jpg]```

# SYNOPSIS

**magick** **mogrify** [_options_] _image_...

# PARAMETERS

**-resize** _geometry_
> Resize images.

**-format** _format_
> Convert to format.

**-quality** _value_
> Set output quality.

**-rotate** _degrees_
> Rotate images.

**-strip**
> Remove metadata.

**-path** _dir_
> Output directory.

# DESCRIPTION

**magick mogrify** modifies images in place. Part of ImageMagick. Unlike convert, mogrify operates directly on files. Use -path to save to different directory. Efficient for batch processing.

# CAVEATS

Modifies files in place by default. Use -path to preserve originals.

# SEE ALSO

[magick](/man/magick)(1), [magick-convert](/man/magick-convert)(1)

