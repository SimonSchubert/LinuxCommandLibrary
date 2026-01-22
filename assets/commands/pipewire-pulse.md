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

**pipewire-pulse** [**-c** _config_] [**-v**...] [**-h**|**--help**]

# PARAMETERS

**-c, --config _file_**
> Use alternate configuration file

**-v, --verbose**
> Increase verbosity level (stackable)

**-h, --help**
> Display help information

# DESCRIPTION

**pipewire-pulse** provides PulseAudio protocol compatibility for PipeWire. It allows applications written for PulseAudio to work seamlessly with PipeWire without modification, listening on the same socket as PulseAudio would.

The daemon translates PulseAudio protocol messages to PipeWire operations, maintaining compatibility with existing applications while leveraging PipeWire's improved architecture and lower latency.

# CAVEATS

Cannot run simultaneously with actual PulseAudio daemon. Usually started automatically by systemd. Requires main pipewire daemon to be running. Some advanced PulseAudio features may not be fully supported.

# HISTORY

**pipewire-pulse** was developed as part of **PipeWire** to ensure smooth migration from PulseAudio. It allows distributions to switch to PipeWire while maintaining compatibility with the large ecosystem of PulseAudio-enabled applications.

# SEE ALSO

[pipewire](/man/pipewire)(1), [pulseaudio](/man/pulseaudio)(1), [pactl](/man/pactl)(1)
