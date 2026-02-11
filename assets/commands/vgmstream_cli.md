# TAGLINE

Decode video game audio formats

# TLDR

**Convert to WAV**

```vgmstream_cli -o [output.wav] [input.adx]```

**Play audio directly**

```vgmstream_cli -p [file.brstm]```

**Show file info**

```vgmstream_cli -m [file.fsb]```

**Loop twice**

```vgmstream_cli -l 2 -o [output.wav] [input.hca]```

**Select subsong**

```vgmstream_cli -s 3 [file.awb]```

**Disable looping**

```vgmstream_cli -i -o [output.wav] [input.adx]```

# SYNOPSIS

**vgmstream_cli** [_-o file_] [_-p_] [_-m_] [_-l loops_] [_-s subsong_] [_-i_] _file_

# PARAMETERS

**-o** _FILE_
> Output WAV file.

**-p**
> Play to audio device.

**-m**
> Show metadata only.

**-l** _N_
> Loop count.

**-s** _N_
> Select subsong.

**-i**
> Ignore loops.

**-S** _N_
> Start at subsong.

**-E** _N_
> End at subsong.

# DESCRIPTION

**vgmstream_cli** decodes audio files from video games into standard WAV format or plays them directly. It supports hundreds of proprietary audio formats used across game consoles and engines, including ADX, HCA, FSB, BRSTM, and many more.

The tool handles game-specific features like seamless looping, subsong extraction from multi-track archives, and accurate sample-level playback. Metadata mode displays format details, sample rate, and loop points without decoding the audio.

# CAVEATS

Decode only. Cannot encode to game formats. Some formats need companion files.

# HISTORY

**vgmstream** is a library for playing streamed video game audio, supporting formats from many game engines and platforms.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [sox](/man/sox)(1), [audacity](/man/audacity)(1)
