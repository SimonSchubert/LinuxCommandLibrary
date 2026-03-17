# TAGLINE

A nested X server that runs as a client window

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
> Parent X server to connect to. Defaults to DISPLAY environment variable.

**-geometry** _WxH+X+Y_
> Window geometry for the nested server.

**-scrns** _num_
> Number of screens to create.

**-depth** _n_
> Default color depth.

**-fullscreen**
> Run fullscreen on the parent display.

**-bw** _n_
> Border width in pixels.

**-name** _string_
> Window name for the nested server.

**-sss**
> Enable separate screen saver for each screen.

**-sync**
> Synchronize window and graphics operations with the parent server. Useful for debugging but significantly slows performance.

# DESCRIPTION

**Xnest** is both an X client and an X server. It runs as a window within another X server (the parent), appearing as a regular X client to the parent while providing a complete X server environment to its own clients.

Applications connect to Xnest using its display number (e.g., `:1`) and receive a fully functional X environment. Multiple screens can be referenced by the number after the dot in the display name (e.g., `xterm -display :1.1` for the second screen). This enables testing window managers, running isolated X sessions, or displaying remote X applications in a contained window.

Xnest manages fonts by loading them locally and passing the font name to the real server. For better performance and modern X extension support, **Xephyr** is recommended as a replacement.

# CAVEATS

Lacks modern X extensions (XRender, Composite, RandR). No hardware acceleration. Resource intensive. Xephyr is recommended for most use cases. Requires display number different from parent.

# HISTORY

**Xnest** was developed as a debugging and testing tool for X11. It enabled developers to test applications and window managers without risking their primary desktop. While still functional, the more capable Xephyr server has largely superseded it for modern use.

# SEE ALSO

[Xvfb](/man/Xvfb)(1), [Xorg](/man/Xorg)(1), [startx](/man/startx)(1)
