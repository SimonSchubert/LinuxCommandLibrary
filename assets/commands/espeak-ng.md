# TAGLINE

next-generation formant-based speech synthesis

# TLDR

**Speak text**

```espeak-ng "[Hello world]"```

**Use specific voice**

```espeak-ng -v [en-gb] "[Hello]"```

**Read from file**

```espeak-ng -f [document.txt]```

**Output to WAV**

```espeak-ng -w [output.wav] "[Hello]"```

**Adjust speaking rate**

```espeak-ng -s [175] "[Hello]"```

**List voices**

```espeak-ng --voices```

**Use phoneme input**

```espeak-ng -x "[h@l'oU]"```

# SYNOPSIS

**espeak-ng** [_options_] [_words_]

# PARAMETERS

_WORDS_
> Text to speak.

**-v** _VOICE_
> Select voice/language.

**-f** _FILE_
> Read from file.

**-w** _FILE_
> Write to WAV file.

**-s** _SPEED_
> Words per minute.

**-p** _PITCH_
> Pitch adjustment.

**-x**
> Input is phonemes.

**--voices**
> List voices.

**--help**
> Display help information.

# DESCRIPTION

**espeak-ng** (eSpeak New Generation) is a fork of eSpeak with active development, additional features, and improved voice quality. It's a formant-based speech synthesizer supporting 100+ languages.

The tool provides text-to-speech capabilities for accessibility, voice assistants, and applications. It includes improvements in pronunciation rules, language support, and phoneme handling over the original eSpeak.

espeak-ng is the default TTS engine in many Linux distributions and speech synthesis frameworks.

# CAVEATS

Still sounds robotic (formant synthesis). Some advanced SSML features unsupported. Voice quality varies by language. Output format options limited.

# HISTORY

espeak-ng was forked from eSpeak by **Reece H. Dunn** to continue development after the original project became inactive. It's now the actively maintained version used in most Linux distributions.

# SEE ALSO

[espeak](/man/espeak)(1), [festival](/man/festival)(1), [mimic](/man/mimic)(1)
