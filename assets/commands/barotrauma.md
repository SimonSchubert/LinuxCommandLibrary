# TAGLINE

Run a dedicated multiplayer game server.

# TLDR

**Start** the dedicated server in the foreground

```[path/to]/DedicatedServer```

Start with a **name, port and player limit** (overrides serversettings.xml)

```[path/to]/DedicatedServer -name "[My Server]" -port [27015] -queryport [27016] -maxplayers [16]```

Start a **public, password-protected** server

```[path/to]/DedicatedServer -public true -password [secret]```

**Install or update** the server via SteamCMD

```steamcmd +login anonymous +app_update [1026340] validate +quit```

# SYNOPSIS

**DedicatedServer** [_options_]

# PARAMETERS

**-name** _name_
> Server name shown in the server browser.

**-port** _port_
> UDP game port (default **27015**).

**-queryport** _port_
> Steam query port (default **27016**).

**-public** **true**|**false**
> List the server in the public server browser.

**-password** _password_
> Require a password to join.

**-nopassword**
> Start without a password.

**-maxplayers** _n_
> Maximum number of players.

**-enableupnp** **true**|**false**
> Try to forward ports automatically via UPnP.

**-playstyle** _style_
> Server play style tag (**Serious**, **Casual**, **Roleplay**, **Rampage**, **SomethingDifferent**).

**-karma** **true**|**false**
> Enable or disable the karma system.

**-karmapreset** _name_
> Karma preset to use.

**-language** _language_
> Server language.

# DESCRIPTION

**DedicatedServer** is the headless game server distributed by **FakeFish** and **Undertow Games** for **Barotrauma**, a 2D co-op submarine survival game set on Jupiter's moon Europa. The binary listens for incoming player connections, runs the simulation, and acts as the authoritative host for round state.

Server behaviour is driven mostly by **serversettings.xml** in the game directory: player slot count, password, allowed mods, game mode (campaign, sandbox, mission, PvP), and karma settings. Command-line options override the corresponding values at startup. Workshop content downloaded by the server lives under **WorkshopMods/**. The server can also be controlled at runtime by typing console commands into the terminal it runs in.

# CONFIGURATION

**serversettings.xml**
> Main server configuration file. Controls game settings, player slots, password, allowed mods, and most runtime parameters.

**Data/clientpermissions.xml**
> Per-client permissions and admin rights.

**Data/bannedplayers.xml**
> List of banned players.

# CAVEATS

Requires the Barotrauma dedicated server files (Steam app ID **1026340**). Settings must be authored before launch; only a handful of settings can be overridden on the command line. Internet-facing deployments need UDP port forwarding for the game port (default **27015**) and query port (default **27016**) and may require Steam authentication for clients to join.

# HISTORY

**Barotrauma**, developed by FakeFish and Undertow Games and published by Daedalic Entertainment, was released for early access in **2019** and reached version **1.0** in **2023**. Its source code is available on GitHub under a source-available EULA. The dedicated server binary has shipped alongside the game client throughout the game's life and is freely available through Steam.

# SEE ALSO

[steamcmd](/man/steamcmd)(1)

# RESOURCES

```[Source code](https://github.com/FakeFishGames/Barotrauma)```

```[Homepage](https://barotraumagame.com/)```

<!-- verified: 2026-11-23 -->
