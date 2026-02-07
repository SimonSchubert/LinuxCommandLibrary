# TAGLINE

Package manager for CircuitPython libraries

# TLDR

**List installed CircuitPython libraries**

```circup list```

**Update all libraries** on the connected device

```circup update```

**Install a library**

```circup install [library_name]```

**Uninstall a library**

```circup uninstall [library_name]```

**Show outdated libraries**

```circup show```

**Freeze installed libraries** to requirements file

```circup freeze > [requirements.txt]```

# SYNOPSIS

**circup** _command_ [_options_]

# SUBCOMMANDS

**list**
> List installed libraries on the device.

**update**
> Update libraries on the device.

**install**
> Install a library.

**uninstall**
> Remove a library.

**show**
> Show outdated libraries.

**freeze**
> Output installed libraries in requirements format.

**bundle-show**
> Show available libraries in the bundle.

# DESCRIPTION

**circup** is a package manager for CircuitPython libraries on microcontroller boards. It manages the lib folder on connected CircuitPython devices, checking installed libraries against the Adafruit CircuitPython Bundle for available updates.

The tool automatically detects connected CircuitPython devices by scanning mounted filesystems for a valid CircuitPython installation. It handles downloading, installing, updating, and removing libraries, and can freeze the current library state into a requirements file for reproducibility.

circup is written in Python and installed via pip. It supports boards like Adafruit Feather, Circuit Playground, and other CircuitPython-compatible hardware.

# CAVEATS

Requires a CircuitPython device to be connected and mounted. The device must be running CircuitPython (not MicroPython).

# SEE ALSO

[pip](/man/pip)(1), [mpremote](/man/mpremote)(1)
