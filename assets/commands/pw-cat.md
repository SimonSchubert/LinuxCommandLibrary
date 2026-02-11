# TAGLINE

Play and record audio through PipeWire

# TLDR

**Play** a WAV file

```pw-cat -p [path/to/file.wav]```

Play with specific **resampler quality**

```pw-cat -q [8] -p [path/to/file.wav]```

**Record** to file with volume adjustment

```pw-cat -r --volume [1.25] [path/to/file.wav]```

Record with **custom sample rate**

```pw-cat -r --rate [48000] [path/to/file.wav]```

Display **help**

```pw-cat -h```

# SYNOPSIS

**pw-cat** [**-p**|**-r**] [**-q** _quality_] [**--volume** _vol_] [**--rate** _rate_] _file_

# PARAMETERS

**-p, --playback**
> Play audio file

**-r, --record**
> Record to audio file

**-q, --quality _level_**
> Resampler quality (0-15, default 4)

**--volume _level_**
> Volume level (1.0 = 100%)

**--rate _hz_**
> Sample rate in Hz

**--channels _num_**
> Number of channels

**--target _target_**
> Target node to connect to

# DESCRIPTION

**pw-cat** plays and records audio files through PipeWire. It provides a simple command-line interface for audio playback and recording similar to pacat for PulseAudio.

The tool supports various audio formats and can connect to specific PipeWire nodes. It's useful for testing audio setup and simple recording tasks.

# CAVEATS

Requires running PipeWire instance. Limited format support compared to full audio players. Use pw-play and pw-record as simpler aliases.

# HISTORY

**pw-cat** is part of the **PipeWire** multimedia framework. It provides similar functionality to PulseAudio's pacat tool for the PipeWire ecosystem.

# SEE ALSO

[pw-play](/man/pw-play)(1), [pw-record](/man/pw-record)(1), [pw-cli](/man/pw-cli)(1), [wpctl](/man/wpctl)(1)
