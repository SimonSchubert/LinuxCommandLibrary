# TAGLINE

Modal keyboard-driven virtual pointer

# TLDR

Start the warpd **daemon** in the background

```warpd```

Start in the **foreground** for debugging

```warpd -f```

Run in **hint** mode (label screen locations)

```warpd --hint```

Run in **grid** mode (divide screen into quadrants)

```warpd --grid```

Run in **normal** mode (vi-like cursor movement)

```warpd --normal```

Run in hint mode and **exit** after selection (oneshot)

```warpd --hint --oneshot```

**List** all configurable options

```warpd --list-options```

Use a custom **config** file

```warpd -c [path/to/config]```

# SYNOPSIS

**warpd** [_OPTIONS_]

# PARAMETERS

**-f**, **--foreground**
> Run in the foreground (useful for debugging).

**-l**, **--list-keys**
> Print a list of valid keys which can be used as config values.

**--list-options**
> Print all configurable options.

**-v**, **--version**
> Display version information.

**-c**, **--config** _file_
> Use the provided config file (use - for stdin).

**--hint**
> Run in daemonless hint mode.

**--hint2**
> Run in two-stage hint mode.

**--grid**
> Run in grid mode (divides screen into quadrants for selection).

**--normal**
> Run in normal mode (vi-like cursor movement).

**--history**
> Run in history hint mode (hints over previously selected targets).

**--screen**
> Run in screen selection mode (for multi-monitor setups).

**--oneshot**
> Exit after mode completion instead of dropping into normal mode.

**--click** _button_
> Send a mouse click and exit.

**--move** _'x y'_
> Position pointer at the specified coordinates.

# KEY BINDINGS

**h**, **j**, **k**, **l**
> Move cursor left, down, up, right (normal mode).

**H**, **M**, **L**
> Jump to left edge, middle, right edge of screen.

**e**, **y**
> Scroll down, scroll up.

**m**
> Left click.

**,**
> Middle click.

**.**
> Right click.

**n**
> Activate hint mode from normal mode.

# DESCRIPTION

**warpd** is a modal keyboard-driven pointer manipulation program. It provides three main modes for moving the mouse cursor without a physical mouse, using an interaction model inspired by vi.

**Normal mode** (activated by default with A-M-c) provides vi-like cursor movement using hjkl keys, with support for numeric multipliers to control movement distance. **Hint mode** (A-M-x) overlays labeled hints on screen locations, allowing quick pointer warping by typing the corresponding label. **Grid mode** (A-M-g) divides the screen into a 2x2 grid, recursively subdividing on each selection to narrow down the target location.

Additional modes include **history mode** which shows hints over previously selected targets, and **screen mode** for navigating between multiple monitors. Configuration is done via `~/.config/warpd/config`.

# CAVEATS

Requires X11 or Wayland (with wlroots-based compositors). The daemon must be running for activation key bindings to work. Key bindings may conflict with other applications. Hint mode may not label all clickable elements depending on the platform.

# SEE ALSO

[xdotool](/man/xdotool)(1), [keynav](/man/keynav)(1), [xbindkeys](/man/xbindkeys)(1)
