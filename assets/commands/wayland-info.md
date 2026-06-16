# TAGLINE

Display information about a Wayland compositor

# TLDR

**Show** all globals the compositor advertises

```wayland-info```

**Filter** the output to a single interface

```wayland-info -i [wl_output]```

**Connect** to a specific Wayland display

```wayland-info -d [wayland-1]```

**Save** the report to a file

```wayland-info > [path/to/file.txt]```

# SYNOPSIS

**wayland-info** [**-d** _display_] [**-i** _interface_]...

# DESCRIPTION

**wayland-info** connects to a running **Wayland** compositor and prints the global objects it exposes through the registry, together with their interface name and version. For well-known interfaces it also decodes and prints extra detail, such as the modes, geometry, scale, and transform of each **wl_output**, the formats supported by **wl_shm**, and the available seats and their capabilities.

It is the Wayland equivalent of tools like **xrandr** or **glxinfo** for X11, and is useful for checking which protocols and protocol versions a compositor supports, debugging multi-monitor setups, and confirming that a session is actually running under Wayland. The tool is part of the **wayland-utils** package and supersedes the older **weston-info**.

# PARAMETERS

**-d** _display_, **--display** _display_

> Connect to the named Wayland display instead of the one in the **WAYLAND_DISPLAY** environment variable.

**-i** _interface_, **--interface** _interface_

> Print information only for globals matching the given interface name. May be repeated to select several interfaces.

**-h**, **--help**

> Show usage information.

# CAVEATS

The tool must be run inside a Wayland session (or with **WAYLAND_DISPLAY**/**-d** pointing at a reachable compositor socket); it cannot report on an X11 session. The exact set of decoded interfaces depends on the installed version of wayland-utils.

# SEE ALSO

[swaymsg](/man/swaymsg)(1), [weston](/man/weston)(1), [drm_info](/man/drm_info)(1), [glxinfo](/man/glxinfo)(1), [xrandr](/man/xrandr)(1)

# RESOURCES

```[Source code](https://gitlab.freedesktop.org/wayland/wayland-utils)```

```[Homepage](https://wayland.freedesktop.org)```

<!-- verified: 2026-06-16 -->
