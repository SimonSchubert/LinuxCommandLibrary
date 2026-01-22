# TLDR

**Encode to MP3**

```lame [input.wav] [output.mp3]```

**Set bitrate**

```lame -b [320] [input.wav] [output.mp3]```

**Variable bitrate**

```lame -V [2] [input.wav] [output.mp3]```

**High quality preset**

```lame --preset extreme [input.wav] [output.mp3]```

**Add ID3 tags**

```lame --tt "[title]" --ta "[artist]" [input.wav] [output.mp3]```

**Decode MP3 to WAV**

```lame --decode [input.mp3] [output.wav]```

# SYNOPSIS

**lame** [_options_] _input_ [_output_]

# PARAMETERS

_INPUT_
> Input audio file.

_OUTPUT_
> Output MP3 file.

**-b** _BITRATE_
> Constant bitrate (kbps).

**-V** _QUALITY_
> Variable bitrate (0-9, 0=best).

**--preset** _NAME_
> Quality preset (extreme, insane).

**--tt** _TITLE_
> Song title.

**--ta** _ARTIST_
> Artist name.

**--decode**
> Decode MP3 to WAV.

**--help**
> Display help information.

# DESCRIPTION

**LAME** is a high-quality MP3 encoder. It produces excellent audio quality at various bitrates.

The encoder supports constant and variable bitrate modes. It's widely regarded as the best open-source MP3 encoder.

LAME encodes audio to MP3.

# CAVEATS

Encoding only by default. Quality vs size tradeoff. VBR recommended.

# HISTORY

LAME (Lame Ain't an MP3 Encoder) was started in 1998 and became the leading open-source MP3 encoder.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [sox](/man/sox)(1), [oggenc](/man/oggenc)(1)
