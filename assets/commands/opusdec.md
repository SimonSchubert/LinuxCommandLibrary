# TLDR

**Decode Opus to WAV**

```opusdec [input.opus] [output.wav]```

**Decode to raw PCM**

```opusdec --raw [input.opus] [output.pcm]```

**Decode to stdout**

```opusdec [input.opus] - | aplay```

**Set output sample rate**

```opusdec --rate [48000] [input.opus] [output.wav]```

**Force stereo output**

```opusdec --force-stereo [input.opus] [output.wav]```

# SYNOPSIS

**opusdec** [_options_] _input_ [_output_]

# PARAMETERS

**--rate** _Hz_
> Output sample rate.

**--raw**
> Output raw PCM.

**--force-stereo**
> Force stereo output.

**--float**
> 32-bit float output.

**--gain** _dB_
> Apply gain.

**--no-dither**
> Disable dithering.

**--packet-loss** _%_
> Simulate packet loss.

# DESCRIPTION

**opusdec** decodes Opus audio files to WAV or raw PCM. Opus is a versatile audio codec designed for both speech and music, widely used in WebRTC and streaming.

Part of the opus-tools package.

# EXAMPLE

```bash
# Decode to WAV
opusdec music.opus music.wav

# Play directly
opusdec music.opus - | aplay -f cd

# Convert with specific rate
opusdec --rate 44100 input.opus output.wav
```

# CAVEATS

Output defaults to same channels as input. Resampling may affect quality. Use --float for highest precision.

# HISTORY

Opus was developed by the **IETF** Codec Working Group, standardized as RFC 6716 in **2012**, combining SILK and CELT technologies.

# SEE ALSO

[opusenc](/man/opusenc)(1), [opusinfo](/man/opusinfo)(1), [ffmpeg](/man/ffmpeg)(1)
