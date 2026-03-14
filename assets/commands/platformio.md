# TAGLINE

Embedded development platform and build system

# TLDR

**Initialize project**

```pio init --board [uno]```

**Build project**

```pio run```

**Upload to board**

```pio run --target upload```

**Monitor serial port**

```pio device monitor```

**List connected boards**

```pio device list```

**Install a library**

```pio pkg install --library "[library_name]"```

**Search for boards**

```pio boards [pattern]```

**Clean build files**

```pio run --target clean```

# SYNOPSIS

**pio** _command_ [_options_]

# DESCRIPTION

**platformio** is an ecosystem for embedded development. It provides unified tools for building, uploading, and debugging embedded software across many platforms and frameworks.

The tool supports Arduino, ESP32, STM32, and hundreds of other boards with integrated library management and debugging.

# PARAMETERS

**init**
> Initialize project.

**run**
> Build project.

**run --target upload**
> Upload firmware.

**device monitor**
> Serial monitor.

**device list**
> List devices.

**pkg install**
> Install packages (libraries, platforms, tools).

**pkg install --library** _NAME_
> Install a library dependency.

**pkg search**
> Search the PlatformIO Registry.

**boards**
> List supported boards.

**check**
> Run static code analysis.

**debug**
> Start debugger.

**test**
> Run unit tests.

**home**
> Launch PlatformIO Home web UI.

**-e**, **--environment** _env_
> Specific environment.

**-v**, **--verbose**
> Verbose output.

# CONFIGURATION

**platformio.ini**
> Project configuration file defining board targets, frameworks, library dependencies, and build options.

**~/.platformio/**
> PlatformIO home directory containing installed platforms, packages, and global settings.

**PLATFORMIO_CORE_DIR**
> Environment variable to override the PlatformIO home directory location.

# CAVEATS

Initial setup downloads many dependencies. Some boards need drivers. The `pio lib` command family is deprecated since PlatformIO 6.0; use `pio pkg` instead.

# HISTORY

**PlatformIO** was created by **Ivan Kravets** in **2014** to unify embedded development tooling. It addressed the fragmentation of vendor-specific IDEs and build systems, becoming popular with IoT and maker communities.

# SEE ALSO

[pio](/man/pio)(1), [arduino-cli](/man/arduino-cli)(1), [make](/man/make)(1), [cmake](/man/cmake)(1), [gdb](/man/gdb)(1)
