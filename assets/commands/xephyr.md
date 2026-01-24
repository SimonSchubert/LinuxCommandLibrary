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

**Xephyr** runs nested X server. It's X in a window.

Window manager testing. Safe testing.

Display isolation. Separate X server.

Development tool. Test configurations.

Kdrive-based. Lightweight.

# CAVEATS

X11 only. No Wayland. Display must be free.

# HISTORY

**Xephyr** was created as a modern kdrive-based X server that runs in a window for development and testing.

# SEE ALSO

[Xnest](/man/Xnest)(1), [Xvfb](/man/Xvfb)(1), [startx](/man/startx)(1)
