# TAGLINE

Play encoded audio streams through PipeWire

# TLDR

**Play an encoded audio file**

```pw-encplay [path/to/file]```

**Play with a specific volume**

```pw-encplay --volume [0.8] [path/to/file]```

**Play to a specific target node**

```pw-encplay --target [node_id] [path/to/file]```

**Play with verbose output**

```pw-encplay -v [path/to/file]```

# SYNOPSIS

**pw-encplay** [_options_] [_FILE_ | **-**]

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

**pw-encplay** plays encoded (compressed) audio streams through a PipeWire server. It is a convenience wrapper for **pw-cat** in encoded playback mode, passing encoded audio data directly to the PipeWire graph without decoding it first.

This enables passthrough of compressed audio formats (such as AC3, DTS, or AAC) to hardware decoders or receivers that support native decoding, preserving the original encoded stream quality.

When **-** is given as the file, data is read from stdin.

# CAVEATS

Requires a sink that supports the encoded format for passthrough playback. If the connected output does not support the format, no audio will be produced. Typically used with HDMI or S/PDIF outputs connected to AV receivers.

# HISTORY

Part of **PipeWire**, the modern multimedia framework for Linux created by **Wim Taymans** at Red Hat. PipeWire was first released in **2017** and provides unified audio and video handling, replacing PulseAudio and JACK. The pw-cat family of tools provides simple command-line media playback and capture.

# SEE ALSO

[pw-cat](/man/pw-cat)(1), [pw-play](/man/pw-play)(1), [pw-record](/man/pw-record)(1), [pipewire](/man/pipewire)(1)
