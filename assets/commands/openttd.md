# TAGLINE

transport simulation

# TLDR

**Start game**

```openttd```

**Start with a specific config file**

```openttd -c [config.cfg]```

**Start a dedicated server**

```openttd -D```

**Load a savegame** on startup

```openttd -g [savegame.sav]```

**Start a new game** with a specific map generator seed

```openttd -G [12345]```

**Connect to a network game**

```openttd -n [host:3979]```

**Start at a specific year**

```openttd -t [1970]```

**Run at a fixed resolution**

```openttd -r [1280x720]```

# SYNOPSIS

**openttd** [_options_]

# PARAMETERS

**-c** _FILE_
> Use the specified configuration file instead of openttd.cfg.

**-D** [_host_[_:port_]]
> Run as a dedicated server (no graphical client).

**-f**
> Fork to the background (used with **-D** on Unix-like systems).

**-g** [_FILE_]
> Start with a savegame loaded; without an argument, starts a new game immediately.

**-G** _SEED_
> Set the random seed used to generate the map.

**-n** _HOST_[_:PORT_][_#PLAYER_]
> Join the network game running at _HOST_.

**-p** _PASSWORD_
> Password for the dedicated server (used with **-D**).

**-t** _YEAR_
> Starting year for the new game.

**-r** _WIDTHxHEIGHT_
> Set screen resolution.

**-b** _BLITTER_
> Select a blitter (graphics renderer).

**-v** _DRIVER_
> Select the video driver.

**-s** _DRIVER_
> Select the sound driver.

**-m** _DRIVER_
> Select the music driver.

**-I** _SET_, **-S** _SET_, **-M** _SET_
> Select the base graphics set, sound set, and music set respectively.

**-e**
> Start in the scenario editor.

**-q** _FILE_
> Write information about a savegame to stdout and exit.

**-d** [_LEVEL_]
> Enable debug output at the given verbosity level.

**-x**
> Do not automatically save the configuration on exit.

**--help**
> Display help information.

# DESCRIPTION

**openttd** is OpenTTD transport simulation. Open source Transport Tycoon Deluxe.

The game simulates transport company management. Multiplayer support.

# CAVEATS

Requires base graphics set. NewGRF mods available. Multiplayer networking.

# HISTORY

OpenTTD was created as an **open-source remake** of Transport Tycoon Deluxe.

# SEE ALSO

[simutrans](/man/simutrans)(1)

