# TAGLINE

Set KDE Plasma desktop wallpaper

# TLDR

**Apply** a wallpaper

```plasma-apply-wallpaperimage [/path/to/image]```

Apply with **fill mode**

```plasma-apply-wallpaperimage --fill-mode [preserveAspectCrop] [/path/to/image]```

Display **help**

```plasma-apply-wallpaperimage --help```

# SYNOPSIS

**plasma-apply-wallpaperimage** [**--fill-mode** _mode_] _image_path_

# PARAMETERS

**--fill-mode _mode_**
> How to fit image: stretch, preserveAspectFit, preserveAspectCrop, tile, tileVertically, tileHorizontally, pad

**image_path**
> Path to wallpaper image file

**--help**
> Display help information

# DESCRIPTION

**plasma-apply-wallpaperimage** sets the desktop wallpaper in KDE Plasma from the command line. It supports various fill modes to control how the image is scaled or tiled to fit the screen.

The tool is useful for scripts that change wallpapers based on time of day, weather, or other conditions.

# CAVEATS

Requires running Plasma session. Image must be in supported format (PNG, JPG, etc.). Applies to all desktops/monitors by default.

# HISTORY

**plasma-apply-wallpaperimage** is part of **KDE Plasma Workspace**, providing scriptable wallpaper control alongside other plasma-apply tools.

# SEE ALSO

[plasma-apply-colorscheme](/man/plasma-apply-colorscheme)(1), [feh](/man/feh)(1), [nitrogen](/man/nitrogen)(1)
