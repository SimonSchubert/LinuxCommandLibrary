# TAGLINE

Multiplayer space combat game

# TLDR

**Start the game** and connect to a server

```xpilot```

**Connect to a specific server**

```xpilot -join [server_address]```

**Set player name** for the session

```xpilot -name "[player_name]"```

**Connect with team selection**

```xpilot -join [server] -team [team_number]```

**Use a specific ship shape**

```xpilot -shipShape "[shape_string]"```

**List available servers** on the network

```xpilot -list```

**Start with specific display**

```xpilot -display [hostname:0]```

# SYNOPSIS

**xpilot** [_-display host:n_] [_-join server_] [_-name name_] [_-team n_] [_-list_] [_-port n_] [_-shipShape shape_] [_options_]

# PARAMETERS

**-display** _host:n_
> Connect to X server on specified display.

**-join** _server_
> Connect directly to the specified game server.

**-name** _name_
> Set the player name (default: login name).

**-team** _n_
> Join the specified team number.

**-list**
> Query and list available servers on the network.

**-port** _n_
> Use specified port number for server connection.

**-shipShape** _shape_
> Define custom ship appearance using shape string.

**-geometry** _WxH+X+Y_
> Set window geometry.

**-fps** _n_
> Target frames per second.

**-keyTurnLeft** _key_
> Bind key for turning left.

**-keyTurnRight** _key_
> Bind key for turning right.

**-keyThrust** _key_
> Bind key for thrust.

**-keyFire** _key_
> Bind key for firing.

**-help**
> Display help and available options.

# DESCRIPTION

**XPilot** is a multiplayer tactical space combat game for the X Window System. Players pilot spacecraft in a 2D arena, competing against others in various game modes including team battles, capture the flag, and survival matches.

The game features Newtonian physics with momentum and gravity, requiring players to master thrust and rotation for maneuvering. Ships can collect power-ups for weapons like missiles, lasers, and mines. The gameplay emphasizes skill in navigation and combat timing.

Players connect to dedicated servers which host the game maps and manage the match. Multiple clients can connect to a single server for competitive play. The game supports both internet play and LAN sessions. Custom ship designs can be created using the ship shape specification language.

XPilot has an active community with various forks and enhanced versions. Configuration can be customized through command-line options or the **.xpilotrc** configuration file in the user's home directory.

# CAVEATS

Requires an X11 display. Network latency significantly affects gameplay on internet servers. Some servers may run modified versions with different rules or physics. The original XPilot has been superseded by forks like XPilot-AI and XPilot NG with improved features.

# HISTORY

**XPilot** was created by Bjorn Stabell and Ken Ronny Schouten, with the first public release in **1991**. It became one of the earliest popular networked multiplayer games for Unix systems. The game gained a dedicated following throughout the 1990s with servers running worldwide. Various forks emerged including XPilot NG (Next Generation) which modernized the codebase and added features.

# SEE ALSO

[xpilot-ng](/man/xpilot-ng)(1), [xpilots](/man/xpilots)(1), [xscreensaver](/man/xscreensaver)(1)
