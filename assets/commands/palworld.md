# TLDR

Start server with **default** settings

```[path/to]/PalServer.sh```

Start with specific **port** and **player count**

```[path/to]/PalServer.sh -port=[8211] -players=[16]```

Start as **public** lobby

```[path/to]/PalServer.sh -publiclobby```

Start with **multi-threaded** optimizations

```[path/to]/PalServer.sh -useperfthreads -NoAsyncLoadingThread -UseMultithreadForDS```

Start **community server** with public IP

```[path/to]/PalServer.sh -publicip=[ip_address] -publicport=[port]```

# SYNOPSIS

**PalServer.sh** [**-port=**_port_] [**-players=**_count_] [**-publiclobby**] [**-publicip=**_ip_] [**-publicport=**_port_]

# PARAMETERS

**-port=_port_**
> Server port number (default: 8211)

**-players=_count_**
> Maximum player count (1-32)

**-publiclobby**
> Make server visible in public server list

**-publicip=_ip_**
> Public IP address for community servers

**-publicport=_port_**
> Public port for community servers

**-useperfthreads**
> Enable performance thread optimizations

**-NoAsyncLoadingThread**
> Disable async loading for better stability

**-UseMultithreadForDS**
> Enable multi-threading for dedicated server

# DESCRIPTION

**PalServer.sh** runs a dedicated Palworld game server on Linux. Palworld is a multiplayer survival game featuring creature collection and base building. The dedicated server allows hosting persistent worlds for multiple players.

The server requires Steam and SteamCMD for installation. Configuration is done through command-line arguments and the PalWorldSettings.ini file.

# CAVEATS

Requires significant system resources (8+ GB RAM recommended). Port forwarding needed for public servers. Steam authentication required for player connections. Regular backups of world data recommended.

# HISTORY

**Palworld** was developed by **Pocketpair** and released in early access in January 2024. The dedicated server support allows community hosting on Linux systems, expanding the game's multiplayer capabilities beyond peer-to-peer connections.

# SEE ALSO

[steamcmd](/man/steamcmd)(1), [screen](/man/screen)(1), [tmux](/man/tmux)(1)
