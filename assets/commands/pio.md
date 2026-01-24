# TLDR

**Initialize new project**

```pio project init --board [uno]```

**Build project**

```pio run```

**Upload to board**

```pio run --target upload```

**Monitor serial port**

```pio device monitor```

**List boards**

```pio boards [search_term]```

**Install library**

```pio pkg install --library "[library_name]"```

**Run tests**

```pio test```

**Check for updates**

```pio pkg update```

# SYNOPSIS

**pio** [_project_] [_run_] [_device_] [_pkg_] [_boards_] [_options_] [_args_]

# PARAMETERS

**project init**
> Initialize project.

**run**
> Build project.

**run -t upload**
> Upload firmware.

**run -t clean**
> Clean build.

**device monitor**
> Serial monitor.

**device list**
> List devices.

**boards** [_QUERY_]
> Search boards.

**pkg install**
> Install package.

**pkg update**
> Update packages.

**pkg list**
> List packages.

**test**
> Run unit tests.

**-e** _ENV_
> Target environment.

**-d** _DIR_
> Project directory.

**-v**
> Verbose output.

# DESCRIPTION

**pio** (PlatformIO Core CLI) is a development platform for embedded systems. It supports hundreds of boards including Arduino, ESP32, STM32, and more.

Project initialization creates the directory structure and configuration. The platformio.ini file defines boards, frameworks, and dependencies.

Building compiles code for target platforms. Multiple environments can be defined for different boards or configurations.

Upload transfers firmware to connected devices. Serial monitor provides interactive communication for debugging.

Library management handles dependencies. Libraries are installed globally or per-project. The registry contains thousands of libraries.

Unit testing runs on embedded devices or host machines. This enables test-driven development for firmware.

VS Code integration through the PlatformIO IDE extension provides a full development environment.

# CAVEATS

Large download for platform support. First build downloads toolchains. Some obscure boards may lack support. Configuration can be complex for advanced use.

# HISTORY

**PlatformIO** was created by **Ivan Kravets** starting around **2014**. It unified fragmented embedded development tooling, providing cross-platform, vendor-independent infrastructure for IoT development.

# SEE ALSO

[arduino-cli](/man/arduino-cli)(1), [esptool](/man/esptool)(1), [avrdude](/man/avrdude)(1), [openocd](/man/openocd)(1)
