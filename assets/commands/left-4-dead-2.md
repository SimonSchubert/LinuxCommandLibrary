# TAGLINE

Left 4 Dead 2 dedicated server

# TLDR

Start the **headless** server

```[path/to]/srcds_run```

Start on a **map**

```[path/to]/srcds_run +map [map]```

# SYNOPSIS

**srcds_run** [_options_] [+_commands_]

# PARAMETERS

**+map** _map_
> Map to load. Campaign maps use names such as the opening map of Dead Center, Swamp Fever, or The Parish.

**game mode**
> Set on the command line with the game's mode console command. Common mode names are **coop**, **versus**, and **survival**. The Valve dedicated-server page lists the exact command.

# DESCRIPTION

The Left 4 Dead 2 dedicated server is a headless Source dedicated server. The launcher script in the server install is **srcds_run**. It starts the Linux server binary, restarts it if it crashes, and forwards console commands from the command line.

With no map, the server starts on its default map. **+map** selects a campaign map. A console command on the same line selects cooperation, versus, survival, and the other modes the game ships. More settings live in **server.cfg** in the left4dead2 cfg directory.

Install or update the server files with SteamCMD into the directory that contains **srcds_run**.

# CAVEATS

**srcds_run** is not on the default PATH. The path is the dedicated-server install. Players outside the machine need the game port reachable (27015 by default). Map and mode names are the game's own tokens; a wrong map name makes the server fail at startup.

# SEE ALSO

[steamcmd](/man/steamcmd)(1)

# RESOURCES

```[Homepage](https://www.l4d.com)```

```[Documentation](https://developer.valvesoftware.com/wiki/Left%5F4%5FDead%5F2%5FDedicated%5FServer)```

<!-- verified: 2026-11-26 -->
