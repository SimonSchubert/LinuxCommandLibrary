# TAGLINE

lightweight, keyboard-driven image viewer for X11

# TLDR

**Open images**

```nsxiv [path/to/file1 path/to/file2 ...]```

Open images from **directories** in image mode

```nsxiv [path/to/directory1 path/to/directory2 ...]```

Search directories **recursively** for images to view

```nsxiv -r [path/to/directory1 path/to/directory2 ...]```

**Quit** nsxiv

```q```

Switch to **thumbnail mode** or open selected image

```Enter```

**Next/previous** image

```n / p```

# SYNOPSIS

**nsxiv** [_options_] _files_|_directories_...

# PARAMETERS

**-r, --recursive**
> Search directories recursively for images

**-t, --thumbnail**
> Start in thumbnail mode

**-f, --fullscreen**
> Start in fullscreen mode

**-s _mode_**
> Scale mode: fit, fill, width, height

**-g _geometry_**
> Window geometry (WxH+X+Y)

**-b**
> Hide info bar

**-q**
> Quiet mode; suppress warnings

**-o**
> Output selected files to stdout on exit

# DESCRIPTION

**nsxiv** (Neo Simple X Image Viewer) is a lightweight, keyboard-driven image viewer for X11. It's a fork of the original sxiv with additional features and active maintenance.

The viewer has two modes: **image mode** for viewing individual images with zoom and pan, and **thumbnail mode** for browsing multiple images. Navigation uses vim-like keybindings: **h/j/k/l** or arrow keys, **n/p** for next/previous.

Images can be marked for batch operations, and the selection can be output to stdout for use in scripts. External commands can be configured through shell scripts.

# CAVEATS

X11 only; does not work in Wayland without XWayland. Supports common image formats through imlib2 (JPEG, PNG, GIF, etc.). Animated GIF support is limited. Custom keybindings require recompilation.

# HISTORY

nsxiv is a community fork of sxiv (simple X image viewer) created after the original project became unmaintained. It continues active development with new features while maintaining the minimalist philosophy.

# SEE ALSO

[sxiv](/man/sxiv)(1), [feh](/man/feh)(1), [imv](/man/imv)(1), [viewnior](/man/viewnior)(1)
