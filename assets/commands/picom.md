# TAGLINE

standalone X11 compositor for shadows, transparency, blur, and fades

# TLDR

**Run in the foreground** with default settings

```picom```

**Run as a daemon** (background)

```picom -b```

**Use a specific config file**

```picom --config [~/.config/picom/picom.conf]```

**Pick a rendering backend**

```picom --backend [glx]```

**Enable the experimental rewritten backends** (older versions)

```picom --experimental-backends --backend [glx]```

**Disable window shadows**

```picom --no-shadow```

**Set default inactive-window opacity**

```picom -i [0.9]```

**Enable vsync**

```picom --vsync```

**Log to a file** instead of stderr

```picom --log-file [~/.picom.log]```

# SYNOPSIS

**picom** [_options_]

# PARAMETERS

**-b**, **--daemon**
> Run as a daemon (fork into background).

**--config** _FILE_
> Path to the configuration file (default `~/.config/picom/picom.conf`).

**--backend** _TYPE_
> Rendering backend: `glx`, `xrender`, or `xr_glx_hybrid` (legacy). Modern picom also supports the Vulkan backend on some builds.

**--experimental-backends**
> Use the rewritten backend implementations. Required on older releases for features like `dual_kawase` blur. Not needed on picom ≥ 10, where the new backends are the default.

**--shadow** / **--no-shadow**
> Enable or disable drop shadows.

**--fading** / **--no-fading-openclose**
> Enable fades on window open/close or disable them specifically on open/close.

**--fade-in-step** _N_ / **--fade-out-step** _N_
> Opacity step per frame when fading (0.001–1.0).

**-i** _OPACITY_, **--inactive-opacity** _OPACITY_
> Default opacity for inactive windows (0.0–1.0).

**-e** _OPACITY_, **--frame-opacity** _OPACITY_
> Opacity for window frames.

**--active-opacity** _OPACITY_
> Opacity for the focused window.

**--blur-method** _METHOD_
> Blur algorithm: `none`, `gaussian`, `box`, `kernel`, `dual_kawase`.

**--blur-background**
> Blur the background behind transparent windows.

**--vsync**
> Enable vsync using the appropriate method for the selected backend.

**--use-damage** / **--no-use-damage**
> Render only damaged regions (faster, default on).

**--unredir-if-possible**
> Unredirect fullscreen windows (e.g. full-screen video/games) for better performance.

**--corner-radius** _N_
> Round window corners with radius _N_ pixels (picom ≥ 10).

**--shadow-radius** _N_ / **--shadow-offset-x** _N_ / **--shadow-offset-y** _N_ / **--shadow-opacity** _O_
> Shape, offset, and opacity of drop shadows.

**--log-level** _LEVEL_
> `trace`, `debug`, `info`, `warn`, `error`, `fatal`.

**--log-file** _FILE_
> Write logs to _FILE_ instead of stderr.

**-v**, **--version**
> Show version.

**-h**, **--help**
> Show help.

# DESCRIPTION

**picom** is a lightweight standalone X11 compositor — it paints the final image you see by combining window contents drawn into offscreen pixmaps, which lets it add effects that the window manager itself does not render: shadows, fades, blur behind transparency, rounded corners (v10+), and animations. It is typically started alongside a tiling/stacking WM that is not itself a compositor (i3, bspwm, Openbox, awesome, Xmonad).

Most real configuration lives in `picom.conf`. Command-line flags override config values and are handy for testing.

# CAVEATS

Only works under X11 (Wayland compositors render themselves). Requires a GPU driver with working GLX for the `glx` backend; VirtualBox/VMware guests often need `xrender`. Conflicts with other compositors (including KWin and Mutter) — stop them first. Effects are resource-intensive on old hardware; disable blur and shadows if the CPU/GPU can't keep up.

# HISTORY

**picom** is a maintained fork of **compton**, itself a fork of **xcompmgr-dana**/**xcompmgr**. Maintained by **yshui** after compton became inactive, picom is now the community-standard compositor for tiling WMs.

# SEE ALSO

[xcompmgr](/man/xcompmgr)(1), [compton](/man/compton)(1), [i3](/man/i3)(1), [bspwm](/man/bspwm)(1)
