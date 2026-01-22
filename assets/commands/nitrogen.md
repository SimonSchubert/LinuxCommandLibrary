# TLDR

**Browse** wallpapers from a directory

```nitrogen [path/to/directory]```

**Set** wallpaper with automatic sizing

```nitrogen --set-auto [path/to/file]```

**Restore** previous wallpaper

```nitrogen --restore```

Set wallpaper **scaled** to fit

```nitrogen --set-scaled [path/to/file]```

Set wallpaper **centered**

```nitrogen --set-centered [path/to/file]```

Set wallpaper **tiled**

```nitrogen --set-tiled [path/to/file]```

# SYNOPSIS

**nitrogen** [**--restore**] [**--set-auto**|**--set-scaled**|**--set-centered**|**--set-tiled**|**--set-zoom** _file_] [_directory_]

# PARAMETERS

**--restore**
> Restore previously set wallpaper

**--set-auto _file_**
> Set wallpaper with automatic sizing

**--set-scaled _file_**
> Set wallpaper scaled to fill screen

**--set-centered _file_**
> Set wallpaper centered on screen

**--set-tiled _file_**
> Set wallpaper tiled across screen

**--set-zoom _file_**
> Set wallpaper zoomed to fill

**--set-zoom-fill _file_**
> Set wallpaper zoomed and cropped to fill

**--save**
> Save current settings

**--head _n_**
> Set wallpaper on specific monitor (Xinerama)

# DESCRIPTION

**nitrogen** is a wallpaper browser and setter for X Window desktops. It provides a graphical interface for browsing and selecting wallpapers, with support for multiple monitor configurations.

The tool saves wallpaper settings that can be restored on login using the --restore flag. It supports various scaling modes and works with Xinerama/RandR multi-monitor setups.

# CAVEATS

Only works with X Window System, not Wayland. Settings are stored in ~/.config/nitrogen/. For startup restoration, add "nitrogen --restore &" to autostart scripts.

# HISTORY

**nitrogen** was developed as a lightweight wallpaper setter for window managers that don't include built-in wallpaper functionality. It is commonly used with tiling window managers like i3, bspwm, and openbox.

# SEE ALSO

[feh](/man/feh)(1), [xwallpaper](/man/xwallpaper)(1), [hsetroot](/man/hsetroot)(1)
