# TAGLINE

PNG optimizer that reduces file size without losing quality

# TLDR

**Optimize PNG file**

```optipng [image.png]```

**Optimize with maximum compression**

```optipng -o7 [image.png]```

**Optimize multiple files**

```optipng [*.png]```

**Preserve file timestamps**

```optipng -preserve [image.png]```

**Simulate** without modifying

```optipng -simulate [image.png]```

**Strip all metadata**

```optipng -strip all [image.png]```

**Convert to PNG**

```optipng [image.bmp]```

# SYNOPSIS

**optipng** [_options_] _files_...

# DESCRIPTION

**optipng** is a PNG optimizer that reduces file size without losing quality. It recompresses the image data and removes unnecessary metadata.

The tool can also convert other formats (BMP, GIF, TIFF) to optimized PNG.

# PARAMETERS

**-o** _level_
> Optimization level (0-7, default 2).

**-strip** _objects_
> Strip metadata (all, exif, icc, etc.).

**-preserve**
> Preserve file attributes.

**-simulate**
> Dry run, don't modify.

**-out** _file_
> Output to different file.

**-dir** _directory_
> Output directory.

**-backup**
> Keep backup of original.

**-quiet**
> Quiet mode.

**-verbose**
> Verbose output.

**-fix**
> Fix corrupt data.

# CAVEATS

Higher optimization levels much slower. Lossless only - can't reduce beyond PNG limits. Some metadata may be useful. Original file modified by default.

# HISTORY

**OptiPNG** was created by **Cosmin Truta** to provide optimal PNG compression. It builds on the zlib and libpng libraries, implementing various optimization strategies to minimize file size.

# SEE ALSO

[pngcrush](/man/pngcrush)(1), [pngquant](/man/pngquant)(1), [jpegoptim](/man/jpegoptim)(1), [convert](/man/convert)(1)
