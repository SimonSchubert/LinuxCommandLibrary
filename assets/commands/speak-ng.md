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

**speak-ng** speaks text aloud. It's a text-to-speech engine.

Multiple languages. Many voice options.

Phoneme-based synthesis. Formant generation.

SSML support. Speech markup.

WAV output. Save audio files.

# CAVEATS

Voice quality varies. Robotic sound. Resource usage moderate.

# HISTORY

**speak-ng** is part of **eSpeak NG**, a fork of eSpeak providing speech synthesis in many languages.

# SEE ALSO

[espeak](/man/espeak)(1), [festival](/man/festival)(1), [pico2wave](/man/pico2wave)(1)
