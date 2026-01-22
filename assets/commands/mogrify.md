# TLDR

**Resize images in place**

```mogrify -resize [800x600] [*.jpg]```

**Convert format**

```mogrify -format [png] [*.jpg]```

**Rotate images**

```mogrify -rotate [90] [*.jpg]```

**Add watermark**

```mogrify -draw "text 10,10 'Copyright'" [*.jpg]```

**Compress quality**

```mogrify -quality [80] [*.jpg]```

**Strip metadata**

```mogrify -strip [*.jpg]```

# SYNOPSIS

**mogrify** [_options_] _files_

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

**mogrify** modifies images in place. It's ImageMagick's batch processing tool.

The tool transforms multiple images at once. Unlike convert, it overwrites originals.

mogrify batch modifies images.

# CAVEATS

Overwrites originals. Part of ImageMagick. Backup before use.

# HISTORY

mogrify is part of **ImageMagick**, providing in-place image transformation since 1990.

# SEE ALSO

[convert](/man/convert)(1), [identify](/man/identify)(1), [magick](/man/magick)(1)

