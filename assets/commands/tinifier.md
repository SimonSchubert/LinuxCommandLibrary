# TAGLINE

CLI tool for compressing images via TinyPNG

# TLDR

**Compress all images in a directory**

```tinifier compress --api-key [KEY] [./images/]```

**Compress with 4 threads**

```tinifier compress -t 4 --api-key [KEY] [photo.png]```

**Compress while preserving EXIF metadata**

```tinifier compress --keep-metadata --api-key [KEY] [./img/]```

# SYNOPSIS

**tinifier** [_options_] _path_...

# PARAMETERS

**--api-key** _KEY_
> TinyPNG API key. Can be specified multiple times.

**-t** _N_
> Number of parallel threads.

**--keep-metadata**
> Preserve original file metadata.

# DESCRIPTION

**tinifier** compresses images using the TinyPNG API with parallel processing support. It handles WEBP, AVIF, JPEG, and PNG files, supports multiple API keys with automatic switching when quotas are exceeded, and can preserve original file metadata.

# CAVEATS

Requires a TinyPNG API key.

# HISTORY

**tinifier** was created by **tarampampam** and is written in **Go**.

# SEE ALSO

[optipng](/man/optipng)(1), [jpegoptim](/man/jpegoptim)(1), [imagemagick](/man/imagemagick)(1)
