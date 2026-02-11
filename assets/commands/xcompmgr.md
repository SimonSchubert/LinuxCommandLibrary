# TAGLINE

X11 compositing window manager

# TLDR

**Start with default settings** (shadows and fading)

```xcompmgr```

**Enable shadows** with custom offset and opacity

```xcompmgr -c -l [left_offset] -t [top_offset] -o [opacity]```

**Enable shadows and fading** with transition steps

```xcompmgr -cCfF -D [fade_time_ms]```

**Enable only fading effects** between window states

```xcompmgr -fF```

**Run with softer shadows** (larger radius, more transparent)

```xcompmgr -c -r [shadow_radius] -o [0.5]```

**Disable shadows on dock and panel windows**

```xcompmgr -c -n```

# SYNOPSIS

**xcompmgr** [_-d display_] [_-r radius_] [_-o opacity_] [_-l left_] [_-t top_] [_-cCfFnsSdD_]

# PARAMETERS

**-d** _display_
> Specifies which display to manage.

**-c**
> Enable client-side shadows on windows.

**-C**
> Disable shadows on dock/panel windows with _NET_WM_WINDOW_TYPE_DOCK.

**-f**
> Fade windows in and out when opening/closing.

**-F**
> Fade windows during opacity changes.

**-r** _radius_
> Shadow radius in pixels (default: 12).

**-o** _opacity_
> Shadow opacity (0.0 to 1.0, default: 0.75).

**-l** _offset_
> Left offset for shadows in pixels (default: -15).

**-t** _offset_
> Top offset for shadows in pixels (default: -15).

**-n**
> Normal client-side shadows (no fading).

**-s**
> Enable synchronous X operation for debugging.

**-S**
> Enable shadows on windows with shapes.

**-D** _time_
> Fade time step in milliseconds (default: 10).

**-a**
> Disable fading on window open/close.

**-I** _opacity_
> Opacity change per step while fading in (default: 0.028).

**-O** _opacity_
> Opacity change per step while fading out (default: 0.03).

# DESCRIPTION

**xcompmgr** is a compositing window manager for the X Window System that adds visual effects to windows including drop shadows, transparency, and fading transitions. It operates as a standalone compositor that works with any ICCCM/EWMH compliant window manager.

The compositor uses the X Composite extension to redirect window contents to off-screen pixmaps, then combines them with effects before displaying. This enables true transparency without the need for pseudo-transparency techniques. Windows can have per-window opacity set via tools like **transset**.

Common configurations combine shadow (-c) and fade (-f) options for a polished desktop appearance. The shadow appearance is controlled through radius, offset, and opacity parameters. For lighter systems, shadows can be disabled on docks and panels with -C to reduce visual clutter.

# CAVEATS

Requires the Composite, Damage, Fixes, and Render X extensions to be enabled. May conflict with window managers that have built-in compositing (disable their compositor first). Performance depends on graphics driver quality; software rendering can be slow. Does not support advanced effects like blur or animations found in modern compositors like **picom**.

# HISTORY

**xcompmgr** was written by Keith Packard and released as a sample compositing manager following the introduction of the X Composite extension around **2004**. It served as a proof-of-concept and reference implementation demonstrating compositing capabilities in X.Org. While functional, it was superseded by more feature-rich compositors like **compton** and later **picom**, which offer additional effects and better performance.

# SEE ALSO

[picom](/man/picom)(1), [compton](/man/compton)(1), [transset](/man/transset)(1), [xwininfo](/man/xwininfo)(1)
