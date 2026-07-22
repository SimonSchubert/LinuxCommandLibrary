# TAGLINE

OpenGL and GLX capability display tool

# TLDR

**Show OpenGL information**

```glxinfo```

**Show brief summary**

```glxinfo -B```

**Show only vendor and version**

```glxinfo | grep "OpenGL"```

**List supported extensions**

```glxinfo | grep "GL_"```

**Display on specific screen**

```DISPLAY=:0 glxinfo```

**Show in-depth limits**

```glxinfo -l```

# SYNOPSIS

**glxinfo** [_options_]

# PARAMETERS

**-B**
> Brief output (summary only).

**-l**
> Display extended limits.

**-v**
> Verbose output for the visual list.

**-t**
> Produce a wider, more readable tabular format for the visual list.

**-s**
> Print a single extension per line.

**-i**
> Force indirect rendering.

**-b**
> Find the "best" visual and print its number.

**-display** _dpy_
> Specify X display.

**-h**
> Display help.

# DESCRIPTION

**glxinfo** displays information about the GLX implementation and OpenGL capabilities of the graphics system. It is useful for diagnosing graphics driver issues and checking hardware capabilities.

The tool queries the X server and graphics driver, reporting OpenGL version, renderer, vendor, and supported extensions.

# CAVEATS

Requires X server connection. Results depend on driver and configuration. Indirect rendering may show different capabilities. Wayland needs XWayland.

# HISTORY

**glxinfo** is part of the **mesa-utils** package, associated with the **Mesa** 3D Graphics Library. Mesa was started by **Brian Paul** in **1993**, and glxinfo has been a standard diagnostic tool for OpenGL on X11 systems since the early days of GLX.

# INSTALL

```apt: sudo apt install mesa-utils```

```pacman: sudo pacman -S mesa-utils```

```apk: sudo apk add mesa-utils```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[glxgears](/man/glxgears)(1), [xdpyinfo](/man/xdpyinfo)(1), [vulkaninfo](/man/vulkaninfo)(1), [nvidia-smi](/man/nvidia-smi)(1)

# RESOURCES

```[Source code](https://gitlab.freedesktop.org/mesa/demos)```

```[Manual page](https://manpages.debian.org/testing/mesa-utils/glxinfo.1.en.html)```

<!-- verified: 2026-07-17 -->
