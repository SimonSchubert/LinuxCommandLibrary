# TLDR

**Start KWin (X11)**

```kwin_x11 --replace```

**Start KWin Wayland**

```kwin_wayland```

**Restart KWin**

```kwin_x11 --replace &```

**Reconfigure KWin**

```qdbus org.kde.KWin /KWin reconfigure```

**List effects**

```qdbus org.kde.KWin /Effects listLoadedEffects```

# SYNOPSIS

**kwin_x11** [_options_]

**kwin_wayland** [_options_]

# PARAMETERS

**--replace**
> Replace running window manager.

**--crashes** _n_
> Crash limit for restart.

**--lock**
> Start with screen locked.

**--no-kactivities**
> Disable KActivities.

# DESCRIPTION

**KWin** is the window manager for KDE Plasma. It handles window placement, decorations, virtual desktops, and desktop effects (compositing).

KWin supports both X11 (kwin_x11) and Wayland (kwin_wayland) sessions, providing features like window tiling, wobbly windows, desktop grid, and scripting.

# D-BUS CONTROL

```bash
# Toggle present windows
qdbus org.kde.KWin /Effects togglePresentWindows

# Show desktop grid
qdbus org.kde.KWin /Effects showDesktopGrid

# Reconfigure after settings change
qdbus org.kde.KWin /KWin reconfigure
```

# CAVEATS

Wayland session has different capabilities than X11. Some effects require OpenGL. Scripting uses JavaScript.

# HISTORY

KWin was originally written by **Matthias Ettrich** as part of KDE 1 in **1997**. It has evolved significantly, adding compositing support in KDE 4 and Wayland support in Plasma 5.

# SEE ALSO

[plasmashell](/man/plasmashell)(1), [systemsettings](/man/systemsettings)(1), [qdbus](/man/qdbus)(1)
