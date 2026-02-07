# TAGLINE

GNOME desktop terminal emulator

# TLDR

Open a new **GNOME terminal window**

```gnome-terminal```

Run a **specific command** in a new terminal window

```gnome-terminal -- [command]```

Open a new **tab** in the last opened window

```gnome-terminal --tab```

Set the **title** of the new tab

```gnome-terminal --tab -t "[title]"```

# SYNOPSIS

**gnome-terminal** [_options_] [**--**] [_command_]

# PARAMETERS

**--tab**
> Open a new tab in existing window

**--window**
> Open a new window

**-t**, **--title** _TITLE_
> Set initial terminal title

**--working-directory** _DIR_
> Set working directory

**--geometry** _GEOMETRY_
> Set window size and position (WIDTHxHEIGHT+X+Y)

**--profile** _PROFILE_
> Use specified profile

**-e**, **--command** _CMD_
> Execute command (deprecated, use -- instead)

**--wait**
> Wait until terminal exits

**--maximize**
> Start maximized

**--full-screen**
> Start in full-screen mode

# DESCRIPTION

**gnome-terminal** is the default terminal emulator for the GNOME desktop environment. It provides a feature-rich terminal with support for multiple tabs, profiles, and customization options.

Features include multiple profiles with different colors and fonts, transparent backgrounds, custom key bindings, and VTE-based terminal emulation with Unicode support.

# CONFIGURATION

**dconf /org/gnome/terminal/**
> Terminal settings stored in dconf, configurable via gsettings or the Preferences dialog.

# CAVEATS

On Wayland, some X11-specific features like geometry positioning may not work. The --geometry option is deprecated on modern setups. Heavy customization requires editing dconf settings.

# HISTORY

gnome-terminal has been part of GNOME since version 1.0 in **1999**. It uses the VTE (Virtual Terminal Emulator) widget library, which is also used by other terminals like Terminator and Tilix. The application has evolved significantly through GNOME's various iterations.

# SEE ALSO

[bash](/man/bash)(1), [xterm](/man/xterm)(1), [tilix](/man/tilix)(1), [alacritty](/man/alacritty)(1)
