# TAGLINE

Reference Wayland compositor

# TLDR

**Start Weston compositor** (requires seat access)

```weston```

**Start with a specific backend**

```weston --backend=[drm|wayland|x11]```

**Start with a specific shell**

```weston --shell=[desktop|fullscreen|kiosk]```

**Start in windowed mode** under X11

```weston --backend=x11```

**Start nested** inside another Wayland compositor

```weston --backend=wayland```

**Run with Xwayland** for X11 client compatibility

```weston --xwayland```

**Specify display socket name**

```weston -S [wayland-1]```

**Start with specific configuration file**

```weston -c [path/to/weston.ini]```

# SYNOPSIS

**weston** [**-B**=_backend_] [**--shell**=_shell_] [**-S**=_name_] [**-c**=_file_] [_options_]

# PARAMETERS

**-B**, **--backend**=_backend_
> Compositor backend: drm (native), x11, wayland, headless, rdp, vnc, pipewire.

**--shell**=_shell_
> Shell plugin: desktop (default), fullscreen, kiosk, ivi.

**-S**, **--socket**=_name_
> Wayland socket name for clients to connect.

**-c**, **--config**=_file_
> Path to configuration file. Default is $XDG_CONFIG_HOME/weston.ini or ~/.config/weston/weston.ini.

**--no-config**
> Do not read configuration file.

**--modules**=_module_
> Load additional modules (comma-separated).

**--renderer**=_name_
> Select rendering engine (gl, pixman, vulkan, noop).

**--xwayland**
> Enable X11 application support via Xwayland.

**-i**, **--idle-time**=_seconds_
> Idle timeout before screen saver.

**--log**=_file_
> Log file path.

**-l**, **--logger-scopes**=_scopes_
> Comma-separated logger scopes to enable.

**--debug**
> Enable debug protocol extension.

**--width**=_pixels_
> Initial output width (windowed backends).

**--height**=_pixels_
> Initial output height (windowed backends).

**--scale**=_factor_
> Output scale factor.

**-h**, **--help**
> Display help message.

**--version**
> Display version information.

# DESCRIPTION

**Weston** is the reference Wayland compositor, serving as both a display server and window manager. It demonstrates Wayland protocol capabilities and provides a functional desktop environment for testing and embedded systems.

Weston supports multiple backends for different deployment scenarios: DRM for native Linux framebuffer access, X11 or Wayland backends for running nested inside other display servers, and headless/RDP/VNC backends for remote or testing purposes.

Different shells provide various user interface styles: desktop shell for traditional workstation use, fullscreen shell for single-application kiosks, and IVI shell for in-vehicle infotainment systems. Configuration is done through weston.ini.

Weston requires access to input devices and display hardware through a seat manager (seatd or elogind). For native mode, the user must have appropriate permissions via the seat mechanism.

# CAVEATS

Requires Linux kernel mode setting (KMS) for native operation. Running directly requires seat management setup (seatd or elogind). Some features depend on GPU driver support for EGL and DRM. weston-launch is deprecated since version 10.0.0.

# HISTORY

**Weston** was developed alongside the **Wayland** protocol at **freedesktop.org**, with initial development led by **Kristian Høgsberg** starting around **2010**. It served as the proving ground for Wayland concepts and remains the reference implementation. While production desktops typically use compositors like GNOME's Mutter or KDE's KWin, Weston continues development for testing, embedded systems, and automotive applications.

# INSTALL

```apt: sudo apt install weston```

```dnf: sudo dnf install weston```

```pacman: sudo pacman -S weston```

```apk: sudo apk add weston```

```zypper: sudo zypper install weston```

```nix: nix profile install nixpkgs#weston```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[sway](/man/sway)(1), [Xwayland](/man/Xwayland)(1), [xrandr](/man/xrandr)(1)
