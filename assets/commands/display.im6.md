# TAGLINE

ImageMagick version 6 image viewer

# TLDR

**Display an image** (ImageMagick 6)

```display.im6 [image.jpg]```

**Display with title**

```display.im6 -title "[Title]" [image.jpg]```

**Display resized**

```display.im6 -resize [50%] [image.jpg]```

**Display multiple images**

```display.im6 [image1.jpg] [image2.jpg]```

# SYNOPSIS

**display.im6** [_options_] _file_...

# PARAMETERS

_FILE_
> Image file(s) to display.

**-resize** _GEOMETRY_
> Resize image.

**-title** _STRING_
> Set window title.

**-geometry** _GEOMETRY_
> Window geometry.

**-delay** _SECONDS_
> Slideshow delay.

**-help**
> Display help information.

# DESCRIPTION

**display.im6** is the ImageMagick version 6 image viewer, provided for compatibility when both ImageMagick 6 and 7 are installed on a system. It functions identically to the display command but explicitly uses the version 6 libraries.

This versioned command allows scripts and users to specify which ImageMagick version to use when both are available, ensuring consistent behavior regardless of system defaults.

All features of the standard display command are available, including interactive viewing, image manipulation, format conversion, and slideshow capabilities.

# CAVEATS

Requires ImageMagick 6 installed. May behave differently than ImageMagick 7 version. Primarily exists for compatibility during transition periods.

# HISTORY

The .im6 suffix was added when **ImageMagick 7** introduced breaking changes from version 6. This naming convention allows both versions to coexist, with im6 explicitly invoking the legacy version.

# SEE ALSO

[display](/man/display)(1), [convert.im6](/man/convert.im6)(1), [identify.im6](/man/identify.im6)(1)
