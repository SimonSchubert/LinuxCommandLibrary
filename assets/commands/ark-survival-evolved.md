# TAGLINE

Host a dedicated game server for dinosaur survival multiplayer.

# TLDR

Start the server with a **specific map**

```[path/to]/ShooterGameServer [TheIsland]```

Start with **session name, passwords**

```[path/to]/ShooterGameServer [TheIsland]?SessionName=[name]?ServerPassword=[pass]?ServerAdminPassword=[admin_pass]```

Start with **specific port** and max player count

```[path/to]/ShooterGameServer [TheIsland]?Port=[7777]?MaxPlayers=[1..70]```

Enable **PvE mode** (disable PvP)

```[path/to]/ShooterGameServer [TheIsland]?ServerPVE=true```

Set **difficulty multiplier**

```[path/to]/ShooterGameServer [TheIsland]?DifficultyOffset=[1.0]```

Enable a **specific event**

```[path/to]/ShooterGameServer [TheIsland] -ActiveEvent=[Summer]```

Enable **crossplay** between Steam and Epic Games

```[path/to]/ShooterGameServer [TheIsland] -crossplay -PublicIPForEpic=[ip_address]```

# SYNOPSIS

**ShooterGameServer** _map_ [_?options_] [_-flags_]

# DESCRIPTION

**ShooterGameServer** runs a headless dedicated server for ARK: Survival Evolved, a dinosaur-themed survival game. It allows hosting multiplayer servers with configurable maps, gameplay settings, and mod support.

Server options use URL-style query parameters (joined with **?**) for gameplay settings and command-line flags (prefixed with **-**) for technical configuration.

# PARAMETERS

**SessionName=**_name_
> Set the server's display name in the server browser

**ServerPassword=**_password_
> Require a password to join the server

**ServerAdminPassword=**_password_
> Set the admin password for RCON and in-game admin commands

**ServerPVE=true**
> Enable PvE mode, disabling player versus player combat

**DifficultyOffset=**_value_
> Scale difficulty (affects wild creature levels)

**Port=**_number_
> Network port for the server

**MaxPlayers=**_count_
> Maximum number of players (1-70)

**-ActiveEvent=**_event_
> Enable a specific seasonal event

**-automanagedmods**
> Enable automatic mod downloading and updating (Steam only)

**-crossplay**
> Enable crossplay between Steam and Epic Games

# CONFIGURATION

**/ShooterGame/Saved/Config/LinuxServer/GameUserSettings.ini**
> Main server configuration including session name, passwords, ports, rates, and gameplay toggles.

**/ShooterGame/Saved/Config/LinuxServer/Game.ini**
> Advanced gameplay overrides including engram points, loot tables, and per-level stat multipliers.

# CAVEATS

Requires significant system resources (8GB+ RAM recommended). Server files must be installed via SteamCMD. Mods require Steam Workshop integration. Configuration persistence requires editing GameUserSettings.ini and Game.ini files.

# SEE ALSO

[steamcmd](/man/steamcmd)(1), [ark-survival-ascended](/man/ark-survival-ascended)(1)
