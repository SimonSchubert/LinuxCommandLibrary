# TAGLINE

List connected X11 client applications

# TLDR

**List X clients**

```xlsclients```

**Show all windows**

```xlsclients -a```

**Long format**

```xlsclients -l```

**Specific display**

```xlsclients -display [:0]```

# SYNOPSIS

**xlsclients** [_-a_] [_-l_] [_-display dpy_] [_options_]

# PARAMETERS

**-a**
> All screens.

**-l**
> Long format.

**-display** _DPY_
> X display.

**-m** _MAXCMD_
> Max command length.

# DESCRIPTION

**xlsclients** lists the client applications currently connected to an X display server. For each client, it shows the window name and the command used to launch it, providing a quick overview of what X11 applications are running.

The tool is useful for debugging X11 sessions, identifying which applications are consuming display resources, and verifying that expected clients are connected. The **-a** option shows clients across all screens, while **-l** provides a long format with additional detail about each client's machine name and command line.

# CAVEATS

X11 only. No Wayland. Limited info shown.

# HISTORY

**xlsclients** is a standard X11 utility for listing client applications connected to an X server.

# SEE ALSO

[xwininfo](/man/xwininfo)(1), [xprop](/man/xprop)(1), [xdotool](/man/xdotool)(1)
