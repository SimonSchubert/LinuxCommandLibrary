# TAGLINE

Run a dedicated multiplayer game server.

# TLDR

**Start** the dedicated server in the foreground

```[path/to]/DedicatedServer```

**Run on a custom port** (configured in serversettings.xml beforehand)

```[path/to]/DedicatedServer -port [27015]```

**Install or update** the server via SteamCMD

```steamcmd +login anonymous +app_update [1026340] validate +quit```

# SYNOPSIS

**DedicatedServer** [_options_]

# DESCRIPTION

**DedicatedServer** is the headless game server distributed by **Undertow Games** for **Barotrauma**, a 2D co-op submarine survival game set on Jupiter's moon Europa. The binary listens for incoming player connections, runs the simulation, and acts as the authoritative host for round state.

Server behaviour is driven almost entirely by **serversettings.xml** in the game directory: player slot count, password, allowed mods, game mode (campaign, sandbox, mission, PvP), and karma settings. Workshop content downloaded by the server lives under **WorkshopMods/**. The server can also be controlled at runtime through the in-game console (commands prefixed with **/**).

# CONFIGURATION

**serversettings.xml**
> Main server configuration file. Controls game settings, player slots, password, allowed mods, and most runtime parameters.

**config_player.xml**
> Server-side player configuration (admin list, banned IPs are persisted alongside).

**servermessages.txt**
> Optional rotating message-of-the-day file shown to connecting players.

# CAVEATS

Requires the Barotrauma dedicated server files (Steam app ID **1026340**). Settings must be authored before launch; the server does not currently expose a rich CLI. Internet-facing deployments need UDP port forwarding for the configured port (default **27015**) and may require Steam authentication for clients to join.

# HISTORY

**Barotrauma** was released for early access in **2019** and reached version **1.0** in **2023**. The dedicated server binary has shipped alongside the game client throughout the game's life and is freely redistributable through Steam.

# SEE ALSO

[steamcmd](/man/steamcmd)(1)
