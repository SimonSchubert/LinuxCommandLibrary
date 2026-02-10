# TAGLINE

optimizes JPEG files by removing metadata and optionally reducing quality

# TLDR

**Optimize JPEG losslessly**

```jpegoptim [image.jpg]```

**Optimize to target quality**

```jpegoptim -m [85] [image.jpg]```

**Optimize to target size**

```jpegoptim --size=[500k] [image.jpg]```

**Strip metadata**

```jpegoptim --strip-all [image.jpg]```

**Optimize all JPEGs in directory**

```jpegoptim [*.jpg]```

**Keep original** and create new

```jpegoptim -d [output_dir] [image.jpg]```

**Show statistics**

```jpegoptim -n [image.jpg]```

# SYNOPSIS

**jpegoptim** [_options_] _files_...

# DESCRIPTION

**jpegoptim** optimizes JPEG files by removing metadata and optionally reducing quality. It can produce smaller files through lossless optimization or lossy quality reduction.

The tool is useful for web images, photo galleries, and reducing storage requirements while maintaining acceptable visual quality.

# PARAMETERS

**-m** _quality_
> Set maximum quality (0-100).

**--size** _size_
> Target file size.

**-d** _dir_
> Output directory.

**-n**, **--noaction**
> Simulate (don't modify).

**-o**, **--overwrite**
> Overwrite original.

**-p**, **--preserve**
> Preserve file times.

**--strip-all**
> Strip all markers.

**--strip-com**
> Strip comments.

**--strip-exif**
> Strip EXIF data.

**--strip-icc**
> Strip color profiles.

**-q**, **--quiet**
> Quiet mode.

# CAVEATS

Lossy optimization permanent. Stripping ICC may affect colors. Some metadata useful for organization. Progressive encoding may differ.

# HISTORY

**jpegoptim** was created by **Timo Kokkonen** as a command-line JPEG optimizer. It provides a simpler alternative to jpegtran for common optimization tasks, focusing on ease of use for batch processing.

# SEE ALSO

[jpegtran](/man/jpegtran)(1), [optipng](/man/optipng)(1), [convert](/man/convert)(1), [exiftool](/man/exiftool)(1)
