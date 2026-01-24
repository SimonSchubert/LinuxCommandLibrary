# TLDR

**Start the game**

```vitetris```

**Start without menu** (jump straight into game)

```vitetris -nomenu```

**Listen for network game** on a port

```vitetris listen [34034]```

**Connect to a network game**

```vitetris connect [hostname:34034]```

**Show high scores**

```vitetris -hiscores```

**Start two-player local game**

```vitetris -2p```

# SYNOPSIS

**vitetris** [**-nomenu**] [**-hiscores**] [**-2p**] [**listen** _port_] [**connect** _host:port_]

# PARAMETERS

**-nomenu**
> Skip the menu and start playing immediately.

**-hiscores**
> Print the high score list and exit.

**-2p**
> Start a two-player local game.

**listen** _port_
> Listen for incoming network connections on the specified port.

**connect** _host:port_
> Connect to a remote player for network play. Host can be an IP address or hostname.

# DESCRIPTION

**vitetris** is a terminal-based Tetris clone with gameplay similar to early Nintendo Tetris games. It features configurable controls, a high score table, two-player mode with garbage lines, network play, and joystick support on Linux.

The game runs entirely in the terminal using text-mode graphics, making it playable over SSH or on systems without a graphical environment. Controls are fully customizable through the in-game options menu.

Network play allows two players to compete over the internet, with each player able to choose their own difficulty level and starting height. One player listens on a port while the other connects to that address.

The game has minimal dependencies, requiring only libc, and has been tested on Linux, BSD, and ported to Windows and DOS.

# CAVEATS

Terminal size should be at least 80x24 for proper display. Network play requires appropriate firewall configuration to allow connections on the chosen port. Some terminal emulators may have input lag affecting gameplay.

# HISTORY

**vitetris** was created by **Victor Geraldsson** and first released in the early **2000s**. It was designed to be a lightweight, terminal-based Tetris implementation with network play capabilities. The project continues to be maintained and is available in package repositories for major Linux distributions.

# SEE ALSO

[bastet](/man/bastet)(6), [tint](/man/tint)(6), [ninvaders](/man/ninvaders)(6)
