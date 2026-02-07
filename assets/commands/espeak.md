# TAGLINE

compact open-source speech synthesizer

# TLDR

**Speak text**

```espeak "[Hello world]"```

**Speak from file**

```espeak -f [text.txt]```

**Set voice/language**

```espeak -v [en-us] "[Hello]"```

**Adjust speed**

```espeak -s [150] "[Hello]"```

**Save to audio** file

```espeak -w [output.wav] "[Hello]"```

**List available voices**

```espeak --voices```

**Adjust pitch**

```espeak -p [50] "[Hello]"```

# SYNOPSIS

**espeak** [_options_] [_words_]

# PARAMETERS

_WORDS_
> Text to speak.

**-f** _FILE_
> Read text from file.

**-v** _VOICE_
> Voice name or language.

**-s** _SPEED_
> Speed in words per minute.

**-p** _PITCH_
> Pitch (0-99).

**-w** _FILE_
> Write output to WAV file.

**--voices**
> List available voices.

**-m**
> Interpret SSML markup.

**--help**
> Display help information.

# DESCRIPTION

**eSpeak** is a compact, open-source text-to-speech synthesizer supporting many languages. It uses formant synthesis, producing a distinctive robotic voice but requiring minimal resources.

The tool converts text to speech output through speakers or audio files. Multiple languages and voices are available with adjustable speed, pitch, and other parameters.

eSpeak is useful for accessibility, automated announcements, and applications requiring speech synthesis without large voice databases.

# CAVEATS

Voice quality robotic compared to neural TTS. Some language support limited. Pronunciation may need tuning. SSML support is partial.

# HISTORY

eSpeak was created by **Jonathan Duddington** and released as open source. Its formant synthesis approach prioritizes small size and multi-language support over naturalistic voice quality.

# SEE ALSO

[espeak-ng](/man/espeak-ng)(1), [festival](/man/festival)(1), [pico2wave](/man/pico2wave)(1)
