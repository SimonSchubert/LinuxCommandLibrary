# TAGLINE

Wayland gaming micro-compositor

# TLDR

Run a program inside gamescope

```gamescope -- [program]```

Use it as a **Steam launch option**

```gamescope -- %command%```

Render at one resolution and **output at another**

```gamescope -w [1280] -h [720] -W [2560] -H [1440] -- [program]```

Upscale with **AMD FidelityFX**

```gamescope -F fsr -- [program]```

Tune how sharp that upscaling looks

```gamescope -F fsr --sharpness [5] -- [program]```

Use **integer scaling**, which keeps pixel art crisp

```gamescope -S integer -- [program]```

Cap the **refresh rate** of the nested display

```gamescope -r [60] -- [program]```

Cap the **frame rate** without changing the refresh rate

```gamescope --framerate-limit [60] -- [program]```

Drop to a lower refresh rate **when the window loses focus**

```gamescope -r [144] -o [30] -- [program]```

Enable **variable refresh rate**

```gamescope --adaptive-sync -- [program]```

Enable **HDR output**

```gamescope --hdr-enabled -- [program]```

Choose **which display** to open on

```gamescope -O [DP-1] -- [program]```

Overlay **MangoHud** statistics

```gamescope --mangoapp -- [program]```

Launch **Steam Big Picture** inside gamescope

```gamescope -e -- steam -tenfoot```

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

**-F**, **--filter** _FILTER_
> Upscaler filter: linear, nearest, fsr, nis, pixel.

**--hdr-enabled**
> Enable HDR output (requires compatible display and hardware).

**--mangoapp**
> Launch MangoHud overlay (mangoapp) alongside gamescope.

**--force-grab-cursor**
> Always use relative mouse mode instead of flipping between relative and absolute.

**--adaptive-sync**
> Enable adaptive sync / VRR on the output if supported.

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

# INSTALL

```dnf: sudo dnf install gamescope```

```pacman: sudo pacman -S gamescope```

```apk: sudo apk add gamescope```

```zypper: sudo zypper install gamescope```

```nix: nix profile install nixpkgs#gamescope```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[steam](/man/steam)(1), [cage](/man/cage)(1), [sway](/man/sway)(1), [weston](/man/weston)(1), [Xwayland](/man/Xwayland)(1)
