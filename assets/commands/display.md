# TAGLINE

interactive image viewer for X Window System

# TLDR

**Display an image**

```display [image.jpg]```

**Display with specific** window title

```display -title "[My Image]" [image.jpg]```

**Display and resize**

```display -resize [800x600] [image.jpg]```

**Display multiple images** as slideshow

```display [*.jpg]```

**Display from URL**

```display "[https://example.com/image.jpg]"```

**Display with window geometry**

```display -geometry [+100+100] [image.jpg]```

# SYNOPSIS

**display** [_options_] _file_...

# PARAMETERS

_FILE_
> Image file(s) to display.

**-resize** _GEOMETRY_
> Resize image to specified dimensions.

**-title** _STRING_
> Window title.

**-geometry** _GEOMETRY_
> Window position and size.

**-delay** _SECONDS_
> Delay between images in slideshow.

**-immutable**
> Prevent image modifications.

**-verbose**
> Show processing information.

**-help**
> Display help information.

# DESCRIPTION

**display** is an ImageMagick program that displays images on an X Window System. It provides an interactive viewer with zoom, pan, and basic editing capabilities.

The viewer supports numerous image formats through ImageMagick's format handling. Interactive features include zooming, rotating, cropping, color adjustment, and annotation. Multiple images can be viewed as a slideshow.

display includes a command menu accessible by clicking on the image, providing access to transformations, effects, and file operations. Modified images can be saved in various formats.

# CAVEATS

Requires X11 display. Resource-intensive for large images. Feature-rich interface may be complex for simple viewing. Part of ImageMagick which has had security advisories.

# HISTORY

display is part of **ImageMagick**, created by **John Cristy** in **1987**. ImageMagick has been the premier open-source image manipulation suite for decades, with display providing interactive visualization capabilities.

# SEE ALSO

[feh](/man/feh)(1), [eog](/man/eog)(1), [convert](/man/convert)(1), [identify](/man/identify)(1)
