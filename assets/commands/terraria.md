# TAGLINE

Terraria dedicated game server

# TLDR

Start **interactive** server setup

```[path/to]/TerrariaServer```

Start server with **world**

```[path/to]/TerrariaServer -world [path/to/world.wld]```

Start with a **configuration file**

```[path/to]/TerrariaServer -config [serverconfig.txt]```

**Create** a medium world if none exists and start

```[path/to]/TerrariaServer -world [path/to/world.wld] -autocreate [2] -worldname [name]```

Set **port** and **player** limit

```[path/to]/TerrariaServer -world [path/to/world.wld] -port [7777] -players [8]```

# SYNOPSIS

**TerrariaServer** [_OPTIONS_]

# PARAMETERS

**-config** _FILE_
> Configuration file to use

**-port** _PORT_
> Port to listen on (default: 7777)

**-players**, **-maxplayers** _N_
> Maximum number of players

**-pass**, **-password** _PASS_
> Server password

**-world** _PATH_
> Load a world and automatically start the server

**-autocreate** _SIZE_
> Create a world if none is found at the **-world** path (1=small, 2=medium, 3=large)

**-worldname** _NAME_
> Name of the world when using **-autocreate**

**-seed** _SEED_
> World seed when using **-autocreate**

**-banlist** _PATH_
> Location of the banlist (default: banlist.txt in the working directory)

**-ip** _ADDRESS_
> IP address to listen on

**-secure**
> Add additional cheat protection

**-noupnp**
> Disable automatic port forwarding

**-steam**
> Enable Steam support

**-lobby** _friends_|_private_
> With Steam enabled, allow friends to join or set the server private

# DESCRIPTION

**TerrariaServer** creates and runs a headless Terraria game server. It can be started interactively to configure settings or with command-line arguments for automated deployment.

The server hosts multiplayer Terraria sessions, allowing players to connect and play together.

# CAVEATS

Requires a Terraria server installation. To run several servers on one machine, each needs its own configuration file, world and port.

# HISTORY

**Terraria** is a 2D sandbox game developed by **Re-Logic**, first released in **2011**. The dedicated server allows hosting multiplayer games without running the full game client.

# SEE ALSO

[screen](/man/screen)(1), [tmux](/man/tmux)(1)

# RESOURCES

```[Homepage](https://terraria.org)```

```[Documentation](https://terraria.wiki.gg/wiki/Server)```

<!-- verified: 2026-11-09 -->
