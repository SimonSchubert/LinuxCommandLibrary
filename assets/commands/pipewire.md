# TLDR

Start **PipeWire** daemon

```pipewire```

Use **different config** file

```pipewire --config [path/to/file.conf]```

Increase **verbosity** level

```pipewire -vvv```

Display **help**

```pipewire --help```

# SYNOPSIS

**pipewire** [**-c** _config_] [**-v**...] [**--help**] [**--version**]

# PARAMETERS

**-c, --config _file_**
> Use alternate configuration file

**-v, --verbose**
> Increase verbosity (use multiple times for more)

**-h, --help**
> Display help information

**--version**
> Display version information

# DESCRIPTION

**pipewire** is a modern multimedia processing daemon that handles audio and video streams. It provides low-latency capture and playback, replacing both PulseAudio for consumer audio and JACK for professional audio applications.

The daemon manages connections between applications and devices, handles format conversion, and provides a graph-based routing model. It's typically started automatically by systemd user services.

# CAVEATS

Usually started via systemd, not manually. Requires pipewire-pulse for PulseAudio compatibility. Configuration changes need daemon restart. May conflict with running PulseAudio instances.

# HISTORY

**PipeWire** was developed by **Wim Taymans** at Red Hat. It emerged from PulseVideo experiments and became a unified solution for Linux multimedia, officially adopted by Fedora 34 in 2021 and subsequently by other distributions.

# SEE ALSO

[pipewire-pulse](/man/pipewire-pulse)(1), [pw-cli](/man/pw-cli)(1), [pw-top](/man/pw-top)(1), [wireplumber](/man/wireplumber)(1)
