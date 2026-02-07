# TAGLINE

sound synthesis and audio programming language

# TLDR

**Render orchestra and score** to audio

```csound [orchestra.orc] [score.sco]```

**Render unified csd file**

```csound [file.csd]```

**Output to WAV file**

```csound -o [output.wav] [file.csd]```

**Real-time audio output**

```csound -odac [file.csd]```

**Set sample rate**

```csound -r [44100] [file.csd]```

**Set control rate**

```csound -k [4410] [file.csd]```

# SYNOPSIS

**csound** [_options_] _files_...

# DESCRIPTION

**csound** is a sound synthesis program and audio programming language. It generates audio from text-based scores and orchestras, enabling precise control over sound generation and processing.

The system uses two main components: an orchestra defining instruments with synthesis algorithms, and a score specifying when and how to play them. Modern usage typically combines these in CSD (unified) files.

# PARAMETERS

**-o** _file_
> Output audio file (use dac for realtime).

**-i** _file_
> Input audio file (use adc for realtime).

**-r** _rate_
> Sample rate in Hz.

**-k** _rate_
> Control rate in Hz.

**-b** _size_
> Software buffer size.

**-B** _size_
> Hardware buffer size.

**-d**
> Suppress displays.

**-m** _level_
> Message level (0-231).

**-W**
> Create WAV format output.

**-A**
> Create AIFF format output.

**--midi-device=** _dev_
> MIDI input device.

# CAVEATS

Steep learning curve for synthesis programming. Real-time performance depends on buffer settings. Orchestra errors can be cryptic. Requires audio system configuration.

# HISTORY

**Csound** was developed by **Barry Vercoe** at **MIT** in **1986**, based on earlier Music N languages dating to **1957**. It descends from Max Mathews' MUSIC series at Bell Labs. Csound remains actively developed, used in academic research, electronic music, and multimedia installations.

# SEE ALSO

[sox](/man/sox)(1), [pd](/man/pd)(1), [supercollider](/man/supercollider)(1), [ffmpeg](/man/ffmpeg)(1)
