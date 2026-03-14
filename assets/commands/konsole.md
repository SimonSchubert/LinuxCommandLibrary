# TAGLINE

KDE's terminal emulator application

# TLDR

Open terminal in a **specific directory**

```konsole --workdir [path/to/directory]```

**Execute** a command and keep window open

```konsole --noclose -e [command]```

Open a **new tab** in an existing window

```konsole --new-tab```

Start in **background mode** (Ctrl+Shift+F12 to show)

```konsole --background-mode```

Use a specific **profile**

```konsole --profile [profile_name]```

# SYNOPSIS

**konsole** [_options_]

# PARAMETERS

**--workdir** _DIR_
> Set initial working directory

**-e** _COMMAND_
> Execute command in terminal

**--noclose**
> Don't close window after command exits

**--new-tab**
> Open a new tab in existing window

**--background-mode**
> Run in background, Ctrl+Shift+F12 brings to front

**--profile** _NAME_
> Use specified profile

**--separate**
> Run in separate process

**--show-tabbar**
> Show the tab bar

**--hide-tabbar**
> Hide the tab bar

**--show-menubar**
> Show the menu bar

**--hide-menubar**
> Hide the menu bar

**--fullscreen**
> Start in fullscreen mode

# DESCRIPTION

**konsole** is KDE's terminal emulator application. It provides a powerful command-line interface with features like multiple tabs, split views, profiles, and session management.

Features include customizable color schemes, fonts, keyboard shortcuts, and the ability to monitor for activity or silence. It supports SSH bookmarks and integration with the KDE desktop.

# CAVEATS

Some features require KDE Plasma desktop. Profile settings override command-line options in some cases. Background mode requires KDE to be running.

# HISTORY

Konsole has been KDE's default terminal emulator since the early days of the KDE project. It was rewritten for KDE 4 and continues to evolve with the Plasma desktop.

# SEE ALSO

[yakuake](/man/yakuake)(1), [gnome-terminal](/man/gnome-terminal)(1), [xterm](/man/xterm)(1)
