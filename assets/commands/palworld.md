# TAGLINE

runs a dedicated Palworld game server on Linux

# TLDR

**Install or update** the server with SteamCMD

```steamcmd +login anonymous +app_update 2394010 validate +quit```

Start server with **default** settings

```~/Steam/steamapps/common/PalServer/PalServer.sh```

Start with specific **port** and **player count**

```[path/to]/PalServer.sh -port=[8211] -players=[32]```

Start as a **community server**

```[path/to]/PalServer.sh -publiclobby```

Start **community server** with manual public IP and port

```[path/to]/PalServer.sh -publiclobby -publicip=[ip_address] -publicport=[port]```

Start with **multi-threaded** optimizations

```[path/to]/PalServer.sh -useperfthreads -NoAsyncLoadingThread -UseMultithreadForDS```

# SYNOPSIS

**PalServer.sh** [**-port=**_port_] [**-players=**_count_] [**-publiclobby**] [**-publicip=**_ip_] [**-publicport=**_port_] [_options_]

# PARAMETERS

**-port=_port_**
> Port the server listens on (default: UDP 8211)

**-players=_count_**
> Maximum number of players

**-publiclobby**
> Run as a community server, visible in the community server list

**-publicip=_ip_**
> Global IP address for community servers. Auto-detected if omitted

**-publicport=_port_**
> Public port for community servers. Auto-detected if omitted; does not change the listening port

**-useperfthreads**
> Enable performance thread optimizations

**-NoAsyncLoadingThread**
> Performance flag, used together with the other multithreading flags

**-UseMultithreadForDS**
> Enable multi-threading for dedicated server

**-NumberOfWorkerThreadsServer=_count_**
> Number of worker threads, used together with the multithreading flags

**-logformat=_format_**
> Log format: text or json

**-enable-gamedata-api**
> Enable the gamedata API

# DESCRIPTION

**PalServer.sh** runs a dedicated Palworld game server on Linux. Palworld is a multiplayer survival game featuring creature collection and base building. The dedicated server allows hosting persistent worlds for multiple players.

The server is installed with SteamCMD as app ID 2394010. World rules are set in **Pal/Saved/Config/LinuxServer/PalWorldSettings.ini**, which starts as a copy of **DefaultPalWorldSettings.ini**.

# CAVEATS

16 GB of RAM and 4 or more CPU cores are recommended. 8 GB will boot but risks out-of-memory crashes. Low-performance storage may corrupt save data, so use an SSD. Forward UDP port 8211 for players connecting from the internet. From v1.0 on, leaving the multithreading flags unset may perform better. Regular backups of world data are recommended.

# HISTORY

**Palworld** was developed by **Pocketpair** and released in early access in January 2024. The dedicated server support allows community hosting on Linux systems, expanding the game's multiplayer capabilities beyond peer-to-peer connections.

# SEE ALSO

[steamcmd](/man/steamcmd)(1), [screen](/man/screen)(1), [tmux](/man/tmux)(1)

# RESOURCES

```[Documentation](https://docs.palworldgame.com/)```

<!-- verified: 2026-11-08 -->
