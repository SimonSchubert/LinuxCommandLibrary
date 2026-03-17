# TAGLINE

CLI tool for compressing images via TinyPNG API

# TLDR

**Compress all images in a directory**

```tinifier --api-key [KEY] [./images/]```

**Compress recursively with 4 threads**

```tinifier -t 4 -r --api-key [KEY] [./images/]```

**Compress preserving file modification time and EXIF data**

```tinifier --preserve-time --api-key [KEY] [photo.png]```

**Compress only specific file extensions**

```tinifier --api-key [KEY] --ext [png,webp] [./images/]```

**Skip files with less than 5% size reduction**

```tinifier --api-key [KEY] --skip-if-diff-less [5] [./images/]```

**Keep original files alongside compressed versions**

```tinifier --api-key [KEY] --keep-original-file [./images/]```

# SYNOPSIS

**tinifier** [_options_] _path_...

# PARAMETERS

**-k**, **--api-key** _KEY_
> TinyPNG API key. Multiple keys separated by commas for automatic switching when quotas are exceeded.

**-t**, **--threads** _N_
> Number of parallel threads (default: 16).

**-r**, **--recursive**
> Search for files in listed directories recursively.

**-e**, **--ext** _EXTENSIONS_
> File extensions to compress (default: png,jpeg,jpg,webp,avif).

**-p**, **--preserve-time**
> Preserve the original file modification date/time including EXIF data.

**--keep-original-file**
> Leave the original uncompressed file alongside the compressed one.

**--skip-if-diff-less** _N_
> Skip files if compression saves less than N percent (default: 1).

**--max-errors** _N_
> Maximum number of errors before stopping (default: 10, 0 to disable).

**--retry-attempts** _N_
> Number of retry attempts for operations (default: 3).

**--delay-between-retries** _DURATION_
> Delay between retry attempts (default: 1s).

**-c**, **--config-file** _PATH_
> Path to a configuration file.

# DESCRIPTION

**tinifier** compresses images using the TinyPNG API with parallel processing. It supports PNG, JPEG, WebP, and AVIF files. Multiple API keys can be provided for automatic switching when quotas are exceeded. The tool can recursively scan directories and preserves original file metadata on request.

# CAVEATS

Requires a TinyPNG API key (free tier: 500 compressions/month). Files are uploaded to TinyPNG servers for compression. Network connectivity is required.

# HISTORY

**tinifier** was created by **tarampampam** and is written in **Go**.

# SEE ALSO

[optipng](/man/optipng)(1), [jpegoptim](/man/jpegoptim)(1), [pngquant](/man/pngquant)(1), [imagemagick](/man/imagemagick)(1)
