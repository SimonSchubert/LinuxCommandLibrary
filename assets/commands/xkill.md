# TAGLINE

Force-close X11 windows by clicking

# TLDR

**Kill window by clicking**

```xkill```

**Kill specific window ID**

```xkill -id [window_id]```

**Kill all with matching name**

```xkill -frame```

**Show button to use**

```xkill -button any```

# SYNOPSIS

**xkill** [_-id window_id_] [_-button button_] [_-frame_] [_options_]

# PARAMETERS

**-id** _WINDOWID_
> Kill specific window by ID.

**-button** _BUTTON_
> Button to use (any, 1, 2, 3).

**-frame**
> Include window frame.

**-all**
> Kill all matching clients.

**-display** _DISPLAY_
> X server display.

# DESCRIPTION

**xkill** forcibly closes X11 windows. After running, the cursor changes and the next clicked window is killed.

The tool sends a kill request to the X server. This is more forceful than asking the window to close normally.

Window manager frames can be targeted. Using -frame kills the window even if clicking the decoration rather than content.

Any mouse button can trigger the kill. By default, only button 1 (left click) works. The -button option changes this.

Pressing any key cancels xkill without killing a window. This provides an escape if started accidentally.

The tool is useful when applications become unresponsive and normal close methods fail.

# CAVEATS

X11 only - doesn't work on Wayland. May lose unsaved data. Doesn't gracefully close applications. Some windows may resist.

# HISTORY

**xkill** has been part of the **X.Org** utilities since the early days of X11. It provides a simple way to deal with misbehaving X applications.

# SEE ALSO

[kill](/man/kill)(1), [killall](/man/killall)(1), [xwininfo](/man/xwininfo)(1), [xdotool](/man/xdotool)(1)
