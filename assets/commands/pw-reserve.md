# TAGLINE

Reserve audio devices for exclusive use

# TLDR

**Reserve** a device (audio devices only)

```pw-reserve -n audio0```

**Monitor** a device instead of reserving it

```pw-reserve -n audio0 -m```

Display **help**

```pw-reserve -h```

# SYNOPSIS

**pw-reserve** [_options_]

# PARAMETERS

**-n**, **--name** _device_
> Specify device name to reserve (e.g., audio0, audio1)

**-m**, **--monitor**
> Monitor device instead of reserving it

**-h**, **--help**
> Display help message

# DESCRIPTION

**pw-reserve** reserves a device for exclusive use by PipeWire. This implements the D-Bus device reservation protocol, allowing PipeWire to coordinate device access with other audio servers.

Currently only audio devices are supported. Device reservation prevents conflicts when multiple audio systems attempt to access the same hardware.

# CAVEATS

Only audio devices are supported currently. Device names follow the audioN naming convention. Reservation requires D-Bus access.

# HISTORY

Part of **PipeWire**, the modern multimedia framework for Linux. Implements the org.freedesktop.ReserveDevice specification for audio device sharing.

# SEE ALSO

[pipewire](/man/pipewire)(1), [pw-cli](/man/pw-cli)(1)
