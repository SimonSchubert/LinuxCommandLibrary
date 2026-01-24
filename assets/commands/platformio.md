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

**Install library**

```pio lib install "[library_name]"```

**Search for boards**

```pio boards [pattern]```

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

**lib install**
> Install library.

**lib search**
> Search libraries.

**boards**
> List supported boards.

**debug**
> Start debugger.

**test**
> Run unit tests.

**-e** _env_
> Specific environment.

# CAVEATS

Initial setup downloads many dependencies. Some boards need drivers. IDE integration varies. Large project builds slow.

# HISTORY

**PlatformIO** was created by **Ivan Kravets** in **2014** to unify embedded development tooling. It addressed the fragmentation of vendor-specific IDEs and build systems, becoming popular with IoT and maker communities.

# SEE ALSO

[arduino-cli](/man/arduino-cli)(1), [make](/man/make)(1), [cmake](/man/cmake)(1), [gdb](/man/gdb)(1)
