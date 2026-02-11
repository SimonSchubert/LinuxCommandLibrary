# TAGLINE

Lightweight X11 wallpaper setter

# TLDR

**Set wallpaper centered**

```xwallpaper --center [image.jpg]```

**Set wallpaper zoomed to fill**

```xwallpaper --zoom [image.jpg]```

**Stretch to fit screen**

```xwallpaper --stretch [image.jpg]```

**Tile wallpaper**

```xwallpaper --tile [image.png]```

**Set for specific output**

```xwallpaper --output [HDMI-1] --zoom [image.jpg]```

**Different wallpapers per output**

```xwallpaper --output [HDMI-1] --zoom [wall1.jpg] --output [eDP-1] --center [wall2.jpg]```

**Run as daemon** for output changes

```xwallpaper --daemon --zoom [image.jpg]```

# SYNOPSIS

**xwallpaper** [_options_] [_mode_] _file_...

# PARAMETERS

**--center** _file_
> Center image without scaling.

**--zoom** _file_
> Zoom to fill, cropping if needed.

**--maximize** _file_
> Scale to fit without cropping.

**--stretch** _file_
> Stretch to fill, ignoring aspect ratio.

**--tile** _file_
> Tile image from upper left.

**--focus** _file_
> Focus on selection with --trim.

**--output** _name_
> Target specific output (use xrandr to list).

**--screen** _screen_
> Target specific X screen.

**--trim** _WxH[+X+Y]_
> Trim input image.

**--daemon**
> Redraw on output changes.

**--clear**
> Clear wallpaper.

**--no-randr**
> Disable RandR support.

**--no-atoms**
> Don't set wallpaper atoms.

**--debug**
> Enable debug output.

**--version**
> Display version.

# DESCRIPTION

**xwallpaper** is a wallpaper setting utility for X11. It supports JPEG, PNG, and XPM formats with various scaling modes to fit different display configurations.

The tool supports multi-monitor setups through RandR, allowing different wallpapers per output. In daemon mode, it monitors output changes and redraws wallpapers automatically when displays are connected or resized.

Wallpaper atoms are set to support semi-transparent backgrounds in compatible applications.

For Wayland, consider using swaybg or wbg instead.

# CAVEATS

X11 only; won't work under pure Wayland. Daemon mode requires RandR support. Image formats depend on build configuration. Some window managers may override wallpaper.

# HISTORY

**xwallpaper** was created by Tobias Stoeckmann as a lightweight, dependency-minimal wallpaper setter for X11. It focuses on correctness and minimal resource usage compared to larger tools like feh.

# SEE ALSO

[feh](/man/feh)(1), [nitrogen](/man/nitrogen)(1), [hsetroot](/man/hsetroot)(1), [xrandr](/man/xrandr)(1)
