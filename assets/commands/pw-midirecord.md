# TAGLINE

Record MIDI events through PipeWire

# TLDR

**Record MIDI input to a file**

```pw-midirecord [path/to/output.mid]```

**Record with verbose output**

```pw-midirecord -v [path/to/output.mid]```

**Record from a specific source node**

```pw-midirecord --target [node_id] [path/to/output.mid]```

**Record with custom latency**

```pw-midirecord --latency [50ms] [path/to/output.mid]```

# SYNOPSIS

**pw-midirecord** [_options_] [_FILE_ | **-**]

# PARAMETERS

**--volume** _level_
> Stream volume (default 1.0).

**--rate** _hz_
> Sample rate in Hz (default 48000).

**--channels** _num_
> Number of audio channels (default 2).

**--channel-map** _map_
> Channel layout (e.g. stereo, surround-51, or custom FL,FR mapping).

**--format** _fmt_
> Sample format: u8, s8, s16, s24, s32, f32, f64 (default s16).

**--target** _value_
> Source node: auto, 0, or a specific node ID.

**--latency** _value_
> Node latency (default 100ms).

**-q**, **--quality** _level_
> Resampler quality (0-15, default 4).

**-R**, **--remote** _name_
> Connect to a specific PipeWire instance.

**-P**, **--properties** _json_
> Extra stream properties as a JSON object.

**-v**, **--verbose**
> Enable verbose output.

**-h**, **--help**
> Display help information.

**--version**
> Show version details.

# DESCRIPTION

**pw-midirecord** captures MIDI events from the PipeWire graph and writes them to a file. It is a convenience wrapper for **pw-cat --record --midi**, recording MIDI data from connected MIDI controllers, software instruments, or other MIDI sources available through PipeWire.

The tool records raw MIDI events only. It does not capture rendered audio from MIDI synthesizers. To record the audio output of MIDI playback, use **pw-record** instead.

When **-** is given as the file, data is written to stdout.

# CAVEATS

Records MIDI events only, not audio. A MIDI source must be connected in the PipeWire graph for data to be captured. Requires appropriate device permissions for hardware MIDI controllers.

# HISTORY

Part of **PipeWire**, the modern multimedia framework for Linux created by **Wim Taymans** at Red Hat. PipeWire was first released in **2017** and has become the default audio and video server in major Linux distributions, replacing both PulseAudio and JACK. The pw-cat family of tools provides simple command-line media playback and capture.

# SEE ALSO

[pw-cat](/man/pw-cat)(1), [pw-midiplay](/man/pw-midiplay)(1), [pw-mididump](/man/pw-mididump)(1), [pw-record](/man/pw-record)(1), [pipewire](/man/pipewire)(1)
