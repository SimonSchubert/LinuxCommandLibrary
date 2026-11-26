# TAGLINE

Counter-Strike 1.6 dedicated server

# TLDR

Start a **headless** server on a map

```[path/to]/hlds_run -game cstrike +map [map]```

# SYNOPSIS

**hlds_run** -game cstrike [_options_] [+_commands_]

# PARAMETERS

**-game cstrike**
> Run the Counter-Strike mod. Required for this game on the Half-Life dedicated server.

**+map** _map_
> Map to load. Dust II is the usual first map.

# DESCRIPTION

The Counter-Strike 1.6 dedicated server is a headless Half-Life dedicated server. The launcher script shipped with that install is **hlds_run**. It starts the Linux server binary, restarts it if it crashes, and passes the rest of the command line through.

**-game cstrike** selects Counter-Strike. **+map** chooses the map players join. Further server settings are console commands and a **server.cfg** in the Counter-Strike game directory. The server does not need a graphical display.

Install the dedicated-server files with SteamCMD, or from the dedicated-server archive Valve publishes, into the directory that contains **hlds_run**.

# CAVEATS

**hlds_run** is not on the default PATH. The path is wherever the dedicated server was installed. The process must be allowed to listen on its game port (27015 by default) before players outside the machine can connect. This page is the Counter-Strike 1.6 server, not **cs2**.

# SEE ALSO

[steamcmd](/man/steamcmd)(1), [counter-strike-2](/man/counter-strike-2)(6)

# RESOURCES

```[Homepage](https://store.steampowered.com/app/10)```

```[Documentation](https://developer.valvesoftware.com/wiki/Half-Life%5FDedicated%5FServer)```

<!-- verified: 2026-11-26 -->
