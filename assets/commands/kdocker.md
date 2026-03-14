# TAGLINE

allows any application to be docked to the system tray

# TLDR

**Select a window to dock by clicking on it**

```kdocker```

**Launch an application and dock it to the tray**

```kdocker [application]```

**Dock the currently focused window**

```kdocker -f```

**Dock with a custom icon**

```kdocker -i [/path/to/icon.png] [application]```

**Launch an application, dock it, and minimize on start**

```kdocker -o [application]```

**Dock a window and minimize it when it loses focus**

```kdocker -l [application]```

# SYNOPSIS

**kdocker** [_options_] [_command_] [_args_]

# PARAMETERS

**-f**
> Dock the currently focused window.

**-i** _ICON_
> Use a custom icon for the docked application.

**-l**
> Minimize to tray when the window loses focus.

**-m**
> Keep application window mapped (visible); don't hide when minimizing.

**-o**
> Minimize to tray immediately on start.

**-p** _SECONDS_
> Wait the specified number of seconds before docking.

**-t**
> Remove the tray icon when the application window is closed.

**-q**
> Disable notification balloon messages.

**-w** _WINDOW_ID_
> Dock the window with the specified X11 window ID.

**--version**
> Display version information.

# DESCRIPTION

**kdocker** allows any application to be docked to the system tray. When an application is docked, clicking its tray icon toggles the window visibility, effectively providing system tray functionality to applications that don't natively support it.

The tool works by selecting a window (interactively via mouse click or automatically) and managing its visibility through the system tray. It works with both Qt and GTK applications on any X11 desktop environment.

# CAVEATS

Requires a system tray (most desktop environments provide one). Only works with X11; does not support Wayland. Behavior may vary with different window managers. Some applications may not dock correctly due to window management quirks. The **-p** delay option can help when applications take time to create their window.

# HISTORY

KDocker was originally a KDE-specific tool but evolved to work with any X11 desktop environment. It provides universal system tray functionality regardless of toolkit.

# SEE ALSO

[alltray](/man/alltray)(1), [trayer](/man/trayer)(1)
