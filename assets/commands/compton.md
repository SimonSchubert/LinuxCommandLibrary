# TLDR

**Start compton** with default settings

```compton```

**Start with a configuration file**

```compton --config [~/.config/compton.conf]```

**Enable shadows** on windows

```compton -c```

**Enable fading** effects for windows

```compton -f```

**Set shadow opacity**

```compton -c -o [0.5]```

**Disable shadows on dock** and panel windows

```compton -c -C```

**Run in background** as daemon

```compton -b```

**Enable vsync** to prevent tearing

```compton --vsync opengl```

# SYNOPSIS

**compton** [_options_]

# PARAMETERS

**-c**, **--shadow**
> Enable client-side shadows on windows.

**-C**, **--no-dock-shadow**
> Disable shadows on dock/panel windows.

**-f**, **--fading**
> Fade windows in/out when opening/closing.

**-o** _OPACITY_
> Shadow opacity (0.0 to 1.0).

**-r** _RADIUS_
> Shadow blur radius in pixels.

**-l** _OFFSET_
> Left offset for shadows in pixels.

**-t** _OFFSET_
> Top offset for shadows in pixels.

**--vsync** _METHOD_
> VSync method: none, drm, opengl, opengl-oml, opengl-swc.

**-b**, **--daemon**
> Run as a background daemon.

**--config** _FILE_
> Read configuration from the specified file.

**-i** _OPACITY_
> Inactive window opacity (0.0 to 1.0).

**-e** _OPACITY_
> Opacity of window titlebars and borders.

**--backend** _BACKEND_
> Rendering backend: xrender, glx.

# DESCRIPTION

**compton** is a standalone compositor for X11, providing visual effects like window shadows, transparency, fading animations, and vsync to prevent screen tearing. It works with any window manager that supports compositing.

The compositor operates by intercepting window rendering and applying effects before displaying the final image. It supports both XRender and OpenGL backends, with GLX generally providing better performance. Configuration can be done via command-line options or a configuration file.

Compton is commonly used with lightweight window managers like i3, openbox, and bspwm to add visual polish without the overhead of a full desktop environment's compositor. It can also help with screen tearing issues on systems without built-in compositing.

# CAVEATS

Compton development has ceased; **picom** is the actively maintained fork and recommended for new installations. OpenGL backend may have compatibility issues with some graphics drivers. Compositing adds GPU overhead that may affect performance on older hardware.

# HISTORY

Compton was forked from **xcompmgr** in **2011** by Christopher Jeffrey (chjj) to add features and fix bugs. It became popular in the Linux ricing community for its configurability. Development stalled around **2017**, leading to the creation of **picom** as an actively maintained fork.

# SEE ALSO

[picom](/man/picom)(1), [xcompmgr](/man/xcompmgr)(1), [i3](/man/i3)(1)
