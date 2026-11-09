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

**Allow any client and do not reset when the last one exits**

```Xephyr -ac -noreset -screen [1280x720] :1```

**Run an application inside it**

```DISPLAY=:1 [xterm]```

# SYNOPSIS

**Xephyr** [_:display_] [_options_]

# PARAMETERS

**-screen** _WxH_
> Screen size.

**-fullscreen**
> Full screen mode.

**-output** _name_
> Full screen restricted to the given output's geometry.

**-resizeable**
> Allow resize. The window has a fixed size by default.

**-no-host-grab**
> Disable grabbing the keyboard and mouse.

**-parent** _xid_
> Use an existing window as the root window.

**-title** _title_
> Set the window title (WM_NAME).

**-name** _name_
> Set the WM_CLASS name.

**-glamor**
> Enable 2D acceleration using glamor.

**-noxv**
> Do not use XV.

**-grayscale**
> Simulate 8-bit grayscale.

**-sw-cursor**
> Render cursors in software.

**-host-cursor**
> Reuse the host's cursor.

**-verbosity** _level_
> Set log verbosity level.

**-ac**
> Disable host-based access control (standard Xserver option).

**-noreset**
> Do not reset when the last client exits (standard Xserver option).

_:display_
> Display number.

# DESCRIPTION

**Xephyr** is a kdrive-based X server that runs as a window inside an existing X session. It creates a fully functional, isolated X display that appears as a regular window on your desktop, allowing you to run a complete X environment within it.

The primary use case for Xephyr is testing and developing window managers, desktop environments, and X11 applications in a sandboxed environment. Developers can start a new window manager inside Xephyr without disrupting their current desktop session, making it safe to experiment with configurations and test changes.

Unlike **Xnest**, which is a proxy limited by the host server's capabilities, Xephyr is a real X server that uses the host window as a framebuffer. It supports modern extensions such as Composite, Damage and RandR. Xephyr supports configurable screen resolutions, fullscreen mode, multiple virtual screens, and resizable windows. It provides complete display isolation from the host X server, so applications running inside Xephyr cannot interact with the host display.

# CAVEATS

Requires a running host X server. Display must be free. Keyboard handling is basic.

# HISTORY

**Xephyr** was written by **Matthew Allum** in **2004** as a kdrive-based X server that runs in a window for development and testing.

# SEE ALSO

[Xnest](/man/Xnest)(1), [Xvfb](/man/Xvfb)(1), [startx](/man/startx)(1)

# RESOURCES

```[Source code](https://gitlab.freedesktop.org/xorg/xserver)```

```[Homepage](https://www.x.org/)```

<!-- verified: 2026-11-09 -->
