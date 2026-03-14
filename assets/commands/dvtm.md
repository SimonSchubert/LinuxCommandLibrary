# TAGLINE

dynamic virtual terminal manager

# TLDR

**Start dvtm**

```dvtm```

**Set modifier key** to Ctrl+a

```dvtm -m ^a```

**Enable mouse support**

```dvtm -M```

**Set scrollback history** buffer size

```dvtm -h [5000]```

**Use a status FIFO** for the status bar

```dvtm -s [/tmp/dvtm-status]```

# SYNOPSIS

**dvtm** [_options_]

# DESCRIPTION

**dvtm** (dynamic virtual terminal manager) brings dwm-style window management to the terminal. It tiles multiple terminal windows within a single terminal emulator.

The tool provides dynamic layouts, tagging, and keyboard-driven window management. It's lightweight and follows the suckless philosophy of minimalism.

# CONFIGURATION

**config.h**
> Source-level configuration file that must be edited and recompiled to change keybindings, colors, layouts, and behavior.

# PARAMETERS

**-v**
> Print version and exit.

**-M**
> Toggle default mouse support.

**-m** _mod_
> Modifier key (default: Ctrl+g).

**-d** _delay_
> Escape sequence delay in milliseconds for ncurses.

**-h** _lines_
> Scrollback history buffer size.

**-t** _title_
> Set terminal title.

**-s** _status-fifo_
> Named pipe to read status bar content from.

**-c** _cmd_
> Command to pipe into the status FIFO.

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
