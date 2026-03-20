# TAGLINE

server daemon for the hunt game

# TLDR

**Start hunt server**

```huntd```

**Specify port**

```huntd -p [9999]```

**Run in server mode** (run forever)

```huntd -s```

**Fork into background** (log errors via syslog)

```huntd -b```

# SYNOPSIS

**huntd** [_options_]

# PARAMETERS

**-p** _port_
> Change the UDP port number used to rendezvous with the player process.

**-s**
> Run in server mode (run forever). Consumes a process table entry when no one is playing.

**-b**
> Fork into the background. Errors are logged via syslog instead of stderr.

**-a** _addr_
> Listen only on a specific interface address (given as an IP address).

# DESCRIPTION

**huntd** is the server daemon for the hunt game. It manages the game world and coordinates multiple players.

The server creates the maze and handles player connections, shots, and scoring. Multiple players connect via the hunt client.

# CAVEATS

Part of BSD games. Can be run standalone with -s or under inetd. Without -s, the daemon exits when all players disconnect.

# HISTORY

huntd is the server component of **hunt**, a classic BSD network game from the 1980s.

# SEE ALSO

[hunt](/man/hunt)(6), [bsdgames](/man/bsdgames)(6)
