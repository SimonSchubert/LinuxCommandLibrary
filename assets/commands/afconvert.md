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

# SYNOPSIS

**afconvert** [_-f file-format_] [_-d data-format_] [_-b bit-rate_] _input_ _output_

# DESCRIPTION

**afconvert** is a macOS command-line tool for converting between audio file formats. It supports all audio formats handled by Core Audio, including WAV, AIFF, MP3, AAC, ALAC, CAF, and more.

The tool provides access to Apple's audio codecs and can perform sample rate conversion, bit depth conversion, and channel remapping along with format conversion.

# PARAMETERS

**-f** _format_
> Output file format: m4af, WAVE, AIFF, caff, etc.

**-d** _format_
> Audio data format: aac, alac, BEI16, LEF32, etc.

**-b** _rate_
> Bit rate in bits per second for compressed formats

**-s** _rate_
> Sample rate for output file

**-c** _channels_
> Number of output channels

**-q** _quality_
> Encoder quality (0-127, higher is better)

**-v**
> Verbose output

**-h**
> Display available formats and help

# CAVEATS

This tool is macOS-only. Some format conversions may be lossy. AAC encoding quality varies with bit rate settings. Not all format combinations are valid.

# HISTORY

**afconvert** has been part of macOS since Mac OS X, providing command-line access to the same audio conversion capabilities used by iTunes and other Apple applications.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [sox](/man/sox)(1), [lame](/man/lame)(1)
