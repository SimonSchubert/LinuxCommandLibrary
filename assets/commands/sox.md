# TAGLINE

Universal command-line audio processor

# TLDR

**Convert audio format**

```sox [input.wav] [output.mp3]```

**Concatenate files**

```sox [file1.wav] [file2.wav] [output.wav]```

**Change sample rate**

```sox [input.wav] -r [44100] [output.wav]```

**Mix to mono**

```sox [input.wav] [output.wav] channels 1```

**Add reverb**

```sox [input.wav] [output.wav] reverb```

**Trim audio**

```sox [input.wav] [output.wav] trim [0] [10]```

**Normalize volume**

```sox [input.wav] [output.wav] norm```

**Record audio**

```sox -d [output.wav]```

# SYNOPSIS

**sox** [_options_] _infiles_ _outfile_ [_effects_...]

# DESCRIPTION

**sox** (Sound eXchange) is a command-line audio processing tool. It converts between formats, applies effects, and can record and play audio.

The tool supports many audio formats and provides extensive processing capabilities including filtering, mixing, and format conversion.

# PARAMETERS

**-r** _rate_
> Sample rate.

**-c** _channels_
> Number of channels.

**-b** _bits_
> Sample size in bits.

**-e** _encoding_
> Sample encoding.

**-t** _type_
> File type.

**-v** _factor_
> Volume adjustment.

**-d**
> Default audio device.

**--combine** _type_
> Combine method (concatenate, merge, mix).

# EFFECTS

**trim**: Cut portion
**fade**: Fade in/out
**reverb**: Add reverb
**norm**: Normalize
**speed**: Change speed
**pitch**: Shift pitch
**equalizer**: EQ adjustment
**compand**: Compression

# CAVEATS

Some formats need external libraries. Complex effects chains can be slow. Quality depends on parameters. Some effects modify duration.

# HISTORY

**SoX** was started by **Lance Norskog** in **1991** and has been developed by many contributors. It became the Swiss Army knife of audio processing on Unix systems.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [lame](/man/lame)(1), [flac](/man/flac)(1), [aplay](/man/aplay)(1)
