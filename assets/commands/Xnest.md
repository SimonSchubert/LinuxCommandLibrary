# TLDR

**Start nested X server on display :1**

```Xnest :1```

**Start with specific window size**

```Xnest :1 -geometry [800x600]```

**Start with multiple screens**

```Xnest :1 -scrns [2]```

**Connect to specific parent display**

```Xnest :1 -display [:0]```

**Start fullscreen**

```Xnest :1 -fullscreen```

# SYNOPSIS

**Xnest** [:_display_] [_options_]

# PARAMETERS

**-display** _name_
> Parent X server to connect to.

**-geometry** _WxH+X+Y_
> Window geometry for nested server.

**-scrns** _num_
> Number of screens to create.

**-depth** _n_
> Default color depth.

**-fullscreen**
> Run fullscreen on parent display.

**-bw** _n_
> Border width in pixels.

**-name** _string_
> Window name.

# DESCRIPTION

**Xnest** is a nested X server that runs as a window within another X server. It appears as a regular X client to the parent server while providing a complete X server environment to its own clients.

Applications connect to Xnest using its display number (e.g., :1) and receive a fully functional X environment. This enables testing window managers, running isolated X sessions, or displaying remote X applications in a contained window.

Xnest is resource-intensive since most requests pass through to the parent server. For better performance and modern extension support, Xephyr is recommended as a replacement.

# CAVEATS

Lacks modern X extensions (XRender, Composite, RandR). No hardware acceleration. Resource intensive. Xephyr is recommended for most use cases. Requires display number different from parent.

# HISTORY

**Xnest** was developed as a debugging and testing tool for X11. It enabled developers to test applications and window managers without risking their primary desktop. While still functional, the more capable Xephyr server has largely superseded it for modern use.

# SEE ALSO

[Xephyr](/man/Xephyr)(1), [Xvfb](/man/Xvfb)(1), [Xorg](/man/Xorg)(1), [startx](/man/startx)(1)
