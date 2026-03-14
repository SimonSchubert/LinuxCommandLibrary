# TAGLINE

Multiplayer FPS dedicated server

# TLDR

Run a **casual game server**

```[path/to]/cs2 -dedicated +game_type 0 +game_mode 0 +map [de_dust2]```

Run a **competitive game server**

```[path/to]/cs2 -dedicated +game_type 0 +game_mode 1 +map [de_dust2]```

Run with specific **IP, port, and max players**

```[path/to]/cs2 -dedicated +map [de_dust2] -ip [1.2.3.4] -port [27015] -maxplayers [10]```

Run with **Steam authentication token**

```[path/to]/cs2 -dedicated +map [de_dust2] +sv_setsteamaccount [token]```

# SYNOPSIS

**cs2** [_options_] [+_commands_]

# DESCRIPTION

**Counter-Strike 2** dedicated server hosts headless game servers for multiplayer matches. It runs without a graphical interface and can be managed via console commands or RCON (Remote Console) for remote administration.

The server can be configured through command-line parameters, console commands, and configuration files. It supports custom game modes, maps, plugins, and administrative controls. Dedicated servers are essential for hosting competitive matches, community servers, and private games with specific rule sets.

Server performance depends on player count, tick rate, and available system resources. The dedicated server is distributed via SteamCMD and requires Steam authentication to run.

# PARAMETERS

**-dedicated**
> Run as dedicated server (headless, no GUI)

**+map** _mapname_
> Specify the map to load (e.g., de_dust2, de_mirage)

**+game_type** _type_
> Game type (0 = Classic, 1 = Arms Race/Demolition/Deathmatch)

**+game_mode** _mode_
> Game mode (varies by game_type, e.g., 0 = Casual, 1 = Competitive)

**+mapgroup** _group_
> Map group to use (e.g., mg_active, mg_allclassic)

**-maxplayers** _count_
> Maximum number of players

**-ip** _address_
> Server IP address to bind

**-port** _port_
> Server port (default: 27015)

**-insecure**
> Disable VAC anti-cheat

**+sv_setsteamaccount** _token_
> Game Server Login Token for Steam authentication

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
