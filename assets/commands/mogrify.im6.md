# TLDR

**Resize images in place**

```mogrify.im6 -resize [800x600] [*.jpg]```

**Convert format**

```mogrify.im6 -format [png] [*.jpg]```

**Rotate images**

```mogrify.im6 -rotate [90] [*.jpg]```

**Compress quality**

```mogrify.im6 -quality [80] [*.jpg]```

**Strip metadata**

```mogrify.im6 -strip [*.jpg]```

**Apply blur**

```mogrify.im6 -blur [0x8] [*.jpg]```

# SYNOPSIS

**mogrify.im6** [_options_] _files_

# PARAMETERS

_FILES_
> Image files to modify.

**-resize** _GEOM_
> Resize geometry.

**-format** _FMT_
> Output format.

**-rotate** _DEG_
> Rotation degrees.

**-quality** _NUM_
> Compression quality.

**-strip**
> Remove metadata.

**--help**
> Display help information.

# DESCRIPTION

**mogrify.im6** is the ImageMagick 6 version of mogrify. It modifies images in place.

The tool provides batch image transformation. This is the legacy IM6 variant.

mogrify.im6 is ImageMagick 6 batch processor.

# CAVEATS

Overwrites originals. ImageMagick 6 specific. Use mogrify for IM7.

# HISTORY

mogrify.im6 is the **ImageMagick 6** version, maintained for compatibility with older systems and scripts.

# SEE ALSO

[mogrify](/man/mogrify)(1), [convert](/man/convert)(1), [identify](/man/identify)(1)

