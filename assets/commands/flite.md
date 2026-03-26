# TAGLINE

lightweight text-to-speech synthesis

# TLDR

**Speak text**

```flite -t "[Hello world]"```

**Speak from file**

```flite -f [text.txt]```

**Save to audio file**

```flite -t "[Hello world]" -o [output.wav]```

**Use specific voice**

```flite -voice [rms] -t "[Hello world]"```

**List available voices**

```flite -lv```

**Speak input as phonemes**

```flite -p "[pau hh ax l ow w er l d]"```

**Read SSML input from file**

```flite -ssml -f [input.ssml]```

# SYNOPSIS

**flite** [_options_] [_text_]

# PARAMETERS

_TEXT_
> Text to speak. If it contains a space, it is treated as a literal text string rather than a filename.

**-t** _TEXT_
> Explicitly set input text string.

**-f** _FILE_
> Explicitly set input filename.

**-o** _FILE_
> Output audio to file (WAV format). If omitted or set to "play", audio is played on the default audio device. Set to "none" to discard output.

**-p** _PHONES_
> Synthesize input as phonemes.

**-voice** _NAME_
> Voice to use (name, filename, or URL).

**-voicedir** _DIR_
> Directory containing voice data.

**-lv**
> List available voices.

**-ssml**
> Read input text/file in SSML mode.

**-b**
> Benchmark mode.

**-l**
> Loop endlessly.

**-s** _F=V_
> Set feature to value (guesses type).

**-v**
> Verbose mode.

**--version**
> Display version number.

**--help**
> Display help information.

# DESCRIPTION

**flite** (Festival Lite) is a small, fast text-to-speech synthesis engine developed at Carnegie Mellon University. It converts text to audio using concatenative synthesis, producing speech from recorded fragments.

The engine is designed for embedded systems with limited resources, providing reasonable quality without large runtime requirements. Multiple voices are available with different characteristics.

flite works offline without internet connectivity, making it suitable for accessibility applications and audio generation.

# CAVEATS

Limited voice naturalness compared to neural TTS. Few voice options. Output quality varies by text type.

# HISTORY

flite was developed at **Carnegie Mellon University** as a lightweight version of the Festival speech synthesis system. It's used in accessibility applications, embedded systems, and offline TTS scenarios.

# SEE ALSO

[espeak](/man/espeak)(1), [espeak-ng](/man/espeak-ng)(1), [festival](/man/festival)(1), [say](/man/say)(1), [spd-say](/man/spd-say)(1)
