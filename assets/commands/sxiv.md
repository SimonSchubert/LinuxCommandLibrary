# TAGLINE

Simple lightweight X11 image viewer

# TLDR

**Open** an image

```sxiv path/to/image```

Open in **fullscreen** mode

```sxiv -f path/to/image```

Read filenames from **stdin**

```echo path/to/file | sxiv -i```

Open as **slideshow**

```sxiv -S 3 path/to/image1 path/to/image2```

Open in **thumbnail** mode

```sxiv -t path/to/images/*```

**Recursive** directory search

```sxiv -r path/to/directory```

# SYNOPSIS

**sxiv** [_options_] _FILE_...

# DESCRIPTION

**sxiv** is a simple image viewer for X. It has two modes: image mode for displaying individual images and thumbnail mode for selecting from a grid view. It supports keyboard navigation, zooming, rotation, and slideshow functionality.

# PARAMETERS

**-f**
> Start in fullscreen mode

**-b**
> Do not show info bar at bottom

**-t**
> Start in thumbnail mode

**-i**
> Read file list from stdin

**-r**
> Search directories recursively for images

**-o**
> Write marked files to stdout on exit

**-a**
> Play animations of multi-frame images

**-A FRAMERATE**
> Set animation framerate

**-s MODE**
> Set scale mode (d=down, f=fit, F=fill, w=width, h=height)

**-z ZOOM**
> Set zoom level as percentage

**-g GEOMETRY**
> Set window geometry (WxH+X+Y)

**-G GAMMA**
> Set gamma correction (-32 to 32)

**-S SECONDS**
> Start slideshow with specified interval

**-n NUM**
> Start at image number NUM

**-c**
> Clean thumbnail cache

**-q**
> Suppress warnings

# CAVEATS

Requires an EWMH/NetWM compliant window manager for fullscreen functionality. Thumbnail cache is stored in $XDG_CACHE_HOME/sxiv/. Custom key handlers can be defined in $XDG_CONFIG_HOME/sxiv/exec/key-handler.

# HISTORY

**sxiv** (Simple X Image Viewer) was created as a lightweight alternative to heavier image viewers, focusing on speed and keyboard-driven operation.

# SEE ALSO

[feh](/man/feh)(1), [imv](/man/imv)(1), [nsxiv](/man/nsxiv)(1)
