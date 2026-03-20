# TAGLINE

graphical front-end for retro gaming emulators

# TLDR

**Start EmulationStation**

```emulationstation```

**Start in windowed mode**

```emulationstation --windowed```

**Specify resolution**

```emulationstation --resolution [1920] [1080]```

**Force full UI reload**

```emulationstation --force-full```

**Show help**

```emulationstation --help```

# SYNOPSIS

**emulationstation** [_options_]

# PARAMETERS

**--windowed**
> Run in windowed mode.

**--resolution** _width_ _height_
> Set screen resolution.

**--gamelist-only**
> Skip systems without gamelists.

**--ignore-gamelist**
> Ignore gamelist.xml files.

**--force-full**
> Force full reload of UI.

**--no-splash**
> Do not show the splash screen on startup.

**--no-exit**
> Do not show the exit option in the menu.

**--draw-framerate**
> Display the framerate on screen.

**--vsync** _1|0_
> Turn VSync on or off (default: on).

**--force-kiosk**
> Force kiosk mode.

**--force-kid**
> Force kid UI mode.

**--home** _path_
> Specify a directory to use as the home path.

**--debug**
> Enable debug output and extra logging.

**--help**, **-h**
> Display help.

# DESCRIPTION

**EmulationStation** is a graphical front-end for organizing and launching emulated games. It provides a polished interface for browsing game collections, displaying metadata, and launching various emulators.

The application is commonly used on RetroPie, Batocera, and other retro gaming distributions. It supports themes, scraping game metadata and artwork, and controller navigation for a console-like experience.

# CONFIGURATION

```
~/.emulationstation/
├── es_systems.cfg     # System definitions
├── es_settings.cfg    # Application settings
├── gamelists/         # Per-system game metadata
└── themes/            # Visual themes
```

# CAVEATS

Requires emulators to be configured separately. First-time setup needs es_systems.cfg. Theme compatibility varies. Scraping requires network access. Controller mapping may need configuration.

# HISTORY

EmulationStation was created by **Alec Lofquist** (Aloshi) in **2012**. It became the default front-end for RetroPie, the popular Raspberry Pi retro gaming distribution. The project has spawned forks like EmulationStation-DE for continued development.

# SEE ALSO

[retroarch](/man/retroarch)(1), [mame](/man/mame)(1)
