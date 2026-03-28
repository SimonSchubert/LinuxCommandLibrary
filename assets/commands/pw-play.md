# TAGLINE

Play audio files through PipeWire

# TLDR

**Play a WAV file**

```pw-play [path/to/file.wav]```

**Play a file at a specific volume**

```pw-play --volume [0.8] [path/to/file.wav]```

**Play with a custom sample rate**

```pw-play --rate [48000] [path/to/file.wav]```

**Play to a specific target node**

```pw-play --target [node_name] [path/to/file.wav]```

**Play with specific resampler quality**

```pw-play -q [8] [path/to/file.wav]```

# SYNOPSIS

**pw-play** [_options_] _file_

# PARAMETERS

**--volume** _level_
> Playback volume (1.0 = 100%).

**--rate** _hz_
> Sample rate in Hz.

**--channels** _num_
> Number of audio channels.

**-q**, **--quality** _level_
> Resampler quality (0-15, default 4).

**--target** _target_
> Target PipeWire node to connect to.

**--channel-map** _map_
> Channel map to use (e.g., FL,FR for stereo).

**--format** _format_
> Sample format (e.g., s16, s32, f32, f64).

**--latency** _latency_
> Latency in milliseconds.

# DESCRIPTION

**pw-play** is a convenience wrapper for **pw-cat --playback**, used to play audio files through PipeWire. It supports common audio formats including WAV, FLAC, and Ogg.

All options available to **pw-cat** in playback mode also apply to **pw-play**. See **pw-cat** for full documentation.

# SEE ALSO

[pw-cat](/man/pw-cat)(1), [pw-record](/man/pw-record)(1), [pw-cli](/man/pw-cli)(1), [pipewire](/man/pipewire)(1)
