# TAGLINE

Desktop text expansion and automation utility

# TLDR

**Start AutoKey** with GTK interface

```autokey-gtk```

**Start AutoKey** with Qt interface

```autokey-qt```

**Start with verbose logging**

```autokey-gtk --verbose```

**Show configuration** window on startup

```autokey-gtk --configure```

**Log mouse button events** too

```autokey-gtk --mouse```

# SYNOPSIS

**autokey-gtk** [_options_]

**autokey-qt** [_options_]

# PARAMETERS

**-c**, **--configure**
> Show the configuration window on startup, even if not the first run.

**-l**, **--verbose**
> Enable verbose (debug) logging.

**-m**, **--mouse**
> Like --verbose but also logs mouse button events.

**-V**, **--version**
> Display version information and exit.

**-h**, **--help**
> Display help message and exit.

# DESCRIPTION

**AutoKey** is a desktop automation utility for Linux that provides text expansion and hotkey-triggered automation. It supports both simple phrase replacement and complex Python scripting for advanced automation tasks.

**Phrases** are text snippets that expand when you type an abbreviation. For example, typing "addr" could expand to your full address. Phrases support macros for dynamic content like dates, clipboard contents, or command output.

**Scripts** use Python 3 for advanced automation including mouse clicks, keyboard simulation, window manipulation, and system commands. Scripts are triggered by abbreviations or hotkeys just like phrases.

AutoKey comes in two variants: **autokey-gtk** for GTK-based desktops (GNOME, XFCE, MATE) and **autokey-qt** for Qt-based desktops (KDE Plasma). Both share the same configuration and scripting capabilities.

# CONFIGURATION

**~/.config/autokey/**
> Configuration directory containing phrases, scripts, and application settings.

# CAVEATS

Requires X11; Wayland is not currently supported. Needs a system tray or appindicator; GNOME Shell users may need the AppIndicator Support extension. Must be running in the background for automation to work. Phrase triggers must be unique to avoid conflicts.

# HISTORY

**AutoKey** was originally created by **Chris Olsen** around **2008** as a Linux equivalent to text expansion tools available on other platforms. The project has been community-maintained since 2018 under the autokey GitHub organization. It provides TextExpander-like functionality for Linux users who need text expansion and keyboard automation.

# INSTALL

```nix: nix profile install nixpkgs#autokey```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[xdotool](/man/xdotool)(1), [xclip](/man/xclip)(1), [espanso](/man/espanso)(1)

# RESOURCES

```[Source code](https://github.com/autokey/autokey)```

```[Documentation](https://autokey.github.io/)```

<!-- verified: 2026-06-17 -->
