# TAGLINE

controls a running PulseAudio sound server from the command line

# TLDR

**List all audio sinks** (output devices)

```pactl list sinks short```

**Set the default audio output**

```pactl set-default-sink [sink_name]```

**Set volume** to a percentage

```pactl set-sink-volume @DEFAULT_SINK@ [50%]```

**Increase volume** by 10%

```pactl set-sink-volume @DEFAULT_SINK@ +[10%]```

**Mute/unmute** the default sink

```pactl set-sink-mute @DEFAULT_SINK@ toggle```

**List all audio sources** (input devices)

```pactl list sources short```

**Move an application** to a different output

```pactl move-sink-input [stream_index] [sink_name]```

**Load a PulseAudio module**

```pactl load-module [module-null-sink]```

# SYNOPSIS

**pactl** [_options_] _command_ [_args_]

**pactl** set-sink-volume _SINK_ _VOLUME_

**pactl** list [short] [_TYPE_]

# PARAMETERS

**-s** _SERVER_, **--server** _SERVER_
> Connect to specified PulseAudio server

**-n** _NAME_, **--client-name** _NAME_
> Client name for connection

**-f** _FORMAT_, **--format** _FORMAT_
> Output format (text or json)

**-v**, **--verbose**
> Enable verbose output

**--version**
> Show version information

**-h**, **--help**
> Show help message

# COMMANDS

**stat**
> Show memory usage statistics

**info**
> Display server information

**list** [short] [_TYPE_]
> List objects (modules, sinks, sources, sink-inputs, source-outputs, clients, samples, cards)

**exit**
> Terminate PulseAudio server

**set-default-sink** _NAME|INDEX_
> Set default audio output

**set-default-source** _NAME|INDEX_
> Set default audio input

**set-sink-volume** _SINK_ _VOLUME_
> Set sink volume (percentage, dB, or absolute)

**set-source-volume** _SOURCE_ _VOLUME_
> Set source volume

**set-sink-mute** _SINK_ _0|1|toggle_
> Mute/unmute sink

**set-source-mute** _SOURCE_ _0|1|toggle_
> Mute/unmute source

**move-sink-input** _INDEX_ _SINK_
> Move playback stream to different sink

**move-source-output** _INDEX_ _SOURCE_
> Move recording stream to different source

**load-module** _NAME_ [_ARGS_]
> Load a PulseAudio module

**unload-module** _INDEX|NAME_
> Unload a module

**set-card-profile** _CARD_ _PROFILE_
> Change sound card profile

**subscribe**
> Listen for PulseAudio events

# DESCRIPTION

**pactl** controls a running PulseAudio sound server from the command line. It provides a scriptable interface for managing audio devices, streams, volumes, and modules.

Volume can be specified as percentages (50%), decibels (0dB), or absolute values. Prefix with + or - for relative adjustments. Special names **@DEFAULT_SINK@**, **@DEFAULT_SOURCE@**, and **@DEFAULT_MONITOR@** refer to default devices.

The **list** command shows detailed information about audio objects. Use **short** for condensed output suitable for scripting. Stream indices from **list sink-inputs** can be used to move applications between outputs with **move-sink-input**.

# CAVEATS

Requires a running PulseAudio daemon. On systems using PipeWire with PulseAudio compatibility, pactl commands work but interact with PipeWire instead. The **pacmd** command is deprecated in favor of pactl. Volume values above 100% are allowed but may cause distortion.

# HISTORY

pactl is part of **PulseAudio**, a sound server for Linux and other Unix-like systems created by **Lennart Poettering**. PulseAudio was first released in **2004** and became the default sound system in most Linux distributions by 2009. The pactl utility provides command-line access to PulseAudio's D-Bus interface. In recent years, **PipeWire** has begun replacing PulseAudio while maintaining compatibility with pactl commands.

# SEE ALSO

[pulseaudio](/man/pulseaudio)(1), [pacmd](/man/pacmd)(1), [pavucontrol](/man/pavucontrol)(1), [amixer](/man/amixer)(1)
