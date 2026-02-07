# TAGLINE

dynamic tiling window manager

# TLDR

**Start dwm** (from xinitrc)

```exec dwm```

**Restart dwm** in place

```kill -HUP $(pidof dwm)```

# SYNOPSIS

**dwm**

# DESCRIPTION

**dwm** (dynamic window manager) is a minimalist tiling window manager for X11. It manages windows in tiled, monocle, and floating layouts with keyboard-driven operation and minimal resource usage.

Windows are organized into tags (similar to workspaces). The master/stack layout places the primary window prominently with others stacked alongside. Configuration is done by editing the C source code and recompiling.

dwm is designed to be extremely small (under 2000 lines of code) and fast, following the suckless philosophy of simplicity and efficiency.

# CONFIGURATION

**config.h**
> Source-level configuration file that must be edited and recompiled to change keybindings, colors, layouts, bar settings, rules, and behavior.

# CAVEATS

Configuration requires recompilation. Learning curve for keyboard shortcuts. No built-in configuration file. Limited mouse support compared to floating WMs.

# HISTORY

dwm was created by the **suckless.org** community, led by **Anselm R. Garbe**, released around **2006**. It established the template for many other tiling window managers and the suckless software philosophy.

# SEE ALSO

[dmenu](/man/dmenu)(1), [st](/man/st)(1), [i3](/man/i3)(1), [awesome](/man/awesome)(1)
