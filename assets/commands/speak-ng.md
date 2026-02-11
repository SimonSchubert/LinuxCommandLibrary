# TAGLINE

eSpeak NG text-to-speech synthesizer

# TLDR

**Speak text**

```speak-ng "[Hello world]"```

**Speak from file**

```speak-ng -f [file.txt]```

**List voices**

```speak-ng --voices```

**Use specific voice**

```speak-ng -v [en-us] "[text]"```

**Output to file**

```speak-ng -w [output.wav] "[text]"```

**Adjust speed**

```speak-ng -s [150] "[text]"```

# SYNOPSIS

**speak-ng** [_-v voice_] [_-s speed_] [_-w file_] [_options_] [_text_]

# PARAMETERS

**-v** _VOICE_
> Voice/language.

**-s** _SPEED_
> Words per minute.

**-f** _FILE_
> Read from file.

**-w** _FILE_
> Write WAV file.

**-p** _PITCH_
> Pitch adjustment.

**--voices**
> List voices.

**-q**
> Quiet (no sound).

# DESCRIPTION

**speak-ng** is the command-line interface for eSpeak NG, a compact open-source text-to-speech synthesizer supporting over 100 languages and accents. It uses formant synthesis to generate speech from phoneme rules, producing intelligible output with a small footprint.

The tool reads text from command-line arguments, files, or stdin and outputs audio through the system sound device or saves it as WAV files. Voice characteristics including speed (words per minute), pitch, and volume are adjustable. SSML (Speech Synthesis Markup Language) input is supported for fine-grained control over pronunciation and prosody.

eSpeak NG is widely used in accessibility tools, embedded systems, and as a backend for Speech Dispatcher. Its compact size and broad language support make it the default speech synthesizer on many Linux distributions.

# CAVEATS

Voice quality varies. Robotic sound. Resource usage moderate.

# HISTORY

**speak-ng** is part of **eSpeak NG**, a fork of eSpeak providing speech synthesis in many languages.

# SEE ALSO

[espeak](/man/espeak)(1), [festival](/man/festival)(1), [pico2wave](/man/pico2wave)(1)
