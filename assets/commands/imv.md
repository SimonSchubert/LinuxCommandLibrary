# TAGLINE

lightweight image viewer for Wayland and X11, designed for use with tiling

# TLDR

**View** multiple images

```imv [path/to/image1] [path/to/image2]```

View in **fullscreen** mode

```imv -f [path/to/image]```

View images **recursively** from a directory as slideshow

```imv -r --slideshow [path/to/directory]```

**Slideshow** with 10-second interval

```imv -t 10 [path/to/directory]```

Open images from **stdin**

```find . -name "*.svg" | imv```

# SYNOPSIS

**imv** [_options_] [_paths_]

# PARAMETERS

**-f**
> Start in fullscreen mode

**-r**
> Load directories recursively

**-t** _SECONDS_
> Slideshow interval in seconds

**--slideshow**
> Start in slideshow mode

**-s** _MODE_
> Scaling mode (none, shrink, full, crop)

**-b** _COLOR_
> Set background color

**-d**
> Show overlay with image information

# DESCRIPTION

**imv** is a lightweight image viewer for Wayland and X11, designed for use with tiling window managers. It supports numerous image formats including PSD (Photoshop), SVG, and animated GIFs.

The viewer is keyboard-driven with vim-like bindings by default. It can read file lists from stdin, making it ideal for integration with other command-line tools. Features include zooming, panning, rotation, and slideshow mode.

# CAVEATS

Requires appropriate backend libraries for format support. Some formats like PSD require optional dependencies. Configuration file controls key bindings.

# HISTORY

imv was created to provide a fast, minimal image viewer suitable for tiling window manager workflows. It supports both X11 and Wayland, making it versatile across different Linux desktop environments.

# SEE ALSO

[feh](/man/feh)(1), [sxiv](/man/sxiv)(1), [mpv](/man/mpv)(1)
