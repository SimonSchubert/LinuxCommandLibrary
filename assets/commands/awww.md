# TAGLINE

Animated Wayland wallpaper manager

# TLDR

**Set a wallpaper image**

```awww img [path/to/image]```

**Set wallpaper on specific monitors**

```awww img -o [output1,output2] [path/to/image]```

**Set wallpaper with a transition effect**

```awww img --transition-type [wipe] --transition-duration [1] [path/to/image]```

**Restore the last set wallpaper**

```awww restore```

**Clear the screen with a solid color**

```awww clear [RRGGBB]```

**Query current output and wallpaper information**

```awww query```

**Stop the daemon**

```awww kill```

# SYNOPSIS

**awww** _command_ [_options_]

# COMMANDS

**img** _path_
> Set wallpaper image or animated GIF. Use **-** to read from stdin.

**restore**
> Re-display the previously shown image on outputs.

**clear** _color_
> Fill specified outputs with a solid color.

**clear-cache**
> Remove the awww cache directory.

**query**
> Request daemon output details (names and dimensions).

**kill**
> Terminate the daemon process.

# PARAMETERS

**-o, --outputs** _names_
> Target specific displays (comma-separated).

**-f, --filter** _filter_
> Scaling filter: Nearest, Bilinear, CatmullRom, Mitchell, Lanczos3.

**--resize** _mode_
> Resize mode: no, crop, fit, stretch.

**--no-resize**
> Disable resizing; center image instead.

**--fill-color** _RRGGBB_
> Padding color for unfilled areas (default: 000000).

**-t, --transition-type** _type_
> Effect: none, simple, fade, left, right, top, bottom, wipe, wave, grow, center, any, outer, random.

**--transition-step** _n_
> RGB increment per frame (0-255).

**--transition-duration** _seconds_
> Transition completion time in seconds.

**--transition-fps** _n_
> Transition frame rate (max 255).

**--transition-angle** _degrees_
> Angle for wipe and wave transitions.

**--transition-pos** _position_
> Circle center position for grow and outer effects.

**--transition-bezier** _curve_
> Custom cubic-bezier animation curve.

**--transition-wave** _width,height_
> Wave dimensions for wave transition.

**-n, --namespace** _name_
> Target a specific Wayland namespace.

**-a, --all**
> Target all active namespaces.

# DESCRIPTION

**awww** ("An Answer to your Wayland Wallpaper Woes") is a wallpaper manager for Wayland compositors. It controls the **awww-daemon** at runtime to change monitor backgrounds, supporting animated GIFs, various image formats, and smooth transition effects between wallpapers.

The daemon must be started first with **awww-daemon**, then the **awww** client sends commands to control wallpaper settings. Per-output wallpaper control allows different images on multiple monitors. Processed images are cached for optimization.

# CAVEATS

Requires a compositor implementing the wlr-layer-shell protocol (typically wlroots-based compositors like Sway or Hyprland). Does not work with GNOME or KDE. The daemon must be running before setting wallpapers. Animated wallpapers consume more resources than static images.

# HISTORY

**awww** is the renamed successor to **swww**, created by **LGFae**. The project was renamed from "A Solution to your Wayland Wallpaper Woes" to "An Answer to your Wayland Wallpaper Woes" and moved from GitHub to Codeberg in **October 2025**. It focuses on efficiency and smooth animations while maintaining low resource usage. Released under GPL-3.0.

# SEE ALSO

[swww](/man/swww)(1), [swaybg](/man/swaybg)(1), [hyprpaper](/man/hyprpaper)(1), [feh](/man/feh)(1)
