# TAGLINE

clear the terminal screen

# TLDR

**Clear the terminal screen**

```clear```

**Clear and reset scrollback buffer**

```clear -x```

**Clear for a specific terminal type**

```clear -T [xterm-256color]```

**Alternative using ANSI escape codes**

```printf '\033[2J\033[H'```

# SYNOPSIS

**clear** [_-Ttype_] [_-V_] [_-x_]

# PARAMETERS

**-T** _type_
> Specify the terminal type to use instead of $TERM

**-V**
> Print version information and exit

**-x**
> Don't attempt to clear the terminal's scrollback buffer

# DESCRIPTION

**clear** clears the terminal screen if this is possible, including its scrollback buffer (if the extended E3 capability is defined). It looks in the environment for the terminal type given by the environment variable TERM and then queries the terminfo database to determine how to clear the screen.

The command outputs escape sequences that instruct the terminal emulator to clear the visible screen area and, by default, the scrollback buffer as well. This is equivalent to pressing Ctrl+L in many shells, though Ctrl+L typically only clears the visible portion without affecting scrollback.

The clear command is useful for privacy (removing sensitive output from view), reducing visual clutter during long terminal sessions, and resetting the terminal to a known state.

# CAVEATS

Not all terminals support clearing the scrollback buffer; in such cases only the visible screen is cleared. The behavior depends on the terminal emulator's implementation of the clear sequence. In some configurations, Ctrl+L provides similar functionality but may behave differently regarding scrollback. The cleared content is not securely erased from memory; for sensitive data, consider closing the terminal entirely.

# HISTORY

The **clear** command has been part of Unix systems since the early days, originating from the **termcap** library system for terminal-independent screen handling. The modern implementation is part of the **ncurses** package, which provides terminal handling capabilities for Unix-like systems. The command has remained essentially unchanged in functionality over the decades, though the underlying terminal handling mechanisms have evolved from termcap to terminfo.

# SEE ALSO

[reset](/man/reset)(1), [tput](/man/tput)(1), [stty](/man/stty)(1), [tty](/man/tty)(1)
