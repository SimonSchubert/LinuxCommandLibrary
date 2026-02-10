# TAGLINE

server daemon for the hunt game

# TLDR

**Start hunt server**

```huntd```

**Specify port**

```huntd -p [9999]```

**Set player limit**

```huntd -n [8]```

**Foreground mode**

```huntd -s```

# SYNOPSIS

**huntd** [_options_]

# PARAMETERS

**-p** _PORT_
> Listen port.

**-n** _NUM_
> Maximum players.

**-s**
> Don't daemonize.

**-a** _ADDR_
> Listen address.

**--help**
> Display help information.

# DESCRIPTION

**huntd** is the server daemon for the hunt game. It manages the game world and coordinates multiple players.

The server creates the maze and handles player connections, shots, and scoring. Multiple players connect via the hunt client.

# CAVEATS

Part of BSD games. Runs as daemon by default. Manages game state.

# HISTORY

huntd is the server component of **hunt**, a classic BSD network game from the 1980s.

# SEE ALSO

[hunt](/man/hunt)(6), [bsdgames](/man/bsdgames)(6)
