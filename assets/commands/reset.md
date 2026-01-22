# TLDR

**Reinitialize** the current terminal

```reset```

**Display** the terminal type instead

```reset -q```

# SYNOPSIS

**reset** [**-IQVcqrsw**] [**-e** _ch_] [**-i** _ch_] [**-k** _ch_] [**-m** _mapping_] [_terminal_]

# PARAMETERS

**-q**
> Display terminal type without reinitializing

**-c**
> Set control characters to defaults

**-e** _ch_
> Set erase character to _ch_

**-i** _ch_
> Set interrupt character to _ch_

**-k** _ch_
> Set kill character to _ch_

**-I**
> Do not send terminal initialization strings

**-Q**
> Do not display control characters

**-r**
> Print terminal reset string to stdout

**-s**
> Print shell commands to set TERM

**-V**
> Display version

**-w**
> Do not resize terminal

# DESCRIPTION

**reset** reinitializes the terminal to its default state, clearing the screen and resetting terminal settings. It is similar to **tset** but performs a more complete reset, useful when the terminal becomes garbled from viewing binary files or other corruption.

The command reads terminfo data for the terminal type (from TERM environment variable) and sends appropriate initialization sequences. It also resets various terminal modes to sane defaults.

# CAVEATS

May not fix all terminal corruption; in some cases closing and reopening the terminal is necessary. On some systems, **reset** is a symbolic link to **tset**. Terminal type must be correctly set in TERM variable.

# HISTORY

Part of the **ncurses** package, derived from original BSD **tset** command. Essential recovery tool since early Unix for restoring terminals after displaying binary data or when escape sequences corrupt the display state.

# SEE ALSO

[tset](/man/tset)(1), [clear](/man/clear)(1), [stty](/man/stty)(1), [tput](/man/tput)(1)
