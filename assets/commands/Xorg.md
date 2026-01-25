# TLDR

**Start X server** on default display

```Xorg```

**Start on specific display**

```Xorg :1```

**Configure and test** without starting

```Xorg -configure```

**Start with specific config file**

```Xorg -config [/path/to/xorg.conf]```

**Start on specific virtual terminal**

```Xorg vt7```

**Query supported modes** for display

```Xorg -query [hostname]```

**Retro probe only** (no server start)

```Xorg -retro -probeonly```

# SYNOPSIS

**Xorg** [**:**_DISPLAY_] [_OPTIONS_]

# PARAMETERS

**:**_DISPLAY_
> Display number to use (default: 0).

**-config** _FILE_
> Use specified configuration file instead of default.

**-configure**
> Probe hardware and generate xorg.conf.

**-logfile** _FILE_
> Write log to specified file.

**-modulepath** _PATH_
> Search path for loadable modules.

**-retro**
> Start with classic X stipple background.

**-probeonly**
> Probe hardware without starting server.

**-query** _HOST_
> Connect to XDMCP host.

**-verbose** [_N_]
> Verbosity level (0-7).

**vt**_N_
> Use virtual terminal N.

**-nolisten** _PROTO_
> Disable listening on protocol (e.g., tcp).

**-novtswitch**
> Don't automatically switch VT at startup.

# DESCRIPTION

**Xorg** is the X Window System server implementation from X.Org Foundation. It provides the foundation for graphical user interfaces on Unix-like systems, managing displays, input devices, and graphics hardware.

The server reads configuration from /etc/X11/xorg.conf or files in /etc/X11/xorg.conf.d/. Modern systems often run without explicit configuration, relying on automatic hardware detection.

Xorg is typically started by a display manager (GDM, SDDM, LightDM) or the **startx** script rather than directly. It runs on a virtual terminal and provides the display connection for X clients.

# CAVEATS

Running Xorg requires appropriate permissions (typically root or membership in video group). Many systems now use Wayland compositors instead of Xorg. Configuration errors can leave the system without a graphical interface; keep a backup configuration or use fallback options.

# HISTORY

X.Org Server is the successor to XFree86 and the reference implementation of the X Window System. The X.Org Foundation was formed in **2004** after a licensing dispute with XFree86. Xorg has been the standard X server on Linux and BSD systems, though Wayland is increasingly replacing it for desktop use.

# SEE ALSO

[startx](/man/startx)(1), [xinit](/man/xinit)(1), [xrandr](/man/xrandr)(1), [xorg.conf](/man/xorg.conf)(5)
