# TAGLINE

Nested X server in a window

# TLDR

**Start nested X server**

```Xephyr :1```

**With resolution**

```Xephyr -screen [800x600] :1```

**Full screen**

```Xephyr -fullscreen :1```

**Multiple screens**

```Xephyr -screen [800x600] -screen [800x600] :1```

**Resizable**

```Xephyr -resizeable :1```

# SYNOPSIS

**Xephyr** [_-screen WxH_] [_-fullscreen_] [_options_] _:display_

# PARAMETERS

**-screen** _WxH_
> Screen size.

**-fullscreen**
> Full screen mode.

**-resizeable**
> Allow resize.

**-no-host-grab**
> No keyboard grab.

_:display_
> Display number.

# DESCRIPTION

**Xephyr** is a kdrive-based X server that runs as a window inside an existing X session. It creates a fully functional, isolated X display that appears as a regular window on your desktop, allowing you to run a complete X environment within it.

The primary use case for Xephyr is testing and developing window managers, desktop environments, and X11 applications in a sandboxed environment. Developers can start a new window manager inside Xephyr without disrupting their current desktop session, making it safe to experiment with configurations and test changes.

Xephyr supports configurable screen resolutions, fullscreen mode, multiple virtual screens, and resizable windows. It provides complete display isolation from the host X server, so applications running inside Xephyr cannot interact with the host display.

# CAVEATS

X11 only. No Wayland. Display must be free.

# HISTORY

**Xephyr** was created as a modern kdrive-based X server that runs in a window for development and testing.

# SEE ALSO

[Xnest](/man/Xnest)(1), [Xvfb](/man/Xvfb)(1), [startx](/man/startx)(1)
