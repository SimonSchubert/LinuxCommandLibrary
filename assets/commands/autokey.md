# TLDR

**Start AutoKey** with GTK interface

```autokey-gtk```

**Start AutoKey** with Qt interface

```autokey-qt```

**Start minimized** to system tray

```autokey-gtk --minimized```

**Start with verbose logging**

```autokey-gtk --verbose```

**Show configuration** window

```autokey-gtk --configure```

# SYNOPSIS

**autokey-gtk** [_options_]

**autokey-qt** [_options_]

# PARAMETERS

**-c**, **--configure**
> Open the configuration window on startup

**-l**, **--verbose**
> Enable verbose debug logging

**-m**, **--minimized**
> Start minimized to system tray

**-h**, **--help**
> Display help message

# DESCRIPTION

**AutoKey** is a desktop automation utility for Linux that provides text expansion and hotkey-triggered automation. It supports both simple phrase replacement and complex Python scripting for advanced automation tasks.

**Phrases** are text snippets that expand when you type an abbreviation. For example, typing "addr" could expand to your full address. Phrases support macros for dynamic content like dates, clipboard contents, or command output.

**Scripts** use Python 3 for advanced automation including mouse clicks, keyboard simulation, window manipulation, and system commands. Scripts are triggered by abbreviations or hotkeys just like phrases.

AutoKey comes in two variants: **autokey-gtk** for GTK-based desktops (GNOME, XFCE, MATE) and **autokey-qt** for Qt-based desktops (KDE Plasma). Both share the same configuration and scripting capabilities.

Configuration files are stored in **~/.config/autokey/** and include phrases, scripts, and settings.

# CAVEATS

Requires X11; Wayland is not currently supported. Needs a system tray or appindicator; GNOME Shell users may need the AppIndicator Support extension. Must be running in the background for automation to work. Phrase triggers must be unique to avoid conflicts.

# HISTORY

**AutoKey** was originally created by **Chris Olsen** around **2008** as a Linux equivalent to text expansion tools available on other platforms. The project has been community-maintained since 2018 under the autokey GitHub organization. It provides TextExpander-like functionality for Linux users who need text expansion and keyboard automation.

# SEE ALSO

[xdotool](/man/xdotool)(1), [xclip](/man/xclip)(1), [espanso](/man/espanso)(1)
