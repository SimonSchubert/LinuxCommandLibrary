# TAGLINE

X11 compatibility layer for Wayland

# TLDR

**Start rootless** (typical usage by compositor)

```Xwayland :0 -rootless```

**Start rootful for testing**

```Xwayland :1 -geometry [1920x1080]```

**Start fullscreen rootful**

```Xwayland :1 -fullscreen```

**Start with decorations**

```Xwayland :1 -decorate```

**Force shared memory backend**

```Xwayland :0 -rootless -shm```

**Enable verbose output**

```Xwayland :0 -rootless -verbose [2]```

# SYNOPSIS

**Xwayland** [:_display_] [_options_]

# PARAMETERS

**-rootless**
> Run rootless, integrating X clients with Wayland desktop.

**-fullscreen**
> Run rootful window fullscreen.

**-geometry** _WxH_
> Set rootful window geometry.

**-decorate**
> Add decorations to rootful window.

**-output** _name_
> Output for fullscreen rootful.

**-host-grab**
> Disable host shortcuts, confine pointer (Ctrl+Shift to release).

**-shm**
> Force shared memory backend.

**-glamor**
> Force OpenGL rendering (not GL ES).

**-hidpi**
> Adjust to output scale in rootful mode.

**-noTouchPointerEmulation**
> Disable touch pointer emulation.

**-nokeymap**
> Ignore compositor keymap.

**-listenfd** _fd_
> Add listen socket (used by compositor).

**-wm** _fd_
> Window manager socket (used by compositor).

**-verbose** _n_
> Set verbosity level.

**-version**
> Display version.

# DESCRIPTION

**Xwayland** is an X server that runs X11 applications under Wayland compositors. It translates X11 protocol to Wayland, enabling legacy X applications to work in modern Wayland desktops.

In rootless mode (default), X windows integrate seamlessly with Wayland windows, managed by the compositor. In rootful mode, Xwayland runs in its own window for testing or isolation.

Xwayland is typically spawned automatically by the Wayland compositor (GNOME, KDE Plasma, Sway, etc.) when X11 applications are launched.

Input, clipboard, and drag-and-drop are bridged between X11 and Wayland contexts.

# CAVEATS

Some X11-specific features may not work (screen capture, global hotkeys). Performance may be lower than native Wayland. Rootful mode is mainly for testing. HiDPI scaling requires compositor support.

# HISTORY

**Xwayland** was developed as part of the X.Org server project to enable X11 compatibility during the transition to Wayland. It became essential for running applications that haven't been ported to Wayland natively.

# SEE ALSO

[Xorg](/man/Xorg)(1), [Xserver](/man/Xserver)(1), [wayland](/man/wayland)(7), [sway](/man/sway)(1)
