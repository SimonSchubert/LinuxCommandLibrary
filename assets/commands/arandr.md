# TAGLINE

Visual front end for display configuration

# TLDR

**Launch the graphical display configuration** tool

```arandr```

**Configure a different display** while showing GUI on current display

```arandr --randr-display [DISPLAY]```

# SYNOPSIS

**arandr** [**--randr-display=**_DISPLAY_]

# PARAMETERS

**--randr-display=**_DISPLAY_
> Use a specific X display for xrandr operations while showing the GUI on the display from the environment

**-h**, **--help**
> Display help message

**--version**
> Display version information

# DESCRIPTION

**ARandR** (Another RandR) is a graphical front end for the XRandR 1.2 extension. It provides a visual interface for configuring display outputs, resolutions, refresh rates, and multi-monitor layouts.

The application shows connected monitors as draggable rectangles, allowing intuitive arrangement of display positions. Changes take effect immediately, and configurations can be saved as executable shell scripts for later use or automatic execution at login.

Key features include drag-and-drop monitor positioning with edge snapping, support for rotation, resolution selection, and enabling/disabling outputs. Saved scripts are plain text and can be edited to include additional commands.

For command-line control of display settings, use **xrandr** directly. ARandR generates xrandr commands internally and is useful for visualizing and experimenting with multi-monitor setups.

# CAVEATS

Requires a running X server with XRandR 1.2 or later support. Does not work with Wayland compositors; use their native display configuration tools instead. Saved configurations only persist if the script is executed at login (via ~/.xprofile, ~/.xinitrc, or session autostart).

# HISTORY

**ARandR** was created by **Christian Aichinger** as an alternative to GNOME and KDE display configuration tools for users of lightweight window managers. The project aims to provide a simple, desktop-environment-independent way to configure displays visually while remaining portable and minimal.

# SEE ALSO

[xrandr](/man/xrandr)(1), [xorg.conf](/man/xorg.conf)(5), [lxrandr](/man/lxrandr)(1)
