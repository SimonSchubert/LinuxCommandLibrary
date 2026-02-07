# TAGLINE

highly configurable X11 window manager

# TLDR

**Start FVWM**

```fvwm```

**Start with specific config**

```fvwm -f [~/.fvwm/config]```

**Replace running window manager**

```fvwm --replace```

**Show version**

```fvwm --version```

# SYNOPSIS

**fvwm** [_options_]

# PARAMETERS

**-f** _file_
> Configuration file.

**-c** _command_
> Execute command on startup.

**-d** _display_
> X display to use.

**--replace**
> Replace running window manager.

**-s**
> Single screen mode.

**-v**, **--version**
> Show version.

# DESCRIPTION

**FVWM** (F Virtual Window Manager) is a highly configurable window manager for X11. It provides virtual desktops, extensive theming, and a powerful configuration language.

FVWM is known for its flexibility and low resource usage. Configuration is done through a text file with commands for window decoration, menus, keybindings, and module loading.

# CONFIGURATION

**~/.fvwm/config**
> Main configuration file for window styles, keybindings, menus, and modules.

# CONFIGURATION EXAMPLE

```
# ~/.fvwm/config
Style * BorderWidth 5
Style * HandleWidth 5
Style * MWMButtons

Key Tab A M WindowList Root c c

Mouse 1 R A Menu MainMenu
Mouse 3 R A WindowList

AddToMenu MainMenu "Main" Title
+ "Terminal" Exec exec xterm
+ "Exit" Quit
```

# CAVEATS

Configuration has learning curve. Documentation can be sparse. FVWM3 is the current major version. Some features require external modules.

# HISTORY

FVWM was derived from TWM by **Robert Nation** in **1993**. The name originally meant "Feeble Virtual Window Manager" but the meaning has been changed multiple times. FVWM2 was a major rewrite in 1996, and FVWM3 was released in 2020.

# SEE ALSO

[openbox](/man/openbox)(1), [i3](/man/i3)(1), [twm](/man/twm)(1), [xorg](/man/xorg)(1)
