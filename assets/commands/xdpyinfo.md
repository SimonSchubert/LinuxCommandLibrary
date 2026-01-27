# TLDR

**Display X server information**

```xdpyinfo```

**Query extension details**

```xdpyinfo -queryExtensions```

**Show specific extension info**

```xdpyinfo -ext [RENDER]```

**Show all extension details**

```xdpyinfo -ext all```

**Query specific display**

```xdpyinfo -display [:0]```

**Show version**

```xdpyinfo -version```

# SYNOPSIS

**xdpyinfo** [_options_]

# PARAMETERS

**-display** _name_
> X display to query.

**-queryExtensions**
> Include extension opcode/event/error numbers.

**-ext** _name_
> Show detailed extension information (use "all" for all).

**-version**
> Display version and exit.

# DESCRIPTION

**xdpyinfo** displays information about an X server including its capabilities, protocol version, vendor, available screens and visuals, and loaded extensions.

Output includes screen dimensions, color depth, supported visual types, and default settings. Extension information shows which X11 extensions are available, useful for debugging graphics and input issues.

The tool helps verify X server configuration, check for required extensions, and troubleshoot display problems. It's commonly used to confirm X11 is working correctly.

# CAVEATS

Requires running X server and DISPLAY set correctly. Using -queryExtensions may load all extensions, consuming resources. X11 only; doesn't work on pure Wayland.

# HISTORY

**xdpyinfo** is part of the X.Org project's utility collection. X11 has been the standard display protocol for Unix systems since 1987. The tool provides essential diagnostic information for X server administration and troubleshooting.

# SEE ALSO

[xwininfo](/man/xwininfo)(1), [xprop](/man/xprop)(1), [xrandr](/man/xrandr)(1), [glxinfo](/man/glxinfo)(1)
