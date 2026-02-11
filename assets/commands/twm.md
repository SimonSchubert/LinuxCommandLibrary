# TAGLINE

Classic X11 Tab Window Manager

# TLDR

**Start window manager**

```twm```

**With display**

```twm -display [localhost:0]```

**Verbose mode**

```twm -v```

**Single screen**

```twm -s```

# SYNOPSIS

**twm** [_-display dpy_] [_-v_] [_-s_] [_options_]

# PARAMETERS

**-display** _DPY_
> X display to use.

**-v**
> Verbose mode.

**-s**
> Single screen.

**-f** _FILE_
> Config file.

# DESCRIPTION

**twm** (Tab Window Manager) is a minimal window manager for the X Window System. It provides basic window management functionality including title bars, borders, window resizing, and iconification using a small memory footprint.

The window manager is highly configurable through the **~/.twmrc** configuration file, which defines key bindings, menus, title bar buttons, and window appearance. It supports virtual screens for organizing workspaces.

As part of the standard X.Org distribution, twm serves as a fallback window manager when no other is configured. Its minimalism makes it suitable for resource-constrained environments and as a base for understanding X11 window management.

# CONFIGURATION

**~/.twmrc**
> Main configuration file defining key bindings, menus, title bar buttons, colors, and window behavior.

# CAVEATS

Very minimal. No modern features. Legacy X11.

# HISTORY

**twm** (Tab Window Manager) was the default window manager for X11, created by Tom LaStrange in 1987.

# SEE ALSO

[fvwm](/man/fvwm)(1), [i3](/man/i3)(1), [openbox](/man/openbox)(1)
