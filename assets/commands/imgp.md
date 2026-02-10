# TAGLINE

fast, command-line image resizer and rotator for JPEG and PNG files

# TLDR

**Resize** images or directories to specific resolution

```imgp -x [1366x1000] [path/to/directory] [path/to/file]```

**Scale** an image by percentage and overwrite source

```imgp -x [75] -w [path/to/file]```

**Rotate** an image clockwise by 90 degrees

```imgp -o [90] [path/to/file]```

# SYNOPSIS

**imgp** [_options_] [_paths_]

# PARAMETERS

**-x**, **--res** _RES_
> Target resolution (WxH) or scale percentage

**-o**, **--rotate** _DEGREES_
> Rotate image clockwise (90, 180, 270)

**-w**, **--overwrite**
> Overwrite source images

**-q**, **--quality** _VALUE_
> JPEG quality (1-95, default 75)

**-n**, **--enlarge**
> Allow enlarging images

**-e**, **--erase**
> Remove EXIF metadata

**-c**, **--convert**
> Convert between PNG and JPEG

# DESCRIPTION

**imgp** is a fast, command-line image resizer and rotator for JPEG and PNG files. It can process single files or entire directories, making batch operations efficient.

The tool preserves aspect ratio by default when resizing and can process images in parallel for improved performance. It maintains EXIF orientation metadata and supports both percentage-based scaling and absolute resolution targets.

# CAVEATS

Only supports JPEG and PNG formats. By default creates new files rather than overwriting. Very large batch operations may consume significant memory.

# HISTORY

imgp was created by Arun Prakash Jana and is part of a collection of efficient command-line utilities. It was designed to provide fast, scriptable image manipulation without the complexity of larger tools like ImageMagick.

# SEE ALSO

[convert](/man/convert)(1), [mogrify](/man/mogrify)(1), [jpegtran](/man/jpegtran)(1)
