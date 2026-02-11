# TAGLINE

Terraria dedicated game server

# TLDR

Start **interactive** server setup

```[path/to]/TerrariaServer```

Start server with **world**

```[path/to]/TerrariaServer -world [path/to/world.wld]```

# SYNOPSIS

**TerrariaServer** [_OPTIONS_]

# PARAMETERS

**-world** _PATH_
> World file to load

**-port** _PORT_
> Server port (default: 7777)

**-maxplayers** _N_
> Maximum players allowed

**-password** _PASS_
> Server password

**-config** _FILE_
> Configuration file path

**-autocreate** _SIZE_
> Auto-create world (1=small, 2=medium, 3=large)

**-worldname** _NAME_
> Name for auto-created world

# DESCRIPTION

**TerrariaServer** creates and runs a headless Terraria game server. It can be started interactively to configure settings or with command-line arguments for automated deployment.

The server hosts multiplayer Terraria sessions, allowing players to connect and play together.

# CAVEATS

Requires a valid Terraria server installation. World files are platform-specific. Server consumes significant resources for large worlds with many players.

# HISTORY

**Terraria** is a 2D sandbox game developed by **Re-Logic**, first released in **2011**. The dedicated server allows hosting multiplayer games without running the full game client.

# SEE ALSO

[screen](/man/screen)(1), [tmux](/man/tmux)(1)
