# TAGLINE

ImageMagick 6 version of mogrify

# TLDR

**Resize all JPEG images in place to fit within 800x600**

```mogrify.im6 -resize [800x600] [*.jpg]```

**Convert all JPEG images to PNG format**

```mogrify.im6 -format [png] [*.jpg]```

**Convert format and write output to a specific directory**

```mogrify.im6 -format [png] -path [output_dir] [*.jpg]```

**Rotate all images by 90 degrees clockwise**

```mogrify.im6 -rotate [90] [*.jpg]```

**Set JPEG compression quality (0-100)**

```mogrify.im6 -quality [80] [*.jpg]```

**Strip all metadata and profiles from images**

```mogrify.im6 -strip [*.jpg]```

**Crop images to a specific region**

```mogrify.im6 -crop [640x480+50+50] [*.jpg]```

# SYNOPSIS

**mogrify.im6** [_options_] _files_

# PARAMETERS

_FILES_
> Image files to modify in place.

**-resize** _GEOMETRY_
> Resize image to fit within the given dimensions (e.g., 800x600, 50%).

**-format** _TYPE_
> Convert image to the specified format (e.g., png, gif, tiff). Output files are written alongside originals with a new extension.

**-path** _DIRECTORY_
> Write output files to the specified directory instead of overwriting originals.

**-rotate** _DEGREES_
> Rotate image by the given number of degrees clockwise.

**-quality** _VALUE_
> Set compression quality (1-100 for JPEG, higher is better quality). For PNG the value selects zlib compression level and filter type instead.

**-strip**
> Remove all image profiles, comments, and metadata.

**-crop** _GEOMETRY_
> Crop image to the specified geometry (WxH+X+Y).

**-blur** _RADIUS_x_SIGMA_
> Apply Gaussian blur with given radius and sigma.

**-colorspace** _TYPE_
> Set the image colorspace (e.g., sRGB, Gray, CMYK).

**-auto-orient**
> Rotate image based on the EXIF orientation tag and reset the orientation to top-left.

**-thumbnail** _GEOMETRY_
> Resize and strip profiles, optimized for creating thumbnails.

**--help**
> Display help information.

# DESCRIPTION

**mogrify.im6** is the ImageMagick 6 version of mogrify. It modifies images in place, unlike convert which writes to a different output file. It is designed for batch processing, applying the same set of transformations to multiple files at once.

When using **-format** to change the output type, new files are created with the appropriate extension. Use **-path** to write converted files to a separate directory and avoid overwriting originals.

# CAVEATS

Overwrites original files by default unless **-format** or **-path** is used, so test on copies first. This is the ImageMagick 6 specific variant name used by Debian-based distributions; use **magick mogrify** for ImageMagick 7. Distribution security policies in /etc/ImageMagick-6/policy.xml can block some formats such as PDF.

# SEE ALSO

[mogrify](/man/mogrify)(1), [convert](/man/convert)(1), [identify](/man/identify)(1), [composite.im6](/man/composite.im6)(1), [identify.im6](/man/identify.im6)(1), [magick-mogrify](/man/magick-mogrify)(1)

# RESOURCES

```[Source code](https://github.com/ImageMagick/ImageMagick6)```

```[Homepage](https://legacy.imagemagick.org/)```

```[Documentation](https://legacy.imagemagick.org/script/mogrify.php)```

<!-- verified: 2026-11-09 -->
