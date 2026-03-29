# TAGLINE

PulseAudio compatibility layer for PipeWire

# TLDR

Start **PulseAudio compatible** daemon

```pipewire-pulse```

Use **specific config** file

```pipewire-pulse -c [path/to/pipewire-pulse.conf]```

Increase **verbosity**

```pipewire-pulse -vvv```

Display **help**

```pipewire-pulse -h```

# SYNOPSIS

**pipewire-pulse** [**-c** _config_] [**-v**...] [**-h**|**--help**] [**--version**]

# PARAMETERS

**-c, --config** _file_
> Use alternate configuration file (default: pipewire-pulse.conf)

**-v, --verbose**
> Increase verbosity level (stackable)

**-h, --help**
> Display help information

**--version**
> Display version information

# DESCRIPTION

**pipewire-pulse** provides PulseAudio protocol compatibility for PipeWire. It allows applications written for PulseAudio to work seamlessly with PipeWire without modification, listening on the same socket as PulseAudio would.

The daemon translates PulseAudio protocol messages to PipeWire operations, maintaining compatibility with existing applications while leveraging PipeWire's improved architecture and lower latency.

# CONFIGURATION

**/etc/pipewire/pipewire-pulse.conf**
> System-wide PipeWire-Pulse configuration file.

**~/.config/pipewire/pipewire-pulse.conf.d/**
> User-level drop-in directory for configuration overrides.

# ENVIRONMENT

**PULSE_RUNTIME_PATH**, **XDG_RUNTIME_DIR**
> Directory in which to create the native protocol PulseAudio socket.

**PULSE_LATENCY_MSEC**
> Extra buffering latency in milliseconds added for libpulse client applications.

# CAVEATS

Cannot run simultaneously with actual PulseAudio daemon. Usually started automatically by systemd. Requires main pipewire daemon to be running. Some advanced PulseAudio features may not be fully supported.

# HISTORY

**pipewire-pulse** was developed as part of **PipeWire** to ensure smooth migration from PulseAudio. It allows distributions to switch to PipeWire while maintaining compatibility with the large ecosystem of PulseAudio-enabled applications.

# SEE ALSO

[pipewire](/man/pipewire)(1), [pulseaudio](/man/pulseaudio)(1), [pactl](/man/pactl)(1), [pacmd](/man/pacmd)(1), [wpctl](/man/wpctl)(1), [pw-top](/man/pw-top)(1)
