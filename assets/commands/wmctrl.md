# TAGLINE

Command-line window manager control

# TLDR

**List** windows

```wmctrl -l```

**Activate** window by title

```wmctrl -a [window_title]```

**Move** window and focus

```wmctrl -R [window_title]```

**Switch** workspace

```wmctrl -s [workspace_number]```

Toggle **fullscreen**

```wmctrl -r [window_title] -b toggle,fullscreen```

Move window to **workspace**

```wmctrl -r [window_title] -t [workspace_number]```

# SYNOPSIS

**wmctrl** [_OPTIONS_]

# PARAMETERS

**-l**
> List windows

**-a** _TITLE_
> Activate window matching title

**-R** _TITLE_
> Move window to current workspace and focus

**-s** _N_
> Switch to workspace N

**-r** _TITLE_
> Select window for action

**-b** _ACTION_
> Modify window state (toggle, add, remove)

**-t** _N_
> Move window to workspace N

# DESCRIPTION

**wmctrl** is a command-line tool for interacting with an X Window Manager that supports the EWMH/NetWM specification. It allows listing, switching, and manipulating windows from scripts or the terminal.

Window titles can be partial matches. Multiple actions can be combined.

# CAVEATS

X11 only. Requires EWMH-compliant window manager. Some features depend on window manager support.

# SEE ALSO

[xdotool](/man/xdotool)(1), [xprop](/man/xprop)(1)
