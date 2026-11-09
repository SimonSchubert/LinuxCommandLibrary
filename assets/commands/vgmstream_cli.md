# TAGLINE

Decode video game audio formats

# TLDR

**Convert to WAV**

```vgmstream_cli -o [output.wav] [input.adx]```

**Pipe audio** to a player

```vgmstream_cli -p [file.brstm] | aplay```

**Show file info**

```vgmstream_cli -m [file.fsb]```

**Loop twice**

```vgmstream_cli -l 2 -o [output.wav] [input.hca]```

**Select subsong**

```vgmstream_cli -s 3 [file.awb]```

**Extract all subsongs**

```vgmstream_cli -S 0 -o "?f#?s.wav" [file.awb]```

**Disable looping**

```vgmstream_cli -i -o [output.wav] [input.adx]```

# SYNOPSIS

**vgmstream_cli** [_-o outfile.wav_] [_options_] _infile_...

# PARAMETERS

**-o** _FILE_
> Output WAV file, default _infile_.wav. Wildcards: ?s subsong, ?n stream name, ?f infile.

**-m**
> Print metadata only, don't decode.

**-i**
> Ignore looping information and play the stream once.

**-l** _N.n_
> Loop count. Default 2.0.

**-f** _N.n_
> Fade time in seconds after loops. Default 10.0.

**-d** _N.n_
> Fade delay in seconds. Default 0.0.

**-F**
> Don't fade after loops; play the rest of the stream.

**-e**
> Set end-to-end looping if the file has no loop points.

**-E**
> Force end-to-end looping even with real loop points.

**-s** _N_
> Select subsong N.

**-S** _N_
> Select end subsong N (0 for all).

**-p**
> Output to stdout for piping into another program.

**-P**
> Output to stdout even if stdout is a terminal.

**-c**
> Loop forever to stdout.

**-L**
> Append a smpl chunk and create a looping WAV.

**-w**
> Keep the original sample format rather than mixing to PCM16.

**-V**
> Print version info and supported extensions as JSON.

**-I**
> Print file info as JSON.

**-h**
> Print all commands.

# DESCRIPTION

**vgmstream_cli** decodes audio files from video games into standard WAV format or plays them directly. It supports hundreds of proprietary audio formats used across game consoles and engines, including ADX, HCA, FSB, BRSTM, and many more.

The tool handles game-specific features like seamless looping, subsong extraction from multi-track archives, and accurate sample-level playback. Metadata mode displays format details, sample rate, and loop points without decoding the audio.

# CAVEATS

Decode only. Cannot encode to game formats. Some formats need companion files. Upstream builds and docs name the executable **vgmstream-cli**; the binary name may differ by package.

# HISTORY

**vgmstream** is a library for playing streamed video game audio, supporting formats from many game engines and platforms.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [sox](/man/sox)(1), [audacity](/man/audacity)(1)

# RESOURCES

```[Homepage](https://vgmstream.org/)```

```[Source code](https://github.com/vgmstream/vgmstream)```

<!-- verified: 2026-11-09 -->
