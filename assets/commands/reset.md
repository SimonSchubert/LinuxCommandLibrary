# TAGLINE

Reinitialize terminal to sane state

# TLDR

**Reinitialize** the current terminal

```reset```

**Display** the terminal type without reinitializing

```reset -q```

**Reset and print shell commands** to set TERM

```reset -s```

**Reset without sending** terminal initialization strings

```reset -I```

# SYNOPSIS

**reset** [**-IQVcqrsw**] [**-e** _ch_] [**-i** _ch_] [**-k** _ch_] [**-m** _mapping_] [_terminal_]

# PARAMETERS

**-q**
> Display terminal type without reinitializing

**-c**
> Set control characters and modes

**-e** _ch_
> Set erase character to _ch_

**-i** _ch_
> Set interrupt character to _ch_

**-k** _ch_
> Set kill character to _ch_

**-I**
> Do not send terminal initialization strings

**-Q**
> Do not display values for erase, interrupt, and line kill characters

**-r**
> Print terminal type to stderr

**-s**
> Print shell commands to set TERM

**-V**
> Report ncurses version and exit

**-w**
> Resize the window to match the size deduced via setupterm

**-m** _mapping_
> Specify a mapping from a port type to a terminal

# DESCRIPTION

**reset** reinitializes the terminal to its default state. When invoked as **reset** (as opposed to **tset**), it sets cooked and echo modes, turns off cbreak and raw modes, turns on newline translation, and resets unset special characters to their default values before sending terminal initialization strings. This is useful when the terminal becomes garbled from viewing binary files or other corruption.

The command reads terminfo data for the terminal type (from TERM environment variable) and sends appropriate initialization sequences. If neither **-c** nor **-w** is given, both are assumed.

# CAVEATS

May not fix all terminal corruption; in some cases closing and reopening the terminal is necessary. On some systems, **reset** is a symbolic link to **tset**. Terminal type must be correctly set in TERM variable.

# HISTORY

Part of the **ncurses** package, derived from original BSD **tset** command. Essential recovery tool since early Unix for restoring terminals after displaying binary data or when escape sequences corrupt the display state.

# SEE ALSO

[tset](/man/tset)(1), [clear](/man/clear)(1), [stty](/man/stty)(1), [tput](/man/tput)(1)
