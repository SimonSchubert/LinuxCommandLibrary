# TAGLINE

displays information about image files

# TLDR

**Show image information**

```magick identify [image.png]```

**Show verbose information**

```magick identify -verbose [image.png]```

**Show specific property**

```magick identify -format "%wx%h" [image.png]```

**Show all images in directory**

```magick identify [*.jpg]```

# SYNOPSIS

**magick** **identify** [_options_] _image_...

# PARAMETERS

**-verbose**
> Show detailed information.

**-format** _string_
> Output format string.

**-quiet**
> Suppress warnings.

**-ping**
> Only read basic attributes.

# DESCRIPTION

**magick identify** displays information about image files. Part of ImageMagick. Shows format, dimensions, color space, file size, and other metadata. Supports format strings for custom output.

# SEE ALSO

[magick](/man/magick)(1), [file](/man/file)(1)

