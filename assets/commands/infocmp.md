# TLDR

**Show current terminal capabilities**

```infocmp```

**Show specific terminal**

```infocmp [xterm-256color]```

**Compare two terminals**

```infocmp -d [xterm] [xterm-256color]```

**Output in terminfo source format**

```infocmp -I [xterm]```

**Show all capabilities**

```infocmp -1 [xterm]```

# SYNOPSIS

**infocmp** [_options_] [_termname_...]

# PARAMETERS

_termname_
> Terminal type to display.

**-d**
> Compare two terminal descriptions.

**-c**
> Compare with common capabilities.

**-n**
> Compare with common capabilities, numeric format.

**-I**
> Output terminfo source format.

**-L**
> Use long C variable names.

**-1**
> One capability per line.

**-C**
> Output termcap format.

**-r**
> Show resolved paths.

**-A** _dir_
> Set terminfo directory.

# DESCRIPTION

**infocmp** displays and compares terminal capability descriptions from the terminfo database. It's useful for debugging terminal issues and understanding terminal features.

The command reads compiled terminfo entries and outputs them in readable format, supporting comparison between different terminal types.

# OUTPUT FORMATS

```bash
# Default format
infocmp xterm

# Source format (can be compiled with tic)
infocmp -I xterm > xterm.ti

# Termcap format
infocmp -C xterm
```

# CAVEATS

Terminfo location varies by system. Some capabilities may be missing. Modern terminals have many extensions. Compare mode shows differences only.

# HISTORY

infocmp is part of the **ncurses** library, which implements the terminfo database. The terminfo system replaced termcap for terminal capabilities, providing a more extensible format.

# SEE ALSO

[tic](/man/tic)(1), [terminfo](/man/terminfo)(5), [tput](/man/tput)(1), [toe](/man/toe)(1)
