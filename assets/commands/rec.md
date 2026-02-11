# TAGLINE

Record audio from sound input devices

# TLDR

**Record audio** to a file from the default input

```rec [output.wav]```

**Record for a specific duration** (10 seconds)

```rec [output.wav] trim 0 10```

**Record in a specific format** (MP3)

```rec [output.mp3]```

**Record with specific sample rate** and channels

```rec -r 44100 -c 2 [output.wav]```

**Record until silence is detected**

```rec [output.wav] silence 1 0.1 1% 1 1.0 1%```

**Record 16-bit audio**

```rec -b 16 [output.wav]```

# SYNOPSIS

**rec** [_options_] _outfile_ [_effects_...]

# PARAMETERS

**-r** _rate_
> Set sample rate in Hz (e.g., 44100, 48000)

**-c** _channels_
> Set number of channels (1=mono, 2=stereo)

**-b** _bits_
> Set sample size in bits (8, 16, 24, 32)

**-t** _type_
> Specify file type (wav, mp3, flac, ogg, etc.)

**-d** _device_
> Specify audio device

**-q**
> Quiet mode; suppress progress output

**-V**
> Verbose mode; show detailed progress

**trim** _start_ _duration_
> Record from start position for specified duration

**silence**
> Stop recording based on silence detection

**fade** _type_ _in_ _stop_ _out_
> Apply fade effects

# DESCRIPTION

**rec** is the recording component of SoX (Sound eXchange), the Swiss Army knife of audio processing. It records audio from the default input device (microphone, line-in) to a file in various formats.

The output format is typically determined by the file extension. SoX supports dozens of formats including WAV, MP3, FLAC, OGG, AIFF, and raw audio. Format-specific encoding options can be specified for compressed formats.

SoX effects can be applied during recording, including silence detection to automatically stop recording, trimming to limit duration, and gain adjustments. Effects are specified after the output filename.

**rec** is equivalent to **sox -d** (using the default input device) with appropriate defaults for recording.

# CAVEATS

MP3 encoding requires SoX to be compiled with MP3 support (libmp3lame). Some distributions package this separately due to licensing.

The default audio device depends on system configuration. Use **-d** to specify a particular device if the default is not the desired input.

Recording requires appropriate permissions for audio device access. Users may need to be in the **audio** group on some systems.

Use Ctrl+C to stop recording manually if no duration or silence detection is specified.

# SEE ALSO

[sox](/man/sox)(1), [play](/man/play)(1), [soxi](/man/soxi)(1), [arecord](/man/arecord)(1), [ffmpeg](/man/ffmpeg)(1)
