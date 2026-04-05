# TAGLINE

Play DSD audio files through PipeWire

# TLDR

**Play a DSF file**

```pw-dsdplay [path/to/file.dsf]```

**Play with a specific volume**

```pw-dsdplay --volume [0.5] [path/to/file.dsf]```

**Play to a specific target node**

```pw-dsdplay --target [node_id] [path/to/file.dsf]```

**Play with verbose output**

```pw-dsdplay -v [path/to/file.dsf]```

# SYNOPSIS

**pw-dsdplay** [_options_] [_FILE_ | **-**]

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

**pw-dsdplay** plays DSD (Direct Stream Digital) audio files in DSF format through a PipeWire server. It is a convenience wrapper for **pw-cat --playback --dsd**, making DSD data available to the PipeWire audio graph.

DSD is a high-resolution audio format used in Super Audio CDs (SACDs) that encodes audio as a stream of single-bit values at very high sample rates (typically 2.8224 MHz or higher). Native DSD playback requires compatible hardware that supports DSD natively.

When **-** is given as the file, data is read from stdin.

# CAVEATS

Requires native DSD-capable hardware to produce audible output. Without compatible hardware, no audio will be heard. DSF is the only supported file format for DSD playback.

# HISTORY

Part of **PipeWire**, the modern multimedia framework for Linux created by **Wim Taymans** at Red Hat. PipeWire was first released in **2017** and has become the default audio and video server in major Linux distributions, replacing both PulseAudio and JACK. The pw-cat family of tools provides simple command-line media playback and capture.

# SEE ALSO

[pw-cat](/man/pw-cat)(1), [pw-play](/man/pw-play)(1), [pw-record](/man/pw-record)(1), [pipewire](/man/pipewire)(1)
