# TAGLINE

official wallpaper utility for Hyprland

# TLDR

Start the **hyprpaper service**

```hyprpaper```

**Preload** a wallpaper

```hyprctl hyprpaper preload "[path/to/image.png]"```

**Switch wallpaper** to a different preloaded image

```hyprctl hyprpaper wallpaper "[monitor],[path/to/image.png]"```

**Reload** wallpaper (preload, set, and unload unused)

```hyprctl hyprpaper reload "[monitor],[path/to/image.png]"```

List **preloaded** wallpapers

```hyprctl hyprpaper listloaded```

List **active** wallpapers with monitors

```hyprctl hyprpaper listactive```

# SYNOPSIS

**hyprpaper**

Control via: **hyprctl hyprpaper** _command_ [_arguments_]

# PARAMETERS

**preload** _PATH_
> Load wallpaper into memory for quick switching

**wallpaper** _MONITOR,PATH_
> Set wallpaper on specified monitor

**reload** _MONITOR,PATH_
> Preload, set, and unload unused wallpapers

**unload** _PATH_
> Remove wallpaper from memory

**listloaded**
> Show preloaded wallpapers

**listactive**
> Show active wallpapers per monitor

# DESCRIPTION

**hyprpaper** is the official wallpaper utility for Hyprland. It runs as a background service and allows dynamic wallpaper changes without restarting.

Configuration is stored in **~/.config/hypr/hyprpaper.conf** with directives:
```
preload = /path/to/image.png
wallpaper = monitor,/path/to/image.png
```

The preload system allows fast wallpaper switching by keeping images in memory. Use **listloaded** to track memory usage and **unload** to free unused wallpapers.

# CAVEATS

Requires Hyprland to be running. Preloaded wallpapers consume memory. Large images or many preloaded wallpapers can impact system resources. Monitor names must match Hyprland output names.

# HISTORY

hyprpaper was created as part of the Hyprland ecosystem by Vaxry. It provides wallpaper functionality specifically designed for Hyprland's Wayland implementation, with IPC integration for dynamic control.

# SEE ALSO

[hyprctl](/man/hyprctl)(1), [swaybg](/man/swaybg)(1), [feh](/man/feh)(1)
