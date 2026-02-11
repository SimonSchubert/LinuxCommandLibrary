# TAGLINE

Wayland wallpaper setter for Sway

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

**swaybg** sets desktop wallpapers for Sway and other wlroots-based Wayland compositors. It supports displaying image files with various scaling modes (stretch, fill, fit, center, tile) or setting a solid background color using hex codes.

Different wallpapers can be assigned to individual outputs by specifying the output name, enabling per-monitor backgrounds in multi-display setups. The tool runs as a persistent background process; to change the wallpaper, the running instance must be killed and a new one started with the desired settings.

Swaybg is typically launched from the Sway configuration file using an `exec` directive, ensuring the wallpaper is set automatically when the compositor starts.

# CAVEATS

Wayland only. Sway/wlroots compositors. One instance per wallpaper.

# HISTORY

**swaybg** is part of the **Sway** project, a Wayland compositor. It provides simple background management for wlroots-based compositors.

# SEE ALSO

[sway](/man/sway)(1), [swaylock](/man/swaylock)(1), [feh](/man/feh)(1)
