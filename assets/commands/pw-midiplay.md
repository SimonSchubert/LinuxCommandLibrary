# TAGLINE

Play MIDI files through PipeWire

# TLDR

**Play a MIDI file**

```pw-midiplay [path/to/file.mid]```

**Play with a specific volume**

```pw-midiplay --volume [0.5] [path/to/file.mid]```

**Play to a specific target node**

```pw-midiplay --target [node_id] [path/to/file.mid]```

**Play with verbose output**

```pw-midiplay -v [path/to/file.mid]```

# SYNOPSIS

**pw-midiplay** [_options_] [_FILE_ | **-**]

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
> Target node: auto, 0, or a specific node ID.

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

**pw-midiplay** plays MIDI files through a PipeWire server. It is a convenience wrapper for **pw-cat --playback --midi**, making MIDI events available to the PipeWire audio graph.

The tool does not render MIDI into audible audio by itself. It sends MIDI events into the PipeWire graph where they must be routed to a MIDI synthesizer (such as **qsynth**, **fluidsynth**, or **timidity**) or hardware MIDI device to produce sound.

When **-** is given as the file, data is read from stdin.

# CAVEATS

Does not produce audible output on its own. A separate MIDI synthesizer or compatible hardware must be connected in the PipeWire graph to render MIDI events into audio. Standard MIDI File format (.mid) is supported.

# HISTORY

Part of **PipeWire**, the modern multimedia framework for Linux created by **Wim Taymans** at Red Hat. PipeWire was first released in **2017** and has become the default audio and video server in major Linux distributions, replacing both PulseAudio and JACK. The pw-cat family of tools provides simple command-line media playback and capture.

# SEE ALSO

[pw-cat](/man/pw-cat)(1), [pw-midirecord](/man/pw-midirecord)(1), [pw-mididump](/man/pw-mididump)(1), [pw-play](/man/pw-play)(1), [pipewire](/man/pipewire)(1)
