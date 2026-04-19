# TAGLINE

network-capable Tetris game

# TLDR

**Play Tetris solo**

```netris```

**Host networked game**

```netris -w```

**Connect to host**

```netris -c [host]```

**Set difficulty**

```netris -l [5]```

**Two player local**

```netris -2```

# SYNOPSIS

**netris** [_options_]

# PARAMETERS

**-w**
> Wait for an opponent (server mode).

**-c** _HOST_
> Connect to opponent at _HOST_ (client mode).

**-p** _PORT_
> Use the given TCP port (default 9284).

**-l** _LEVEL_
> Starting level (1–9).

**-s** _SPEED_
> Initial drop speed (higher is faster).

**-k** _KEYS_
> Use a custom keyset string.

**-F**
> "Fair" mode — both players get the same piece sequence.

**-D**
> Do not show the next piece preview.

**-i** _SECS_
> Request a game invitation timeout.

**-r** _PATH_
> Run a robot opponent executable.

**-S** _FILE_
> Save (or replay) the game session to/from _FILE_.

**-2**
> Two-player local mode on the same terminal.

**-h**
> Display help information.

# DESCRIPTION

**netris** is a network-capable Tetris game. Play solo or against others over network.

The tool provides classic Tetris gameplay. Supports head-to-head competition.

# CAVEATS

Terminal game. Network play requires setup. Classic Tetris rules.

# HISTORY

netris was created to provide **networked Tetris** gameplay over the internet using TCP/IP.

# SEE ALSO

[bastet](/man/bastet)(1), [tetrinet](/man/tetrinet)(1), [bsdgames](/man/bsdgames)(1)

