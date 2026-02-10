# TAGLINE

dedicated server runs a headless game server for the asymmetric multiplayer

# TLDR

Start a server with **default settings**

```[path/to]/server_linux```

Give a server a **custom name** that shows in the server browser

```[path/to]/server_linux -name '[server_name]'```

Specify a **connection port** for the server

```[path/to]/server_linux -port [27015]```

Specify **maximum player count**

```[path/to]/server_linux -limit [2..24]```

Specify the **initial map** the server starts on

```[path/to]/server_linux -map [ns2_summit]```

Limit access to the server with a **password**

```[path/to]/server_linux -password [password]```

Start a server with **webui admin** interface

```[path/to]/server_linux -webadmin -webport [8080]```

# SYNOPSIS

**server_linux** [_options_]

# PARAMETERS

**-name _name_**
> Server name displayed in the browser

**-port _port_**
> UDP port for client connections (default: 27015)

**-limit _n_**
> Maximum players (2-24)

**-map _mapname_**
> Initial map to load

**-password _pass_**
> Server password for private games

**-webadmin**
> Enable web administration interface

**-webport _port_**
> Port for web admin interface

**-config _file_**
> Custom configuration file

# DESCRIPTION

**Natural Selection 2** dedicated server runs a headless game server for the asymmetric multiplayer FPS/RTS hybrid. Players join as either Marines or Aliens, with commanders directing team strategy in real-time.

The Linux server binary (server_linux) is provided through SteamCMD or the game's dedicated server tools. It manages game state, player connections, and map rotation for online matches.

Server configuration can be done through command-line arguments or configuration files in the server directory.

# CAVEATS

Requires sufficient system resources (CPU, RAM, network bandwidth) for smooth gameplay. Port forwarding may be needed for public servers. Server files must be obtained through Steam. Performance depends heavily on player count and map complexity.

# SEE ALSO

[steamcmd](/man/steamcmd)(1)
