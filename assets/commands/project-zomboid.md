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

**Project Zomboid** dedicated server runs a headless game server for the survival horror game. The start-server.sh script launches the server without a graphical interface, allowing it to run on remote systems.

The server manages multiplayer game sessions, player data, and world state persistence.

# CAVEATS

Server configuration is stored in separate config files. Requires sufficient system resources for world simulation and player connections.

# HISTORY

**Project Zomboid** is a survival horror video game developed by The Indie Stone. The dedicated server allows multiplayer gameplay on self-hosted infrastructure.

# SEE ALSO

[screen](/man/screen)(1), [tmux](/man/tmux)(1)
