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

# SYNOPSIS

**say** [_-v voice_] [_-r rate_] [_-o outfile_] [_-f infile_] [_-a device_] [_text..._]

# PARAMETERS

**-v** _voice_
> Use the specified voice instead of the system default

**-r** _rate_
> Speech rate in words per minute

**-f** _file_
> Read text from the specified file

**-o** _file_
> Save speech to an audio file (AIFF, WAVE, m4af, or caff format)

**-a** _device_
> Specify audio output device; use '?' to list devices

**-n** _name:port_
> Send speech to a remote audio server

**--interactive**
> Interactive mode for continuous text input

# DESCRIPTION

**say** converts text to audible speech using the macOS Speech Synthesis manager. It speaks text provided as arguments, from a file, or from standard input, either through audio output or saved to a file.

Multiple voices are available with different accents, languages, and personalities. The default voice and speech settings can be configured in System Settings under Accessibility > Spoken Content.

Output can be saved to AIFF, WAVE, m4af, or caff audio formats for later playback or processing.

# CAVEATS

Direct MP3 output is not supported; convert AIFF output using a separate tool. Voice availability depends on what is installed in macOS; additional voices can be downloaded from System Settings.

# HISTORY

**say** has been included in macOS since the early days of Mac OS X, building on Apple's text-to-speech technology that dates back to the **1980s** with MacinTalk. The command provides terminal access to the same speech synthesis used throughout the operating system.

# SEE ALSO

[espeak](/man/espeak)(1), [festival](/man/festival)(1), [afplay](/man/afplay)(1)
