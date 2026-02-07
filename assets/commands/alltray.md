# TAGLINE

Dock any application into the system tray.

# TLDR

**Click-mode:** run alltray and click on a window to dock it

```alltray```

**Dock a specific application** to the system tray

```alltray [application]```

**Dock an application** with a custom icon

```alltray -i [path/to/icon.png] [application]```

**Dock an application** and keep it visible after start

```alltray -s [application]```

**Dock an application** visible on all workspaces

```alltray --sticky [application]```

**Create a keyboard shortcut** to toggle the window

```alltray -k [Modifier:]Key [application]```

# SYNOPSIS

**alltray** [_OPTIONS_] [_APPLICATION_]

# PARAMETERS

**-h**, **--help**
> Show summary of options.

**-v**, **--version**
> Show version of program.

**-d**, **--debug**
> Show debug messages.

**-s**, **--show**
> Do not hide window after start.

**-i**, **--icon** _FILE_
> Use a PNG image as the tray icon.

**-l**, **--large_icons**
> Allow icons larger than 24x24 pixels.

**-st**, **--sticky**
> Make the window visible on all workspaces.

**-g**, **--geometry** _GEOMETRY_
> Set initial window position (see man X for format).

**-k**, **--key** _[Modifier:]Key_
> Create a keyboard shortcut to toggle window visibility.

**-nm**, **--nominimize**
> Close button closes the application instead of minimizing to tray.

**-conf**, **--configure**
> Show KDE configuration dialog.

# DESCRIPTION

**AllTray** docks any application into the system tray, even applications that do not natively support tray icons. This allows you to minimize applications like terminals, email clients, or media players to the system tray instead of the taskbar.

A key feature is that clicking the window's close button minimizes the application to the system tray rather than closing it. This behavior can be changed with the **--nominimize** option. AllTray works with GNOME, KDE, XFCE 4, Fluxbox, WindowMaker, and other window managers that support the system tray specification.

When run without arguments, AllTray enters click-mode where you can click on any window to dock it. Press **c** to abort click-mode.

# CAVEATS

AllTray depends on the X Window System and standard system tray protocols. It may not work with Wayland-based desktop environments. Some applications with complex window hierarchies may not dock properly. The system tray must be present in your desktop environment for AllTray to function.

# HISTORY

AllTray was created by Jochen Baier in **2005** to provide a universal solution for docking applications to the system tray on Linux desktops. It became popular as a way to keep applications running in the background without cluttering the taskbar, especially before many applications added native tray support.

# SEE ALSO

[kdocker](/man/kdocker)(1), [trayer](/man/trayer)(1), [stalonetray](/man/stalonetray)(1)
