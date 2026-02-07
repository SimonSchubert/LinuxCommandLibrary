# TAGLINE

dynamic virtual terminal manager

# TLDR

**Start dvtm**

```dvtm```

**Start with specific shell**

```dvtm -s [/bin/zsh]```

**Attach to existing session**

```dvtm -a```

**Start with specific layout**

```dvtm -l [tile]```

**Use status command**

```dvtm -c "[date]"```

# SYNOPSIS

**dvtm** [_options_]

# DESCRIPTION

**dvtm** (dynamic virtual terminal manager) brings dwm-style window management to the terminal. It tiles multiple terminal windows within a single terminal emulator.

The tool provides dynamic layouts, tagging, and keyboard-driven window management. It's lightweight and follows the suckless philosophy of minimalism.

# CONFIGURATION

**config.h**
> Source-level configuration file that must be edited and recompiled to change keybindings, colors, layouts, and behavior.

# PARAMETERS

**-s** _shell_
> Shell to use for windows.

**-a**
> Attach to running session.

**-M**
> Toggle default mouse support.

**-m** _mod_
> Modifier key (default Ctrl+g).

**-l** _layout_
> Default layout.

**-c** _cmd_
> Status bar command.

**-t** _title_
> Window title.

# DEFAULT KEYS

**Mod+c**: Create window
**Mod+x**: Close window
**Mod+j/k**: Focus next/previous
**Mod+h/l**: Resize master
**Mod+Enter**: Zoom window
**Mod+Space**: Toggle layout
**Mod+q**: Quit

# LAYOUTS

**tile**: Master-stack
**grid**: Grid layout
**bstack**: Bottom stack
**fullscreen**: Single maximized

# CAVEATS

Limited compared to tmux/screen. No built-in session persistence (use dtach). Configuration requires recompilation. Modifier key may conflict with applications.

# HISTORY

**dvtm** was created by **Marc Andre Tanner** as a terminal multiplexer following **dwm** principles. It emerged from the suckless community around **2007**, providing dynamic tiling for terminal environments without the complexity of screen or tmux.

# SEE ALSO

[tmux](/man/tmux)(1), [screen](/man/screen)(1), [dtach](/man/dtach)(1), [abduco](/man/abduco)(1)
