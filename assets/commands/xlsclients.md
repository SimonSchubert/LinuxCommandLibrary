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

**xlsclients** lists X clients. It shows running X apps.

Window listing. Running applications.

Display info. Which apps connected.

Debug tool. X11 troubleshooting.

Part of xorg-apps. Standard X tool.

# CAVEATS

X11 only. No Wayland. Limited info shown.

# HISTORY

**xlsclients** is a standard X11 utility for listing client applications connected to an X server.

# SEE ALSO

[xwininfo](/man/xwininfo)(1), [xprop](/man/xprop)(1), [xdotool](/man/xdotool)(1)
