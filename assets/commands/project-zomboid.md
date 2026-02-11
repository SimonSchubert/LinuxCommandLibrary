# TAGLINE

Dedicated multiplayer survival game server

# TLDR

**Start** the server

```path/to/start-server.sh```

Start a server with a **specific name**

```path/to/start-server.sh -servername server_name```

# SYNOPSIS

**start-server.sh** [_options_]

# PARAMETERS

**-servername** _name_
> Specify a custom server name

# DESCRIPTION

**Project Zomboid** dedicated server runs a headless multiplayer server for the open-world survival horror game. The **start-server.sh** script launches the server without a graphical interface, making it suitable for remote hosting on Linux machines or cloud instances.

The server manages multiplayer sessions including player connections, world state persistence, zombie population simulation, and loot respawn cycles. Server administrators can configure sandbox settings to control difficulty, PvP rules, player limits, and mod loading through configuration files in the server data directory.

The **-servername** option allows running multiple server instances on the same machine, each with independent world data and settings.

# CONFIGURATION

**~/Zomboid/Server/<servername>.ini**
> Main server configuration file controlling game settings, player limits, PvP rules, loot respawn, and network options.

**~/Zomboid/Server/<servername>_SandboxVars.lua**
> Sandbox settings controlling zombie population, erosion speed, loot rarity, weather, and difficulty parameters.

# CAVEATS

Server configuration is stored in separate config files. Requires sufficient system resources for world simulation and player connections.

# HISTORY

**Project Zomboid** is a survival horror video game developed by The Indie Stone. The dedicated server allows multiplayer gameplay on self-hosted infrastructure.

# SEE ALSO

[screen](/man/screen)(1), [tmux](/man/tmux)(1)
