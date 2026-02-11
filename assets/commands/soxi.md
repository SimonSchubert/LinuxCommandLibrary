# TAGLINE

Display audio file format information

# TLDR

**Show file info**

```soxi [audio.wav]```

**Show duration**

```soxi -D [audio.wav]```

**Show sample rate**

```soxi -r [audio.wav]```

**Show channels**

```soxi -c [audio.wav]```

**Show bit depth**

```soxi -b [audio.wav]```

**Show encoding**

```soxi -e [audio.wav]```

**Show file type**

```soxi -t [audio.wav]```

**Show all stats**

```soxi -V [audio.wav]```

# SYNOPSIS

**soxi** [_-D_] [_-r_] [_-c_] [_-b_] [_options_] _files_

# PARAMETERS

**-D**
> Duration in seconds.

**-d**
> Duration in time format.

**-r**
> Sample rate.

**-c**
> Channel count.

**-b**
> Bits per sample.

**-e**
> Encoding type.

**-t**
> File type.

**-s**
> Sample count.

**-V**
> Verbose output.

**-T**
> Total of multiple files.

# DESCRIPTION

**soxi** displays audio file information. It's part of SoX (Sound eXchange).

Duration shows file length. Seconds or time format available.

Technical parameters show format details. Sample rate, bit depth, channels.

Multiple files can be queried. Summary totals available.

Output is scriptable. Individual values returned for parsing.

# CAVEATS

Part of SoX suite. Not all formats supported. Metadata limited to audio properties.

# HISTORY

**soxi** is the info utility from **SoX** (Sound eXchange), the Swiss Army knife of audio processing. Created by Chris Bagwell and others.

# SEE ALSO

[sox](/man/sox)(1), [ffprobe](/man/ffprobe)(1), [mediainfo](/man/mediainfo)(1)
