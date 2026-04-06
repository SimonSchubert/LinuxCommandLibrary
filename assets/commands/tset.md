# TAGLINE

Terminal initialization and reset utility

# TLDR

**Initialize the terminal** using $TERM

```tset```

**Reset the terminal** to sane defaults

```reset```

**Set terminal type** explicitly

```tset [xterm-256color]```

**Print shell commands** to set TERM

```tset -s```

**Set the erase character** to backspace

```tset -e ^H```

**Set the interrupt character**

```tset -i ^C```

**Skip sending initialization** strings

```tset -I```

**Quiet mode** (suppress output)

```tset -q```

# SYNOPSIS

**tset** [**-IQVcqrsw**] [**-**] [**-e** _ch_] [**-i** _ch_] [**-k** _ch_] [**-m** _mapping_] [_terminal_]

# PARAMETERS

**-c**
> Set control characters and modes

**-e** _ch_
> Set the erase character to ch

**-i** _ch_
> Set the interrupt character to ch

**-k** _ch_
> Set the line kill character to ch

**-I**
> Do not send terminal or tab initialization strings

**-m** _mapping_
> Map port type and baud rate to terminal type

**-Q**
> Do not display erase, interrupt, and kill characters

**-q**
> Display terminal type to stdout without initializing the terminal

**-r**
> Print terminal type to stderr

**-s**
> Print shell commands to set TERM environment variable

**-V**
> Print ncurses version and exit

**-w**
> Resize window to match size deduced via setupterm

# DESCRIPTION

**tset** initializes the terminal according to the terminal type specified in the **$TERM** environment variable or on the command line. It sets terminal modes, sends initialization strings, and can configure special characters like erase and kill. If neither **-c** nor **-w** is specified, both are assumed.

When invoked as **reset**, the command sets terminal modes to "sane" values: enables cooked and echo modes, disables raw mode, enables newline translation, and resets special characters to defaults. This is useful for recovering from programs that leave the terminal in an abnormal state.

The command determines terminal type by checking: command-line argument, $TERM variable, /etc/ttys entry (on BSD), or the default type "unknown". It then sends appropriate initialization sequences from the terminfo database.

The **-s** option outputs shell commands to set TERM, useful in login scripts when the terminal type may change.

# CAVEATS

When the terminal is garbled, you may need to type **\<LF\>reset\<LF\>** (Ctrl+J instead of Enter) since carriage return may not work. The tset command is less commonly needed on modern systems where terminal emulators handle initialization automatically.

# HISTORY

**tset** was written by **Eric Allman** and first appeared in **1BSD** in **1977**, using the termcap database. The ncurses version uses terminfo. The **reset** functionality was historically a separate command but is now typically a link to tset. The command predates POSIX and is not standardized.

# SEE ALSO

[reset](/man/reset)(1), [stty](/man/stty)(1), [clear](/man/clear)(1), [tput](/man/tput)(1), [infocmp](/man/infocmp)(1)
