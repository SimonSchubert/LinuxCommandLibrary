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

**Tile an image on the root window**

```display.im6 -window root [image.jpg]```

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

**-delay** _TICKS_
> Slideshow delay in hundredths of a second between images.

**-density** _GEOMETRY_
> Set image rendering resolution (DPI).

**-rotate** _DEGREES_
> Rotate image by specified degrees.

**-backdrop**
> Display image centered on a backdrop.

**-update** _SECONDS_
> Detect when the image file is modified and redisplay.

**-window** _ID_
> Display image on the background of this window (use root for the root window).

**-immutable**
> Displayed image cannot be modified.

**-help**
> Display help information.

# DESCRIPTION

**display.im6** is a versioned name for the ImageMagick 6 **display** program, created by distribution packages so ImageMagick 6 and 7 can be installed side by side. It functions identically to the display command but explicitly uses the version 6 libraries. The exact name is package-specific: recent Debian and Ubuntu packages use **display-im6.q16** instead.

This versioned command allows scripts and users to specify which ImageMagick version to use when both are available, ensuring consistent behavior regardless of system defaults.

All features of the standard display command are available, including interactive viewing, image manipulation, format conversion, and slideshow capabilities.

# CAVEATS

Requires ImageMagick 6 and an X server. May behave differently than ImageMagick 7 version. Only present on systems whose packaging installs ImageMagick 6 under this name.

# HISTORY

The .im6 suffix is a packaging convention rather than an upstream program name, typically set with a program suffix at build time and paired with an alternatives system that provides the plain **display** command. It allows both ImageMagick versions to coexist, with im6 explicitly invoking the version 6 tool.

# SEE ALSO

[display](/man/display)(1), [identify.im6](/man/identify.im6)(1)

# RESOURCES

```[Source code](https://github.com/ImageMagick/ImageMagick6)```

```[Homepage](https://imagemagick.org/)```

```[Documentation](https://imagemagick.org/display/)```

<!-- verified: 2026-11-09 -->
