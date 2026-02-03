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

**circup** is a package manager for CircuitPython libraries. It manages libraries on CircuitPython devices, checking for updates against the Adafruit CircuitPython Bundle and handling installation and removal.

The tool automatically detects connected CircuitPython devices and manages the lib folder.

# CAVEATS

Requires a CircuitPython device to be connected and mounted. The device must be running CircuitPython (not MicroPython).

# SEE ALSO

[pip](/man/pip)(1), [mpremote](/man/mpremote)(1)
