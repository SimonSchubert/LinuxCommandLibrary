# TAGLINE

Next generation multiplayer space combat

# TLDR

**Start game client**

```xpilot-ng-x11```

**Start SDL/OpenGL client**

```xpilot-ng-sdl```

**Connect to specific server**

```xpilot-ng-x11 -join [server.example.com]```

**Start local server**

```xpilot-ng-server```

**Start server with map**

```xpilot-ng-server -map [/path/to/map.xp2]```

**List public servers**

```xpilot-ng-x11 -list```

# SYNOPSIS

**xpilot-ng-x11** [_options_]

**xpilot-ng-server** [_options_]

# CLIENT PARAMETERS

**-join** _server_
> Connect to specified server.

**-name** _name_
> Player name.

**-team** _num_
> Join specified team.

**-list**
> List available servers.

**-port** _num_
> Server port (default: 15345).

# SERVER PARAMETERS

**-map** _file_
> Load specified map file.

**-port** _num_
> Listen port (default: 15345).

**-contactPort** _num_
> Meta server contact port.

**-password** _pass_
> Server password.

# DESCRIPTION

**xpilot-ng** (XPilot Next Generation) is a multiplayer space combat game where players pilot ships, collect power-ups, and compete in various game modes including deathmatch, capture the flag, and racing.

The NG version features polygon-based maps, OpenGL graphics via SDL client, and improved performance over original XPilot. Players connect to servers hosting games; a central metaserver lists available public servers.

Server configuration in /etc/xpilot-ng/defaults.txt controls extensive gameplay options including gravity, weapons, scoring, and physics. Client settings go in ~/.xpilotrc.

# CAVEATS

Requires network connectivity for multiplayer. Public servers vary in availability. X11 client needs X server; SDL client needs OpenGL support.

# HISTORY

**XPilot** was created in 1991 by Bjørn Stabell and Ken Schouten at the University of Tromsø. XPilot NG branched in 2000, adding polygon maps and OpenGL rendering. One of the oldest continuously played online multiplayer games.

# SEE ALSO

[xpilot-ng-server](/man/xpilot-ng-server)(6), [netrek](/man/netrek)(6)
