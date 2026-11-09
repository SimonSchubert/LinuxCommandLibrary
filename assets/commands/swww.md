# TAGLINE

Animated Wayland wallpaper daemon

# TLDR

**Start the wallpaper daemon**

```swww-daemon```

**Set a wallpaper image**

```swww img [path/to/image]```

**Set wallpaper on specific monitors**

```swww img -o [output1,output2] [path/to/image]```

**Restore the last set wallpaper**

```swww restore```

**Query current output and wallpaper information**

```swww query```

**Stop the daemon**

```swww kill```

**Set wallpaper with a transition effect**

```swww img --transition-type [wipe] --transition-duration [1] [path/to/image]```

**Switch immediately**, without a transition

```swww img -t none [path/to/image]```

**Clear the screen with a solid color**

```swww clear [RRGGBB]```

# SYNOPSIS

**swww** _command_ [_OPTIONS_]

**swww-daemon** [_OPTIONS_]

# COMMANDS

**img** _path_
> Set wallpaper image. Use **-** to read from stdin, or a hex color starting with **0x**

**restore**
> Restore last wallpaper

**query**
> Display output information

**kill**
> Stop the daemon

**pause**
> Pause the daemon

**clear** [_color_]
> Clear screen with RGB color (default: black)

**clear-cache**
> Clear the swww cache

# PARAMETERS

**-o, --outputs** _names_
> Target specific displays (comma-separated)

**-n, --namespace** _name_
> Target the daemon with this namespace (repeatable)

**-a, --all**
> Apply to all daemon instances

**--resize** _mode_
> Resize mode: crop (default), fit, stretch, no

**--fill-color** _color_
> Color for unfilled areas (default: 000000)

**-f, --filter** _filter_
> Scaling filter: Nearest, Bilinear, CatmullRom, Mitchell, Lanczos3 (default)

**-t, --transition-type** _type_
> Effect: none, simple (default), fade, left, right, top, bottom, wipe, wave, grow, center, any, outer, random

**--transition-step** _n_
> How fast the transition approaches the new image (1-255, default: 90, or 2 for simple)

**--transition-fps** _n_
> Frame rate (default: 30)

**--transition-duration** _seconds_
> Transition duration (default: 3, no effect with simple)

**--transition-angle** _degrees_
> Angle for wipe and wave (default: 45)

**--transition-pos** _position_
> Circle center for grow and outer, as percentages, pixels or an alias such as top-left (default: center)

**--invert-y**
> Invert the y position given to **--transition-pos**

**--transition-bezier** _x1,y1,x2,y2_
> Bezier curve for the transition (default: .54,0,.34,.99)

**--transition-wave** _width,height_
> Wave size for the wave transition (default: 20,20)

# DAEMON OPTIONS

**-f, --format** _format_
> Pixel format: argb, abgr, rgb, bgr

**-l, --layer** _layer_
> Layer to display on: background, bottom

**-n, --namespace** _name_
> Run under a custom namespace

**--no-cache**
> Do not restore the cached wallpaper on startup

**-q, --quiet**
> Only log errors

# DESCRIPTION

**swww** is an efficient animated wallpaper daemon for Wayland compositors. It supports animated GIFs and many image formats (JPEG, PNG, GIF, WebP, BMP, TIFF, TGA, PNM, farbfeld, AVIF if built with support, and static SVG) with smooth transition effects between wallpapers. The daemon can be controlled at runtime without restart.

The daemon (**swww-daemon**) must be started first, then the **swww** client controls wallpaper settings. Per-output wallpaper control allows different images on multiple monitors.

# ENVIRONMENT

**SWWW_TRANSITION**: Default transition type
**SWWW_TRANSITION_FPS**: Default FPS
**SWWW_TRANSITION_STEP**: Default step
**SWWW_TRANSITION_DURATION**: Default duration
**SWWW_TRANSITION_ANGLE**: Default angle
**SWWW_TRANSITION_POS**: Default position
**SWWW_TRANSITION_BEZIER**: Default bezier curve
**SWWW_TRANSITION_WAVE**: Default wave size

# CAVEATS

Requires wlr-layer-shell protocol (wlroots-based compositors). Does not work with GNOME. The daemon must be running before setting wallpapers. Animated wallpapers consume more resources than static images. The swww repository is archived; new development happens under the name **awww**, whose binaries are **awww** and **awww-daemon**.

# HISTORY

**swww** was created by **LGFae** as a lightweight alternative to other Wayland wallpaper solutions. It focuses on efficiency and smooth animations while maintaining low CPU and memory usage. The project has been renamed to **awww** and moved to Codeberg as of October **2025**. Released under GPL-3.0.

# SEE ALSO

[awww](/man/awww)(1), [swaybg](/man/swaybg)(1), [hyprpaper](/man/hyprpaper)(1), [feh](/man/feh)(1)

# RESOURCES

```[Source code](https://codeberg.org/LGFae/awww)```

<!-- verified: 2026-11-09 -->
