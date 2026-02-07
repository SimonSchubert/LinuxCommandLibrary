# TAGLINE

lightweight text-to-speech synthesis

# TLDR

**Speak text**

```flite -t "[Hello world]"```

**Speak from file**

```flite -f [text.txt]```

**Save to audio** file

```flite -t "[Hello world]" -o [output.wav]```

**Use specific voice**

```flite -voice [rms] -t "[Hello world]"```

**List available voices**

```flite -lv```

# SYNOPSIS

**flite** [_options_] [_text_]

# PARAMETERS

_TEXT_
> Text to speak.

**-t** _TEXT_
> Input text string.

**-f** _FILE_
> Input from file.

**-o** _FILE_
> Output audio file.

**-voice** _NAME_
> Voice to use.

**-lv**
> List available voices.

**--help**
> Display help information.

# DESCRIPTION

**flite** (Festival Lite) is a small, fast text-to-speech synthesis engine. It converts text to audio using concatenative synthesis, producing speech from recorded fragments.

The engine is designed for embedded systems with limited resources, providing reasonable quality without large runtime requirements. Multiple voices are available with different characteristics.

flite works offline without internet connectivity, making it suitable for accessibility applications and audio generation.

# CAVEATS

Limited voice naturalness compared to neural TTS. Few voice options. Output quality varies by text type.

# HISTORY

flite was developed at **Carnegie Mellon University** as a lightweight version of the Festival speech synthesis system. It's used in accessibility applications, embedded systems, and offline TTS scenarios.

# SEE ALSO

[espeak](/man/espeak)(1), [festival](/man/festival)(1), [say](/man/say)(1)
