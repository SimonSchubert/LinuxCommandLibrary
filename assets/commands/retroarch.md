# TAGLINE

Multi-system emulator and game frontend

# TLDR

Start **menu** mode

```retroarch```

Start in **fullscreen**

```retroarch -f```

List **compiled features**

```retroarch --features```

Use specific **config** file

```retroarch -c [path/to/config]```

Display **help**

```retroarch -h```

Display **version**

```retroarch --version```

# SYNOPSIS

**retroarch** [**-f**] [**-c** _config_] [**-L** _core_] [_content_]

# PARAMETERS

**-f, --fullscreen**
> Start in fullscreen mode

**-c, --config _file_**
> Use specific configuration file

**-L, --libretro _core_**
> Load specific libretro core

**--features**
> List compiled features

**--menu**
> Start directly in menu

**-v, --verbose**
> Verbose logging

**-h, --help**
> Display help

# DESCRIPTION

**retroarch** is a frontend for emulators, game engines, and media players based on the libretro API. It provides a unified interface for playing retro games across many platforms.

The tool uses interchangeable "cores" for different systems (NES, SNES, PlayStation, etc.) with features like shaders, netplay, achievements, and input remapping.

# CONFIGURATION

**~/.config/retroarch/retroarch.cfg**
> Main configuration file controlling video, audio, input, directory paths, and default core settings.

**~/.config/retroarch/cores/**
> Directory containing libretro core shared libraries (.so files) for each emulated system.

**~/.config/retroarch/config/**
> Per-core and per-game override configuration files that supplement the main config.

# CAVEATS

Cores must be downloaded separately. Game ROMs not included (legal backup required). Performance varies by core and system. Configuration can be complex.

# HISTORY

**RetroArch** is the reference implementation of the **libretro** API, developed by the libretro team. It evolved from SSNES and has become the most popular multi-system emulator frontend.

# SEE ALSO

[emulationstation](/man/emulationstation)(1), [mame](/man/mame)(1)
