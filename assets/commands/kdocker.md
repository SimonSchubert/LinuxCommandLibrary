# TLDR

**Select** a window to dock (click to select)

```kdocker```

**Open** an application and dock it

```kdocker [application]```

Dock the **focused** window

```kdocker -f```

Dock with a **custom icon**

```kdocker -i [/path/to/icon]```

Dock and **minimize on focus loss**

```kdocker -l [application]```

Display **version**

```kdocker --version```

# SYNOPSIS

**kdocker** [_options_] [_command_]

# PARAMETERS

**-f**
> Dock the currently focused window

**-i** _ICON_
> Use custom icon for the docked application

**-l**
> Minimize to tray when focus is lost

**-m**
> Keep application window mapped (don't hide)

**-o**
> Minimize to tray on start

**-p** _SECONDS_
> Delay before docking

**-t**
> Remove from tray when window is closed

# DESCRIPTION

**kdocker** allows any application to be docked to the system tray. When an application is docked, clicking its tray icon toggles the window visibility, effectively providing system tray functionality to applications that don't natively support it.

The tool works by selecting a window (interactively or automatically) and managing its visibility through the system tray. It works with both Qt and GTK applications.

# CAVEATS

Requires a system tray (most desktop environments provide one). Behavior may vary with different window managers. Some applications may not dock correctly due to window management quirks.

# HISTORY

KDocker was originally a KDE-specific tool but evolved to work with any X11 desktop environment. It provides universal system tray functionality regardless of toolkit.

# SEE ALSO

[alltray](/man/alltray)(1), [trayer](/man/trayer)(1)
