# TAGLINE

KDE drop-down terminal emulator

# TLDR

**Start** yakuake

```yakuake```

**Show version** information

```yakuake --version```

**Show help**

```yakuake --help```

# SYNOPSIS

**yakuake** [_Qt options_] [_KDE options_]

# PARAMETERS

**--help**
> Display help information.

**--help-qt**
> Display Qt-specific options.

**--help-kde**
> Display KDE-specific options.

**--version**
> Show version information.

**--author**
> Show authors and credits.

**--license**
> Display licensing information.

# KEYBOARD SHORTCUTS

**F12**
> Toggle Yakuake visibility (retract/extend).

**Ctrl+Shift+T**
> Open a new session (tab).

**Ctrl+Shift+W**
> Close the current session.

**Ctrl+(**
> Split the current session left/right.

**Ctrl+)**
> Split the current session top/bottom.

**Ctrl+Shift+X**
> Close the active split.

**Shift+Left / Shift+Right**
> Switch to the previous/next session tab.

**Ctrl+Alt+S**
> Rename the current session.

**Ctrl+Shift+,**
> Open the configuration dialog.

# DESCRIPTION

**yakuake** is a drop-down terminal emulator for KDE based on **Konsole** technology. It slides down from the top of the screen when activated with a configurable global shortcut (F12 by default), similar to Quake-style consoles.

The terminal supports tabs, horizontal and vertical split views, configurable width/height/opacity, and extensive customization through the KDE settings system and D-Bus scripting.

# CAVEATS

Designed for KDE Plasma but works under other desktops provided the required KDE Frameworks libraries are installed. The F12 global shortcut may conflict with other applications; it can be rebound in the configuration dialog.

# SEE ALSO

[guake](/man/guake)(1), [konsole](/man/konsole)(1), [tilda](/man/tilda)(1)
