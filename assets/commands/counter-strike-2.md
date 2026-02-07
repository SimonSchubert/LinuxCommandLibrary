# TAGLINE

Multiplayer FPS dedicated server

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

**Counter-Strike 2** dedicated server hosts headless game servers for multiplayer matches. It runs without a graphical interface and can be managed via console commands or RCON (Remote Console) for remote administration.

The server can be configured through command-line parameters, console commands, and configuration files. It supports custom game modes, maps, plugins, and administrative controls. Dedicated servers are essential for hosting competitive matches, community servers, and private games with specific rule sets.

Server performance depends on player count, tick rate, and available system resources. The dedicated server is distributed via SteamCMD and requires Steam authentication to run.

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

# CONFIGURATION

**game/csgo/cfg/server.cfg**
> Server configuration including hostname, passwords, game rules, and administrative settings.

# CAVEATS

Requires Steam and valid game files. Server hardware requirements depend on player count. Network configuration (port forwarding, firewall) needed for public servers.

# SEE ALSO

[steamcmd](/man/steamcmd)(1)
