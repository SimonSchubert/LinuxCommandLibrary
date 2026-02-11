# TAGLINE

Animated Wayland wallpaper daemon

# TLDR

**Initialize** the daemon

```swww-daemon```

**Set** wallpaper

```swww img [path/to/image]```

Set wallpaper on **specific outputs**

```swww img -o [output1,output2] [path/to/image]```

**Restore** last wallpaper

```swww restore```

**Query** output information

```swww query```

**Kill** daemon

```swww kill```

Set with **transition effect**

```swww img --transition-type [wipe] [path/to/image]```

**Clear** screen with color

```swww clear [RRGGBB]```

# SYNOPSIS

**swww** _command_ [_OPTIONS_]

**swww-daemon**

# COMMANDS

**img** _path_
> Set wallpaper image

**restore**
> Restore last wallpaper

**query**
> Display output information

**kill**
> Stop the daemon

**clear** _color_
> Clear screen with RGB color

# PARAMETERS

**-o, --outputs** _names_
> Target specific displays (comma-separated)

**--transition-type** _type_
> Effect: simple, center, outer, wipe, left, right, top, bottom, any, random

**--transition-step** _n_
> Smoothness (1-255)

**--transition-fps** _n_
> Frame rate (1-255, default: 30)

**--transition-duration** _seconds_
> Transition duration

**--resize** _mode_
> Resize mode: crop, fit, no

**--fill-color** _color_
> Color for unfilled areas

# DESCRIPTION

**swww** is an efficient animated wallpaper daemon for Wayland compositors. It supports animated GIFs and various image formats (JPEG, PNG, WebP, AVIF, SVG, etc.) with smooth transition effects between wallpapers. The daemon can be controlled at runtime without restart.

The daemon (**swww-daemon**) must be started first, then the **swww** client controls wallpaper settings. Per-output wallpaper control allows different images on multiple monitors.

# ENVIRONMENT

**SWWW_TRANSITION**: Default transition type
**SWWW_TRANSITION_FPS**: Default FPS
**SWWW_TRANSITION_STEP**: Default step

# CAVEATS

Requires wlr-layer-shell protocol (wlroots-based compositors). Does not work with GNOME. The daemon must be running before setting wallpapers. Animated wallpapers consume more resources than static images.

# HISTORY

**swww** was created by **LGFae** as a lightweight alternative to other Wayland wallpaper solutions. It focuses on efficiency and smooth animations while maintaining low CPU and memory usage. The project has been renamed to **awww** and moved to Codeberg as of October **2025**. Released under GPL-3.0.

# SEE ALSO

[swaybg](/man/swaybg)(1), [hyprpaper](/man/hyprpaper)(1), [feh](/man/feh)(1)
