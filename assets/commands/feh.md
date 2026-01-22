# TLDR

**View images**

```feh [image.jpg]```

**View directory as** slideshow

```feh -D [5] [directory]```

**Set wallpaper**

```feh --bg-scale [image.jpg]```

**Thumbnail mode**

```feh -t [directory]```

**Fullscreen mode**

```feh -F [image.jpg]```

# SYNOPSIS

**feh** [_options_] [_files_|_directories_|_URLs_]

# PARAMETERS

_FILES_
> Images to display.

**-F**, **--fullscreen**
> Start in fullscreen mode.

**-D** _SEC_, **--slideshow-delay** _SEC_
> Slideshow delay in seconds.

**-t**, **--thumbnails**
> Thumbnail browser mode.

**--bg-scale** _IMAGE_
> Set scaled wallpaper.

**--bg-fill** _IMAGE_
> Set wallpaper filling screen.

**-Z**, **--auto-zoom**
> Zoom to fit window.

**-r**, **--recursive**
> Recurse into directories.

**--help**
> Display help information.

# DESCRIPTION

**feh** is a lightweight, fast image viewer for X11. It supports slideshows, thumbnail browsing, montages, and setting desktop wallpapers through command-line control.

The viewer handles multiple image formats and provides keyboard and mouse controls for navigation and zooming. It can read images from files, directories, stdin, or URLs.

feh is particularly popular for setting wallpapers in window managers that lack built-in wallpaper support.

# CAVEATS

X11 only (no Wayland native). Large images may load slowly. Wallpaper setting requires running at startup.

# HISTORY

feh was created by **Tom Gilbert** in 1999 as a fast, simple X11 image viewer. It remains widely used in lightweight Linux setups, especially for its wallpaper-setting capabilities.

# SEE ALSO

[sxiv](/man/sxiv)(1), [nsxiv](/man/nsxiv)(1), [imv](/man/imv)(1)
