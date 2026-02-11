# TAGLINE

Open-source transportation simulation game

# TLDR

**Start Simutrans** normally

```simutrans```

**Start in fullscreen mode**

```simutrans -fullscreen```

**Set a specific screen size**

```simutrans -screensize [1920] [1080]```

**Load a specific pakset**

```simutrans -objects [pak128/]```

**Load a saved game**

```simutrans -load [savegame.sve]```

**Start in freeplay mode** (no bankruptcy)

```simutrans -freeplay```

**Start without sound** (useful for sound driver issues)

```simutrans -nosound -nomidi```

**Start a multiplayer server**

```simutrans -server [13353]```

# SYNOPSIS

**simutrans** [_options_]

# PARAMETERS

**-screensize** _WIDTH_ _HEIGHT_
> Set screen size to WIDTHxHEIGHT pixels. Widths not a multiple of 16 may cause issues.

**-fullscreen**
> Run in fullscreen mode.

**-fps** _n_
> Refresh the display n times per second.

**-nosound**
> Disable sound effects.

**-nomidi**
> Disable music. Also helps prevent crashes from buggy sound drivers on 64-bit Linux.

**-freeplay**
> Enable freeplay mode where you cannot go bankrupt.

**-timeline** _0|1_
> 0 = all vehicles available from start, 1 = realistic timeline.

**-startyear** _year_
> Set the starting year of the game.

**-load** _savefile_
> Load a saved game directly without showing the initial menu.

**-pause**
> Start the loaded game in paused state.

**-lang** _code_
> Set language using ISO codes (e.g., en, de, fr).

**-objects** _folder/_
> Load a specific pakset from the given folder. The trailing slash is mandatory.

**-singleuser**
> Don't search for files in home directory; use only the data directory.

**-use_workdir**
> Use the current working directory for Simutrans environment.

**-log** _1_
> Write all log output to "simu.log" file.

**-debug** _1-4_
> Set debug output detail level (1-4).

**-server** [_port_]
> Start as a multiplayer server on the specified port (default: 13353).

**-server_name** _"name"_
> Set the server name for multiplayer.

# DESCRIPTION

**Simutrans** is an open-source transportation simulation game where players build and manage transportation networks including trains, buses, trucks, ships, and aircraft. Players create routes between cities, industries, and tourist attractions to earn money while competing with AI companies.

The game supports extensive modding through "paksets" which define vehicles, buildings, and game rules. Popular paksets include pak64, pak128, and pak192.comic, each offering different visual styles and gameplay complexity.

Configuration files are stored in **~/.simutrans** on Linux. The game can be played in single-player, freeplay mode, or as a multiplayer server allowing multiple players to collaborate or compete on the same map.

# CONFIGURATION

**~/.simutrans/**
> User data directory containing saved games, settings, screenshots, and installed paksets.

**~/.simutrans/simuconf.tab**
> Main configuration file for display, network, and gameplay settings.

# CAVEATS

Some command-line options like **-async** and **-net** are only available on Linux/X-Windows. Screen widths not divisible by 16 may cause display problems. The **-nomidi** option is recommended on systems with sound driver issues, particularly 64-bit Linux. Paksets must be downloaded separately from the base game.

# HISTORY

**Simutrans** was created by Hansjörg Malthaner and first released in **1999**. The name is a portmanteau of "simulation" and "transport." After Malthaner ceased active development, the project continued as open source with an international community of developers. The game has been compared to Transport Tycoon but evolved with unique features and extensive modding support. Development continues actively with regular releases.

# SEE ALSO

[openttd](/man/openttd)(6), [lincity-ng](/man/lincity-ng)(6)
