# TAGLINE

Play audio files with effects via SoX

# TLDR

**Play audio file**

```play [audio.mp3]```

**Play with effects**

```play [audio.wav] reverb```

**Play at different speed**

```play [audio.wav] speed 1.5```

**Play with volume change**

```play [audio.wav] vol 0.5```

**Combine files**

```play [file1.wav] [file2.wav]```

# SYNOPSIS

**play** [_options_] _file_ [_effects_...]

# PARAMETERS

_FILE_
> Audio file to play.

_EFFECTS_
> Audio effects to apply.

**-v** _VOLUME_
> Volume level.

**-r** _RATE_
> Sample rate.

**--help**
> Display help.

# DESCRIPTION

**play** plays audio files from the command line with optional real-time effects processing. Part of the SoX (Sound eXchange) audio toolkit, it supports a wide range of formats including WAV, MP3, FLAC, OGG, and many others.

Audio effects such as reverb, echo, speed change, volume adjustment, and equalization can be chained together on the command line. Multiple files can be concatenated for sequential playback.

# CAVEATS

Part of SoX. Format support varies. Effects available.

# HISTORY

play is part of **SoX** (Sound eXchange) audio processing toolkit.

# SEE ALSO

[sox](/man/sox)(1), [rec](/man/rec)(1), [soxi](/man/soxi)(1)

