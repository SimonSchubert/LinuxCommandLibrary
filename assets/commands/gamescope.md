# TAGLINE

Wayland gaming micro-compositor

# TLDR

Run a program with **gamescope**

```gamescope -- [program]```

Run a game with gamescope through **Steam**

```gamescope -- %command%```

**Upscale** a 720p game to 1440p with integer scaling

```gamescope -h 720 -H 1440 -S integer -- [command]```

**Limit** a vsynced game to 30 FPS

```gamescope -r 30 -- [command]```

Launch **Steam in Big Picture Mode** with gamescope integration

```gamescope -e -- /usr/bin/steam -tenfoot```

Specify which **display** to prefer

```gamescope -O [HDMI-A-1|DP-3|...] -- [program]```

Toggle **fullscreen**

```Super+f```

Display **help**

```gamescope --help```

# SYNOPSIS

**gamescope** [_options_] **--** _command_ [_arguments_]

# PARAMETERS

**-h**, **--nested-height** _HEIGHT_
> Set internal (nested) resolution height

**-H**, **--output-height** _HEIGHT_
> Set output resolution height

**-w**, **--nested-width** _WIDTH_
> Set internal (nested) resolution width

**-W**, **--output-width** _WIDTH_
> Set output resolution width

**-r**, **--nested-refresh** _RATE_
> Set internal refresh rate (FPS limit for vsync games)

**-S**, **--scaler** _SCALER_
> Scaling filter: auto, integer, fit, fill, stretch

**-e**, **--steam**
> Enable Steam integration mode

**-O**, **--prefer-output** _OUTPUT_
> Preferred display output

**-f**, **--fullscreen**
> Start in fullscreen mode

**-b**, **--borderless**
> Start in borderless windowed mode

**--hdr-enabled**
> Enable HDR output

# DESCRIPTION

**gamescope** is a Wayland micro-compositor developed by Valve for gaming. It acts as an intermediary layer between games and the display server, providing features like resolution scaling, frame limiting, HDR support, and improved game compatibility.

Key features include FSR (FidelityFX Super Resolution) upscaling, integer scaling for retro games, independent refresh rate control, and seamless fullscreen management. It's the basis for the Steam Deck's gaming mode compositor.

When used with Steam (**-e** flag), it integrates directly with Steam's overlay and game management features.

# KEYBOARD SHORTCUTS

**Super+F** - Toggle fullscreen
**Super+S** - Take screenshot
**Super+G** - Toggle FPS limiter

# CAVEATS

Requires Vulkan support. Some games may have compatibility issues. HDR support requires appropriate hardware and display. Performance overhead is minimal but present.

# HISTORY

gamescope was developed by Valve Software and first released in **2020**. It was created primarily for the Steam Deck handheld gaming PC, providing the foundation for SteamOS 3.0's gaming compositor. The project evolved from earlier work on the steamcompmgr compositor.

# SEE ALSO

[steam](/man/steam)(1), [cage](/man/cage)(1), [sway](/man/sway)(1)
