# TLDR

Run a game with **one map**

```[path/to]/cs2 -dedicated +map [de_dust2]```

Run with **maximum players** specified

```[path/to]/cs2 -dedicated +map [de_dust2] -maxplayers [64]```

Run with specific **IP and port**

```[path/to]/cs2 -dedicated +map [de_dust2] -ip [1.2.3.4] -port [27015]```

**Shut down** the server (interactive)

```quit```

# SYNOPSIS

**cs2** [_options_] [+_commands_]

# DESCRIPTION

**Counter-Strike 2** dedicated server hosts headless game servers for multiplayer matches. It runs without a graphical interface and can be managed via console commands.

Server configuration is done through command-line arguments and config files.

# PARAMETERS

**-dedicated**
> Run as dedicated server

**+map** _mapname_
> Specify the map to load

**-maxplayers** _count_
> Maximum number of players

**-ip** _address_
> Server IP address to bind

**-port** _port_
> Server port (default: 27015)

# CONSOLE COMMANDS

**quit**
> Shut down the server

**changelevel** _map_
> Change to a different map

**status**
> Show server status

# CAVEATS

Requires Steam and valid game files. Server hardware requirements depend on player count. Network configuration (port forwarding, firewall) needed for public servers.

# SEE ALSO

[steamcmd](/man/steamcmd)(1)
