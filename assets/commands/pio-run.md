# TAGLINE

builds PlatformIO projects

# TLDR

**Build project**

```pio run```

**Build and upload to device**

```pio run --target upload```

**Build specific environment**

```pio run -e [uno]```

**Clean build files**

```pio run --target clean```

**Build specific environment** and upload

```pio run -e [esp32dev] --target upload```

**Build from a specific** project directory

```pio run -d [/path/to/project]```

**Build with verbose** output for debugging

```pio run -v```

**Build with parallel** jobs for faster compilation

```pio run -j [4]```

# SYNOPSIS

**pio run** [_options_]

# PARAMETERS

**-e**, **--environment** _name_
> Process specific environment defined in platformio.ini.

**-t**, **--target** _target_
> Process target (upload, clean, program, uploadfs, etc.).

**-d**, **--project-dir** _dir_
> Project directory (default: current directory).

**--upload-port** _port_
> Upload port (e.g., /dev/ttyUSB0 or COM3).

**-j**, **--jobs** _num_
> Number of parallel build jobs.

**-v**, **--verbose**
> Verbose output showing full compiler commands.

**-s**, **--silent**
> Suppress all output except errors.

**--disable-auto-clean**
> Disable automatic cleaning if environment configuration has changed.

**--list-targets**
> List available project targets.

# DESCRIPTION

**pio run** builds PlatformIO projects. Compiles source code, links libraries, and optionally uploads firmware to target devices. It reads the `platformio.ini` configuration file to determine build environments, board settings, and library dependencies. This is the core command for the embedded development workflow with PlatformIO.

Multiple environments can be defined in platformio.ini and selectively built with the **-e** flag. Common targets include **upload** (flash firmware), **clean** (remove build artifacts), and **uploadfs** (upload filesystem image).

# SEE ALSO

[pio-init](/man/pio-init)(1), [pio-device](/man/pio-device)(1), [pio-test](/man/pio-test)(1), [pio-check](/man/pio-check)(1), [pio-debug](/man/pio-debug)(1), [pio-boards](/man/pio-boards)(1)

