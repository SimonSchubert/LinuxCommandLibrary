# TLDR

**Start a game** of tetris

```tetris```

**Start with a specific level**

```tetris -l [level]```

**Start in two-player mode** locally

```tetris 2p```

**Listen for a network game** on a port

```tetris listen [port]```

**Connect to a network game**

```tetris connect [hostname]:[port]```

**Set terminal width**

```tetris -w [80]```

**Show help** for game options

```tetris -help game```

# SYNOPSIS

**tetris** [_options_] [_mode_]

# PARAMETERS

**-l** _level_
> Set the starting level (affects falling speed).

**-h** _height_
> Set the starting height of garbage blocks.

**-w** _width_
> Set the terminal width.

**2p**
> Start a local two-player game.

**listen** _port_
> Listen for incoming network connections on the specified port.

**connect** _host:port_
> Connect to a remote player for network play.

**-help**
> Print help and exit.

**-help game**
> List game options and exit.

**-help term**
> List terminal options and exit.

# DESCRIPTION

**vitetris** (often installed as **tetris**) is a terminal-based Tetris clone with gameplay similar to early Nintendo Tetris games. It supports single-player, local two-player, and network multiplayer modes.

The game features customizable controls, configurable appearance, and network play where both players can independently choose their difficulty settings. It requires only libc with no additional library dependencies.

Controls and appearance can be customized through in-game menus or command-line options. High scores are saved in **~/.vitetris**.

# CAVEATS

Network play requires one player to listen on a port that is accessible to the connecting player. Firewalls and NAT may require port forwarding configuration. The game does not include sound.

# HISTORY

vitetris was created by **Victor Geraldsson** and first released in **2007**. It was designed to be a lightweight, portable Tetris implementation for terminals. The game has been ported to multiple platforms including Linux, BSD, Windows, and DOS. Network play support was added to enable competitive multiplayer over the internet.

# SEE ALSO

[tetris-bsd](/man/tetris-bsd)(6), [bastet](/man/bastet)(6), [nudoku](/man/nudoku)(6)
