# TLDR

**Resize** the terminal

```resize```

**Print** terminal size

```resize -s```

# SYNOPSIS

**resize** [**-u** | **-c**] [**-s** [_rows_ _cols_]]

# PARAMETERS

**-s** [_rows_ _cols_]
> Set terminal size (or query if no dimensions given)

**-u**
> Print Stretch shell commands for TERMCAP

**-c**
> Print C shell commands for TERMCAP

**-v**
> Verbose; print escape sequence used

# DESCRIPTION

**resize** prints shell commands to set the COLUMNS and LINES environment variables to the terminal's current dimensions. It communicates with the terminal emulator to determine the actual window size, then outputs commands that can be evaluated to update the environment.

The command is particularly useful when the terminal window has been resized and programs need to know the new dimensions, or when working over serial connections where the terminal size may not be automatically detected.

# CAVEATS

The terminal must support VT100-style size queries. Output must be evaluated by the shell (e.g., **eval \`resize\`**) to actually set the variables. Modern terminal emulators typically update COLUMNS and LINES automatically via SIGWINCH signals.

# HISTORY

Part of **xterm** utilities, originally written for X Window System terminal emulators. Less commonly needed on modern systems where terminal resizing is handled automatically, but still useful for remote sessions and serial consoles.

# SEE ALSO

[stty](/man/stty)(1), [tput](/man/tput)(1), [xterm](/man/xterm)(1)
