# TAGLINE

Display X server information

# TLDR

**Display all X server information**

```xdpyinfo```

**Query a specific display**

```xdpyinfo -display [localhost:0.0]```

**List extensions with opcode and event numbers**

```xdpyinfo -queryExtensions```

**Show detailed info for a specific extension**

```xdpyinfo -ext [RENDER]```

**Show detailed info for all extensions**

```xdpyinfo -ext all```

**Display version and exit**

```xdpyinfo -version```

# SYNOPSIS

**xdpyinfo** [_options_]

# PARAMETERS

**-display** _name_
> X display to query (default: $DISPLAY).

**-queryExtensions**
> Include extension opcode, event base, and error base numbers.

**-ext** _name_
> Show detailed information for the named extension (use "all" for all extensions).

**-version**
> Display program version and exit.

# DESCRIPTION

**xdpyinfo** displays information about an X server including its capabilities, protocol version, vendor, available screens and visuals, and loaded extensions.

Output includes screen dimensions, color depth, supported visual types, and default settings. Extension information shows which X11 extensions are available, useful for debugging graphics and input issues.

The tool helps verify X server configuration, check for required extensions, and troubleshoot display problems. It's commonly used to confirm X11 is working correctly.

# CAVEATS

Requires running X server and DISPLAY set correctly. Using -queryExtensions may load all extensions, consuming resources. X11 only; doesn't work on pure Wayland.

# HISTORY

**xdpyinfo** is part of the X.Org project's utility collection. X11 has been the standard display protocol for Unix systems since 1987. The tool provides essential diagnostic information for X server administration and troubleshooting.

# SEE ALSO

[xwininfo](/man/xwininfo)(1), [xprop](/man/xprop)(1), [xrandr](/man/xrandr)(1), [glxinfo](/man/glxinfo)(1), [xset](/man/xset)(1), [xlsclients](/man/xlsclients)(1)
