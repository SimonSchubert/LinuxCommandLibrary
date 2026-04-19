# TAGLINE

command-line tool for reconfiguring PulseAudio at runtime

# TLDR

**List sinks (outputs)**

```pacmd list-sinks```

**List sources (inputs)**

```pacmd list-sources```

**Set default sink**

```pacmd set-default-sink [sink_name]```

**Set sink volume**

```pacmd set-sink-volume [sink_name] [65536]```

**Move stream to sink**

```pacmd move-sink-input [index] [sink_name]```

**Interactive mode**

```pacmd```

# SYNOPSIS

**pacmd** [_command_]

# PARAMETERS

**list-sinks**
> List output devices.

**list-sources**
> List input devices.

**list-sink-inputs**
> List playback streams.

**list-source-outputs**
> List recording streams.

**list-modules**
> List loaded PulseAudio modules.

**set-default-sink** _name_
> Set default output.

**set-default-source** _name_
> Set default input.

**set-sink-volume** _name_ _vol_
> Set sink volume (0-65536 linear).

**set-source-volume** _name_ _vol_
> Set source volume.

**set-sink-mute** _name_ _0|1_
> Mute/unmute a sink.

**set-source-mute** _name_ _0|1_
> Mute/unmute a source.

**move-sink-input** _idx_ _sink_
> Move a playback stream to another sink.

**move-source-output** _idx_ _source_
> Move a recording stream to another source.

**load-module** _name_ [_args_]
> Load a PulseAudio module.

**unload-module** _id_
> Unload a module by index or name.

**help**
> Show all supported commands.

**exit**
> Terminate the PulseAudio daemon (in interactive mode, use Ctrl+D to quit).

# DESCRIPTION

**pacmd** is a command-line tool for reconfiguring PulseAudio at runtime. It provides full access to PulseAudio's internal configuration and state.

Running without arguments enters interactive mode with tab completion.

# VOLUME SCALE

```
0     = 0%   (muted)
32768 = 50%
65536 = 100% (normal)
98304 = 150% (amplified)
```

# CAVEATS

PulseAudio specific. Use pactl for simpler operations. Changes may not persist across restarts. Consider PipeWire migration.

# HISTORY

pacmd is part of **PulseAudio**, developed by **Lennart Poettering** starting in **2004** as a next-generation sound server.

# SEE ALSO

[pactl](/man/pactl)(1), [pulseaudio](/man/pulseaudio)(1), [pavucontrol](/man/pavucontrol)(1)
