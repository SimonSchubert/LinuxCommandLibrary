# TAGLINE

Convert text to audible speech

# TLDR

**Speak text aloud**

```say "[Hello, world]"```

**Speak with a specific voice**

```say -v [Alex] "[Hello]"```

**List all available voices**

```say -v "?"```

**Speak text from a file**

```say -f [input.txt]```

**Save speech to an audio file**

```say -o [output.aiff] "[Hello, world]"```

**Speak at a specific rate** (words per minute)

```say -r [200] "[Speaking faster now]"```

**Speak to a specific audio device**

```say -a "[Built-in Output]" "[Hello]"```

**Highlight words interactively as they are spoken**

```say -i "[Hello, this highlights each word]"```

**Save speech as a WAVE file**

```say --file-format=WAVE -o [output.wav] "[Hello, world]"```

# SYNOPSIS

**say** [_-v voice_] [_-r rate_] [_-o outfile_] [_-f infile_] [_-a device_] [_text..._]

# PARAMETERS

**-v** _voice_
> Use the specified voice instead of the system default. Use '?' to list all available voices.

**-r** _rate_
> Speech rate in words per minute.

**-f** _file_
> Read text from the specified file. Use '-' for standard input.

**-o** _file_
> Save speech to an audio file (AIFF by default; format depends on **--file-format**).

**-a** _device_
> Specify audio output device by ID or name prefix. Use '?' to list devices.

**-n** _name:port_
> Redirect speech output through AUNetSend to a remote audio server.

**-i**, **--interactive**
> Print text line by line during synthesis, highlighting words as they are spoken.

**--progress**
> Display progress during synthesis: percentage done, elapsed time, and bytes.

**--file-format** _FORMAT_
> Output file format: AIFF, caff, m4af, or WAVE.

**--data-format** _FORMAT_
> Audio data format (e.g., aac, alac, LEI16).

**--bit-rate** _RATE_
> Bit rate for compressed formats like AAC. Use '?' to list valid rates.

**--quality** _LEVEL_
> Audio converter quality level between 0 (lowest) and 127 (highest).

**--channels** _N_
> Number of output audio channels.

# DESCRIPTION

**say** converts text to audible speech using the macOS Speech Synthesis manager. It speaks text provided as arguments, from a file, or from standard input, either through audio output or saved to a file.

Multiple voices are available with different accents, languages, and personalities. The default voice and speech settings can be configured in System Settings under Accessibility > Spoken Content.

Output can be saved to AIFF, WAVE, m4af, or caff audio formats for later playback or processing.

# CAVEATS

Direct MP3 output is not supported; use **--file-format** for AIFF, WAVE, caff, or m4af, then convert if needed. Voice availability depends on what is installed in macOS; additional voices can be downloaded from System Settings.

# HISTORY

**say** has been included in macOS since the early days of Mac OS X, building on Apple's text-to-speech technology that dates back to the **1980s** with MacinTalk. The command provides terminal access to the same speech synthesis used throughout the operating system.

# SEE ALSO

[espeak](/man/espeak)(1), [spd-say](/man/spd-say)(1), [pico2wave](/man/pico2wave)(1)
