# TAGLINE

macOS audio file format converter

# TLDR

**Convert** audio file to AAC

```afconvert -f m4af -d aac [input.wav] [output.m4a]```

Convert to **ALAC** (Apple Lossless)

```afconvert -f m4af -d alac [input.wav] [output.m4a]```

Convert to **AIFF**

```afconvert -f AIFF -d BEI16 [input.mp3] [output.aiff]```

Set **bit rate** for AAC encoding

```afconvert -f m4af -d aac -b [128000] [input.wav] [output.m4a]```

Convert with VBR **strategy**

```afconvert -f m4af -d aac -s 3 -b [128000] [input.wav] [output.m4a]```

List supported **formats**

```afconvert -hf```

# SYNOPSIS

**afconvert** [_options_] _input_ [_output_]

# DESCRIPTION

**afconvert** is a macOS command-line tool for converting between audio file formats. It supports all audio formats handled by Core Audio, including WAV, AIFF, MP3, AAC, ALAC, CAF, and more. If no output file is specified, the name is generated automatically and saved in the same directory as the input.

The tool provides access to Apple's audio codecs and can perform sample rate conversion, bit depth conversion, and channel remapping along with format conversion.

# PARAMETERS

**-f**, **--file** _format_
> Output file format (m4af, WAVE, AIFF, caff, etc.).

**-d**, **--data** _format_
> Audio data format (aac, alac, BEI16, LEF32, etc.). Can include sample rate and format flags.

**-b**, **--bitrate** _rate_
> Total bit rate in bits per second for compressed formats.

**-c**, **--channels** _number_
> Number of output channels.

**-l**, **--channellayout** _tag_
> Channel layout tag.

**-q**, **--quality** _quality_
> Codec quality (0-127, higher is better).

**-r**, **--src-quality** _quality_
> Sample rate converter quality (0-127, default: 127).

**--src-complexity** _complexity_
> Sample rate converter complexity (line, norm, bats).

**-s**, **--strategy** _strategy_
> Bitrate allocation strategy (0=CBR, 1=ABR, 2=VBR_constrained, 3=VBR).

**-o** _filename_
> Specify output file path.

**--dither** _algorithm_
> Dither algorithm (1 or 2).

**--mix**
> Enable channel downmixing.

**-v**, **--verbose**
> Display progress information.

**-h**, **--help**
> Display help information.

**-hf**, **--help-formats**
> List all supported file and data formats.

# CAVEATS

This tool is macOS-only. Some format conversions may be lossy. AAC encoding quality varies with bit rate settings. Not all format combinations are valid. Use **-hf** to see which formats are supported on your system.

# HISTORY

**afconvert** has been part of macOS since Mac OS X, providing command-line access to the same audio conversion capabilities used by iTunes and other Apple applications.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [sox](/man/sox)(1), [lame](/man/lame)(1)
