# TAGLINE

encodes audio to Opus format

# TLDR

**Encode to Opus**

```opusenc [input.wav] [output.opus]```

**Set bitrate**

```opusenc --bitrate [128] [input.wav] [output.opus]```

**Set quality**

```opusenc --vbr --comp [10] [input.wav] [output.opus]```

**Add metadata**

```opusenc --title "[title]" --artist "[artist]" [input.wav] [output.opus]```

**Encode from pipe**

```ffmpeg -i [input] -f wav - | opusenc - [output.opus]```

# SYNOPSIS

**opusenc** [_options_] _input_ _output_

# PARAMETERS

_INPUT_
> Input audio file.

_OUTPUT_
> Output Opus file.

**--bitrate** _KBPS_
> Target bitrate in kbit/s. Default is 64 for mono, 96 for stereo.

**--vbr**
> Use variable bitrate (default).

**--cvbr**
> Use constrained variable bitrate.

**--hard-cbr**
> Use hard constant bitrate.

**--comp** _LEVEL_
> Encoding complexity, 0 (fast) to 10 (slowest, best quality). Default 10.

**--framesize** _MS_
> Frame size in ms (2.5, 5, 10, 20, 40, 60). Default 20.

**--music** / **--speech**
> Tune the encoder for music or for speech.

**--downmix-mono** / **--downmix-stereo**
> Force mono or stereo output.

**--title** _TITLE_, **--artist** _NAME_, **--album** _NAME_
> Set Vorbis-style metadata tags.

**--raw**, **--raw-rate** _HZ_, **--raw-chan** _N_
> Treat input as headerless PCM with the given sample rate and channel count.

**--help**
> Display help information.

# DESCRIPTION

**opusenc** encodes raw or container audio (WAV, AIFF, FLAC, or raw PCM) to the Opus codec inside an Ogg container. Opus is a low-latency, royalty-free codec well suited to both music and speech at bitrates from 6 to 510 kbit/s.

By default opusenc uses VBR at complexity 10, which gives the best quality for the size at the cost of CPU time. Reading from `-` lets you pipe from `ffmpeg`, `sox`, or similar tools.

# CAVEATS

Shipped as part of **opus-tools**. Input must be WAV, AIFF, FLAC, or raw PCM; MP3 and other lossy formats should be decoded first (typically via ffmpeg). Opus is lossy: re-encoding from another lossy source compounds artifacts.

# HISTORY

opusenc was created for encoding audio to the **Opus codec** format.

# SEE ALSO

[opusdec](/man/opusdec)(1), [ffmpeg](/man/ffmpeg)(1), [lame](/man/lame)(1)

