# TAGLINE

Open source RGB lighting control

# TLDR

**Start GUI**

```openrgb```

**List devices**

```openrgb -l```

**Set color on device**

```openrgb -d [0] -c [FF0000]```

**Set mode**

```openrgb -d [0] -m [Static]```

**Apply profile**

```openrgb -p [profile.orp]```

**Set color on a specific zone**

```openrgb -d [0] -z [0] -c [00FF00]```

**Start SDK server**

```openrgb --server```

**Start server on custom port**

```openrgb --server --server-port [1234]```

# SYNOPSIS

**openrgb** [_options_]

# PARAMETERS

**-l**, **--list-devices**
> List all detected RGB devices with their index numbers.

**-d** _INDEX_, **--device** _INDEX_
> Select device by index number or name. Applies to all devices if omitted.

**-z** _INDEX_, **--zone** _INDEX_
> Select zone on device.

**-c** _COLOR_, **--color** _COLOR_
> Set color in hex format (e.g., FF0000 for red).

**-m** _MODE_, **--mode** _MODE_
> Set lighting mode (e.g., Static, Breathing, Rainbow).

**-s** _SIZE_, **--size** _SIZE_
> Set zone size (for resizable zones).

**-p** _PROFILE_
> Load a saved profile.

**--server**
> Start the SDK server (default port 6742).

**--server-port** _PORT_
> Set SDK server port (range 1024-65535).

**--client** _IP:PORT_
> Connect to an SDK server.

**-v**, **--verbose**
> Print log messages to stdout.

**--startminimized**
> Start the GUI minimized to system tray.

**--help**
> Display help information.

# DESCRIPTION

**OpenRGB** is an open source RGB lighting control application that provides a unified interface across many hardware brands including ASUS, Corsair, Logitech, MSI, Razer, and others.

The tool provides both a GUI and CLI for controlling RGB LEDs on motherboards, RAM, GPUs, peripherals, and other devices. It works cross-platform on Linux, Windows, and macOS, and includes an SDK server for remote control and integration with other applications.

# CAVEATS

Hardware support varies. May need kernel modules. Root for some devices.

# HISTORY

OpenRGB was created for **unified RGB lighting control** across different brands.

# SEE ALSO

[i2cdetect](/man/i2cdetect)(1)

