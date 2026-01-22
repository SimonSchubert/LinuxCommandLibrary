# TLDR

Start the server with a **specific map**

```[path/to]/ArkAscendedServer [TheIsland_WP]```

Start with **session name, passwords**

```[path/to]/ArkAscendedServer [TheIsland_WP]?SessionName=[name]?ServerPassword=[pass]?ServerAdminPassword=[admin_pass]```

Start with **specific port** and max player count

```[path/to]/ArkAscendedServer [TheIsland_WP] -port=[7777] -WinLiveMaxPlayers=[1..70]```

Enable **PvE mode** (disable PvP)

```[path/to]/ArkAscendedServer [TheIsland_WP]?ServerPVE=true```

Set **difficulty multiplier**

```[path/to]/ArkAscendedServer [TheIsland_WP]?DifficultyOffset=[1.0]```

Enable **specific mods** by ID

```[path/to]/ArkAscendedServer [TheIsland_WP] -mods=[mod_id1,mod_id2,...]```

Allow connections from **specific platforms**

```[path/to]/ArkAscendedServer [TheIsland_WP] -ServerPlatform=[PC+XSX+PS5]```

# SYNOPSIS

**ArkAscendedServer** _map_ [_?options_] [_-flags_]

# DESCRIPTION

**ArkAscendedServer** runs a headless dedicated server for ARK: Survival Ascended, the Unreal Engine 5 remake of the original survival game. It allows hosting multiplayer game sessions with configurable maps, mods, and gameplay settings.

Server options are passed using URL-style query parameters (joined with **?**) for gameplay settings and command-line flags (prefixed with **-**) for technical configuration.

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

**-port=**_number_
> Network port for the server

**-WinLiveMaxPlayers=**_count_
> Maximum number of players (1-70)

**-mods=**_ids_
> Comma-separated list of mod IDs to enable

**-ServerPlatform=**_platforms_
> Allow cross-platform connections (PC, XSX, PS5)

# CAVEATS

Requires significant system resources (16GB+ RAM recommended). Server files must be installed via SteamCMD. Configuration persistence requires editing GameUserSettings.ini and Game.ini files.

# SEE ALSO

[steamcmd](/man/steamcmd)(1), [ark-survival-evolved](/man/ark-survival-evolved)(1)
