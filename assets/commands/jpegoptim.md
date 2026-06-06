# TAGLINE

optimizes JPEG files by removing metadata and optionally reducing quality

# TLDR

**Optimize JPEG losslessly**

```jpegoptim [image.jpg]```

**Optimize to target quality**

```jpegoptim -m [85] [image.jpg]```

**Optimize to target size** (kilobytes or percentage)

```jpegoptim --size=[500k] [image.jpg]```

**Strip all metadata**

```jpegoptim --strip-all [image.jpg]```

**Optimize all JPEGs in directory**

```jpegoptim [*.jpg]```

**Write optimized copy** to another directory, keeping the original

```jpegoptim -d [output_dir] [image.jpg]```

**Simulate** (print results without writing)

```jpegoptim -n [image.jpg]```

# SYNOPSIS

**jpegoptim** [_options_] _files_...

# DESCRIPTION

**jpegoptim** optimizes JPEG files by removing metadata and optionally reducing quality. It can produce smaller files through lossless optimization or lossy quality reduction.

The tool is useful for web images, photo galleries, and reducing storage requirements while maintaining acceptable visual quality.

# PARAMETERS

**-m** _quality_, **--max**=_quality_
> Set maximum image quality factor (0-100). Disables the default lossless mode.

**-S** _size_, **--size**=_size_
> Try to optimize to the given size, in kilobytes (e.g. 500k) or as a percentage (1%-99%). Disables lossless mode.

**-d** _dir_, **--dest**=_dir_
> Write optimized files to an alternative destination directory instead of overwriting the originals.

**-f**, **--force**
> Force optimization even if the result is larger than the original.

**-T** _threshold_, **--threshold**=_threshold_
> Keep the old file if the size gain is below the given threshold percentage.

**-n**, **--noaction**
> Simulate: print results without modifying any file.

**-o**, **--overwrite**
> Overwrite an existing target file in the destination directory (only meaningful with -d).

**-p**, **--preserve**
> Preserve file modification and access times.

**-r**, **--retry**
> Recursively re-optimize until the file size stops shrinking.

**-w** _max_, **--workers**=_max_
> Set the maximum number of parallel threads (default 1).

**-t**, **--totals**
> Print totals after processing all files.

**--strip-all**
> Strip all markers (metadata) from output.

**--strip-com**
> Strip comment markers.

**--strip-exif**
> Strip Exif data.

**--strip-icc**
> Strip ICC color profile markers.

**--strip-xmp**
> Strip XMP markers.

**--all-progressive**
> Force all output files to be progressive (use --all-normal for baseline).

**--stdin**, **--stdout**
> Read input from standard input / write output to standard output.

**-q**, **--quiet**
> Quiet mode.

# CAVEATS

Lossy optimization permanent. Stripping ICC may affect colors. Some metadata useful for organization. Progressive encoding may differ.

# HISTORY

**jpegoptim** was created by **Timo Kokkonen** as a command-line JPEG optimizer. It provides a simpler alternative to jpegtran for common optimization tasks, focusing on ease of use for batch processing.

# SEE ALSO

[jpegtran](/man/jpegtran)(1), [optipng](/man/optipng)(1), [convert](/man/convert)(1), [exiftool](/man/exiftool)(1)
