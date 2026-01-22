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

**play** plays audio files. Part of SoX audio toolkit.

The tool supports many formats. Real-time effects.

play plays audio.

# CAVEATS

Part of SoX. Format support varies. Effects available.

# HISTORY

play is part of **SoX** (Sound eXchange) audio processing toolkit.

# SEE ALSO

[sox](/man/sox)(1), [rec](/man/rec)(1), [soxi](/man/soxi)(1)

