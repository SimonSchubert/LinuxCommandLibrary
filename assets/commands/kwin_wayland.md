# TAGLINE

KDE Plasma Wayland compositor and window manager

# TLDR

**Start** a nested KWin Wayland session with Xwayland

```kwin_wayland --xwayland```

**Start nested** with a custom Wayland socket name

```kwin_wayland --xwayland --socket [wayland-1]```

**Run on a TTY** using the DRM backend (default)

```kwin_wayland --drm --xwayland```

**Start and exit** when a session command finishes

```kwin_wayland --xwayland --exit-with-session=[kwrite]```

**Start full Plasma** on Wayland (preferred over calling kwin_wayland alone)

```startplasma-wayland```

# SYNOPSIS

**kwin_wayland** [_options_] [_applications_...]

# PARAMETERS

**--xwayland**
> Start an Xwayland server so X11 apps can run under this compositor.

**--socket** _name_
> Wayland socket name (default often `wayland-0`). Use a different name when nesting under another Wayland session.

**--drm**
> Use the DRM/KMS backend (full-screen takeover, typically on a TTY). Provides OpenGL acceleration.

**--framebuffer**
> Use a framebuffer backend (no OpenGL acceleration).

**--x11-display** _display_
> Explicitly target an X11 display for nested mode.

**--wayland-display** _display_
> Explicitly target a parent Wayland display for nested mode.

**--exit-with-session=**_command_
> Run _command_ as the session client and quit when it exits.

**--lock**
> Start with the screen locked.

**--replace**
> Replace a running window manager where applicable.

**applications...**
> Optional applications to launch as clients of this compositor instance.

# DESCRIPTION

**kwin_wayland** is the Wayland compositor and window manager used by KDE Plasma. It implements the Wayland display server in-process: clients connect over a Unix socket, and KWin composites windows, decorations, virtual desktops, and desktop effects.

It is the Wayland counterpart to **kwin_x11**. In a normal Plasma Wayland login, the display manager and session scripts start **kwin_wayland** (often via **startplasma-wayland**); users rarely need to invoke it by hand.

For development and testing you can run a **nested** instance under X11 or another Wayland session with **--xwayland**, then launch clients with `WAYLAND_DISPLAY` and/or `DISPLAY` pointing at the nested sockets. On a free TTY, **--drm** (the default when no parent display is set) takes over the graphics hardware.

# CAVEATS

Starting **kwin_wayland** alone is not the supported way to log into Plasma; use a display manager session or **startplasma-wayland**. Nested and TTY modes are mainly for testing. Xwayland supports many X11 apps but clipboard managers, screen capture, and some global shortcuts can behave differently than on pure X11. Hardware and driver quirks (especially NVIDIA) may need extra environment configuration.

# HISTORY

KWin began as the KDE X11 window manager in the late **1990s**. Wayland support was developed through Plasma 5; from **Plasma 5.4** onward KWin could manage Wayland clients, and Plasma Wayland sessions use **kwin_wayland** as the compositor. Plasma 6 continues to ship it as the primary Wayland stack for KDE.

# INSTALL

```apt: sudo apt install kwin-wayland```

```dnf: sudo dnf install kwin```

```pacman: sudo pacman -S kwin```

```apk: sudo apk add kwin```

<!-- packages: 2026-08-01 -->

# SEE ALSO

[kwin](/man/kwin)(1), [plasmashell](/man/plasmashell)(1), [startplasma-wayland](/man/startplasma-wayland)(1), [wayland-info](/man/wayland-info)(1), [Xwayland](/man/Xwayland)(1)

# RESOURCES

```[Source code](https://invent.kde.org/plasma/kwin)```

```[Homepage](https://kde.org/plasma-desktop/)```

```[Documentation](https://community.kde.org/KWin/Wayland)```

<!-- verified: 2026-08-01 -->
