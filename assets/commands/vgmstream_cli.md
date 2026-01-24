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

**vgmstream_cli** decodes video game audio formats. Supports hundreds of formats.

Game audio decoder. Many formats.

Loop support. Accurate playback.

Subsong extraction. Multi-track files.

Metadata display. Format information.

# CAVEATS

Decode only. Cannot encode to game formats. Some formats need companion files.

# HISTORY

**vgmstream** is a library for playing streamed video game audio, supporting formats from many game engines and platforms.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [sox](/man/sox)(1), [audacity](/man/audacity)(1)
