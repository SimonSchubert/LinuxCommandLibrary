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
> Target bitrate.

**--comp** _LEVEL_
> Complexity (0-10).

**--vbr**
> Variable bitrate.

**--title** _TITLE_
> Set title metadata.

**--help**
> Display help information.

# DESCRIPTION

**opusenc** encodes audio to Opus format. High-quality lossy compression.

The tool creates Opus files from WAV/FLAC. Part of opus-tools.

# CAVEATS

Part of opus-tools. Input usually WAV/FLAC. Opus is lossy.

# HISTORY

opusenc was created for encoding audio to the **Opus codec** format.

# SEE ALSO

[opusdec](/man/opusdec)(1), [ffmpeg](/man/ffmpeg)(1), [lame](/man/lame)(1)

