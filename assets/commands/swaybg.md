# TLDR

**Set wallpaper**

```swaybg -i [wallpaper.jpg]```

**Specific output**

```swaybg -o [HDMI-A-1] -i [wallpaper.jpg]```

**Fill mode**

```swaybg -i [wallpaper.jpg] -m fill```

**Tile mode**

```swaybg -i [wallpaper.jpg] -m tile```

**Solid color**

```swaybg -c "[#1a1a2e]"```

**Center image**

```swaybg -i [wallpaper.jpg] -m center```

# SYNOPSIS

**swaybg** [_-o output_] [_-i image_] [_-m mode_] [_-c color_]

# PARAMETERS

**-i**, **--image** _FILE_
> Wallpaper image.

**-o**, **--output** _OUTPUT_
> Target output.

**-m**, **--mode** _MODE_
> Scaling mode.

**-c**, **--color** _COLOR_
> Background color.

# MODES

**stretch** - Stretch to fill
**fill** - Fill, crop excess
**fit** - Fit, may letterbox
**center** - Center, no scaling
**tile** - Tile image

# DESCRIPTION

**swaybg** sets wallpapers for Sway and wlroots compositors. It's the standard Wayland background setter.

Image mode displays wallpaper. Various scaling options available.

Color mode sets solid background. Hex color codes supported.

Output targeting sets per-monitor wallpapers. Different wallpapers on each display.

Runs as daemon. Kill to change wallpaper.

# CAVEATS

Wayland only. Sway/wlroots compositors. One instance per wallpaper.

# HISTORY

**swaybg** is part of the **Sway** project, a Wayland compositor. It provides simple background management for wlroots-based compositors.

# SEE ALSO

[sway](/man/sway)(1), [swaylock](/man/swaylock)(1), [feh](/man/feh)(1)
